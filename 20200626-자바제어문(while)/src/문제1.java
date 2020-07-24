public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int sum=0;
		for(int i=100;i<1000;i++) {
			if(i%7==0)
			{
				sum+=i;		
				a++;
			}
		}
		
		System.out.println("7의 배수 갯수:"+a);
		System.out.println("7의 배수 합:"+sum);
		
		System.out.println();
		a=0;
		sum=0;
		
		int i=100;
		while(i<1000) {
			if(i%7==0) {
				a++;
				sum+=i;
		   }
			i++;
		}
		System.out.println("7의 배수 갯수:"+a);
		System.out.println("7의 배수 합:"+sum);



	}

}
