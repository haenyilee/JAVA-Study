package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���α׷� ����"); // 1������
		try
		{
			System.out.println("���� ���� : int i=10;"); // 2������
			System.out.println("���� ���� : int j=0;"); // 3�� ����
			System.out.println(10/0);				// �����߻� ==> catch�� �̵�
			System.out.println("����� ���:"+(10/0));
			// ���������� �����ϴ� ������ ��
		}catch(Exception e)
		{
			// �����ϴ� �������� error�� �߻����� ��쿡 ���
			System.out.println("������ ���� �߻� : /zero"); // 4�� ����
		}
		finally 
		{
			System.out.println("�ٽ� �Է��Ͻÿ�"); // 5�� ���� : ������ �����ϴ� ����
		}
		System.out.println("���α׷� ����!!");		// 6�� ����

	}

}
