/*
	데이터형
	======
	정수
		= byte(-128~127)
		= int(-21억4천~21억)
		= long
	실수
		= double(8바이트)
	문자
		= char
	논리
		= boolean(true/false)
	=========================== 기본형
	참조형 변수 : 배열, 클래스
	========
	문자열을 저장하는 변수 => string
		char c='A' => 문자 한 개만 저장
		string s="ABCDEFG" => 웹, 윈도우(모든 데이터가 문자열)
		====== =
		데이터형  변수
		
		==> String : 클래스
			기능(자바제공)
			=> 문자개수 확인
				string s = "ABCDEF";
				s.length()=6;
				 =========
			=> 특정 자리문자 가져오기
				string s="ABCDEF";
				s.charAt(0) = 'A';
 */

// 사용자가 문자열을 입력
// 대문자 갯수, 소문자 갯수가 몇개인지 확인해보기

import java.util.*;
public class 반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=""; // 문자여러개 저장
		
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열을 입력하세요>>");
		s=scan.nextLine(); // 문자열을 입력받았을 때 공백 포함해서 가져오려면 nextLine! ** next()는 공백에서 끊어버림
		System.out.println(s);
		System.out.println("갯수:"+s.length()+"자");
		
		int a=0; // 소문자갯수 
		int b=0; // 대문자갯수
		
		int i=0; // 루프변수 => 문자 개수만큼 증가하는 변수
		
		
	/*
		문자열은 0,1,2,.......8번이니까 마지막 글자는 s.length()-1
		그래서 범위가 i<s.length()  ... (O)
				  i<=s.length() ... (X)
	 */
		while (i<s.length()) {
			char c=s.charAt(i);
			if(c>='A' && c<='Z')
			// if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				b++;
			if(c>='a' && c<='z') // else 주면 안되는 이유 : 알파벳 이외의 문자를 입력했을 수도 있기 때문에
				a++;
			i++;
		}
		System.out.println("대문자갯수:"+b);
		System.out.println("소문자갯수:"+a);

	}

}
