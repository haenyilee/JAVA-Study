// �� ���� ������ ��¥ ���

/*
	6�Է� ==> 30 ���
	7�Է� ==> 31 ���
 */

/*
 	31,28,31,30,31,30
 	31,31,30,31,30,31
 	==> ���� 3�� : 28, 30, 31
 */

import java.util.*;
public class �������ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����
		int month;
		
		// ������� �Է°� �ޱ�
		Scanner scan = new Scanner(System.in);
		/*
			���� ==> nextInt()
			���ڿ� ==> next(), nextLine()
			�Ǽ� ==> nextDouble()
			�� ==> nextBoolean()			
		 */
		System.out.println("month(1~12��) : ");
		
		// �޸𸮿� ���� ==> ����
		month=scan.nextInt();
		
		// ���� ==> ������, ��� ==> �޼ҵ�
		
		/* �� ���� ��(�ϵ��ڵ�?) ==> ����ȭ(�����ս�,�ӵ�), ����(�ҽ��ڵ��� ����� �� --> ����)
		if(month==1)
			System.out.println(month+"���� 31�� ���� �ֽ��ϴ�.");
		else if(month==2)
			System.out.println(month+"���� 28�� ���� �ֽ��ϴ�.");		
		else if(month==3)
			System.out.println(month+"���� 31�� ���� �ֽ��ϴ�.");
		else if(month==4)
			System.out.println(month+"���� 30�� ���� �ֽ��ϴ�.");		
		else if(month==5)
			System.out.println(month+"���� 31�� ���� �ֽ��ϴ�.");		
		else if(month==6)
			System.out.println(month+"���� 30�� ���� �ֽ��ϴ�.");		
		else if(month==7)
			System.out.println(month+"���� 31�� ���� �ֽ��ϴ�.");		
		else if(month==8)
			System.out.println(month+"���� 31�� ���� �ֽ��ϴ�.");		
		else if(month==9)
			System.out.println(month+"���� 30�� ���� �ֽ��ϴ�.");		
		else if(month==10)
			System.out.println(month+"���� 31�� ���� �ֽ��ϴ�.");		
		else if(month==11)
			System.out.println(month+"���� 30�� ���� �ֽ��ϴ�.");
		else if(month==12)
			System.out.println(month+"���� 31�� ���� �ֽ��ϴ�.");		
		*/
		
		/* �߼� ==> ������ ���� ���� ���� else�� �� �� �־�� ���~
		if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
			System.out.println(month+"���� 31�ϱ��� �ִ�.");
		else if (month==4 || month==6 || month==9 || month==11)
			System.out.println(month+"���� 30�ϱ��� �ִ�.");		
		else
			System.out.println(month+"���� 28�ϱ��� �ִ�.");		
		*/
		
		if (month==2)
			System.out.println(month+"���� 28�ϱ��� �ִ�.");
		else if (month==4 || month==6 || month==9 || month==11)
			System.out.println(month+"���� 30�ϱ��� �ִ�.");		
		else //  else�κп� ����ó��(�����Է�) Ȥ�� ������ ���� ���� �κ��� ���� ��~!
			System.out.println(month+"���� 31�ϱ��� �ִ�.");		
		
	}

}
