/*
 	���� => 
 		��� : ������� �� �� ����
 				int + int = int
 				double + int = double
 				float + long = float
 		================
 		�� : true/false
 		�� : true/false
 		================ ���ǹ�(if)
 		����
 	
 	�񱳿����� : ���� ���� �� => ����, �Ǽ�, ����, ��
 			    ���ڿ��� ���� �� ����
 			  "Hello"=="Hello" ==> equals()�� ���ؾ� ��
 				==> ���ڿ��� �����ϴ� �������� ==> String
 					Char c = 'Hello'
 					String s = "Hello"
 					
 		1) ����
 			== : ����		==> 10==20 (false)
 			!= : ���� �ʴ�		==>	10!=20 (true)
 			<  : �۴�		==> 10<10  (false)
 			>  : �۴�		==> 10>10  (false)
 			<= : �۰ų� ����	==> 10<=10 (true)
 								10<10 || 10=10		==> || : or
  			>= : ũ�ų� ����	==> 10>=10 (true)
  			
 		2) ����� : boolean
 		
 */



public class ���׿�����_�񱳿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; 
		int b=9;
		char c = 'A';
		System.out.println(c++);		// c�� ����(x) ==> ��ġ�ϱ� �����ϱ� �� ���� ���
		System.out.println(c);			// c�� ����(o)
		System.out.println(b++==a);		// false ==> b=9
		System.out.println(++b==a);		// false ==> b=11
		System.out.println(10==20); 	// false
		System.out.println(10!=20); 	// true
		System.out.println(10>10); 		// false
		System.out.println(10<10); 		// false
		System.out.println(10<=10); 	// true
		System.out.println(10>=10); 	// true
		
		System.out.println('A'==65);	// true
		// char�� ������ �����ϸ� ������ ��ȯ�ȴ�

	}

}
