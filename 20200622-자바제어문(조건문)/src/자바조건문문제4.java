/*
	�ΰ��� ������ �޾Ƽ� �ִ밪, �ּҰ��� ����ϴ� �Լ�
	int a, b
	int max,min
	
 */

import java.util.*;
public class �ڹ����ǹ�����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("a b�Է��Ͻÿ� : ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int max, min;
		
		if (a>b) {
			max=a;
			min=b;
		}	
		else 
		{
			max=b;
			min=a;
		}

		System.out.println("max="+max);
		System.out.println("min="+min);
		
		
		// ������ �Է� �޾Ƽ� ���밪�� ����ϴ� ���α׷�
		System.out.println("���� �Է� : ");
		int c = scan.nextInt();
		int d=0;
		
		if (c>0)
			d=c;
		else {
			d=c*(-1);
		}
		
		System.out.println("���밪="+d);
		
		
	}

}
