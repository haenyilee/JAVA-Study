/*
	���׿�����
	
 */
public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		char ccc=65;	// ����ȯ ���ؼ� ������ �Ұ���
		char cc = (char) (c+32);	// �ҹ��� ��ȯ => ����ȯ
		System.out.println(ccc);
		System.out.println(cc);
		System.out.println(cc>='A' && cc<='Z'?"�빮��":"�ҹ���");
		
		int x =2;
		int y=10;
		int z=0;
		z=x++*2+--y-5+x*(y%2);
		System.out.println(z);
		/*
			cc>='A' && cc<='Z' ==> �빮��
			cc<'A' && cc>'Z' ==> �ҹ���
			
		 */

	}

}
