package com.sist.oop;
/*
 	오버라이딩
 	========
 	1. 반드시 상속관계
 	2. 메소드명이 동일
 	3. 매개변수가 동일(갯수, 데이터형)
 	4. 리턴형도 동일해야 함
 	5. 딱 하나 다른점 : 접근지정어는 확장할 수 있다 / 축소할 순 없다.
 				   ========
 				   public > protected > default > private
 				   =======================================
 		같은 클래스	 O			O		   O		O
 				   =======================================
 		같은 패키지	 O	   		O		   O		X
  				   =======================================
 	다른패키지(상속)	 O	   		O		   X		X
 				   =======================================			
 		모든 클래스	 O	   		X		   X		X
 				   =======================================		 				   	   
 				   	   
 				   
 				   ==> 예)
 				   			class A
 				   			{
 				   				private void display(){}
 				   			}
 				   			
 				   			class B extends A
 				   			{
 				   				1. private void display(){}
 				   				2. void display(){}
 				   				3. protected void display(){}
 				   				4. public void display(){}
 				   			}
 				   			
 				   ==> 예) 캡슐화(은닉화)
 				   			class A
 				   			{
 				   				private int a;
 				   				@Getter
 				   				@Setter
 				   			}
 				   			
 				   			class B
 				   			{
 				   				
 				   			} 				   
 				   
 				   
 				   
 				   			
 */

public class 오버라이딩_메소드재정의 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
