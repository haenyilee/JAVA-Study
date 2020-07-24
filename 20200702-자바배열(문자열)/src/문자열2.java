/*	
	문자열을 저장할 수 있는 공간 : String
	String : 일반변수의 역할
			  클래스의 역할 => 기능(메소드)
			 
			 주요 기능
			 	= 문자열 비교 : .equals()
			 	= 포함 문자 : contains()
			 	= 문자열중에 한 개 문자 : charAt()
			 	= 저장된 문자의 갯수 : length()
			 	= 문자 자르기 : substring()
			 	= 찾는 문자의 위치 확인 : indexOf(), lastIndexOf()
			 	= 모든 데이터형을 문자열로 변환 => valueOf()
			 	= 공백문자 제거 : trim() => 좌우만 제거
			 		" Hello Java " => "Hello Java"
			 	= 문자열을 char[]로 변환 가능 => toCharArray()
			 	= startsWith, endsWith => 검색기
			 	
			 	==============================================
			 	Wrapper Class
			 	=============
			 	기본형 데이터(정수,실수,문자,논리)
			 	int => Integer => "2" => 2 => parseInt("2") => 2
			 	"10" + "100" ==> 110
			 	===================== 10100
			 	double => Double Boolean, Float, Byte....
 */

// substring : 필요한 문자만 추출 => 형태소 분석(형용사,부사,명사)
/*
	
	1. 중간부터 끝까지 추출
	"Hello Java" => String => char[]
	       ==== substring(6)
	
	2. 2~5번째까지 추출
	"Hello Java"     
	  ==== substring(1,5)
	  
	substring(int start)
	substring(int start,int end)
						======= 이거 전까지만 추출됨(얘는 제외)
 */
public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="100-010";
				//  0123456 <= 자리수
		System.out.println(msg.substring(0,3));
		System.out.println(msg.substring(4,7));
		System.out.println(msg.substring(4));		

	}

}
