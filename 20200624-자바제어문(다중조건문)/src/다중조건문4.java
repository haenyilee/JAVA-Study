/*
	����� => �����Է�(1~12)
	12,1,2 => �ܿ��Դϴ�
	3,4,5 => ���Դϴ�
	6,7,8 => ����
	9,10,11 => ����
	
 */

import java.util.*;
public class �������ǹ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����
		int month;
		
		// ����� �Է°� �ޱ�
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է��ϼ���(1~12):");
		month=scan.nextInt();
		
		// �������ǹ�
		if (month==12 || month==1 || month==2) 
			System.out.println(month+"���� �ܿ��Դϴ�.");
		else if (month==3 || month==4 || month==5) // if (month>=3 && month<=5)
			System.out.println(month+"���� ���Դϴ�.");		
		else if (month==6 || month==7 || month==8) // if (month>=6 && month<=8)
			System.out.println(month+"���� �ܿ��Դϴ�.");
		else if (month==9 || month==10 || month==11) // if (month>=9 && month<=11)
			System.out.println(month+"���� �����Դϴ�.");		
		
		// ����ó��
		else { 
			System.out.println("�������� �ʴ� ���Դϴ�. 1~12 ���� �Է��ϼ���");
		}
		
	}

}
