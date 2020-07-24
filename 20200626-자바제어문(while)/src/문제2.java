public class ¹®Á¦2 {

	public static void main(String[] args) {
		// TODO Auto-gen
		int i=0;
		int sum=0;
		for(int a=100;a<1000;a++) {
			if(a%4!=0) {
				i++;
				sum+=a;
			}
				
		}
			
		System.out.println("°¹¼ö:"+i);
		System.out.println("ÇÕ:"+sum);

		
		System.out.println();
		i=0;
		sum=0;
		
		int a=100;
		while(a<1000) {
			if(a%4!=0) {
				i++;
				sum+=a;
			}
		a++;
		}
		
		
		System.out.println("°¹¼ö:"+i);
		System.out.println("ÇÕ:"+sum);
		
		
		
		
		
		
		
	}

}
