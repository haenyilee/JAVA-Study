/*
	valueOf() => ��� ���������� ���ڷ� ��ȯ
	
	valueOf(10) ==> "10"
	valueOf(true) ==> "true"
	char[] c = {'H','e','l','l','o'};
	valueOf(c) = "Hello"
 */
public class ���ڿ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = {'H','e','l','l','o'};
		String msg = String.valueOf(c); // char[] ==> string���� ��ȯ
		System.out.println(msg);
		
		String ss="Hello Java!!";
		char[] cc=ss.toCharArray(); // string ==> char[]�� ��ȯ
		System.out.println(cc); 
		
		int a=10;
		int b=20;
		System.out.println(String.valueOf(a)+String.valueOf(b));

	}

}
