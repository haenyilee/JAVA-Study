package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {
		
		// ��� (1)
		try {
		}catch (ArithmeticException e) {
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		catch (NumberFormatException e) { // web���� �ַ� ����ϴ� ����
		}
		
		// ��� (2)
		try {
		}catch (RuntimeException e) {
		}
		
		// ��� (3)
		try {
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
		}

	}

}
