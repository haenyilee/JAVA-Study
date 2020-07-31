package com.sist.server;

class MyThread extends Thread{
	public void run()
	{
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println(getName()+":"+i); // getName :쓰레드 이름은 가상머신이 정해줌
				Thread.sleep(50); // 1/1000초
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
		
		// 이름부여
		t1.setName("서울");
		t2.setName("경기");
		t3.setName("인천");
		
		// 순위를 부여
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(1);
		
		
		// 쓰레드의 호출
		t1.start();
		t2.start();
		t3.start();
	}

}
