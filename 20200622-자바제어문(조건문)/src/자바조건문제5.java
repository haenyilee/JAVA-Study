/*
	char 변수 선언 ==> 값을 대입
	==> char alpha = 'A'
	==> alpha가 대문자면 ==> 소문자 출력
	==>        소문자면 ==> 대문자 출력
 */
public class 자바조건문제5 {
	public static void main(String[] args) {
		
		char alpha='J'; //A:65 ~Z:90, a:97~122
	
		if (alpha>=65 && alpha<91)
			System.out.println((char)(alpha+32));
		if (alpha>=97 && alpha<123)
			System.out.println((char)(alpha-32));
		
		
	}
}
