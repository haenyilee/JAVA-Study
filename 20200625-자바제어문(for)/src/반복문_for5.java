
		
public class 반복문_for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ==> 1~100까지의 ==> 짝수의 합, 홀수의 합
		
		
//		int even=0;
//		int odd=1;
//		
//		for(int i=1;i<=50;i++) {
//			even+=2*i;
//			System.out.printf("2부터%d까지의 합:%d\n",2*i,even);
//			odd+=2*i;
//			System.out.printf("1부터%d까지의 합:%d\n",(2*i)-1,odd);
//		}
		
		int even=0;
		int odd=0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==0)
				even+=i;
			else {
				odd+=i;
			}
		}
		
			System.out.println("1~100까지의 짝수 합:"+even);
			System.out.println("1~100까지의 홀수 합:"+odd);
		
	
	}

}
