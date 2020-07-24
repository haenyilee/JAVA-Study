import java.util.Scanner; // sc ==> shift+space ==> Scanner 선택해서 엔터 ==> import 자동으로 불러옴
import java.util.*; // 자바폴더안에 유틸폴더안에 모든 클래스 가져와라~ 속도 느려질 수 있음

public class 자바출력메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// \n은 new line ==> 새로운 줄에 출력
		System.out.printf("%d*%d=%d\n",2,2,4); // \n 을 붙이면 줄바꿈(new line)
		System.out.printf("%d*%d=%d\n",2,3,6);
		
		// \t는 tap ==> 일정한 간격 공백
		System.out.printf("%d*%d=%d\t",2,2,4); 
		System.out.printf("%d*%d=%d\n",3,2,6); // \t 을 붙이면 tap간격
		
		// 화면에서 입력받기 - Scanner
		Scanner scan = new Scanner(System.in);
		/*
		 Scanner : 데이터형
		 scan : 변수
		 new : 메모리에 저장(메모리 크기 모를 때, 메모리 크기 결정해주는 아이 ==> 새로운 메모리를 만든다는 뜻)
		 Scanner(System.in) : 초기화
		 */

		System.out.println("1' 정수 입력:");
		int a=scan.nextInt(); // nextInt가 입력된 정수를 읽어와서 a라는 메모리공간에 저장
		System.out.println("2' 정수 입력:");
		int b=scan.nextInt();
		System.out.println("3' 정수 입력:");
		int c=scan.nextInt();
		
		// 출력 : (1) 한 값씩 입력하고 엔터  or (2) 한 값씩 입력하고 스페이스
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		// Scanner ==> 도스에서만 사용
	}
}
