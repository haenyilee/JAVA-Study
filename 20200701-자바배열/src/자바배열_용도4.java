/*
	배열 = 용도별로 묶어서 사용한다.
	== 선언 데이터[] 베얄먕;
		====기본형
		byte[] b => File 전송
		String[] s => 문자열이 많은 경우(이름, 주소, 전화번호)
		int[] i => 성적계산, 통계
		double[] d => 통계, 빈도수, 레이팅
		boolean[] b => 존재여부
 */
public class 자바배열_용도4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {
				"raisin",
				"cherry",
				"peach",
				"japanese apricot",
				"mango",
				"tomato",
				"coconut"
		};
		// 문제 : 과일명중에 가장 긴과일은?
		// 전체 과일 출력
		System.out.println("======== 전체 과일명 =======");
		for(String ss:s) { // for-each는 index 존재x, 값을 변경할 수 없음
			System.out.println(ss);
		}
		System.out.println("==========================");
		System.out.println("과일명중에 가장 긴과일은?");
		int max=0;
		for(String ss:s) {
			int len=ss.length(); // 문자열 => 문자의 갯수(length())
			if(max<len)
				max=len;
		}
		
		// 출력
		for(String ss:s) {
			if(ss.length()==max) {
				System.out.println(ss);
			}
		}
		
		// 문제 : 과일명중에 가장 짧은과일은?
		// 전체 과일 출력


		System.out.println("==========================");
		System.out.println("과일명중에 가장 짧은과일은?");
		int min=100;
		for(String ss:s) {
			int len=ss.length(); // 문자열 => 문자의 갯수(length())
			if(min>len)
				min=len;
		}
		
		// 출력
		for(String ss:s) {
			if(ss.length()==min) {
				System.out.println(ss);
			}
		}	
		
		
		// 문자 갯수 확인 ==> 비밀번호
		/*
			문자열 ==> 
			String ==> char[] ==> 시작번호가 ==> 0
			"Hello Java"
			0123456789
		 */
		String msg="Hello Java";
		System.out.println("5번째 문자는?");
		System.out.println(msg.charAt(4)); // 0번부터 시작하기 떄문에 5번쨰==> charAt(4)
		
		// 전체 글자 출력
		for(int i=0;i<msg.length();i++) {
			System.out.println(msg.charAt(i)); // 0번부터 시작하기 떄문에 5번쨰==> charAt(4)
		}
				
		
		
		
		
		
		
		
		
	}

}
