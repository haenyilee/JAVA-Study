import java.util.Scanner;

public class ���_�������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		// a, b => ����ڰ� �Է�
		// c => ���� ����� ����
		char op='+';
		
		// ������� �Է°��� �޴´�
		Scanner scan=new Scanner(System.in);
		System.out.println("ù��° ���� �Է�: ");
		a=scan.nextInt();
		
		System.out.print("�ι�° ���� �Է�:");
		b=scan.nextInt();
		// '+' ==> "x"
		
		// char�� ���� ��, nextInt�� ���� ����
		System.out.print("������(+,-,*,/):");
		op=scan.next().charAt(0);
		
		// "+" ==> 'x'
		// Scanner => char�� �޾Ƽ� ó���ϴ� ����� ���� => ���ڿ�
		// System.in => ����ó���� �ؾ� �Ѵ�
		
		// ����ó�� ==> ���� 4�������� ���� if�� ���� �ӵ��� �� ����
		if(op=='+')
		{
			System.out.printf("%d+%d=%d\n",a,b,a+b);
		}
		if(op=='-')
		{
			System.out.printf("%d-%d=%d\n",a,b,a-b);
		}
		if(op=='*')
		{
			System.out.printf("%d*%d=%d\n",a,b,a*b);
		}
		if(op=='/')
		{
			// ���� ó�� �ݵ�� �ؾ���
			if (b==0)
			{
				System.out.printf("0���� ���� �� �����ϴ�.\n");
			}
			else {
				System.out.printf("%d/%d=%.2f\n",a,b,a/(double)b);
			}
		}
	
		System.out.println("���α׷� ����");
	}// main => end => ���α׷� ����
	 // main : ���α׷� ����, ���� �޼ҵ�
	 // ���α׷� ==> Ŭ���� (1) ==> ������

}
