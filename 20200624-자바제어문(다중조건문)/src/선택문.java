/*
	���ù�
	 => switch(����, ����, ���ڿ�)
	 	{
	 		// ����
	 		case ������: 			@���� : �����ݷ�(;)�� �ƴ϶� �ݷ�(:)��
	 			ó������
	 			==> if(����){ó��}
	 		case ������: 			@���� : ������ �ڸ��� �ߺ��� ���� ����� �� ����
	 			ó������
	 		
	 			
	 	}
	 	
	 	switch(a)
	 	{
	 		case1 : 
	 		case1 : @���� : �ߺ� �� ���
	 	}
	 	
	 	if (a==1){System.out.println("1");}
	 	if (a==1){System.out.println("��");} @����	
	 	
	 	if (a==1){
	 		System.out.println("1");	 	
	 		System.out.println("��");} @����	
	 		
	 		
	 	// ����� => ���� 1
	 	Switch(����) 		==> break�� ���� ��쿡�� ��� ������ ����
	 	{
	 		case 1:
	 			ó������ 1
	 		case 2:
	 			ó������ 2	 	
	 		case 3:
	 			ó������ 3
	 	}	 			
	 						==> �ϳ��� �����Ϸ��� �� case���� break�� �ɾ���� ��
	 						==> �� �� �̻� �����Ϸ��� ������ case�� break�� �ɾ���� �� �� ���� ����Ǵ� ��� ó�� ������
	 			
	 			
	 			
 */

import java.util.*;
public class ���ù� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select;
		Scanner scan=new Scanner(System.in);
		System.out.println("����(1~5):");
		select=scan.nextInt();
		
		// ��������� �߿��� ==> break�� �ɾ���� �ϴϱ�...�ȱ׷��� ��� ������!
		switch(select)
		{
		case 1: // case1�� case2�� ����� �����ϱ� �󺧸� �޾��ָ� �� @���� : case1,2:��� �ۼ��ϸ� �ȵ�! ������ ���ε��� �ۼ��ϱ�
			// System.out.println("1~2���� �Է��Ͽ����ϴ�.");
			// break; 
		case 2:
			System.out.println("1~2���� �Է��Ͽ����ϴ�.");
			break;	// switch���� �����Ѵ�.
		case 3:
			System.out.println("3���� �Է��Ͽ����ϴ�.");
			break;
		case 4:
			System.out.println("4���� �Է��Ͽ����ϴ�.");
			break;
		case 5:
			System.out.println("5���� �Է��Ͽ����ϴ�.");
			break;
		
		// ����ó��
		default:
			System.out.println("error : 1~5�������� ���ڸ� �Է��ϼ���!!");
			
		}
	}

}
