/*
	'A' + 'B'
	===
	정수변환 -> 65
		  ===
		   정수변환 -> 66
	==========
	 65  +  66 = 131 (int) char, short, byte 연산 ==> 결과값은 무조건 int
	 
	 *** 주의점  : 데이터형을 범위를 초과하면 error가 아니라 오버플로우를 발생
	 			예 )  int ==> 1~10 		11 ==> 1
	 				=============================
	 				128	64	32	16	8	4	2	1 				
	 				=============================
	 				 0 	1 	1 	1 	1 	1 	1 	1  ==> 127이 컴퓨터에 저장
	 				-----------------------------
	 				 1 	0 	0 	0 	0 	0 	0 	0  ==> 128이 컴퓨터에 저장 ==> -128
	 				
	 			 강제형변환 순서에 따라 결과값이 달라질 수 있음
	 			 예)	(int) (10.5 + 10.5) ==> 21
	 			 	(int)10.5 + (int)10.5 ==> 20

 */
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 64;
		byte b2 = 64;
		byte b3 = (byte) (b1+b2);
		System.out.println(b3); // -128이 나오는 이유 ==> 오버플로우
		
		// % ==> 부호는 왼쪽편을 따름
		int a= 5;
		int b= 2;
		System.out.printf("%d%%%d=%d%n",a,b,a%b); 	//  5%2
		System.out.printf("%d%%%d=%d%n",a,b,-a%b); 	// -5%2
		System.out.printf("%d%%%d=%d%n",a,b,a%-b); 	//  5%-2
		System.out.printf("%d%%%d=%d%n",a,b,-a%-b); 	// -5%-2
		
		// 결과값이 달라지는 형변환
		System.out.println((int) (10.5 + 10.5));
		System.out.println((int)10.5 + (int)10.5);

	}

}
