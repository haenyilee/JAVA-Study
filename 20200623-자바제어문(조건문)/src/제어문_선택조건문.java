/*

	선택 조건문 
	if(조건문)
	{
		조건문이  true면 수행하는 문장 구현
	}
	else => 조건이 복잡한 것을 else에 넣는 것이 편함
	{
		조건문이 false일때 수행하는 문장 구현
	}
	
	조건문 ==> 핵심(조건 제작)
	
	==> 책 137페이지 참조
	-------------단일 조건일때
	== 
	-------------조건이 여러개일때
	&&
	||
	-------------
	
	문자열 ==> !=, ==을 사용하지 않는다
		 ==> 같다 : equals()
		 ==> 같지 않다 : !equals()

 */

import java.util.*;
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자한개를 입력받아서 => 알파벳인지 여부 확인\

		char ch='A'; // 변수 => 초기화
		/*
		 *  int => 0
		 *  double => 0.0
		 *  long => 0L
		 *  boolean => false
		 *  char => A
		 */
		// 문자한개 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하시오: ");

		// "ABC" => 자바는 모든 시작 번호가 0부터 시작함
		ch=scan.next().charAt(0); // 0은 첫번째 단어를 가져오겠다는 뜻

		
		if ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
			System.out.println(ch+"는 알파벳입니다!!!");
		}
		else {
			System.out.println(ch+"는 알파벳이 아닙니다...");
		}
		
		
		// 숫자 => 정수로 출력, 나머진 => 문자로 출력?

	}
}
