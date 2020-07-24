package com.sist.abs;
/*
  	추상클래스 
 */
abstract class 도형{
	public abstract void draw();
	
	// 추상 클래스에 기능 추가하는 방법
	public void color() {
		System.out.println("검정색으로 그림을 그린다");
	}
}

class 삼각형 extends 도형
{
	// 상속받은 추상클래스의 구현
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다");		
	}	
}

class 원 extends 도형
{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");		
	
	}
	
	// 빨간색으로 그림을 그리고 싶다면? ==> 정의 변경(재정의)
	@Override
	public void color() {
		System.out.println("빨간색으로 그림을 그린다");
	}	
}

class 사각형 extends 도형
{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다");		
	}	
}


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		도형 g=new 삼각형();
		g.color();
		g.draw();
		
		g=new 사각형();
		g.color();
		g.draw();
		
		g=new 원();
		g.color();
		g.draw();
		
		// 오류 : 도형 a=new 도형();

	}

}
