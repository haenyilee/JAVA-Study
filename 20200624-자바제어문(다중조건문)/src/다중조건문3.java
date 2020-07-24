import java.util.Scanner;

// 사칙연산

/*
	변수 
	==> 정수 2개
	==> 연산자(+,-,*,/)
 */
public class 다중조건문3 {
	public static void main(String[] args) {
		// 변수 2개
		int a,b=0;
		
		// 연산자
		char op='+';
		
		// 사용자의 입력값을 받는다
		Scanner scan = new Scanner(System.in);
		System.out.println("두개의 정수 입력:");
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.println("연산자입력(+,-,*,/):");
		op=scan.next().charAt(0);
		
		if(op=='+'){
			System.out.printf("%d+%d=%d\n",a,b,a+b);
		}
		
		else if(op=='-'){
			System.out.printf("%d-%d=%d\n",a,b,a-b);		
		}
		
		else if(op=='*'){
			System.out.printf("%d*%d=%d\n",a,b,a*b);			
		}	
		
		else if(op=='/'){
			if (b==0)
				System.out.println("0으로 나눌 수 없습니다.");
			else {
				System.out.printf("%d/%d=%.2f\n",a,b,a/(double)b);					
			}
		}
		else // 연산자 외에 다른 문자를 입력했을 경우
		{
			System.out.println("잘못된 연산자 입력입니다!");
		}
		
		
	}

}
