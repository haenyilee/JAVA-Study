/*

["���� ==> �ʱ�ȭ" ���]
1. ���� ó��
	int a = 100;
	
2. ���� ==> Ű���忡�� �޾Ƽ� ����
3. ������ ���� �����ϴ� ��� (random) ==> ����, �ζ� 
4. �Է�â�� ���� ���� �޴� ���



===> ����� ���ÿ� �ʱⰪ �ο� ==> �����ڿ� ���� �ַ� ����
	int a=100;
	
===> �����ϰ� ���߿� �ʱⰪ�� �ο� ==> ����ڿ� ���� �ַ� ����
	int a;
	a=100;

 */

import java.util.*;
// String, System, Math ==> java.lang ==> ��������


public class �ڹٺ����ʱ�ȭ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1-1�� ���(���� ó��)
		int a = 100;
		System.out.println("a="+a);
		
		// 1-2�� ���(���� ó��)
		int b; // �����ϰ�
		b = 2; // ���� ���߿� �ʱ�ȭ
		System.out.println("b="+b);
		
		// 3�� ���
		int c;
		c=(int)(Math.random()*100)+1; // random �� double���̶� int�� ����ȯ ���ϸ� error
			/* 			==> random ==> 0.0 ~ 0.99 
						==> *100   ==> 0.0 ~ 99.0
						==> (int)  ==> 0 ~ 99
						==> +1     ==> 1 ~ 100
			*/
		System.out.println("c="+c);

		// 2�� ���
		int d;
		Scanner scan= new Scanner(System.in); 
								// System.in ==> Ű���� �Է°��� �о� �´�
		System.out.println("�����Է�:");
		d=scan.nextInt();
		
		System.out.println("d="+d);
		
	}

}
