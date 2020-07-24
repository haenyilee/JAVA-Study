import java.util.*;

public class 문제12번14번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하시오: ");
		int a,b;
		a=scan.nextInt();
		b=scan.nextInt();		
		
		System.out.printf("%d+%d=%d\n",a,b,a+b);
		System.out.printf("%d-%d=%d\n",a,b,a-b);
		System.out.printf("%d%%%d=%d\n",a,b,a%b);
	}

}
