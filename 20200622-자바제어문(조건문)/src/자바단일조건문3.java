import sun.security.krb5.KdcComm;

/*
	���ǹ� �����ϴ� ���
	
	if(���ǹ�) : ������� ������ true / false
		==> �ʿ��� ��쿡�� ������ ���� : ������ true�� ����
			false�� ��쿡�� �ǳʶ�(������ �������� ���Ѵ�)
 */
public class �ڹٴ������ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ĺ��� ���� ==> �빮��, �ҹ���
		char alpha= 'n';
		if(alpha>='A' && alpha<='Z')
			System.out.println(alpha+"��(��) �빮���̴�");
		if (alpha>='a' && alpha<='z')
			System.out.println(alpha+"��(��) �ҹ����̴�");
		if(alpha>='0' && alpha<='9')
			System.out.println(alpha+"��(��) �����̴�");
		if(alpha>='��' && alpha<='�R')
			System.out.println(alpha+"��(��) �ѱ��̴�");
		
		// Ư������
		if (alpha =='\t' || alpha=='\n')
			System.out.println("Ư�������Դϴ�");
	}

}
