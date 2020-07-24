/*
	20200622 -> 제어문
	=> 종류
		1. 조건문
			(1) 단일 조건문
				if(조건문=> 결과  : true/false)
				{
					실행문장 => 조건이  true일 경우에 처리하는 문장
						   => 조건이 false가 되면 실행문장을 수행하지 않는다.
					
				}
				*** 모든 제어문은 {}을 사용하지 않으면 한 개의 문장만 수행한다.
				
				예)
					===========
					if (조건문)			
						실행문장1 => if가 제어하는 문장
					===========								
						실행문장2 => 무조건 실행하는 문장
			(2) 선택 조건문
				true일 경우 ==> 처리문장
				false일 경우 ==> 처리문장
				예) 로그인 처리가 될 경우, 로그인 처리가 안될 경우 / 아이디 중복 true or false
				
				형식) =========> 사용 빈도가 많다.
					if (조건문)
						조건이 true일 경우 처리 문장
					else
						조건이 false일 경우 처리 문장
						
			(3) 다중 조건문 : 조건에 해당하는 문장만 수행 => 한 번만 수행
				형식)
					if (조건문)
						실행문장1 => 조건이 true일 떄 수행하고 종료
					else if (조건문)
						실행문장2 => 조건이 true일 떄 수행하고 종료
					else if (조건문)
						실행문장3 => 조건이 true일 떄 수행하고 종료
					else if (조건문)
						실행문장4	 => 조건이 true일 떄 수행하고 종료					
					else
						실행문장5 => 조건에 해당하는 사항이 없는 경우
			
		
		2. 선택문
		3. 반복문
		4. 반복제어문
	=> 형식
	=> 흐름 이해
	=> 구현
	
	
	
 */
public class 자바단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 30;
		// score가 60 이상이면 통과
		// 60 이하면 실패
		if (score>=60)
		{
			System.out.println("첫번째 if문 수행");
			System.out.println("Success");
		}
		else
		{
			System.out.println("두번째 if문 수행");
			System.out.println("Fail");
		}

	}

}
