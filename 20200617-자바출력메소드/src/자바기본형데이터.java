/*
[자바 => 기본형]
	자바에서 지원하는 데이터형
	
	논리형 ==> boolean ==> 값 : true / false ==> if(조건문)을 사용할 때 주로 사용하는 데이터
										  ==> 턴
	
[데이터형 변환]
	boolean은 크기 비교 불가. false or true 뿐이기 때문에...
	
	자동으로 업캐스팅됨(강제로 형변환 시, down캐스팅)
	============> upcasting  (자동형변환)
				  downcasting(강제형변환) <============	
	byte < short(char) < int < long < float < double

				  
	double d = 'a'; ==> 출력되는 형식 : double ==> d=97.0
	int i = 'A'; 	==> 출력되는 형식 : int    ==> i=65
	
	
	byte b1=10
	byte b2=20
	byte b3=b1+b2 ==> error, 30이 아님 ==> byte를 더하면 int로 바뀌기 때문임 ==> int로 형변환해야 함
	
	byte a=10;
	byte b=30;
	byte c=(byte)(a*b); ==> 300은 byte의 용량 초과 ==> 8진법으로 변환 ==> c=44;
	byte c=(int)(a*b);  ==> c=300;
 	int c=a*b;    		==> c=300;

*/

public class 자바기본형데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		// 사용 방법
		boolean b = false; // 대소문자 구분 주의, False는 error ==> 1byte
		System.out.println("b="+b);
		b=true;
		System.out.println("b="+b);
		
		System.out.println('홍');
		System.out.println((int)'홍');	// 각 문자번호는 숫자를 가지고 있다(char는 정수형으로 인식한다.)	
		
		System.out.println('A');
		System.out.println((int)'A');
		
		
	}

}
