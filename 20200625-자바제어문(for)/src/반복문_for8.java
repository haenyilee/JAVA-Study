/*
	for => 횟수가 지정된 반복문
	=> UPDOWN게임
	=> 컴퓨터가 1~100사이의 난수 발생
	=> 사용자가 난수 맞추는 게임
		힌트 : 높다, 낮다
	=> 예) 난수 : 70, 사용자 : 60, 출력 : UP!
 */

import java.util.*;
/*
	1. 컴퓨터가 난수발생
		Math.random() => 0.0 ~ 0.99 => 0.0 ~ 99.0 ==> (+1) 1.0 ~ 100.0
	====================
	2. 사용자 입력
	3. 입력하면  => 힌트주기
	4. 종료여부  => 
 */
public class 반복문_for8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1;
		// 난수 => 임의 수를 추출
		Scanner scan=new Scanner(System.in);
		int count=0; // 몇번입력했는지 맞추기 위한 변수
		for(;;) { // 무한루프
			System.out.println("1~100사이의 정수를 입력 : ");
			int user=scan.nextInt();
			if (user<1 || user>100) {
				System.out.println("잘못된 입력입니다!!");
				continue; // 종료시키는 것이 아니라 처음으로 다시 돌아갈 때 쓰는 것(for문 증가식으로 이동)		
				
			}
			// 정상적으로 입력된 상태
			count++;
			
			//비교
			if (com>user) {
				System.out.println("UP!!");
			}
			else if(user>com) {
				System.out.println("DOWN!!");
				}
			else {
				System.out.println("GAME OVER!!");
				
				// 몇 번만에 출력했는지 맞추기
				System.out.println("입력횟수:"+count);
				
				// 게임 종료하기
				break;
			}

}
}
}