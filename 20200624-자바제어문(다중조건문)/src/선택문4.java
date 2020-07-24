/*
	case 정수: ==> case 1:
	case 문자: ==> case 'A'
	case 문자열: ==> case "+" : case "LOGIN" "CHAT"....
 */

import java.util.*;
public class 선택문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 2개 입력(ex.3 5) : ");
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/): ");
		
		switch (scan.next()) {
		case "+":	
			System.out.printf("%d+%d=%d\n",a,b,a+b);
			break;
		case "-":	
			System.out.printf("%d-%d=%d\n",a,b,a-b);
			break;
		case "*":	
			System.out.printf("%d*%d=%d\n",a,b,a*b);
			break;	
		case "/":	
			if(b==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				System.out.printf("%d/%d=%.2f\n",a,b,a/(double)b);
			}
			break;			
		default:
			System.out.println("잘못된 연산자입니다!");
			break;
		}
		
	}

}
