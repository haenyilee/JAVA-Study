/*
 <문제>
	2. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구해라 
	=> 조건 : 
	60이상이면 d
	70	==> c
	80	==> b
	90	==> a
	나머지==> f
	
	국어 : 80
	영어 : 80
	수학 : 80
	
	총점 : 240
	평균 : 80.0
	학점 : B
 */


import java.util.Scanner;

public class 자바조건문문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2번 문제	
		int kor=0;
		int eng=0;
		int math=0;
		
		Scanner scan2=new Scanner(System.in);
		// scan ==> 여러번 받을 수 있음
		System.out.println("점수를 입력하시오 : ");
		// 입력 방법 : 입력 + 스페이스
		
		kor=scan2.nextInt();
		eng=scan2.nextInt();		
		math=scan2.nextInt();
		
		char grade='A';
		
		int total=(kor+eng+math);
		double avg=(total/3); // int가 아니라 double로! 소수자리까지 나오는 평균이니까...
		
		// 다중 if가 더 편함 (if > else if > else if > else if > else)
		if (avg>=60 && avg<70)
			grade='D'; 			//System.out.println("D"); (x)
		if (avg>=70 && avg<80)
			grade='C'; 			// System.out.println("C"); 
		if (avg>=80 && avg<90)
			grade='B';			// System.out.println("B");
		if (avg>=90 && avg<=100)
			grade='A';			// System.out.println("A"); 
		if (avg<60) // else 붙이면 안됨 ==> 가장 가까운 바로 위 조건에 대한 else가 나와버림 ==> if 조건 걸어줘야 함
			grade='F';
	
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f%n",avg); // %전체자리.소수점아래자리f ex. %14.10f%n
		System.out.println("학점:"+grade);
	}

}
