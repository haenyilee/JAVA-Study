package com.sist.exception;
/*
 	����ó��
 		����)
 			1. ����ó��
 				try
 				{
 					������ ������ �ڵ�(���� ���� ����)
 				}catch(����Ŭ���� ��ü)
 				{
 					���� ������ ������ �� ��쿡 ó�� ����
 				}
 				*** catch�� ������ ����� ����
 				*** finally�� ����� �� �ִ�.(�ʿ��� ��쿡��)
 					����, ������ ���̽� ���� : �����ݱ�, ����Ŭ ���� ����
 			2. �ڹٿ��� �����ϴ� ����ó��
 				�Ѱ��� ó��
 					NmberFormatException
 					ArrayIndexOutBoundsException
 					NullPointException
 					IOException
 					SQLException
 				������ ó��
 					RuntimeException
 					Exception
 					Throwable
 			3. catch�� �������� ����� �� �ִ�.
 				�ش� ������ ã�� ��쿡�� ó������ ���������� �˻� => ����ó�� ������� �ڵ�
 				
 			4. try������ �߻��ϸ� �߻� ��ġ���� catch�� �̵�
 			   ======================== �ؿ� �ִ� �ҽ��� ������� �ʴ´�
 			   
 			5. ���� : ����üũ(����Ȯ��) => �ҽ����� => �����
 			
 			6. ����ó�� => ������ ������ ����
 			
 			7. �ڹ��� ��� �ڵ��� ����ó���� �����Ѵ�. 
 				��, ����ô� ������ �����ϴ�.
 			
 			8. ����ó���� �ݵ�� ó���ؾ� �ϴ� Ŭ������ ���礿����.
 				
 */
import javax.swing.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String num1=JOptionPane.showInputDialog("ù ��° �����Է�:");
			String num2=JOptionPane.showInputDialog("�� ��° �����Է�:");
			// �迭�� ÷��
			int[]arr=new int[2];
			// ���ڿ��� ������ ��ȯ
			arr[0]=Integer.parseInt(num1); // �����Է� ==> "10" ���ڷ� ��ȯ ==> " 1 0" "1  0" "������" (����)
			arr[1]=Integer.parseInt(num2);
			
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
		}
		/*catch (NumberFormatException e) {
			System.out.println("������ �Է�");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭���� �ʰ�");
		}catch (ArithmeticException e) {
			System.out.println("0���� ���� �� ����");
		}*/
		catch (RuntimeException e) {
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("ó������ �ٽ�!");

	}

}
