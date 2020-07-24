/*
	선택문
	 => switch(정수, 문자, 문자열)
	 	{
	 		// 정수
	 		case 정수값: 			@주의 : 세미콜론(;)이 아니라 콜론(:)임
	 			처리문장
	 			==> if(조건){처리}
	 		case 정수값: 			@주의 : 정수값 자리에 중복된 값은 사용할 수 없다
	 			처리문장
	 		
	 			
	 	}
	 	
	 	switch(a)
	 	{
	 		case1 : 
	 		case1 : @오류 : 중복 값 사용
	 	}
	 	
	 	if (a==1){System.out.println("1");}
	 	if (a==1){System.out.println("일");} @오류	
	 	
	 	if (a==1){
	 		System.out.println("1");	 	
	 		System.out.println("일");} @정상	
	 		
	 		
	 	// 사용자 => 정수 1
	 	Switch(정수) 		==> break가 없는 경우에는 모든 문장을 수행
	 	{
	 		case 1:
	 			처리문장 1
	 		case 2:
	 			처리문장 2	 	
	 		case 3:
	 			처리문장 3
	 	}	 			
	 						==> 하나씩 수행하려면 각 case마다 break를 걸어줘야 함
	 						==> 두 개 이상 수행하려면 마지막 case에 break를 걸어줘야 두 개 동시 시행되는 경우 처리 가능함
	 			
	 			
	 			
 */

import java.util.*;
public class 선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수(1~5):");
		select=scan.nextInt();
		
		// 종료시점이 중요함 ==> break를 걸어줘야 하니까...안그러면 계속 실행함!
		switch(select)
		{
		case 1: // case1과 case2의 결과가 같으니까 라벨만 달아주면 됨 @주의 : case1,2:라고 작성하면 안됨! 무조건 따로따로 작성하기
			// System.out.println("1~2번을 입력하였습니다.");
			// break; 
		case 2:
			System.out.println("1~2번을 입력하였습니다.");
			break;	// switch문을 종료한다.
		case 3:
			System.out.println("3번을 입력하였습니다.");
			break;
		case 4:
			System.out.println("4번을 입력하였습니다.");
			break;
		case 5:
			System.out.println("5번을 입력하였습니다.");
			break;
		
		// 예외처리
		default:
			System.out.println("error : 1~5번까지의 숫자만 입력하세요!!");
			
		}
	}

}
