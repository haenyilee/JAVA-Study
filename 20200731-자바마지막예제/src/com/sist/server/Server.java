package com.sist.server;
// ��Ʈ��ũ : ��Ʈ��ũ�� ���õ� ���̺귯�� �ʿ� => net

import java.util.*;

import com.sist.common.Function;

import java.io.*; // �����(������ Ŭ���̾�Ʈ ����ؼ� ������ �ְ�ޱ�)
import java.net.*; // ��ǻ�Ϳ� ��ǻ�͸� ������ �� ���

// ���� : ���Ӹ� ���
public class Server implements Runnable {
	
	// ������ �޴� Ŭ���� (���� ����)
	private ServerSocket ss;
	private final int PORT=3355;
	
	// ���͸� ����ϴ� ���� : ����ȭ���α׷��̱� ������ (*�񵿱�ȭprogram:Arraylist) 
	private Vector<Client> waitVc = new Vector<Client>();
	
	// ���� ����
	private Server()
	{
		try
		{
			// ����,����,���
			ss=new ServerSocket(PORT);
			// bind() : IP�� PORT��ȣ�� ������(����)
			// listen() : ��� ����(Ŭ���̾�Ʈ�� �����ϱ� ������ ���)
			System.out.println("Server Start...");
		}catch (Exception e) {}
	}
	
	// Ŭ���̾�Ʈ�� ������ ���� ���, ���� ����� �����ϰ� ������� ���������
	@Override
	public void run() {
		try {
			while(true)
			{
				//accept() : Ư���� �޼ҵ�(Ŭ���̾�Ʈ�� ���ӵ������� �����)
				Socket s= ss.accept();
				
				// ���� �͵鳢���� ������� ������
				Client client = new Client(s);
				
				// Ŭ���̾�Ʈ�� ����� �� �ְ� ��Ž���
				client.start();
			}
		} catch (Exception e) {}
		
	}
	
	

	public static void main(String[] args) {
		
		// ���� ����
		Server server = new Server();
		
		// serverŬ������ �ִ� ������ ȣ��(not Ŭ���̾�Ʈ)
		new Thread(server).start(); 

	}

	// ���� Ŭ���� => Server�� ������ �ִ� �����͸� ���� ���� �����ϰ� ����� ���� �����
// Ŭ���̾�Ʈ : ���� ����� ���
	class Client extends Thread
	{
		
		// Ŭ���̾�Ʈ�� ����
		Socket s;
		
		// Ŭ���̾�Ʈ�κ��� ��û �ޱ�
		BufferedReader in;
		
		// ��û�� ó���� ������ Ŭ���̾�Ʈ�� ����� ����
		OutputStream out;
		
		// �α��� ���� ����
		String id,name,sex,pos;
		
		
		public Client(Socket s)
		{
			try {
				// Ŭ���̾�Ʈ ������ s�� �б�
				this.s=s;
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				// Ŭ���̾�Ʈ�� ��û�� �޼ҵ带 �о���� �޸� ����
				out=s.getOutputStream();
			} catch (Exception e) {}
		}
		
		// ����� ��� �� ���ΰ�? ���(��ûó��)����� �κ�
		public void run()
		{
			try {
				while(true)
				{
					// Ŭ���̾�Ʈ�� ��û�� ������ �ޱ�
					String msg=in.readLine();
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol = Integer.parseInt(st.nextToken());
					// [100|id|��ȭ��|����] �������� ���������ؼ� token���
					
					switch (protocol) 
					{
						case Function.LOGIN:
						{
							// �α��� ó��
							// �����Ͱ� �ޱ� : [100|id|��ȭ��|����] ����
							this.id = st.nextToken();
							this.name= st.nextToken();
							this.sex=st.nextToken();
							this.pos="����"; // ������� �⺻����
							
							// ������ ��� ����ڿ��� �α����� ����� ������ �����ֱ�
							this.messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos);
							
							// ������ ����� ������ �����صα�
							waitVc.add(this);
							// Client client = new Client();
							messageTo(Function.MYLOG+"|"+id);
							
							// �α���â���� ����â���� ����
							for(Client user:waitVc) 
							{
								messageTo(Function.LOGIN+"|"+user.id+"|"+user.name+"|"+user.sex+"|"+user.pos);
							}
							
							// ����޼��� ���
							messageAll(Function.WAITCHAT+"|[��"+name+"���� �����ϼ̽��ϴ�]");
							
							// ������ �� ����
							
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
		
		// ���� ó��
		// ���������� ����
		public synchronized void messageTo(String msg)
		{
			/* 
			 * ������� ����Ʈ�� �񵿱�ȭ��
			 * <sychronized>�� ���� ����ȭ ���α׷����� �ٲ�
			 */
			try {
				// ���ڵ�, ���ڵ��ؾ���
				out.write((msg+"\n").getBytes());	
			} catch (Exception e) {}
			
			
			
		}
		
		// ��ü������ ����
		public synchronized void messageAll(String msg)
		{
			try {
				
				// ������ ��ο��� �޼��� ������
				for(Client user:waitVc)
				{
					user.messageTo(msg);
				}
				
			} catch (Exception e) {}
		}
		
		
	}

	
}
