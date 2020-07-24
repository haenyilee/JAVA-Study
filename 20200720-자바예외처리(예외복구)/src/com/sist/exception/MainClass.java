// try-catch

package com.sist.exception;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		try {
			
		}
		catch (Exception e) {
			System.out.println("에러발생");
		}
		System.out.println("프로그램 정상 종료");
		*/
		
		// 1. 예외처리가 없는 상태 (비정상종료)
		/*
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("c="+c);
		System.out.println("정상적으로 프로그램 종료!!");
		*/
		
		// 2. 예외처리가 있는 상태 (정상종료)
		try {
			int a=10;					// 1번수행
			int b=0; 					// 2번수행
			int c=a/b; 					// 3번 수행 ==> error => catch문으로 이동
			System.out.println("c="+c); // ***실행안되는 문장***
		}
		catch (Exception e) {
			System.out.println("0으로 나눌 수 없다!!"); // 4번 수행
		}
		System.out.println("프로그램 정상 종료"); // 5번 수해

	}

}
