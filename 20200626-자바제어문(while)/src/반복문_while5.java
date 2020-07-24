/*
	주의점)
			1) while문은 조건이 없는 경우 error => for문은 조건식 없어도 괜춘~
			   while()
			   {
			   } ==> 오류발생  : 조건식 오류
			   
			2) while문에서 무한루프
			   => for(;;) ==> while(true) : 가장 많이 등장
			
	for(int i=0;i<10;i++)
	
	int i=0;
	while(i<10){
		i++;
	}
 */

// 5 입력 ==> 1~5까지의 합

import java.util.*;
public class 반복문_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 2개 필요
		int user=0; 		// 사용자가 입력한 변수
		int i=0; 			// 사용자가 요청한 변수까지 증가되는 변수(루프변수)
		int sum=0; 			// 누적(합)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력 : ");
		user=scan.nextInt();
		
		while(i<=user) {
			
			sum+=i;
			i++;
		}
		System.out.println("sum="+sum);
			
		i=1; // 초기
		System.out.println(i);
			
			
			
			
	}

}
