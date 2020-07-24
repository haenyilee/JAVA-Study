/*
[화면출력]
	- system.out.println("Hello");	: 줄바꿈
		예)
			system.out.println("Hello");	
			system.out.println("java");
			Hello
			java
		
	- system.out.print("java");
	- system.out.printf() : 서식이 있는 출력
		예)
			80 80 90 240 80.0 B
			system.out.println(80 80 90 240 80.0 B);
			system.out.printf("%5d%5d%5d%5d%5f%5c,80,80,90,240,80.0,'B');
		
			%5d 
			00080
			%-5d
			80000
			
			%5.2f
			080.00
		

 */
public class 자바출력메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.1f",80.55);
		System.out.println("");
		
		int a=2;
		int b=2;
		
		System.out.println(a+"*"+b+"="+a*b);
		System.out.printf("%d*%d=%d\n",a,b,a*b);  // JDK 1.5
		
		/*
		 %d => 정수
		 %f => 실수
		 %c => 문자
		 %s => 문자열		 
		 */
		
		System.out.println(Integer.toBinaryString(240));
		System.out.println(0b011110000); // 2진법

		System.out.println(Integer.toOctalString(240));
		System.out.println(0360); // 8진법
		
		System.out.println(Integer.toHexString(240));
		System.out.println(0xf0); // 16진법
		
		System.out.println(~100); // 음수표현 ==> 음수가 하나 더 많음(음수는 앞에 1이 붙기 때문에)

	}

}
