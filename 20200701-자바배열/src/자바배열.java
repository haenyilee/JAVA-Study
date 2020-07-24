/*
	배열
		=> 여러개의 변수를 하나로 묶어서 관리
		   (변수 이름을 한 개를 가지고 사용 => 배열명)
		    변수가 여러개이기 때문에 구분이 필요함 ==> 인덱스(첨자)로 해결!
		    *** 주의점 : 인덱스 번호는 0부터 시작
		=> 배열의 갯수를 가지고 올때 => 배열명.length()
		=> 배열 선언
			int[] 배열명=new int[변수갯수]; => int는 0으로 초기화
			int[] arr = new int[5];
			double[] arr = new double[5]; => double은 0.0으로 초기화
			=======
			데이터형
			문자열 여러개
			String[] arr= new String[10] => string은 특이하게 null로 초기화
			*** 모든 클래스 ==> 주소를 가지고 있다(주소 없는 경우 : null)
		=> 배열 초기화
			1) new를 이용해서 자동 초기화
			2) 프로그래머가 직접 입력하는 방식
				int[] arr={10,20,30,40};
			3) 사용자가 입력 , 난수 발생
		
		=> 배열 값 변경
			배열명[원하는 위치] = 값
			     =========
			     	인덱스
			     ex. 10개 중에 7번째 값을 변경하려면? 배열명[6]=바꿀값 ==> 일반변수와 동일한 취급 
			
		=> 배열 값 출력
			0부터 시작하기 때문에 for문을 사용하기 용이하다 => while문 사용이 가능
			=> 일반 for문 : ==> 인덱스 사용
				========================배열값을 변경 , 제어
			=> for-each ==> 실제 저장된 값을 읽어 온다
				===============================출력용으로 주로 사용
 */

// 사용자가 년,월,일을 입력하면 ==> 요일 출력

import java.util.*;
public class 자바배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 년도, 월, 일 받는 변수가 필요함
		int year=0,month=0,day=0;
		// 사용자로부터 요청값을 받는다
		Scanner scan=new Scanner(System.in);
		System.out.println("년도를 입력하세요 >>");
		year=scan.nextInt();
		// scan.nextInt ==> 키보드로 입력된 정수값을 읽어오는 역할
		System.out.println("월을 입력하세요 >>");
		month=scan.nextInt();
		System.out.println("일을 입력하세요 >>");
		day=scan.nextInt();
		
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		// 요일 구하기
		/*
		 									<2020년 7월 1일 => 요일 구하려면?>
			1) 전년도까지의 총날수 구하기 			=> 2019년도 12월 31일까지 계산
			2) 전달까지의 총날수 				=> 2020년 1월 1일 ~ 2020년 6월 30일까지 계산
			3) 입력된 DAY까지 총날수를 구한다.		=> 1일 더하기
			=========================== +
			=> 전체 총 날수 % 7 ==> 요일 구할 수 있음
			   ============
			   0(일요일), 1(월요일), 2(화요일)........6(토요일)
			   ==> 1년도 1월 1일 ==> 월요일부터 시작
		 */
			//	전년도까지의 총 날수 구하기
			int total =(year-1)*365
					+(year-1)/4
					-(year-1)/100
					+(year-1)/400;
				// 윤년 => 366일 => 4년마다, 100년마다(제외), 400년마다 => 로마시대때부터 내려옴...
			
		
			// 전달까지의 합
			int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
				// 1월 => 0
				// 2월 => total+31
				// 3월 => total+31+28
				// 단, 2월은 29일까지 있을 때도 있음
			
			if((year%4==0 && year%100!=0)||(year%400==0)) // 윤년조건
			{
				lastDay[1]=29;
			}
			else {
				lastDay[1]=28;
			}
			
			for(int i=0;i<month-1;i++) {
				total+=lastDay[i];
			}
			
			// 입력된 Day 합하기
			total+=day;
		
			// 요일 구하기
			int week=total%7;
			char[] strWeek= {'일','월','화','수','목','금','토'};
			System.out.println(strWeek[week]+"요일입니다");
			
//			switch(week) {
//
//			case 0:
//				System.out.println("일요일입니다");
//				break;
//			case 1:
//				System.out.println("월요일입니다");
//				break;
//			case 2:
//				System.out.println("화요일입니다");
//				break;
//			case 3:	
//				System.out.println("수요일입니다");
//				break;
//			case 4:
//				System.out.println("목요일입니다");
//				break;
//			case 5:
//				System.out.println("금요일입니다");
//				break;
//			case 6:
//				System.out.println("토요일입니다");
//				break;
//			}
		
		
		
		
		
		
		
		
		
		

	}

}
