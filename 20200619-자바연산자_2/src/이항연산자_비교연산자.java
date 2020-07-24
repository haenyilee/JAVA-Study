/*
 	이항 => 
 		산술 : 결과값을 알 수 없다
 				int + int = int
 				double + int = double
 				float + long = float
 		================
 		비교 : true/false
 		논리 : true/false
 		================ 조건문(if)
 		대입
 	
 	비교연산자 : 수와 수를 비교 => 정수, 실수, 문자, 논리
 			    문자열은 비교할 수 없다
 			  "Hello"=="Hello" ==> equals()로 비교해야 함
 				==> 문자열을 저장하는 데이터형 ==> String
 					Char c = 'Hello'
 					String s = "Hello"
 					
 		1) 종류
 			== : 같다		==> 10==20 (false)
 			!= : 같지 않다		==>	10!=20 (true)
 			<  : 작다		==> 10<10  (false)
 			>  : 작다		==> 10>10  (false)
 			<= : 작거나 같다	==> 10<=10 (true)
 								10<10 || 10=10		==> || : or
  			>= : 크거나 같다	==> 10>=10 (true)
  			
 		2) 결과값 : boolean
 		
 */



public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; 
		int b=9;
		char c = 'A';
		System.out.println(c++);		// c가 증가(x) ==> 후치니까 증가하기 전 값을 출력
		System.out.println(c);			// c가 증가(o)
		System.out.println(b++==a);		// false ==> b=9
		System.out.println(++b==a);		// false ==> b=11
		System.out.println(10==20); 	// false
		System.out.println(10!=20); 	// true
		System.out.println(10>10); 		// false
		System.out.println(10<10); 		// false
		System.out.println(10<=10); 	// true
		System.out.println(10>=10); 	// true
		
		System.out.println('A'==65);	// true
		// char는 연산을 수행하면 정수로 변환된다

	}

}
