package com.sist.lang;
class B
{
	int x,y;
	
}

public class MainClass3 {

	public static void main(String[] args) {
		// 매개변수가 클래스나 배열이면 원본(주소) 변경
		// 매개변수가 일반 기본형 데이터 혹은 String이면 복사본이 넘어감 , 원본 변경x
		
		// 메모리(클래스) => 같이 사용 : 참조
		// 메모리(클래스) => 이미 만들어진 클래스를 사용 : 복제(clone)
		// 메모리(클래스) => 새로운 내용으로 처음부터 사용 : new
		
		// Call By Value : 값을 변경 , 매개변수 전송법 (다른 메모리 할당)
		
		int x=10;
		int y=20;
		
		int i=x;
		int j=y;
		
		int temp=i;
		i=j;
		j=temp;
		
		System.out.println("i="+i+", j="+j); // i=20, j=10
		System.out.println("x="+x+", y="+y); // x=10, y=20
		
		// Call By Reference : 주소 전송, 값을 변경
		
		
		B b = new B();
		b.x=10;
		b.y=20;
		
		B c = b; // 참조(별칭을 준다) = swap(B c) = swap(b)
		c.x=100;
		c.y=200;
		
		System.out.println("b="+b); // b=com.sist.lang.B@15db9742
		System.out.println("c="+c); // c=com.sist.lang.B@15db9742
		
		System.out.println(b.x); // 100
		System.out.println(b.y); // 200
		
		

	}

}
