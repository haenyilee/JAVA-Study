/*
[�ڹ� => �⺻��]
	�ڹٿ��� �����ϴ� ��������
	
	���� ==> boolean ==> �� : true / false ==> if(���ǹ�)�� ����� �� �ַ� ����ϴ� ������
										  ==> ��
	
[�������� ��ȯ]
	boolean�� ũ�� �� �Ұ�. false or true ���̱� ������...
	
	�ڵ����� ��ĳ���õ�(������ ����ȯ ��, downĳ����)
	============> upcasting  (�ڵ�����ȯ)
				  downcasting(��������ȯ) <============	
	byte < short(char) < int < long < float < double

				  
	double d = 'a'; ==> ��µǴ� ���� : double ==> d=97.0
	int i = 'A'; 	==> ��µǴ� ���� : int    ==> i=65
	
	
	byte b1=10
	byte b2=20
	byte b3=b1+b2 ==> error, 30�� �ƴ� ==> byte�� ���ϸ� int�� �ٲ�� ������ ==> int�� ����ȯ�ؾ� ��
	
	byte a=10;
	byte b=30;
	byte c=(byte)(a*b); ==> 300�� byte�� �뷮 �ʰ� ==> 8�������� ��ȯ ==> c=44;
	byte c=(int)(a*b);  ==> c=300;
 	int c=a*b;    		==> c=300;

*/

public class �ڹٱ⺻�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		// ��� ���
		boolean b = false; // ��ҹ��� ���� ����, False�� error ==> 1byte
		System.out.println("b="+b);
		b=true;
		System.out.println("b="+b);
		
		System.out.println('ȫ');
		System.out.println((int)'ȫ');	// �� ���ڹ�ȣ�� ���ڸ� ������ �ִ�(char�� ���������� �ν��Ѵ�.)	
		
		System.out.println('A');
		System.out.println((int)'A');
		
		
	}

}
