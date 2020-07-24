package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {
		
		// 방법 (1)
		try {
		}catch (ArithmeticException e) {
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		catch (NumberFormatException e) { // web에서 주로 출력하는 에러
		}
		
		// 방법 (2)
		try {
		}catch (RuntimeException e) {
		}
		
		// 방법 (3)
		try {
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
		}

	}

}
