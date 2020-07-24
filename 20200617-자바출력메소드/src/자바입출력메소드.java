import java.util.*; // Scanner ==> 이전에 만들어진 자바파일을 읽어 온다. 
/*
  class Scanner{
  }
  
 */
public class 자바입출력메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력값 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("실수입력:"); // println은 담줄에 입력,print는 바로 옆에 입력
		 							 // System.out.print("정수입력:\n");
									 // System.out.println("정수입력:");
		double a= scan.nextDouble();
		System.out.println("a="+a);
	
	}

}
