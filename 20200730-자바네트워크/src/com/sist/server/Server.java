package com.sist.server;

class MyThread extends Thread{
	public void run()
	{
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println(getName()+":"+i); // getName :������ �̸��� ����ӽ��� ������
				Thread.sleep(50); // 1/1000��
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class Server {
	
	public static void main(String[] args) {
		MyThread t1= new MyThread();
		MyThread t2= new MyThread();
		MyThread t3= new MyThread();
		
		// �̸��ο�
		t1.setName("����");
		t2.setName("���");
		t3.setName("��õ");
		
		// ������ �ο�
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(1);
		
		
		// �������� ȣ��
		t1.start();
		t2.start();
		t3.start();
	}

}
