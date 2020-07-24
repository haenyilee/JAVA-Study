// 가변 매개변수 : 변수가 애매한 경우
// 책 287page

package com.sist.method;

public class 메소드 {
	
	public static void concat(String s, String... s1)
	{
		for(String ss:s1)
		{
			s+=ss;
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		concat("Hello","홍길동","심청이","춘향이","이순신");
		
		// Object는 모든 데이터형을 다 받을 수 있다
		Object o=10;
		Object o1=0.5;
		Object o2='A';
		Object o3="aaaaa";
		Object o4=new 메소드();
		
		

	}

}
