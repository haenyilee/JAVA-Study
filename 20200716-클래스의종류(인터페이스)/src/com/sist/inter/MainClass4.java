package com.sist.inter;

interface A
{
	public void display();
}

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 익명의 클래스 => 인터페이스를 이용한 가용성
		A a=new A() {
			public void display() {
				System.out.println("A:display:Call...");
			}
		};
		a.display();

	}

}
