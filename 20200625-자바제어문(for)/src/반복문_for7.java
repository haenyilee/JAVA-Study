/*
	A - Z까지 출력
	a - z까지 출력
	(변수 사용에 주의~!)
 */
public class 반복문_for7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch);
		} // 블럭 닫겼으니, ch는 메모리에서 사라짐
		System.out.println(); // 줄바꾸는 방법 ==> 아래 내용은 다음줄에 출력하시오
		
		
		for(char ch='a';ch<='z';ch++) { 
			// 변수는 블럭만 닫히면 똑같은거 써도 상관없음~~!!!(지역변수)
			System.out.print(ch);
		}
		System.out.println(); // 줄바꾸는 방법 ==> 아래 내용은 다음줄에 출력하시오	
		
		
		for (int i=10;i>=1;i--) {
			System.out.printf("%d\t",i);
		}
		System.out.println();
		System.out.println("==========================================================================="); // 줄바꾸는 방법 ==> 아래 내용은 다음줄에 출력하시오		
		
		for (int i=1,j=10;i<=10;i++,j--) {
			// 조건식만은 무조건 하나만 나와야 함!!!!!!!!!!!
			System.out.println("i="+i+"   j="+j);
		}		
		
		


	}

}
