// trim(), replace()
public class ���ڿ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// trim : �� �� ���� ���ֱ�
		String s=" Hello Java ";
		System.out.println(s.trim());
		System.out.println(s);
		System.out.println(s=s.trim());
		System.out.println(s);
		
		
		// replace : ���� �ٲٱ�
		System.out.println(s.replace("o", "i"));
		System.out.println(s.replace(" ", "-"));
		System.out.println(s.substring(1,6));
	}

}
