import java.util.*;

public class 문제13번15번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("세 개의 정수를 입력하시오: ");
		int a,b,c;
		a=scan.nextInt();
		b=scan.nextInt();	
		c=scan.nextInt();
		
		System.out.println("a*b+c="+a*b+c);
		
		System.out.println("두 자리 정수를 입력하세요: ");
		int d;
		d=scan.nextInt();
		
		// e : 십의 자리, f : 일의 자리
		int e = d/10;
		int f = d%10;
		
		if (e==f)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		

	}

}
