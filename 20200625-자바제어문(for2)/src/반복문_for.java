/*
	���� ��Ī�� => �ĺ��� 
	1) ���ĺ�(��ҹ���), �ѱ۷� �����Ѵ�
	2) ���ڴ� ��� ����(�տ� ��� ����)
	3) Ű����� ����� �� ����
	4) _ , $ �� ����� �� �ִ�
	=============================����(Ŭ������,�޼ҵ��)
	
	
	for ����) 
			for (�ʱ�ȭ;���ǽ�;������){
				�ݺ� �����ϴ� ����
				���๮�� 			
			}
 */
public class �ݺ���_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �ִ� ver.
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello!!");
			System.out.println("Java=>For");
		}
		System.out.println();		
		
		// �� ���� ver.
		for(int i=1;i<=5;i++)
			System.out.println("Hello!!");
			System.out.println("Java=>For");
		
			
		// AaBbCc......Zz ����ϱ�
		char a='a';
		
		for(char c='A';c<='Z';c++) {
			System.out.print(c+""+a++);
						//  ===   ====
						// �빮��     �ҹ���
		}
		System.out.println();
		
		// ������ ���� 1~10 ==> Ȧ���� ���
	
		for(int b=1;b<10;b+=2) {
			System.out.print(b+"\t");
							// ====
							// �������� ����
		}
		System.out.println();
		
		
		// ������ ���� 1~10 ==> ¦���� ���
		
		for(int b=2;b<=10;b+=2) {
			System.out.print(b+"\t");
		}
		System.out.println();
				
		
		// 1~5��� => 1,2,3,4,5,
		for(int i=1;i<=5;i++) {
			System.out.print(i+",");
		}
		System.out.println();
		
		
		// 1~5��� => 1,2,3,4,5 ==> �� �ڿ��� �޸� �������� �ϴ� ��?
		for(int i=1;i<=5;i++) {
			System.out.print(i);
			if(i<5)
			System.out.print(",");
		}
		
		
		
	}

}
