// ���� ���� ��

/*
	0 => ����
	1 => ����
	2 => ��
 */

// �Է�
import java.util.*;
public class �ڹٹ迭_�뵵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ��ǻ�Ͱ� ���� �� => ���� �߻�(0~2 �߿���)
		int com =(int)(Math.random()*3);	// 0~2
		
		// ����ڰ� �Է�
		Scanner scan=new Scanner(System.in);
		System.out.println("0(����),1(����),2(��) : ");
		int user=scan.nextInt();
		
		// �Էµ� ��� Ȯ��
//		if(com==0)
//			System.out.println("��ǻ��   :����");
//		else if(com==1)
//			System.out.println("��ǻ��   :����");
//		else if (com==2) {
//			System.out.println("��ǻ��   :��");
//		}
//
//		if(user==0)
//			System.out.println("Player:����");
//		else if(user==1)
//			System.out.println("Player:����");
//		else if (user==2) {
//			System.out.println("Player:��");
//		}
		
		String[] result = {"����","����","��"};
		System.out.println("��ǻ��     : "+result[com]);
		System.out.println("Player : "+result[user]);		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
