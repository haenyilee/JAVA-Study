/*
	�������� ==> ����� ������ �޸𸮿��� ������� ����
	�� case������ {}���� ���ߴµ� �������� �����ϸ� �ȵ� ==> ���������̱� ������ ==> ��ϼ����ؼ� ���������� �ٲ���� ��!
 */
public class ���ù�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		// {int a=10} ==> a�� ���������� ��� ������ ���ÿ� �޸𸮿��� �����
		
		switch (a) {
		case 10:
			int b=100;
			System.out.println("a="+a+", b="+b);
			break;
		case 11:
			int c=200; // ���� �̸��� b�� �����ϸ�, ���� ��ϰ� �ߺ��Ǳ� ������ error ==> 1) ��ϼ����ϰų� 2) �ٸ� ������ ����ϱ�
			System.out.println("a="+a+" ,c="+c);

		default:
			break;
		}

	}

}
