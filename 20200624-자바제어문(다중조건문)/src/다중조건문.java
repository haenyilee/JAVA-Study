/*
	다중조건문 => 조건이 많은 경우에 사용
			=> 조건이 맞는 문장만 실행(1번만 수행)

	===========================================================================================================
	<틀린예시> : if-else if는 하나의 덩어리 ==> 3개의 조건 중 1개만 수행함
	int a=15;
	if(a%3==0)
		System.out.println("3의 배수"); ==> 수행 후 종료
	else if(a%5==0)
		System.out.println("5의 배수"); ==> 3의 배수임이 판정되서 종료되어 버렸기 때문에 실행 X => else빼고 if문 여러개로 써야 함
	else if(a%7==0)
		System.out.println("7의 배수");	
	===========================================================================================================
	<맞는예시> : 개별 if문은 독립적(조건 2개 충족하면 2개 다 수행됨)
	int a=15;
	if(a%3==0)
		System.out.println("3의 배수"); => 수행 후 종료
	if(a%5==0)
		System.out.println("5의 배수"); => 수행 후 종료
	if(a%7==0)
		System.out.println("7의 배수");				
	===========================================================================================================
	
	형식)
		if(조건식)
		{
			조건이 true면 수행하는 문장
			수행 후에 종료
		}
		else if(조건식)
		{
			조건이 true면 수행하는 문장
			수행 후에 종료		
		}
		else if(조건식)
		{
			조건이 true면 수행하는 문장
			수행 후에 종료		
		}
		else if(조건식)
		{
			조건이 true면 수행하는 문장
			수행 후에 종료		
		}		
		=====================================
		else
		{
			해당 조건이 없는 경우에 수행하는 문장
			수행 후에 종료
		}				
		===================================== else는 생략 가능		
				
				
 */

// 성적 계산
/*
 	3개의 점수를 받아서 ==> import
 	총점, 평균, 학점 =====> 등수
 */

import java.util.*;
public class 다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 6개 선언 => 저장할 공간 설정
		int kor,eng,math=0;
		int total=0;
		double avg=0.0;
		char grade='A';
				
		// 입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수 입력: ");
		kor = scan.nextInt(); // 키보드로 입력한 정수를 읽어옴
		System.out.println("영어 점수 입력: ");
		eng = scan.nextInt(); // 키보드로 입력한 정수를 읽어옴		
		System.out.println("수학 점수 입력: ");
		math = scan.nextInt(); // 키보드로 입력한 정수를 읽어옴		
				
		// 1. 총점
		total = kor+eng+math;
		
		// 2. 평균
		avg = total/3.00; // 소수점
		
		// 3. 학점
		if(avg>=90)
			grade='A';
		else if(avg>=80)
			grade='B';		
		else if(avg>=70)
			grade='C';			
		else if(avg>=60)
			grade='D';	
		else
			grade='F';		
		
		/*
		만약 if문을 여러개 쓴다면, 80점이 d가 출력됨
		*/		
		
//		if(avg>=90)
//			grade='A'; ==> A
//		if(avg>=80)
//			grade='B'; ==> B
//		if(avg>=70)
//			grade='C'; ==> C			
//		if(avg>=60)
//			grade='D'; ==> D
//		else
//			grade='F';			
				

		// 4. 처리가 완료 ==> 화면에 출력
		System.out.println("======성적======");
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);		
		System.out.println("총점:"+total);		
		System.out.printf("평균:%.2f\n",avg);	
		System.out.println("학점"+grade);		
		
		
		
		/*
			1. 데이터 저장
				1) 사용자가 요청
				2) file읽기
				3) 오라클 읽기
				4) 웹에 있는 데이터 읽기
				
			2. 사용자 요청한 내용으로 ==> 데이터를 가공
			
			3. 사용자에게 가공된 데이터를 출력
			
		 */
				
	}

}
