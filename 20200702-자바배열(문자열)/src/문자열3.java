/*
	indexOf , lastIndexOf ==> 문자의 위치 찾기 ==> 정수값 리턴됨
	// 문자자르기 => substring()
 */
public class 문자열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="dfsgagadffadsfaf.java";
		System.out.println(msg.indexOf('d'));
		System.out.println(msg.lastIndexOf('d'));
		System.out.println("확장자 : " + msg.substring(msg.lastIndexOf(".")+1));
	}

}
