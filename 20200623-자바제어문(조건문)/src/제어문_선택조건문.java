/*

	���� ���ǹ� 
	if(���ǹ�)
	{
		���ǹ���  true�� �����ϴ� ���� ����
	}
	else => ������ ������ ���� else�� �ִ� ���� ����
	{
		���ǹ��� false�϶� �����ϴ� ���� ����
	}
	
	���ǹ� ==> �ٽ�(���� ����)
	
	==> å 137������ ����
	-------------���� �����϶�
	== 
	-------------������ �������϶�
	&&
	||
	-------------
	
	���ڿ� ==> !=, ==�� ������� �ʴ´�
		 ==> ���� : equals()
		 ==> ���� �ʴ� : !equals()

 */

import java.util.*;
public class ���_�������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����Ѱ��� �Է¹޾Ƽ� => ���ĺ����� ���� Ȯ��\

		char ch='A'; // ���� => �ʱ�ȭ
		/*
		 *  int => 0
		 *  double => 0.0
		 *  long => 0L
		 *  boolean => false
		 *  char => A
		 */
		// �����Ѱ� �Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�: ");

		// "ABC" => �ڹٴ� ��� ���� ��ȣ�� 0���� ������
		ch=scan.next().charAt(0); // 0�� ù��° �ܾ �������ڴٴ� ��

		
		if ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
			System.out.println(ch+"�� ���ĺ��Դϴ�!!!");
		}
		else {
			System.out.println(ch+"�� ���ĺ��� �ƴմϴ�...");
		}
		
		
		// ���� => ������ ���, ������ => ���ڷ� ���?

	}
}
