/*
	indexOf , lastIndexOf ==> ������ ��ġ ã�� ==> ������ ���ϵ�
	// �����ڸ��� => substring()
 */
public class ���ڿ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="dfsgagadffadsfaf.java";
		System.out.println(msg.indexOf('d'));
		System.out.println(msg.lastIndexOf('d'));
		System.out.println("Ȯ���� : " + msg.substring(msg.lastIndexOf(".")+1));
	}

}
