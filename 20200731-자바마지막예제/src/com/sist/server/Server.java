package com.sist.server;
// 네트워크 : 네트워크와 관련된 라이브러리 필요 => net

import java.util.*;

import com.sist.common.Function;

import java.io.*; // 입출력(서버와 클라이언트 통신해서 데이터 주고받기)
import java.net.*; // 컴퓨터와 컴퓨터를 연결할 때 사용

// 서버 : 접속만 담당
public class Server implements Runnable {
	
	// 접속을 받는 클래스 (정보 저장)
	private ServerSocket ss;
	private final int PORT=3355;
	
	// 벡터를 사용하는 이유 : 동기화프로그램이기 때문에 (*비동기화program:Arraylist) 
	private Vector<Client> waitVc = new Vector<Client>();
	
	// 서버 가동
	private Server()
	{
		try
		{
			// 접속,결합,대기
			ss=new ServerSocket(PORT);
			// bind() : IP와 PORT번호를 묶어줌(개통)
			// listen() : 대기 상태(클라이언트가 접속하기 전까지 대기)
			System.out.println("Server Start...");
		}catch (Exception e) {}
	}
	
	// 클라이언트가 접속을 했을 경우, 각자 통신이 가능하게 쓰레드랑 연결시켜줌
	@Override
	public void run() {
		try {
			while(true)
			{
				//accept() : 특수한 메소드(클라이언트가 접속됐을때만 실행됨)
				Socket s= ss.accept();
				
				// 같은 것들끼리만 쓰레드로 묶어줌
				Client client = new Client(s);
				
				// 클라이언트와 통신할 수 있게 통신승인
				client.start();
			}
		} catch (Exception e) {}
		
	}
	
	

	public static void main(String[] args) {
		
		// 서버 가동
		Server server = new Server();
		
		// server클래스에 있는 쓰레드 호출(not 클라이언트)
		new Thread(server).start(); 

	}

	// 내부 클래스 => Server가 가지고 있는 데이터를 쉽게 공유 가능하게 만들기 위해 사용함
// 클라이언트 : 실제 통신을 담당
	class Client extends Thread
	{
		
		// 클라이언트와 연결
		Socket s;
		
		// 클라이언트로부터 요청 받기
		BufferedReader in;
		
		// 요청을 처리한 다음에 클라이언트에 결과를 응답
		OutputStream out;
		
		// 로그인 변수 설정
		String id,name,sex,pos;
		
		
		public Client(Socket s)
		{
			try {
				// 클라이언트 소켓의 s값 읽기
				this.s=s;
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				// 클라이언트가 요청한 메소드를 읽어오는 메모리 공간
				out=s.getOutputStream();
			} catch (Exception e) {}
		}
		
		// 통신을 어떻게 할 것인가? 기능(요청처리)만드는 부분
		public void run()
		{
			try {
				while(true)
				{
					// 클라이언트가 요청한 내용을 받기
					String msg=in.readLine();
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol = Integer.parseInt(st.nextToken());
					// [100|id|대화명|성별] 형식으로 보내기위해서 token사용
					
					switch (protocol) 
					{
						case Function.LOGIN:
						{
							// 로그인 처리
							// 데이터값 받기 : [100|id|대화명|성별] 형식
							this.id = st.nextToken();
							this.name= st.nextToken();
							this.sex=st.nextToken();
							this.pos="대기실"; // 사용자의 기본정보
							
							// 접속한 모든 사용자에게 로그인한 사람의 정보를 보내주기
							this.messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos);
							
							// 접속한 사람의 정보를 저장해두기
							waitVc.add(this);
							// Client client = new Client();
							messageTo(Function.MYLOG+"|"+id);
							
							// 로그인창에서 대기실창으로 변경
							for(Client user:waitVc) 
							{
								messageTo(Function.LOGIN+"|"+user.id+"|"+user.name+"|"+user.sex+"|"+user.pos);
							}
							
							// 입장메세지 출력
							messageAll(Function.WAITCHAT+"|[☞"+name+"님이 입장하셨습니다]");
							
							// 개설된 방 전송
							
						}
						break;
						case Function.WAITCHAT:
						{
							messageAll(Function.WAITCHAT+"|["+name+"]"+st.nextToken());
						}
						break;

//					default:
//						break;
					}
				}
			} catch (Exception e) {}
		}
		
		// 응답 처리
		// 개인적으로 전송
		public synchronized void messageTo(String msg)
		{
			/* 
			 * 쓰레드는 디폴트가 비동기화임
			 * <sychronized>를 쓰면 동기화 프로그램으로 바뀜
			 */
			try {
				// 인코딩, 디코딩해야함
				out.write((msg+"\n").getBytes());	
			} catch (Exception e) {}
			
			
			
		}
		
		// 전체적으로 응답
		public synchronized void messageAll(String msg)
		{
			try {
				
				// 접속한 모두에게 메세지 보내기
				for(Client user:waitVc)
				{
					user.messageTo(msg);
				}
				
			} catch (Exception e) {}
		}
		
		
	}

	
}
