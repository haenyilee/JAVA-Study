import java.util.Scanner;

// ��Ģ����

/*
	���� 
	==> ���� 2��
	==> ������(+,-,*,/)
 */
public class �������ǹ�3 {
	public static void main(String[] args) {
		// ���� 2��
		int a,b=0;
		
		// ������
		char op='+';
		
		// ������� �Է°��� �޴´�
		Scanner scan = new Scanner(System.in);
		System.out.println("�ΰ��� ���� �Է�:");
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.println("�������Է�(+,-,*,/):");
		op=scan.next().charAt(0);
		
		if(op=='+'){
			System.out.printf("%d+%d=%d\n",a,b,a+b);
		}
		
		else if(op=='-'){
			System.out.printf("%d-%d=%d\n",a,b,a-b);		
		}
		
		else if(op=='*'){
			System.out.printf("%d*%d=%d\n",a,b,a*b);			
		}	
		
		else if(op=='/'){
			if (b==0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else {
				System.out.printf("%d/%d=%.2f\n",a,b,a/(double)b);					
			}
		}
		else // ������ �ܿ� �ٸ� ���ڸ� �Է����� ���
		{
			System.out.println("�߸��� ������ �Է��Դϴ�!");
		}
		
		
	}

}
