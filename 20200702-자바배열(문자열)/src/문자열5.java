/*
	valueOf() => 모든 데이터형을 문자로 변환
	
	valueOf(10) ==> "10"
	valueOf(true) ==> "true"
	char[] c = {'H','e','l','l','o'};
	valueOf(c) = "Hello"
 */
public class 문자열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = {'H','e','l','l','o'};
		String msg = String.valueOf(c); // char[] ==> string으로 변환
		System.out.println(msg);
		
		String ss="Hello Java!!";
		char[] cc=ss.toCharArray(); // string ==> char[]로 변환
		System.out.println(cc); 
		
		int a=10;
		int b=20;
		System.out.println(String.valueOf(a)+String.valueOf(b));

	}

}
