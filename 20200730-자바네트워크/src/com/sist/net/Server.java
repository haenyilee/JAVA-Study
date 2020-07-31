package com.sist.net;
import java.io.*;
import java.net.*;
import java.util.*;


public class Server implements Runnable{
	// ���� �޴� Socket => ��ȯ����
	ServerSocket ss = null;
	
	// ������ ���� ����
	Vector<Client> waitVc = new Vector<Client>();
	
	// �������� : �� ���� ��ǻ�Ϳ����� �������� ���ÿ� ������ �� ���� => new Server() �����ϸ� �Ǵٸ� ������ ���� �ǹǷ�, ����Ŭ������ ���͸� ��ȯ�ؾ� ��
	public Server()
	{
		try 
		{
			ss= new ServerSocket(3333);
			// bind(ip,port) + listen() ���ԵǾ� ����
			// ��������
			System.out.println("Server Start!!");
		} catch (Exception e) {}
	}
	
	// ���� ���ӽÿ� ó��
	public void run()
	{
		try {
				while(true)
				{
					// �������� IP�� PORT�� Ȯ��(�������� ���)
					Socket s = ss.accept();
					// Socket(�߽��� ����)�� IP,PORT�� ������ ����
					/*
					System.out.println("������ IP:"+s.getInetAddress().getHostAddress());
					System.out.println("������ PORT(���ἱ ��ȣ):"+s.getLocalPort());
					*/
					
					// �����ڿ� �����带 �����Ű�� ����
					Client c = new Client(s);
					waitVc.add(c); // Ŭ���̾�Ʈ ����					
					c.start(); // �����ڿ� ��� ����
				}
			} catch (Exception e) {}
	}
	
	// 1. ����Ŭ����(���͸� �ƹ����� �������� �� ����)
	// 2. �����ڸ��� ���� ����� �����ϰ� ����� : Ŭ���̾�Ʈ ��û�� ���ö����� ���� 1���� �����带 ���������༭ ���ÿ� �ٸ� ���� ���� ����
	class Client extends Thread
	{
		Socket s; // ������ Ŭ���̾�Ʈ�� ����
		OutputStream out; // Ŭ���̾�Ʈ�� ����� ����
		BufferedReader in; // Ŭ���̾�Ʈ�� ��û�� ���� �޴� Ŭ����
		
		// s�� �޾ƿ���
		public Client(Socket s)
		{
			try 
			{
				this.s = s; // this.s�� Client Ŭ������ Socket s��,  �ڿ� s�� public Client�� �Ű����� s��
				out=s.getOutputStream();
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			}catch (Exception e) {}
		}
		
		// ��� ����
		public void run()
		{
			try 
			{
				while (true) 
				{
					// ä�� ���ڿ� �޾ƿ���
					String msg= in.readLine();
					for(Client user:waitVc)
					{
						user.out.write((msg+"\n").getBytes());
						// ��Ʈ��ũ : 1byte�� ������ => ���� ���� �ѱ۷� : 2byte�� ��ȯ�ؼ� �޾ƾ���(getByte�� ����-���ڵ�)
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
