/*
	����ȯ ������
		==> �ʿ�ÿ� ���������� �����ؼ� ����� �� ��� : ��������ȯ
			(int) double
			(char) int
			==> ū ���������� ���� ������������ �ٲ� �� ���!
		
		
		==> �ڵ�����ȯ
			int + double = double + double
			char + int = int + int
			char + int + long + double = double ==> �ӵ��� �������ϱ� �ٸ� ������������ ���� �� ����
			int + long = long
 		
 		==> Ư�̻���
 			1) boolean�� ����
 			2) int ���ϴ� ������ �ϸ� �������  int
 				byte+byte		=int
 				char+char		=int
 				short+ short	=int
 				short+byte		=int
 				char+byte+short =int
 
 */
public class ���׿�����_����ȯ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		byte c=20;
		// byte d=b+c; ==> error ==> byte+ byte = int�̱� ������
		// byte d=(byte)(b+c); // (byte)�� ������ ������� ��
		int d = b+c;
		
		// �ڵ�����ȯ
		int a = 'A'; // a = 65
		double e = 10; // d= 10.0
		char f = 65; // c= 'A'
		
		System.out.println("a="+a);
		System.out.println("e="+e);
		System.out.println("f="+f);
		
		// ��������ȯ
		// int i = 10.5; ==> error
		int i = (int) 10.5;
		int ii = (int) 'A';
		System.out.println("i="+i);
		System.out.println("ii="+ii);
		
		
		

	}

}
