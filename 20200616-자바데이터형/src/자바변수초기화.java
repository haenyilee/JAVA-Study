
public class �ڹٺ����ʱ�ȭ{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int kor=78; int eng=85; int math=96;
		 * 
		 */
		/*
		 * [���ڿ� ����]   // ���� �ڿ� ���ϱ�� �÷����� �ƴ϶� ���ڸ� �̾��ִ� ������ ��
		 * =============
		 * 	7+7+"1"+7+7
		 *  ===
		 *  14 +"1"
		 *  ======
		 *  "141"  +7
		 *  ========
		 *  "1417"   +7
		 *  ========
		 *  "14177"
		 */
		/*
		 * System.out.println("����:"+ kor+eng+math); // ()�� ��ġ�� + �޺κ��� ���ڿ��� �ν��� ==> ���� : 788596�̵� 
		 * System.out.println("����:"+(kor+eng+math));
		 */
		int a=65;
		char c=65; // char ==> ����, ����
		System.out.println("a="+a); // ��� : a=65
		System.out.println("c="+c); // ��� : c=A
		
		// char�� ������ �Է��ص� ���ڰ� ��µ� (����,���� �����)
		/*
		 * 
		 * 
		 * long = int
		 * int = long (error)
		 * double = int, long, float
		 * int = double(error)
		 * (����) char = int
		 * 
		 * 
		 * ���� : [�޸𸮿� �����ϴ� ũ��]
		 * 	byte  < short < int < long < float < double 
		 * 			char
		 * ���� ������ ��, ������ �� ū ����������
		 * 
		 *  
		 */
		
		System.out.println(100); // 100�� int
		System.out.println(10.8); // 10.8�� double
		
		int d=97;
		char b=97;
		System.out.println("d="+d);  // ��� : d=97
		System.out.println("b="+b);  // ��� : b=a
		
		int e=1;
		int f='1';
		System.out.println("e="+e);  // ��� : e=1
		System.out.println("f="+f);  // ��� : f=49

		
	}

}
