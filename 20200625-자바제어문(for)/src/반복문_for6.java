public class 반복문_for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1~100까지의 3의배수 합, 5의 배수 합, 7의 배수 합
		int a=0,b=0,c=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
				a+=i;
			if (i%5==0) 
				b+=i;
			if(i%7==0) 
				c+=i;
		}
		System.out.println("1~100까지 3의 배수의 합:"+a);
		System.out.println("1~100까지 5의 배수의 합:"+b);		
		System.out.println("1~100까지 7의 배수의 합:"+c);
		
		
		// 100~999까지 ==> 7의 배수의 갯수
		int count=0;
		for(int i=100;i<1000;i++) {
			if(i%7==0)
				count++; // +=는 합의 누적구할 때 쓰고, 갯수 구할 때는 하나씩 누적하는 ++ 사용하기
		}
		System.out.println("100~999까지 7의 배수의 갯수:"+count);
		
		
		// 1-2+3-4+5-...+9-10 구하기
		
		int sum2=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				sum2-=i;
			else {
				sum2+=i;
			}
		}
		System.out.println("1-2+3-4+5-...+9-10="+sum2);
		
		
		// ★★☆★★☆★★☆★★☆ 출력하기
		for(int i=1;i<=12;i++) {
			if(i%3==0)
				System.out.print("☆");
			else {
				System.out.print("★");
			}
		}
	
		
		
		
		
		
		
		
		

	}
}
