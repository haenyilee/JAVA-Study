import java.util.Scanner; // sc ==> shift+space ==> Scanner �����ؼ� ���� ==> import �ڵ����� �ҷ���
import java.util.*; // �ڹ������ȿ� ��ƿ�����ȿ� ��� Ŭ���� �����Ͷ�~ �ӵ� ������ �� ����

public class �ڹ���¸޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// \n�� new line ==> ���ο� �ٿ� ���
		System.out.printf("%d*%d=%d\n",2,2,4); // \n �� ���̸� �ٹٲ�(new line)
		System.out.printf("%d*%d=%d\n",2,3,6);
		
		// \t�� tap ==> ������ ���� ����
		System.out.printf("%d*%d=%d\t",2,2,4); 
		System.out.printf("%d*%d=%d\n",3,2,6); // \t �� ���̸� tap����
		
		// ȭ�鿡�� �Է¹ޱ� - Scanner
		Scanner scan = new Scanner(System.in);
		/*
		 Scanner : ��������
		 scan : ����
		 new : �޸𸮿� ����(�޸� ũ�� �� ��, �޸� ũ�� �������ִ� ���� ==> ���ο� �޸𸮸� ����ٴ� ��)
		 Scanner(System.in) : �ʱ�ȭ
		 */

		System.out.println("1' ���� �Է�:");
		int a=scan.nextInt(); // nextInt�� �Էµ� ������ �о�ͼ� a��� �޸𸮰����� ����
		System.out.println("2' ���� �Է�:");
		int b=scan.nextInt();
		System.out.println("3' ���� �Է�:");
		int c=scan.nextInt();
		
		// ��� : (1) �� ���� �Է��ϰ� ����  or (2) �� ���� �Է��ϰ� �����̽�
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		// Scanner ==> ���������� ���
	}
}
