/*
	제어문
	=====
		1) 조건문
			= 단일 조건문 ==> 단독 수행
				=> if(조건문) => (true와 false) 비교연산자, 논리연산자, 부정연산자
					{
						조건문이 true일때만 수행하는 문장 : 산술연산자, 대입연산자
						
					}
			= 선택 조건문 ==> true / false 나눠서 처리
				=> if(조건문)
					{
						조건문이 true일때 처리
					}
					else
					{
						조건문이 false일때 처리되는 문장
					}
					==> ID중복체크에 사용되는 로직?
			= 다중 조건문 ==> 한 개의 조건만 수행하게 만듬
				if(조건문){
				
				}
				else if(조건문){
				
				}
				else if(조건문){
				
				}
				else{
				
				}
			
		2) 선택문
			=> 조건이 많이 있는 경우에 주로 사용 (web => 조건 => if)
			=> 게임
			=> 한개의 값을 선택시에 처리
				=> 네트워크
			
			switch(정수,문자,문자열)
			{
				case 정수:
					처리
					break;
				case 정수:
					처리
					break;					
				case 정수:
					처리
					break;					
				case 정수:
					처리
					break;					
				default:
					해당 정수가 없는 경우
			}
		
		3) 반복문
			= for**** : 횟수가 지정되어 있을 때
				= 제어 : 값변경, 수정, 다른기능  : 일반 for
					for(초기값;조건식;증가식)
					{
						처리문장
						처리문장
					}
				= 출력
					for(실제 데이터를 받을 변수:저장된 데이터)
					
					서버 : JSP,Spring,Oracle => 일반 for
					클라이언트 : HTML,CSS,JavaScript => for-each
					
					
			= while**** : 횟수가 애매할때 --> length 활용하면 글자수는 알 수 있으니까 for 쓸 수 있음 / 종료조건 반드시!
			= do-while
		
		4) 반복제어문
		
 */


public class 제어문정리 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	

	}
}