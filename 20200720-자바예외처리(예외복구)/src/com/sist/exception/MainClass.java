// try-catch

package com.sist.exception;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		try {
			
		}
		catch (Exception e) {
			System.out.println("�����߻�");
		}
		System.out.println("���α׷� ���� ����");
		*/
		
		// 1. ����ó���� ���� ���� (����������)
		/*
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("c="+c);
		System.out.println("���������� ���α׷� ����!!");
		*/
		
		// 2. ����ó���� �ִ� ���� (��������)
		try {
			int a=10;					// 1������
			int b=0; 					// 2������
			int c=a/b; 					// 3�� ���� ==> error => catch������ �̵�
			System.out.println("c="+c); // ***����ȵǴ� ����***
		}
		catch (Exception e) {
			System.out.println("0���� ���� �� ����!!"); // 4�� ����
		}
		System.out.println("���α׷� ���� ����"); // 5�� ����

	}

}
