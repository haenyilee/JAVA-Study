/*
	while => 무한루프(데이터베이스 (오라클) , 파일 읽기 , 서버제작 , 게임)
					===============             ======
					파일 : XML, JSON
					=> break; 병행
	
	형식)
			초기값 ============ 1
			while (조건식) === 2 => true{안에 있는 내용 수행} / false
			{
				반복수행문장 === 3
				증가식 ======= 4 => 조건식 비교
			}
			
	예) 1~10까지 정수를 출력하라.
		1) 1~10까지 변경되는 변수 = 루프변수
			in i=1;		 => 1
			while(i<=10) => 10
			{
				System.out.println(i);
				i++ // i=2  =>  i<=10? ...... i=11 i<=10 => 종료
			}
			
	과정) 1) 초기값 설정 => i=1
		 2) 어디까지 수행할건지? => 조건식 i<=10
		 3) i를 어떻게 변경할건가? => i++ , i+=2, i*=3....
					
 */

import java.util.*;
public class 반복문_while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수값(ex.5)을 받아서 ==> 받은 정수 갯수만큼(ex.5개) ★을 출력
		// 1. 정수값 받기
		Scanner scan=new Scanner(System.in);
		System.out.println("정수값을 입력하세요!");
		// 2. 변수 2개 선언
		int user=scan.nextInt();
		int i=1; // 사용자가 요청한 값까지 변경할 변수
		while (i<=user) {
			System.out.print("★"); // user=5라면, i=1일때 별 한개 + i=2일때 별 한개 ....+i=5일때 별 한개 ==> 총 별 5개!!
			i++; // user의 갯수가 될때까지 루프실행
			
		}

	}

}
