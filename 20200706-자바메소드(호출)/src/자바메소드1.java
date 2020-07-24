/*
	변수 > 배열 > 클래스 > 파일 > 데이터 베이스
	=================================
	명령문 ==> 메소드(한 개의 기능) ==> 클래스 ==> 페키지 ==> ==>> .Jar(  )
		
	메소드
		= 사용자 정의 트렌드
		= 형식)
		= 반환형 메소드형(매개변수)
		{
			return 값; 값=변환형
			변환형이 없는 경우에는 => void, return 의 생걀이 감
			
		}
		
		= 호출)
		메소드를 호출할때는 메소명사+,kim
	
	메소드 : 특정 작업을 수행하기 위한 컴퓨터의 명령문의 집합
			*** 한가지 일만 수행할 수 있다 
			*** 세분화 작업
				======== 재사용에 목적 ==> import
				목적 : 재사용성, 중복된 코드 제거
				사용법 : 구조화(단락(기능))
			
			예) 숫자 야구 게임
			= 3자리 정수의 난수
			= 사용자에게 입력을 요청
			= 난수와 사용자 입력값을 비교
			= 힌트
			= 정답일 경우 종료
			= 다시 게임을 할지 말지 확인
	
	실행형식 => 메소드가 종료해야 => 다음 문장을 수행한다
		1) 목록출력
		2) 찾기(검색)
		3) 수정
		4) 삭제
		5) 추가
		==> 판매
	
 */
public class 자바메소드1 {
	static void aaa()
	{
		
		System.out.println("aaa() 호출 시작"); // 1
		bbb(); // bbb이동
		System.out.println("aaa() 호출 종료");	// 8
	}
	static void bbb()
	{
		System.out.println("bbb()호출 시작"); // 2
		ccc();
		System.out.println("bbb() 호출 종료");	// 7
		
	}
	static void ccc()
	{		
		System.out.println("ccc() 호출 시작"); // 3
		ddd();
		System.out.println("ccc() 호출 종료");	//   6
	}
	static void ddd()
	{		
		System.out.println("ddd() 호출 시작"); // 4
		aaa();
		System.out.println("ddd() 호출 종료");	// 5
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa(); // 시작하는 메소드를.....
	}

}
