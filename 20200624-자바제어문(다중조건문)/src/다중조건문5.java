/*
 	
 	
	���ڸ� �Է��� �޾Ƽ� char ch
		1) ���� �Է� ch>='0' && ch<='9'
		2) ���ĺ� �Է� ch>='A' && ch<='Z' || ch>='a' && ch<='z'
		3) �ѱ� ch>='��' && ch<='�R'
		4) Ư������
		
 */
import java.util.*;

public class �������ǹ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����
		char ch;
		
		// �����Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���:");
		ch=scan.next().charAt(0);
		
		// �������ǹ�
		if (ch>='0' && ch<='9')
			System.out.println(ch+"�� �����Դϴ�.");
		else if (ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			System.out.println(ch+"�� ���ĺ��Դϴ�.");		
		else if ( ch>='��' && ch<='�R')
			System.out.println(ch+"�� �ѱ��Դϴ�.");		
		
		// ����ó��
		else
			System.out.println(ch+"�� Ư�������Դϴ�.");		
		
		

	}

}
