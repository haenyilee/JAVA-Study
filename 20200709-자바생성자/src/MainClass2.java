// ���� ==> ����, ����, ����

public class MainClass2 {
	// ���� ����
	int a=10;
	int b=20;
	
	// ������
	MainClass2(){
		a=100;
		b=200;
	}
	
	// ����ڰ� ���� => a, b���� �ִ� ��� 
	MainClass2(int c, int d)
	{
		a=c;
		b=d;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ���(1)
		MainClass2 m=new MainClass2();
		System.out.println("a="+m.a);
		System.out.println("b="+m.b);
		
// ���(2) : �Ű����� ==> �ʿ��� ������ �ʱⰪ �ٲ㼭 �� �� �ִٴ� ����!
		MainClass2 m1=new MainClass2(1000,2000);
		System.out.println("a="+m1.a);
		System.out.println("b="+m1.b);

	}

}
