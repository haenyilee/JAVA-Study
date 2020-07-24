/*
	변수 Scope
	=========
	변수의 종류
	=========
	1. 지역변수 
	2. 멤버변수
	3. 공유변수
		public class A
		{
			int a; ==> 멤버변수 ==> 클래스 A가 저장이 될때마다 생성
			static int b; ==> 공유변수 ==> 가상머신(JVM)이 클래스를 로드했을때만 생성
			=============================================================
				public static void main(String[] args) 
				{
					int c; // 지역변수 ==> main에서만 사용 가능한 변수 ==> 블럭이 지나면 사라져요!
				}
			
		}
 */
public class 변수의사용범위 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		for(i=1;i<=10;i++) {
			System.out.print("i="+i+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.print("i="+i);
		
		System.gc(); // 메모리 회수(가비지커렉션)
		
		System.out.println();
		System.out.println();
		
		// for문
		System.out.println("<for문>");
		for(i=1;i<=5;i++) {
			System.out.print(i+" ");			
		}
		
		System.out.println();
		System.out.println();
		
		// while문
		System.out.println("<while문>");
		i=1;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		System.out.println();
		
		// do-while문
		System.out.println("<do-while문>");
		i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=5);
			

	}

}
