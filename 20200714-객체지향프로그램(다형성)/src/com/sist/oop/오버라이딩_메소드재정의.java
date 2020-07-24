package com.sist.oop;
/*
 	�������̵�
 	========
 	1. �ݵ�� ��Ӱ���
 	2. �޼ҵ���� ����
 	3. �Ű������� ����(����, ��������)
 	4. �������� �����ؾ� ��
 	5. �� �ϳ� �ٸ��� : ����������� Ȯ���� �� �ִ� / ����� �� ����.
 				   ========
 				   public > protected > default > private
 				   =======================================
 		���� Ŭ����	 O			O		   O		O
 				   =======================================
 		���� ��Ű��	 O	   		O		   O		X
  				   =======================================
 	�ٸ���Ű��(���)	 O	   		O		   X		X
 				   =======================================			
 		��� Ŭ����	 O	   		X		   X		X
 				   =======================================		 				   	   
 				   	   
 				   
 				   ==> ��)
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
 				   			
 				   ==> ��) ĸ��ȭ(����ȭ)
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

public class �������̵�_�޼ҵ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
