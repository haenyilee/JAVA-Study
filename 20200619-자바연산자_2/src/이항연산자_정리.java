/*
	응용시에 많이 사용하는 연산자
		==> 증감연산자(++ , --)
		==> 산술연산자(+ , - , * , / , %)
		==> 비교연산자, 논리연산자
		==> 대입연산자
		
		==> 기타 연산자
			==> 삼항연산자	==>	if ~ else랑 자주 쓰임	==> 게임에서 많이 나옴
				조건? 값1:값2
				====
				=> true : 값1 / false : 값2
 */

import java.util.*;
// import java.lang.* ==> System, String, Math
// 정수를 입력받아서 짝수인지 홀수인지 출력하는 코드
public class 이항연산자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// system.in  : 키보드 입력
		// system.out : 화면
		
		System.out.println("정수입력:");
		// 입력받은 정수를 저장한다
		int a = scan.nextInt();
		System.out.println(a%2==0? "짝수입니다":"홀수입니다");
		
		int b = (int)(Math.random()*100)+1;
		
		//		===== ==================== ==
		//		2		1					3
		/*
			연산자 우선순위
			1) () 	   : (0.0 ~0.99)*100 = 0.0~99.0
			2) 단항연산자 : 0 ~ 99
			3) 이항연산자 : 1 ~ 100
			
		 */
		System.out.println("b="+b);
		System.out.println(b%2==0? "짝수입니다":"홀수입니다");
	
	}

}
