public class �ݺ���_for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1~100������ 3�ǹ�� ��, 5�� ��� ��, 7�� ��� ��
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
		System.out.println("1~100���� 3�� ����� ��:"+a);
		System.out.println("1~100���� 5�� ����� ��:"+b);		
		System.out.println("1~100���� 7�� ����� ��:"+c);
		
		
		// 100~999���� ==> 7�� ����� ����
		int count=0;
		for(int i=100;i<1000;i++) {
			if(i%7==0)
				count++; // +=�� ���� �������� �� ����, ���� ���� ���� �ϳ��� �����ϴ� ++ ����ϱ�
		}
		System.out.println("100~999���� 7�� ����� ����:"+count);
		
		
		// 1-2+3-4+5-...+9-10 ���ϱ�
		
		int sum2=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				sum2-=i;
			else {
				sum2+=i;
			}
		}
		System.out.println("1-2+3-4+5-...+9-10="+sum2);
		
		
		// �ڡڡ١ڡڡ١ڡڡ١ڡڡ� ����ϱ�
		for(int i=1;i<=12;i++) {
			if(i%3==0)
				System.out.print("��");
			else {
				System.out.print("��");
			}
		}
	
		
		
		
		
		
		
		
		

	}
}
