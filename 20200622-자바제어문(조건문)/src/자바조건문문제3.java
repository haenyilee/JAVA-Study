/*
	사용자 입력 ==> 0,1,2
	
		입력		출력
	=> 0이면 => 가위
	=> 1이면 => 바위
	=> 2이면 => 보
	
	
	정수, 실수, 문자일 경우에는 == 사요이 가능
	문자열은 ==으로 비교가 불가능하다 ==> equals()를 사용해야 한다
 */
import java.util.*;

public class 자바조건문문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 가위바위보
		Scanner scan = new Scanner(System.in);
		System.out.println("0,1,2 중 하나를 입력하세요 : ");
		int a=scan.nextInt();
		
		if (a==0)
			System.out.println("나:가위");
		if (a==1)
			System.out.println("나:바위");
		if (a==2)
			System.out.println("나:보");
			
		
		// 컴퓨터
		int com = (int)(Math.random()*3);
//						=============
//						0.0~0.99     *3 ==> 0.0~2.9... ==> (int) ==> 0~2 		
			
		if (com==0)
			System.out.println("컴퓨터:가위");
		if (com==1)
			System.out.println("컴퓨터:바위");	
		if (com==2)
			System.out.println("컴퓨터:보");	

		
		// 결과 비교
			// 컴퓨터가 가위일때
		if (com==0) {
					if(a==0) {
				System.out.println("draw");
			}
			if (a==1) {
				System.out.println("player win!");	
			}
			if (a==2) {
				System.out.println("computer win!");	
			}
		}
				
			// 컴퓨터가 바위일때
		if (com==1) {
			if(a==0) {
				System.out.println("computer win!");		
			}
			if (a==1) {
				System.out.println("draw");	
			}
			if (a==2) {
				System.out.println("player win!");	
			}
		}
				
			// 컴퓨터가 보일때
		if (com==2) {
			if(a==0) {
				System.out.println("player win!");	
			}
			if (a==1) {
				System.out.println("computer win!");	
			}
			if (a==2) {
				System.out.println("draw");	
			}
		}
			
		
		// 정석 코딩 방법 : 가위, 바위, 보에 0,1,2 숫자 부여 ==> com과 나의 숫자 빼기 ==> 공통값 || 으로 묶어서 if 조건문 작성하기
		
		
		
		
	}

}
