/*
[ȭ�����]
	- system.out.println("Hello");	: �ٹٲ�
		��)
			system.out.println("Hello");	
			system.out.println("java");
			Hello
			java
		
	- system.out.print("java");
	- system.out.printf() : ������ �ִ� ���
		��)
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
public class �ڹ���¸޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.1f",80.55);
		System.out.println("");
		
		int a=2;
		int b=2;
		
		System.out.println(a+"*"+b+"="+a*b);
		System.out.printf("%d*%d=%d\n",a,b,a*b);  // JDK 1.5
		
		/*
		 %d => ����
		 %f => �Ǽ�
		 %c => ����
		 %s => ���ڿ�		 
		 */
		
		System.out.println(Integer.toBinaryString(240));
		System.out.println(0b011110000); // 2����

		System.out.println(Integer.toOctalString(240));
		System.out.println(0360); // 8����
		
		System.out.println(Integer.toHexString(240));
		System.out.println(0xf0); // 16����
		
		System.out.println(~100); // ����ǥ�� ==> ������ �ϳ� �� ����(������ �տ� 1�� �ٱ� ������)

	}

}
