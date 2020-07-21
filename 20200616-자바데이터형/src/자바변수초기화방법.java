/*

["변수 ==> 초기화" 방법]
1. 직접 처리
	int a = 100;
	
2. 선언 ==> 키보드에서 받아서 저장
3. 임의의 수를 저장하는 방식 (random) ==> 게임, 로또 
4. 입력창을 만들어서 값을 받는 방식



===> 선언과 동시에 초기값 부여 ==> 관리자용 웹에 주로 쓰임
	int a=100;
	
===> 선언하고 나중에 초기값을 부여 ==> 사용자용 웹에 주로 쓰임
	int a;
	a=100;

 */

import java.util.*;
// String, System, Math ==> java.lang ==> 생략가능


public class 자바변수초기화방법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1-1번 방법(직접 처리)
		int a = 100;
		System.out.println("a="+a);
		
		// 1-2번 방법(추후 처리)
		int b; // 선언하고
		b = 2; // 값을 나중에 초기화
		System.out.println("b="+b);
		
		// 3번 방법
		int c;
		c=(int)(Math.random()*100)+1; // random 은 double형이라서 int로 형변환 안하면 error
			/* 			==> random ==> 0.0 ~ 0.99 
						==> *100   ==> 0.0 ~ 99.0
						==> (int)  ==> 0 ~ 99
						==> +1     ==> 1 ~ 100
			*/
		System.out.println("c="+c);

		// 2번 방법
		int d;
		Scanner scan= new Scanner(System.in); 
								// System.in ==> 키보드 입력값을 읽어 온다
		System.out.println("정수입력:");
		d=scan.nextInt();
		
		System.out.println("d="+d);
		
	}

}
