/*
	메소드
	=====
		1) 자동 메모리에 저장 => 정적 메소드
			=> 형식
			static 리턴형(결과값) 메소드명(매개변수...)
			{
				return 값
			}
		2) 프로그래머가 메모리를 만든 다움에 저장 => 인스턴스 메소드
			===>  new연산자를 이용하면 저장이 가능
			===> 프로그램의 중심
		
			리턴형(결과값) 메소드명(매개변수...)
			{
			 return 값
			}
		3) 메소드의 선언부만 사용 => 추상 메소드
 			리턴형(결과값) 메소드명(매개변수...); => 추상클래스(인터페이스)
 			
 		1. 메소드 형태
 			선언부 => 메모리에 저장이 안된다
 			구현부 => 메모리에 저장이 된다 => 필요한 위치에서 사용이 가능
 			
 			리턴형 메소드명(매개변수....) => 선언부
 			{
 				가공(처리)			=> 구현부
 				return 결과값
 			}
 			
 			결과값이 없는 경우에는 return 생략 가능함
 			=> JVM에서 자동으로 return추가해줌
 			return : 메소드가 종료하는 시점 => 모든 메소드에는 리턴이 있다
 			
 			=> 리턴형 (결과값) ===> (1) 결과값은 반드시 1개만 설정
 									기본형(정수, 실수...)
 								 (2) 데이터가 여러개일 경우, 데이터를 모아서 한 번에 전송(배열, 클래스)
 								
 			=> 사용자 입력값(매개변수, 인자, 인수) ==> 사용자 요청값
 				한개일 수 있고
 				여러개일 경우도 있다 ==> 매개변수는 되도록 3개 이상 초과(x)
 								   ========================== 배열, 클래스 
 				=> 10명의 국어점수 -> 평균구하기		
 			
 			=> return문 : 모든 메소드에서 반드시 사용 => 메소드 종료
 						  위치는 상관없다.
 						 예외사항 ) 결과값이 없는 경우는 생략이 가능
 						 
 			 

 */
/*
// 결과값 ? 사용자로부터 무슨 값을 받냐?(매개변수, 인자,인수)

// 사용자로부터 정수를 입력 받아서 ==> 헤당 구구단을 출력

	1) 결과값(ㅇ), 매개변수(ㅇ) ==> 구구단을 묶어서 넘겨준다.
	string
	2) 결과값(x), 메게변(o) ==> 메소드 안에서 출력
	void

public class 자바메소드1 {

*/

import java.util.*;
public class 자바메소드1 {
	static String gugudan1(int dan)
	{
		// 출력
		String gu="";
		for(int i=0;i<=9;i++)
			{
					gu+=dan+"*"+i+"="+dan*i+"\n";
			}
		return gu;
	}
	static void gugudan2(int dan)
	{
		// 전체 처리 --> 출력까지 안에서 처리?
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력:");
		int dan=scan.nextInt();
		*/
		/*
		gugudan2(3); // 메소드는 호출하면 항상 메소드의 시작부터 종료까지 방복
		gugudan2(5);
		// 구구단을 출력할 메소드 호출
		// gugudan2(dan);
		String gu = gugudan1(9); // 메소드 수행후에 결과값을 넘겨주고 
		//다음 문장으로 넘어간다
		System.out.println(gu);
		// 다음 문장으로 넘어간다
		*/
		for( int i=2;i<=9;i++)
		{
			String gu =gugudan1(i); // 반복적인 기능의 제
			System.out.println(gu);
		}
			
		return; // 메소드의 종료 ==> 자동 추가
		
		
		
		
		

	}

}
