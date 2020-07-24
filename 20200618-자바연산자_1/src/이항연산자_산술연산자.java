/*
	이항연산자 
		산술연산자 (+ , - , * , / , %)
		=> 자바에서 제공하는 모든 연산자는 산술로 변환할 수 있다.
		
			5<<2 : 뒤에 0을 2개 채워라 ==> 5*(2의 2제곱)
				101 (5) ==> 10100 (20)
			9<<3 : 뒤에 0을 3개 채워라 ==> 9*(2의 2제곱)
				1001 (9) ==> 1001000 (72)
			>>
		=> 자바 프로그램에서 제일 많이 사용되는 연산자	
		=> 주의점
			1) 형변환 ==> 가장 큰 데이터형으로 변경
			2) /
				= 0으로 나누면 오류가 발생
				= 정수/정수=정수(결과값이 소수점으로 나와도 정수로 출력됨)
			3) %
				= 나누고 나머지를 가져옴 => 부호는 왼쪽편을 따라감
					-5 % 2 = -1
				
			4) 산술 연산자의 우선순위는 *, / , % 가 +, - 보다 우선순위가 높다
				=> 우선 순위를 잘 모르면 => ()를 이용해서 우선순위 결정
					3+(4*7)
 */
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int a = 10/0;
		// System.out.println(a);
		
		int b = 20;
		int c = 10;
		
		int d = b+c;
		int e = b-c;
		int f = b*c;
		int m = b/c;
		int n = b%c;
		
		System.out.printf("%d+%d=%d%n",b,c,d); // %n은 \n이랑 같은 기능임 ==> 출력 후 한 줄 띄우기 
		System.out.printf("%d-%d=%d%n",b,c,e);
		System.out.printf("%d*%d=%d%n",b,c,f);
		System.out.printf("%d/%d=%d%n",b,c,m);
		System.out.printf("%d%%%d=%d%n",b,c,n); // %는 %%로 표현해야 함
		
		

	}

}
