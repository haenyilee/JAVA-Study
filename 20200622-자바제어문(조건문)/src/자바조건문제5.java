/*
	char ���� ���� ==> ���� ����
	==> char alpha = 'A'
	==> alpha�� �빮�ڸ� ==> �ҹ��� ���
	==>        �ҹ��ڸ� ==> �빮�� ���
 */
public class �ڹ����ǹ���5 {
	public static void main(String[] args) {
		
		char alpha='J'; //A:65 ~Z:90, a:97~122
	
		if (alpha>=65 && alpha<91)
			System.out.println((char)(alpha+32));
		if (alpha>=97 && alpha<123)
			System.out.println((char)(alpha-32));
		
		
	}
}
