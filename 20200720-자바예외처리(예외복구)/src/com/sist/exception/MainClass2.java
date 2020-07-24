package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작"); // 1번수행
		try
		{
			System.out.println("정수 저장 : int i=10;"); // 2번수행
			System.out.println("정수 저장 : int j=0;"); // 3번 수행
			System.out.println(10/0);				// 에러발생 ==> catch로 이동
			System.out.println("결과값 출력:"+(10/0));
			// 정상적으로 수행하는 문장이 들어감
		}catch(Exception e)
		{
			// 실행하는 과정에서 error가 발생했을 경우에 대비
			System.out.println("나누기 문제 발생 : /zero"); // 4번 수행
		}
		finally 
		{
			System.out.println("다시 입력하시오"); // 5번 수행 : 무조건 수행하는 문장
		}
		System.out.println("프로그램 종료!!");		// 6번 수행

	}

}
