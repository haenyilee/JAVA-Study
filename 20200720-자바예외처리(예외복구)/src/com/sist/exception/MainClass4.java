package com.sist.exception;

// 다중 처리

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int [] arr=new int[2];
			arr[0]=100;
			arr[1]=0;
			
			int a=arr[0]/arr[1];
			
		}// catch (Exception e) {}
		catch (NumberFormatException e) { 
			System.out.println("정수변환이 안됨");
		}
		/*
		 * catch (ArrayIndexOutOfBoundsException e) {
		 * System.out.println("배열범위가 벗어난 경우"); }
		 */
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌경우");
		}
		catch (RuntimeException e) {
			System.out.println("실행 시 모든 에러를 처리");
		} // 예상못했던 에러 처리
		catch (Exception e) {
			System.out.println("수정이 가능한 모든 에러를 처리");
		} // exception 처리 
		catch (Throwable e) {
			System.out.println("예외와 에러를 동시에 처리");
		} // error, exception 동시 처리 가능
		System.out.println("프로그램 종료");


	}

}
