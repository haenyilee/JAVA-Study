/*
	�迭 = �뵵���� ��� ����Ѵ�.
	== ���� ������[] �����;
		====�⺻��
		byte[] b => File ����
		String[] s => ���ڿ��� ���� ���(�̸�, �ּ�, ��ȭ��ȣ)
		int[] i => �������, ���
		double[] d => ���, �󵵼�, ������
		boolean[] b => ���翩��
 */
public class �ڹٹ迭_�뵵4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {
				"raisin",
				"cherry",
				"peach",
				"japanese apricot",
				"mango",
				"tomato",
				"coconut"
		};
		// ���� : ���ϸ��߿� ���� �������?
		// ��ü ���� ���
		System.out.println("======== ��ü ���ϸ� =======");
		for(String ss:s) { // for-each�� index ����x, ���� ������ �� ����
			System.out.println(ss);
		}
		System.out.println("==========================");
		System.out.println("���ϸ��߿� ���� �������?");
		int max=0;
		for(String ss:s) {
			int len=ss.length(); // ���ڿ� => ������ ����(length())
			if(max<len)
				max=len;
		}
		
		// ���
		for(String ss:s) {
			if(ss.length()==max) {
				System.out.println(ss);
			}
		}
		
		// ���� : ���ϸ��߿� ���� ª��������?
		// ��ü ���� ���


		System.out.println("==========================");
		System.out.println("���ϸ��߿� ���� ª��������?");
		int min=100;
		for(String ss:s) {
			int len=ss.length(); // ���ڿ� => ������ ����(length())
			if(min>len)
				min=len;
		}
		
		// ���
		for(String ss:s) {
			if(ss.length()==min) {
				System.out.println(ss);
			}
		}	
		
		
		// ���� ���� Ȯ�� ==> ��й�ȣ
		/*
			���ڿ� ==> 
			String ==> char[] ==> ���۹�ȣ�� ==> 0
			"Hello Java"
			0123456789
		 */
		String msg="Hello Java";
		System.out.println("5��° ���ڴ�?");
		System.out.println(msg.charAt(4)); // 0������ �����ϱ� ������ 5����==> charAt(4)
		
		// ��ü ���� ���
		for(int i=0;i<msg.length();i++) {
			System.out.println(msg.charAt(i)); // 0������ �����ϱ� ������ 5����==> charAt(4)
		}
				
		
		
		
		
		
		
		
		
	}

}
