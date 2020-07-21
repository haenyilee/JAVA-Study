
public class 자바변수초기화{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int kor=78; int eng=85; int math=96;
		 * 
		 */
		/*
		 * [문자열 결합]   // 문자 뒤에 더하기는 플러스가 아니라 문자를 이어주는 역할을 함
		 * =============
		 * 	7+7+"1"+7+7
		 *  ===
		 *  14 +"1"
		 *  ======
		 *  "141"  +7
		 *  ========
		 *  "1417"   +7
		 *  ========
		 *  "14177"
		 */
		/*
		 * System.out.println("총점:"+ kor+eng+math); // ()를 안치면 + 뒷부분을 문자열로 인식함 ==> 총점 : 788596이됨 
		 * System.out.println("총점:"+(kor+eng+math));
		 */
		int a=65;
		char c=65; // char ==> 문자, 숫자
		System.out.println("a="+a); // 결과 : a=65
		System.out.println("c="+c); // 결과 : c=A
		
		// char는 정수를 입력해도 문자가 출력됨 (문자,정수 취급함)
		/*
		 * 
		 * 
		 * long = int
		 * int = long (error)
		 * double = int, long, float
		 * int = double(error)
		 * (예외) char = int
		 * 
		 * 
		 * 참고 : [메모리에 저장하는 크기]
		 * 	byte  < short < int < long < float < double 
		 * 			char
		 * 변수 선언할 때, 왼쪽이 더 큰 범위여야함
		 * 
		 *  
		 */
		
		System.out.println(100); // 100은 int
		System.out.println(10.8); // 10.8은 double
		
		int d=97;
		char b=97;
		System.out.println("d="+d);  // 결과 : d=97
		System.out.println("b="+b);  // 결과 : b=a
		
		int e=1;
		int f='1';
		System.out.println("e="+e);  // 결과 : e=1
		System.out.println("f="+f);  // 결과 : f=49

		
	}

}
