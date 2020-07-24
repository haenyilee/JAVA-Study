/*
 <문제>
	1. 정수를 입력 받아서 짝수인지 홀수인지 확인 => 10은 짝수다,11은 홀수다
	
 */


import java.util.*;

public class 자바조건문문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1번 문제
		int num=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		num=scan.nextInt();
		
		if (num%2==0)
			System.out.println(num+"은 짝수이다.");
		else
			System.out.println(num+"은 홀수이다");
			
	

	}

}
