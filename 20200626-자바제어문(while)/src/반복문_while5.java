/*
	������)
			1) while���� ������ ���� ��� error => for���� ���ǽ� ��� ����~
			   while()
			   {
			   } ==> �����߻�  : ���ǽ� ����
			   
			2) while������ ���ѷ���
			   => for(;;) ==> while(true) : ���� ���� ����
			
	for(int i=0;i<10;i++)
	
	int i=0;
	while(i<10){
		i++;
	}
 */

// 5 �Է� ==> 1~5������ ��

import java.util.*;
public class �ݺ���_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� 2�� �ʿ�
		int user=0; 		// ����ڰ� �Է��� ����
		int i=0; 			// ����ڰ� ��û�� �������� �����Ǵ� ����(��������)
		int sum=0; 			// ����(��)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�����Է� : ");
		user=scan.nextInt();
		
		while(i<=user) {
			
			sum+=i;
			i++;
		}
		System.out.println("sum="+sum);
			
		i=1; // �ʱ�
		System.out.println(i);
			
			
			
			
	}

}
