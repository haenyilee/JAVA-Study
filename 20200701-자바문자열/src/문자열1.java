import java.util.Scanner;

/*
	���ڿ� �� : equals()
	================== (==)���Ұ�
	���� ã�� : contains()
	���۹��ڿ� : startWith()
	������ ���ڿ� : endsWidth()
	���ڿ� �ڸ��� : substring()
	���� ���� : charAt()
	������ ���� : length()
	���鹮�� ���� : trim()
	������ġ ã�� : indexOf() , lastIndexOf()
		aaa.java
	����ȯ : valueOf()
 */

// �α��� ó��
public class ���ڿ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// id, pwd
		final String ID="admin";
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ID�� �Է� :");
		String id=scan.nextLine();
		System.out.print("��й�ȣ �Է� :");
		String pwd=scan.nextLine();
		
		// ���
			// .equalsIgnoreCase : ��ҹ��� ����x
			// .equals : ��ҹ��� ����
		if(id.equalsIgnoreCase(ID) && pwd.equals(PWD)) {			// Ʋ������ : 	if(id==ID && pwd==PWD)
			System.out.println("�α��εǾ����ϴ�!!");
		}
		else {
			System.out.println("ID�� ��й�ȣ�� Ʋ���ϴ�!!");
		}
		
		
		
		
		
		
		
	}

}
