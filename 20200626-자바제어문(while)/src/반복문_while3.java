/*
	��������
	======
	����
		= byte(-128~127)
		= int(-21��4õ~21��)
		= long
	�Ǽ�
		= double(8����Ʈ)
	����
		= char
	��
		= boolean(true/false)
	=========================== �⺻��
	������ ���� : �迭, Ŭ����
	========
	���ڿ��� �����ϴ� ���� => string
		char c='A' => ���� �� ���� ����
		string s="ABCDEFG" => ��, ������(��� �����Ͱ� ���ڿ�)
		====== =
		��������  ����
		
		==> String : Ŭ����
			���(�ڹ�����)
			=> ���ڰ��� Ȯ��
				string s = "ABCDEF";
				s.length()=6;
				 =========
			=> Ư�� �ڸ����� ��������
				string s="ABCDEF";
				s.charAt(0) = 'A';
 */

// ����ڰ� ���ڿ��� �Է�
// �빮�� ����, �ҹ��� ������ ����� Ȯ���غ���

import java.util.*;
public class �ݺ���_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=""; // ���ڿ����� ����
		
		Scanner scan=new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���>>");
		s=scan.nextLine(); // ���ڿ��� �Է¹޾��� �� ���� �����ؼ� ���������� nextLine! ** next()�� ���鿡�� �������
		System.out.println(s);
		System.out.println("����:"+s.length()+"��");
		
		int a=0; // �ҹ��ڰ��� 
		int b=0; // �빮�ڰ���
		
		int i=0; // �������� => ���� ������ŭ �����ϴ� ����
		
		
	/*
		���ڿ��� 0,1,2,.......8���̴ϱ� ������ ���ڴ� s.length()-1
		�׷��� ������ i<s.length()  ... (O)
				  i<=s.length() ... (X)
	 */
		while (i<s.length()) {
			char c=s.charAt(i);
			if(c>='A' && c<='Z')
			// if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				b++;
			if(c>='a' && c<='z') // else �ָ� �ȵǴ� ���� : ���ĺ� �̿��� ���ڸ� �Է����� ���� �ֱ� ������
				a++;
			i++;
		}
		System.out.println("�빮�ڰ���:"+b);
		System.out.println("�ҹ��ڰ���:"+a);

	}

}
