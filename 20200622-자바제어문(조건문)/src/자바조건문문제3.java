/*
	����� �Է� ==> 0,1,2
	
		�Է�		���
	=> 0�̸� => ����
	=> 1�̸� => ����
	=> 2�̸� => ��
	
	
	����, �Ǽ�, ������ ��쿡�� == ����� ����
	���ڿ��� ==���� �񱳰� �Ұ����ϴ� ==> equals()�� ����ؾ� �Ѵ�
 */
import java.util.*;

public class �ڹ����ǹ�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����������
		Scanner scan = new Scanner(System.in);
		System.out.println("0,1,2 �� �ϳ��� �Է��ϼ��� : ");
		int a=scan.nextInt();
		
		if (a==0)
			System.out.println("��:����");
		if (a==1)
			System.out.println("��:����");
		if (a==2)
			System.out.println("��:��");
			
		
		// ��ǻ��
		int com = (int)(Math.random()*3);
//						=============
//						0.0~0.99     *3 ==> 0.0~2.9... ==> (int) ==> 0~2 		
			
		if (com==0)
			System.out.println("��ǻ��:����");
		if (com==1)
			System.out.println("��ǻ��:����");	
		if (com==2)
			System.out.println("��ǻ��:��");	

		
		// ��� ��
			// ��ǻ�Ͱ� �����϶�
		if (com==0) {
					if(a==0) {
				System.out.println("draw");
			}
			if (a==1) {
				System.out.println("player win!");	
			}
			if (a==2) {
				System.out.println("computer win!");	
			}
		}
				
			// ��ǻ�Ͱ� �����϶�
		if (com==1) {
			if(a==0) {
				System.out.println("computer win!");		
			}
			if (a==1) {
				System.out.println("draw");	
			}
			if (a==2) {
				System.out.println("player win!");	
			}
		}
				
			// ��ǻ�Ͱ� ���϶�
		if (com==2) {
			if(a==0) {
				System.out.println("player win!");	
			}
			if (a==1) {
				System.out.println("computer win!");	
			}
			if (a==2) {
				System.out.println("draw");	
			}
		}
			
		
		// ���� �ڵ� ��� : ����, ����, ���� 0,1,2 ���� �ο� ==> com�� ���� ���� ���� ==> ���밪 || ���� ��� if ���ǹ� �ۼ��ϱ�
		
		
		
		
	}

}
