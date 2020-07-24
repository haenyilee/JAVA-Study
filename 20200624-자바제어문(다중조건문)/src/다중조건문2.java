// 각 달의 마지막 날짜 출력

/*
	6입력 ==> 30 출력
	7입력 ==> 31 출력
 */

/*
 	31,28,31,30,31,30
 	31,31,30,31,30,31
 	==> 조건 3개 : 28, 30, 31
 */

import java.util.*;
public class 다중조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		int month;
		
		// 사용자의 입력값 받기
		Scanner scan = new Scanner(System.in);
		/*
			정수 ==> nextInt()
			문자열 ==> next(), nextLine()
			실수 ==> nextDouble()
			논리 ==> nextBoolean()			
		 */
		System.out.println("month(1~12月) : ");
		
		// 메모리에 저장 ==> 변수
		month=scan.nextInt();
		
		// 가공 ==> 연산자, 제어문 ==> 메소드
		
		/* 안 좋은 예(하드코딩?) ==> 최적화(퍼포먼스,속도), 가독(소스코딩이 적어야 함 --> 로직)
		if(month==1)
			System.out.println(month+"월은 31일 까지 있습니다.");
		else if(month==2)
			System.out.println(month+"월은 28일 까지 있습니다.");		
		else if(month==3)
			System.out.println(month+"월은 31일 까지 있습니다.");
		else if(month==4)
			System.out.println(month+"월은 30일 까지 있습니다.");		
		else if(month==5)
			System.out.println(month+"월은 31일 까지 있습니다.");		
		else if(month==6)
			System.out.println(month+"월은 30일 까지 있습니다.");		
		else if(month==7)
			System.out.println(month+"월은 31일 까지 있습니다.");		
		else if(month==8)
			System.out.println(month+"월은 31일 까지 있습니다.");		
		else if(month==9)
			System.out.println(month+"월은 30일 까지 있습니다.");		
		else if(month==10)
			System.out.println(month+"월은 31일 까지 있습니다.");		
		else if(month==11)
			System.out.println(month+"월은 30일 까지 있습니다.");
		else if(month==12)
			System.out.println(month+"월은 31일 까지 있습니다.");		
		*/
		
		/* 중수 ==> 조건이 가장 많은 것을 else로 뺄 수 있어야 고수~
		if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
			System.out.println(month+"월은 31일까지 있다.");
		else if (month==4 || month==6 || month==9 || month==11)
			System.out.println(month+"월은 30일까지 있다.");		
		else
			System.out.println(month+"월은 28일까지 있다.");		
		*/
		
		if (month==2)
			System.out.println(month+"월은 28일까지 있다.");
		else if (month==4 || month==6 || month==9 || month==11)
			System.out.println(month+"월은 30일까지 있다.");		
		else //  else부분엔 오류처리(문자입력) 혹은 조건이 가장 많은 부분이 들어가야 함~!
			System.out.println(month+"월은 31일까지 있다.");		
		
	}

}
