
		
public class �ݺ���_for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ==> 1~100������ ==> ¦���� ��, Ȧ���� ��
		
		
//		int even=0;
//		int odd=1;
//		
//		for(int i=1;i<=50;i++) {
//			even+=2*i;
//			System.out.printf("2����%d������ ��:%d\n",2*i,even);
//			odd+=2*i;
//			System.out.printf("1����%d������ ��:%d\n",(2*i)-1,odd);
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
		
			System.out.println("1~100������ ¦�� ��:"+even);
			System.out.println("1~100������ Ȧ�� ��:"+odd);
		
	
	}

}
