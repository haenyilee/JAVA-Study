package com.sist.server;
import java.util.*;

import com.sist.common.Function;

import java.net.*;
import java.io.*;
public class Server implements Runnable{
	// �������� ����� Socket
	ServerSocket ss;
	final int PORT=3355;
	
	// Ŭ���̾�Ʈ ���� ����(arraylist,linkedlist �Ⱦ�����? ����ȭ���� �ʾƼ�)
	Vector<Client> waitVc=new Vector<Client>();	
	
	// ���� ����
	public Server()
	{
		try
		{
			ss= new ServerSocket(PORT);
			// bind():����   listen(): ���ӽñ��� ���
			System.out.println("Server Start...");
		}catch (Exception e) {}
	}
	
	// Ŭ���̾�Ʈ�� ���� �ø��� ó�� ���
	public void run() {
		try {
			while(true)
			{
				// �߽��� ����(IP,PORT)�� ������ �ִ� ����
				Socket s = ss.accept();
					// �����ϸ� ������ �����ؼ� => Ŭ���̾�Ʈ���� ����� �ٸ��� �� �� �ְ� �����.
				
				// ������� ���� => �ѻ���ϰ� ����� ������
				 Client client = new Client(s);
				 client.start(); // ����� ����
			}
		} catch (Exception e) {}
		
	}
	// ����� �����ϰ� �����
	class Client extends Thread
	{
		Socket s;
		
		OutputStream out;
		BufferedReader in;
		String id,name,sex;
		
		// �������� �����ؼ� Ŭ���̾�Ʈ ���� �ޱ�
		public Client(Socket s)
		{
			try {
				// Ŭ���̾�Ʈ�� ����(Ŀ�ؼ�)
				this.s=s;
				
				// Ŭ���̾�Ʈ�� ������ ����(��)
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
					// Ŭ���̾�Ʈ ��û ������
					StringTokenizer st = new StringTokenizer(msg,"|");
					int protocol= Integer.parseInt(st.nextToken());
					
					switch(protocol)
					{
						case Function.LOGIN:
						{
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							// Function.LOGIN : LOGIN���̺� �߰�
							messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex);
							
							
							// �߰�
							waitVc.add(this);
							
							// ȭ�� ����
							// �α��� => ���Ƿ�
							// Function.MYLOG : LOGIN���̺� �߰�
							messagTO(Function.MYLOG+"|"+id);
							
							// �̹� ������ ������� ���� �ް�
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
							// EXIT => ���� ���̺��� ID�� ����
							
							// ����
							for(Client user:waitVc)
							{
								if(user.id.equals(id))
								{
									messagTO(Function.MYEXIT+"|");
									
									// ����� �ߴ�
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
		
		// ���� ���� �����
		// ��ü������ �޼��� ����
		public void messageAll(String msg)
		{
			for(Client user:waitVc)
			{
				try {
					user.messagTO(msg);
				}catch (Exception e) {
					// ������ ��, ���� x��ư ������ ������ ����
					waitVc.remove(user);
				}
			} 
			
		}
		// ���������� �޼��� ����
		public void messagTO(String msg)
		{
			try {
				out.write((msg+"\n").getBytes());
				// ���ڵ� => ���ڵ� => UTF-8
			} catch (Exception e) {}
			
		}
	}

	public static void main(String msg) {
		
		Server server = new Server(); // ��������
		new Thread(server).start();  // ���ӽñ��� ��ٷ���
		

	}

	

}
