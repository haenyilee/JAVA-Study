/*
	A - Z���� ���
	a - z���� ���
	(���� ��뿡 ����~!)
 */
public class �ݺ���_for7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch);
		} // �� �ݰ�����, ch�� �޸𸮿��� �����
		System.out.println(); // �ٹٲٴ� ��� ==> �Ʒ� ������ �����ٿ� ����Ͻÿ�
		
		
		for(char ch='a';ch<='z';ch++) { 
			// ������ ���� ������ �Ȱ����� �ᵵ �������~~!!!(��������)
			System.out.print(ch);
		}
		System.out.println(); // �ٹٲٴ� ��� ==> �Ʒ� ������ �����ٿ� ����Ͻÿ�	
		
		
		for (int i=10;i>=1;i--) {
			System.out.printf("%d\t",i);
		}
		System.out.println();
		System.out.println("==========================================================================="); // �ٹٲٴ� ��� ==> �Ʒ� ������ �����ٿ� ����Ͻÿ�		
		
		for (int i=1,j=10;i<=10;i++,j--) {
			// ���ǽĸ��� ������ �ϳ��� ���;� ��!!!!!!!!!!!
			System.out.println("i="+i+"   j="+j);
		}		
		
		


	}

}
