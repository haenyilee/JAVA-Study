import java.util.*;

public class ����13��15�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է��Ͻÿ�: ");
		int a,b,c;
		a=scan.nextInt();
		b=scan.nextInt();	
		c=scan.nextInt();
		
		System.out.println("a*b+c="+a*b+c);
		
		System.out.println("�� �ڸ� ������ �Է��ϼ���: ");
		int d;
		d=scan.nextInt();
		
		// e : ���� �ڸ�, f : ���� �ڸ�
		int e = d/10;
		int f = d%10;
		
		if (e==f)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		

	}

}
