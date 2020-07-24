/*
 	메소드의 구성요소
 		메소드 : 기능, 행위, 동작
 		예)
	 		자판기 : 				=> 클래스
	 			동전 , 음료수		=> 변수
	 			동전 투입 시 처리 	=> 메소드
	 			버튼 누를때 처리		=> 메소드
	 			
 	메인 메소드 => 없으면 실행 안됨
 		메인 메소드는 시작하자마자 컴파일러가 호출하기 때문에 저장하기 전에 읽어줘야 하니까 static이 없으면 안됨
 		public 없으면 안됨
 		메인 메소드는 출력이나 하지 값을 넘겨주지 않으니까 void가 붙어....
 */

/*
 	초기화 블록
 	= 인스턴스 블록
 	
 	
 	= static 블록
 		class A(){
 			static int a;
 			static
 			{
 				a=10;
 			}
 		
 		}
 	
 	**** 초기화 블록 , 생성자를 같이 사용하는 경우는 거의 없음
 		class A {
 			int a=10;	==> 명시적 초기화
 			{
 				a=100;	==> 초기화 블록
 			}
 			A(){
 				a=1000;	==> 생성자 초기화
 			}
 		}
 */
public class MainClass2 {

	public static void main(String[] a) {
		// TODO Auto-generated method stub
		System.out.println("aaa");
		
	}

}
