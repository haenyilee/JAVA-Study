/*
	2~9 ����ڰ� �Է�
	
	�Է�>2
	���>2*1=2
		2*2=4
		.
		.
		.
		2*9=18
		
 */

import java.util.*;
public class �ݺ���_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ==> ����� �Է�
		int dan=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�(2~9) : ");
		dan=scan.nextInt();
		
		// ��û�� ���
		for (int i=1;i<=9; i++) {
			System.out.printf("%d*%d=%d\t",dan,i,dan*i);
		}

	}

}
