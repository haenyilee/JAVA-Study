package com.sist.server;
import java.util.*;

import com.sist.common.Function;

import java.net.*;
import java.io.*;
public class Server implements Runnable{
	// 서버에서 실행된 Socket
	ServerSocket ss;
	final int PORT=3355;
	
	// 클라이언트 정보 저장(arraylist,linkedlist 안쓴이유? 동기화되지 않아서)
	Vector<Client> waitVc=new Vector<Client>();	
	
	// 서버 가동
	public Server()
	{
		try
		{
			ss= new ServerSocket(PORT);
			// bind():개통   listen(): 접속시까지 대기
			System.out.println("Server Start...");
		}catch (Exception e) {}
	}
	
	// 클라이언트가 접속 시마다 처리 기능
	public void run() {
		try {
			while(true)
			{
				// 발신자 정보(IP,PORT)를 가지고 있는 소켓
				Socket s = ss.accept();
					// 접속하면 쓰레드 생성해서 => 클라이언트마다 통신을 다르게 할 수 있게 만든다.
				
				// 쓰레드와 연결 => 한사람하고만 통신이 가능함
				 Client client = new Client(s);
				 client.start(); // 토신을 시작
			}
		} catch (Exception e) {}
		
	}
	// 통신이 가능하게 만든다
	class Client extends Thread
	{
		Socket s;
		
		OutputStream out;
		BufferedReader in;
		String id,name,sex;
		
		// 소켓으로 연결해서 클라이언트 정보 받기
		public Client(Socket s)
		{
			try {
				// 클라이언트와 연결(커넥션)
				this.s=s;
				
				// 클라이언트에 응답을 전송(값)
				out=s.getOutputStream();
				in= new BufferedReader(new InputStreamReader(s.getInputStream()));
			} catch (Exception e) {}
			
		}
		
		
		public void run()
		{
			try 
			{
				while(true)
				{
					String msg=in.readLine();
					System.out.println("client=>"+msg);
					// 클라이언트 요청 데이터
					StringTokenizer st = new StringTokenizer(msg,"|");
					int protocol= Integer.parseInt(st.nextToken());
					
					switch(protocol)
					{
						case Function.LOGIN:
						{
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							// Function.LOGIN : LOGIN테이블에 추가
							messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex);
							
							
							// 추가
							waitVc.add(this);
							
							// 화면 변경
							// 로그인 => 대기실로
							// Function.MYLOG : LOGIN테이블에 추가
							messagTO(Function.MYLOG+"|"+id);
							
							// 이미 접속한 사람들의 정보 받가
							for(Client user:waitVc)
							{
								messagTO(Function.LOGIN+"|"+user.id+"|"+user.name+"|"+user.sex);
							}
				
						
						}
						break;
						case Function.CHAT:
						{
							messageAll(Function.CHAT+"|["+name+"]|"+st.nextToken());
						}
						break;
						case Function.EXIT:
						{
							String mid=id;
							messageAll(Function.EXIT+"|"+mid);
							// EXIT => 대기실 테이블에서 ID를 제거
							
							// 제거
							for(Client user:waitVc)
							{
								if(user.id.equals(id))
								{
									messagTO(Function.MYEXIT+"|");
									
									// 통신을 중단
									in.close();
									out.close();
									break;
								}
							}
						}
						break;
					}
				}
			} catch (Exception e) {}
		}
		
		// 저장 공간 만들기
		// 전체적으로 메서지 전송
		public void messageAll(String msg)
		{
			for(Client user:waitVc)
			{
				try {
					user.messagTO(msg);
				}catch (Exception e) {
					// 종료할 때, 빨강 x버튼 눌러서 나가면 삭제
					waitVc.remove(user);
				}
			} 
			
		}
		// 개인적으로 메세지 전송
		public void messagTO(String msg)
		{
			try {
				out.write((msg+"\n").getBytes());
				// 인코딩 => 디코딩 => UTF-8
			} catch (Exception e) {}
			
		}
	}

	public static void main(String msg) {
		
		Server server = new Server(); // 서버가동
		new Thread(server).start();  // 접속시까지 기다려라
		

	}

	

}
