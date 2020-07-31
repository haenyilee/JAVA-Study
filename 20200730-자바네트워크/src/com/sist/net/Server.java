package com.sist.net;
import java.io.*;
import java.net.*;
import java.util.*;


public class Server implements Runnable{
	// 접속 받는 Socket => 교환소켓
	ServerSocket ss = null;
	
	// 접속자 정보 저장
	Vector<Client> waitVc = new Vector<Client>();
	
	// 서버가동 : 한 개의 컴퓨터에서는 여러개를 동시에 수행할 수 없음 => new Server() 생성하면 또다른 서버가 들어가게 되므로, 내부클래스로 백터를 교환해야 함
	public Server()
	{
		try 
		{
			ss= new ServerSocket(3333);
			// bind(ip,port) + listen() 포함되어 있음
			// 서버가동
			System.out.println("Server Start!!");
		} catch (Exception e) {}
	}
	
	// 서버 접속시에 처리
	public void run()
	{
		try {
				while(true)
				{
					// 접속자의 IP와 PORT를 확인(접속했을 경우)
					Socket s = ss.accept();
					// Socket(발신자 정보)이 IP,PORT를 가지고 있음
					/*
					System.out.println("접속자 IP:"+s.getInetAddress().getHostAddress());
					System.out.println("접속자 PORT(연결선 번호):"+s.getLocalPort());
					*/
					
					// 접속자와 쓰레드를 연결시키는 과정
					Client c = new Client(s);
					waitVc.add(c); // 클라이언트 저장					
					c.start(); // 접속자와 통신 시작
				}
			} catch (Exception e) {}
	}
	
	// 1. 내부클래스(백터를 아무때나 공유받을 수 있음)
	// 2. 접속자마다 따로 통신이 가능하게 만들기 : 클라이언트 요청이 들어올때마다 각자 1개의 쓰레드를 배정시켜줘서 동시에 다른 역할 수행 가능
	class Client extends Thread
	{
		Socket s; // 접속한 클라이언트랑 연결
		OutputStream out; // 클라이언트에 결과값 전송
		BufferedReader in; // 클라이언트가 요청시 값을 받는 클래스
		
		// s값 받아오기
		public Client(Socket s)
		{
			try 
			{
				this.s = s; // this.s는 Client 클래스의 Socket s임,  뒤에 s는 public Client의 매개변수 s임
				out=s.getOutputStream();
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			}catch (Exception e) {}
		}
		
		// 통신 시작
		public void run()
		{
			try 
			{
				while (true) 
				{
					// 채팅 문자열 받아오기
					String msg= in.readLine();
					for(Client user:waitVc)
					{
						user.out.write((msg+"\n").getBytes());
						// 네트워크 : 1byte로 보내줌 => 받을 때는 한글로 : 2byte로 변환해서 받아야함(getByte의 역할-인코딩)
					}
					
					
				}				
			} catch (Exception e) {}
		}
		
		
	}

	public static void main(String[] args) {
		Server server = new Server();
		new Thread(server).start();

	}

}
