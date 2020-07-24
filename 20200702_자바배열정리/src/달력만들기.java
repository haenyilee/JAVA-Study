/*
		프로그램
			= 데이터 저장
				변수 ===> 배열, 클래스
			= 명령문
				===> 명령문 묶기	==> 메소드
			=============================
			객체 지향 프로그램(Web)
			
		=======================================================
		데이터 저장
			한개		==> 	변수/상수
			여러개	==>		배열
		
		데이터 처리(사용자의 요청대로 처리)
			제어문, 연산자
		
		결과값 제시 ==> 도스, 윈도우, 브라우저, 핸드폰에 따라 형식 다름
		======================================================= 클래스			
		
		==> 테스트, 사용자가 입력값이 잘못되면 => 쉽게 종료
				=> if
				=> 예외처리
 */

// 년 월 입력 ==> 입력값 받기
import java.util.*;
public class 달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0,month=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("년도입력:");
		year=scan.nextInt();
		
		System.out.println("월 입력:");
		month=scan.nextInt();
		
		// 입력한 (년/월)출력
		System.out.println(year+"년 "+month+"월");
		
		// 요일 행 만들기
		String[] strWeek= {"일","월","화","수","목","금","토"};
		for(String week:strWeek) {
			System.out.print(week+"\t");
		}
		
		// 첫날 요일 구하기
		/*
			2020
			전년도까지의 총날수 1년~2019.12.31까지 총 날수 
			7
			전달까지의 합 2020.01.01 ~ 2020.06.30
			+1
		 */
		// 전년까지의 합
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100 	// 제외
				+(year-1)/400;
		// 전달 까지의 합
		int[] lastDay= {31,28,31,30,31,30,
						31,31,30,31,30,31};
		
			// 윤년 조건 설정
			if((year%4==0 && year%100!=0)||(year%400==0))
					lastDay[1]=29;
			else {
				lastDay[1]=28;
			}
		
		for(int i=0; i<month-1;i++) {
			total+=lastDay[i];
		}
		
		// 1일자의 요일
		total++;
		
		int week=total%7;
		// 달력 출력
		System.out.println();
		for(int i=1;i<=lastDay[month-1];i++) // 이해안감ㅋㅋ
		{
			if(i==1) {
				for(int j=0;j<week;j++) {
				System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			
			// 5일부터 밑에 출력되게 하기
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
		}
		
		
			

		
		
		
		
		
		
		
		
		
		
		

	}

}
