import java.util.Scanner;

public class 제어문_단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		// a, b => 사용자가 입력
		// c => 연산 결과를 저장
		char op='+';
		
		// 사용자의 입력값을 받는다
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력: ");
		a=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		b=scan.nextInt();
		// '+' ==> "x"
		
		// char로 받을 땐, nextInt로 받지 않음
		System.out.print("연산자(+,-,*,/):");
		op=scan.next().charAt(0);
		
		// "+" ==> 'x'
		// Scanner => char를 받아서 처리하는 기능이 없다 => 문자열
		// System.in => 예외처리를 해야 한다
		
		// 연산처리 ==> 수행 4번하지만 다중 if를 쓰면 속도가 더 빠름
		if(op=='+')
		{
			System.out.printf("%d+%d=%d\n",a,b,a+b);
		}
		if(op=='-')
		{
			System.out.printf("%d-%d=%d\n",a,b,a-b);
		}
		if(op=='*')
		{
			System.out.printf("%d*%d=%d\n",a,b,a*b);
		}
		if(op=='/')
		{
			// 오류 처리 반드시 해야함
			if (b==0)
			{
				System.out.printf("0으로 나눌 수 없습니다.\n");
			}
			else {
				System.out.printf("%d/%d=%.2f\n",a,b,a/(double)b);
			}
		}
	
		System.out.println("프로그램 종료");
	}// main => end => 프로그램 종료
	 // main : 프로그램 시작, 종료 메소드
	 // 프로그램 ==> 클래스 (1) ==> 여러개

}
