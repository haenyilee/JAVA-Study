// trim(), replace()
public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// trim : 앞 뒤 공백 없애기
		String s=" Hello Java ";
		System.out.println(s.trim());
		System.out.println(s);
		System.out.println(s=s.trim());
		System.out.println(s);
		
		
		// replace : 문자 바꾸기
		System.out.println(s.replace("o", "i"));
		System.out.println(s.replace(" ", "-"));
		System.out.println(s.substring(1,6));
	}

}
