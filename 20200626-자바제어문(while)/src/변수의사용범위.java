/*
	���� Scope
	=========
	������ ����
	=========
	1. �������� 
	2. �������
	3. ��������
		public class A
		{
			int a; ==> ������� ==> Ŭ���� A�� ������ �ɶ����� ����
			static int b; ==> �������� ==> ����ӽ�(JVM)�� Ŭ������ �ε��������� ����
			=============================================================
				public static void main(String[] args) 
				{
					int c; // �������� ==> main������ ��� ������ ���� ==> ���� ������ �������!
				}
			
		}
 */
public class �����ǻ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		for(i=1;i<=10;i++) {
			System.out.print("i="+i+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.print("i="+i);
		
		System.gc(); // �޸� ȸ��(������Ŀ����)
		
		System.out.println();
		System.out.println();
		
		// for��
		System.out.println("<for��>");
		for(i=1;i<=5;i++) {
			System.out.print(i+" ");			
		}
		
		System.out.println();
		System.out.println();
		
		// while��
		System.out.println("<while��>");
		i=1;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		System.out.println();
		
		// do-while��
		System.out.println("<do-while��>");
		i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=5);
			

	}

}
