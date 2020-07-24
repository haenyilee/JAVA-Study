package com.sist.inter;

interface 동물{
	void eat();
	void run();
	
}


class 소 implements 동물{

	@Override
	public void eat() {// public 꼭 써야함
		System.out.println("소같이 먹는다?");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class 개 implements 동물{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("개같이 먹는다?");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}


class 돼지 implements 동물{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("돼지같이 먹는다");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
	
	
}


class 사람 implements 동물{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("두발로 걷는다");			
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("수저로 먹는다");
		
		
	}
	
	
}


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		동물 ani=new 소();
		// error : 동물 ani=new 동물();
		ani.eat();
		
		ani=new 개();
		ani.eat();
		
		ani=new 돼지();
		ani.eat();
	}

}
