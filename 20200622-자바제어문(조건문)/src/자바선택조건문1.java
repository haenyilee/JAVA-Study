/*
	�������ǹ� : if ~ else
		==> �α��� ó��
		==> ���̵� �ߺ�üũ
		==> �۾��� (����/���)
		==> ¦�� / Ȧ��
		==> �빮�� / �ҹ���

	����)
		if (���ǹ�)
		{
			������ true�� �� ó���ϴ� ����
		}
		else
		{
			������ false�� �� ó���ϴ� ����
		}
	
 */

import java.util.Scanner; // Ű����κ��� �Է°��� �޴´�. 
public class �ڹټ������ǹ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner ���� ==> Ű������ �Է°��� �ִ� ��쿡 ó��
		Scanner scan = new Scanner(System.in);
		// �ڹ��� ��� Ŭ����, ����� ���� Ŭ���� ==> ������ �� �� �ݵ�� new �̿��ؼ� ����
		// System.in �� ����� Ű���� �Է°��� �޴´�
		// System.out �� ����Ϳ� ����� �� ���
		System.out.println("������ �Է�(1~100): ");
		int a=scan.nextInt(); // �Էµ� ���� �޾Ƽ� a��� �޸� ������ ����
		// 1~100������ ������ �Էµ��� �ʾҴٸ�
		// ���α׷��� ������ ����
		if(a<1 || a>100) // if(!(a>=1 && a<=100))
		{
			System.out.println("�߸��� �Է��Դϴ�\n���α׷��� �����մϴ�.");
		}
		else {
			// 1~100���� ������ ������ �ԷµǾ��ٸ�
			System.out.println(a+"�� �ԷµǾ����ϴ�.");
		}

	}

}
