/*
	변수 명칭법 => 식별자 
	1) 알파벳(대소문자), 한글로 시작한다
	2) 숫자는 사용 가능(앞에 사용 금지)
	3) 키워드는 사용할 수 없다
	4) _ , $ 를 사용할 수 있다
	=============================적용(클래스명,메소드명)
	
	
	for 형식) 
			for (초기화;조건식;증감식){
				반복 수행하는 문장
				실행문장 			
			}
 */
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 블럭 있는 ver.
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello!!");
			System.out.println("Java=>For");
		}
		System.out.println();		
		
		// 블럭 없는 ver.
		for(int i=1;i<=5;i++)
			System.out.println("Hello!!");
			System.out.println("Java=>For");
		
			
		// AaBbCc......Zz 출력하기
		char a='a';
		
		for(char c='A';c<='Z';c++) {
			System.out.print(c+""+a++);
						//  ===   ====
						// 대문자     소문자
		}
		System.out.println();
		
		// 조건이 없이 1~10 ==> 홀수만 출력
	
		for(int b=1;b<10;b+=2) {
			System.out.print(b+"\t");
							// ====
							// 일정간격 띄어쓰기
		}
		System.out.println();
		
		
		// 조건이 없이 1~10 ==> 짝수만 출력
		
		for(int b=2;b<=10;b+=2) {
			System.out.print(b+"\t");
		}
		System.out.println();
				
		
		// 1~5출력 => 1,2,3,4,5,
		for(int i=1;i<=5;i++) {
			System.out.print(i+",");
		}
		System.out.println();
		
		
		// 1~5출력 => 1,2,3,4,5 ==> 맨 뒤에는 콤마 안찍히게 하는 법?
		for(int i=1;i<=5;i++) {
			System.out.print(i);
			if(i<5)
			System.out.print(",");
		}
		
		
		
	}

}
