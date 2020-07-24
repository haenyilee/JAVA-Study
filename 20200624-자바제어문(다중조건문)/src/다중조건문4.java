/*
	사용자 => 정수입력(1~12)
	12,1,2 => 겨울입니다
	3,4,5 => 봄입니다
	6,7,8 => 여름
	9,10,11 => 가을
	
 */

import java.util.*;
public class 다중조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		int month;
		
		// 사용자 입력값 받기
		Scanner scan=new Scanner(System.in);
		System.out.println("월을 입력하세요(1~12):");
		month=scan.nextInt();
		
		// 다중조건문
		if (month==12 || month==1 || month==2) 
			System.out.println(month+"월은 겨울입니다.");
		else if (month==3 || month==4 || month==5) // if (month>=3 && month<=5)
			System.out.println(month+"월은 봄입니다.");		
		else if (month==6 || month==7 || month==8) // if (month>=6 && month<=8)
			System.out.println(month+"월은 겨울입니다.");
		else if (month==9 || month==10 || month==11) // if (month>=9 && month<=11)
			System.out.println(month+"월은 가을입니다.");		
		
		// 오류처리
		else { 
			System.out.println("존재하지 않는 월입니다. 1~12 값을 입력하세요");
		}
		
	}

}
