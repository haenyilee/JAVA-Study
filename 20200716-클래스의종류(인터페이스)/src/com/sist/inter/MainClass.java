package com.sist.inter;

interface ����{
	void eat();
	void run();
	
}


class �� implements ����{

	@Override
	public void eat() {// public �� �����
		System.out.println("�Ұ��� �Դ´�?");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class �� implements ����{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("������ �Դ´�?");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}


class ���� implements ����{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�������� �Դ´�");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
	
	
}


class ��� implements ����{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ι߷� �ȴ´�");			
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("������ �Դ´�");
		
		
	}
	
	
}


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		���� ani=new ��();
		// error : ���� ani=new ����();
		ani.eat();
		
		ani=new ��();
		ani.eat();
		
		ani=new ����();
		ani.eat();
	}

}
