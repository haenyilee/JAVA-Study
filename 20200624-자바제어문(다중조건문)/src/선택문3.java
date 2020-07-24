/*
범위가 주어지는 것 ==> if
키보드 누르기, 하나씩만 선택하기 ==> 선택문
 */

// 3개의 정수를 입력받아서 학점계산하는 프로그램

import java.util.*;

public class 선택문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math=0;
		char score='A';
		// ====> 프로그램에 필요한 메모리 저장 공간 확보
		
		// 입력
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		math= scan.nextInt();

		// 결과값 출력 => 가공 (연산자+제어문)
		// 메소드 ==> 데이터를 가공해서 결과값을 넘겨준다
 		switch ((kor+eng+math)/30) // 30으로 나눈 이유는 case 값을 적게 만들어주기 위해서...300점 만점이니까 case 300개 만들 수 없으니... 
 		{
		case 10:
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;		
		default:
//		case 5:
//		case 4:
//		case 3:
//		case 2:
//		case 1:
			score='F';
			break;			
		}		
 		System.out.println("====결과====");
 		System.out.println("학점:"+score);
		
		
		
		
		
		
	}

}
