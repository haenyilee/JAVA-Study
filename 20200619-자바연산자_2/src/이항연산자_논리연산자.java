/*
�������� ==> if������ �ַ� �����
	����) && (���Ŀ�����) , || (���Ŀ�����)
		==============	==============
		�� ���� true		�� �� �̻� true
		
		&& ==> ����, �Ⱓ�� ������ �� ���
		|| ==> ������ �Ⱓ�� ����� ��쿡 �ַ� ���
		 
	��) ����
		score>=90 (&&) score<=100
		score<=0  (||) score>100
		
	
	����) ���� (&&,||) ����
		  ====		  ====
		  T/F		  T/F

 	����� ��)
 						 &&		 ||
 		===============================
 		true	ture	true	true
 		-------------------------------
 		true	false	false	true
 		-------------------------------
 		false	ture	false 	true
 		-------------------------------
 		flase	false	false	flase
 		===============================
 		
 		6<5 && 10==10 // false && true ==> false
 		
 	ȿ������ ����)
 		int a = 10;
 		int b = 9;
 		
 		a==b && ++b==a ==> false
 		====	======
 		���� 		���� x
 			
 		b=? 
 		==> 9 // ���� �ǿ����ڰ� false�� �Ǵ� ���� �ڿ� ���� ������� �ʾƼ� ++b�� ������ ����
 		
 		&& ==> ���ʿ� �ִ� ������ false�� �������� ���� X
 		|| ==> ���ʿ� �ִ� ������ true�� �������� ���� X
 
 */

public class ���׿�����_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A';
		int i = 65;
		char c2 = 'B';
		
		System.out.println(c1==i && --c2==i);
		System.out.println(c2);

		boolean bCheck=c1==i || ++c1==c2;
		System.out.println(bCheck);
		System.out.println(c2);
	}

}
