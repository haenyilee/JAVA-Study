/*
	����ڰ� ���ĺ��� �Է��ϸ�(B) => AB���
						D  => ABCD���
 
	char => scan.next().charAt(0)
 */

import java.util.*;
public class �ݺ���_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("���ĺ��� �Է��ϼ���(�빮��):");
		char user=scan.next().charAt(0);
		
		char ch='A';
		while (ch<=user) {
			System.out.print(ch);
			ch++;			
		}

		
		
		
		
		
	}

}
