package com.sist.exception;

// ���� ó��

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
			System.out.println("������ȯ�� �ȵ�");
		}
		/*
		 * catch (ArrayIndexOutOfBoundsException e) {
		 * System.out.println("�迭������ ��� ���"); }
		 */
		catch (ArithmeticException e) {
			System.out.println("0���� �������");
		}
		catch (RuntimeException e) {
			System.out.println("���� �� ��� ������ ó��");
		} // ������ߴ� ���� ó��
		catch (Exception e) {
			System.out.println("������ ������ ��� ������ ó��");
		} // exception ó�� 
		catch (Throwable e) {
			System.out.println("���ܿ� ������ ���ÿ� ó��");
		} // error, exception ���� ó�� ����
		System.out.println("���α׷� ����");


	}

}
