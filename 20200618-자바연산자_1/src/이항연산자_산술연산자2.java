/*
	'A' + 'B'
	===
	������ȯ -> 65
		  ===
		   ������ȯ -> 66
	==========
	 65  +  66 = 131 (int) char, short, byte ���� ==> ������� ������ int
	 
	 *** ������  : ���������� ������ �ʰ��ϸ� error�� �ƴ϶� �����÷ο츦 �߻�
	 			�� )  int ==> 1~10 		11 ==> 1
	 				=============================
	 				128	64	32	16	8	4	2	1 				
	 				=============================
	 				 0 	1 	1 	1 	1 	1 	1 	1  ==> 127�� ��ǻ�Ϳ� ����
	 				-----------------------------
	 				 1 	0 	0 	0 	0 	0 	0 	0  ==> 128�� ��ǻ�Ϳ� ���� ==> -128
	 				
	 			 ��������ȯ ������ ���� ������� �޶��� �� ����
	 			 ��)	(int) (10.5 + 10.5) ==> 21
	 			 	(int)10.5 + (int)10.5 ==> 20

 */
public class ���׿�����_���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 64;
		byte b2 = 64;
		byte b3 = (byte) (b1+b2);
		System.out.println(b3); // -128�� ������ ���� ==> �����÷ο�
		
		// % ==> ��ȣ�� �������� ����
		int a= 5;
		int b= 2;
		System.out.printf("%d%%%d=%d%n",a,b,a%b); 	//  5%2
		System.out.printf("%d%%%d=%d%n",a,b,-a%b); 	// -5%2
		System.out.printf("%d%%%d=%d%n",a,b,a%-b); 	//  5%-2
		System.out.printf("%d%%%d=%d%n",a,b,-a%-b); 	// -5%-2
		
		// ������� �޶����� ����ȯ
		System.out.println((int) (10.5 + 10.5));
		System.out.println((int)10.5 + (int)10.5);

	}

}
