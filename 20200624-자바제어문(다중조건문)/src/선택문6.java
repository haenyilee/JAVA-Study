// switch ��ø

/*
	if(���ǹ�)
	{
		if (���ǹ�)
		{
		}
		else
		{
		}
	}
	
	// Computer���� ���������� ���α׷� ���� �� ���~!
	 * ����
	 	����
	 	����
	 	��
	 * ����
	 	����
	 	����
	 	��
	 * ��
	 	����
	 	����
	 	��
	 	
	switch (����)
	{
		case 1:
			switch(����)
			{
				case 'A':
				{
				}
			}
	}
	
 */

import java.util.*;
public class ���ù�6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0;
		int com=(int)(Math.random()*3); // 0,1,2
		/*            =============
							1
							=========
								2
				=====
				 3
				 
				 1. Math.random() => 0.0 ~ 0.99
				 2. *3 => 0.0 ~ 2.9...
				 3. (int) => 0 ~ 2
				 	0:����
				 	1:����
				 	2:��
 				 				 
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("0(����),1(����),2(��) �߿� �ϳ� ���� : ");
		
		user=scan.nextInt();
		
		// ����� ���
/*	������ ����!!!!!(�ϵ��ڵ�)
		switch (com) {
		case 0:
				switch (user) {
				case 0:
					System.out.println("��ǻ��:����,�����:����");
					System.out.println("����!");
					break;
				case 1:
					System.out.println("��ǻ��:����,�����:����");
					System.out.println("�����  WIN!");					
					break;
				case 2:
					System.out.println("��ǻ��:����,�����:��");
					System.out.println("��ǻ��  WIN!");					
					break;				
				default:
					System.out.println("0~2���� ���� �ۼ��ϼ���");
					break;
				}
			break;
			
		case 1:
			switch (user) {
			case 0:
				System.out.println("��ǻ��:����,�����:����");
				System.out.println("��ǻ��  WIN!");					
				break;
			case 1:
				System.out.println("��ǻ��:����,�����:����");
				System.out.println("����!");				
				break;
			case 2:
				System.out.println("��ǻ��:����,�����:��");
				System.out.println("�����  WIN!");						
				break;				
			default:
				System.out.println("0~2���� ���� �ۼ��ϼ���");
				break;
			}			
			break;
			
		case 2:
			switch (user) {
			case 0:
				System.out.println("��ǻ��:��,�����:����");
				System.out.println("�����  WIN!");						
				break;
			case 1:
				System.out.println("��ǻ��:��,�����:����");
				System.out.println("��ǻ��  WIN!");					
				break;
			case 2:
				System.out.println("��ǻ��:��,�����:��");
				System.out.println("����!");	
				break;				
			default:
				System.out.println("0~2���� ���� �ۼ��ϼ���");
				break;
			}			
			break;			
			
		}
		
		COM		����		����		��
	�����		0		1		2
		���� 	0	0		-1(C)	-2(��)
		���� 	1	1(��)	0		-1(C)
		�� 	2	2(C)	1(��)	0
		
*/
			String[] str= {"����","����","��"};
			if(user>=0 && user<3) 
			{
			System.out.println("��ǻ��:"+str[com]);
			System.out.println("�����:"+str[user]);
			}
			switch (user-com) {
			case 2: case -1:
				System.out.println("��ǻ�� Win!!!");
				break;
			case 1: case -2:
				System.out.println("����� Win!!!");
				break;
			case 0:
				System.out.println("����!!!");
				break;
			default:
				System.out.println("0~2���� ���� �Է��ϼ���.");
			}

	}

}
