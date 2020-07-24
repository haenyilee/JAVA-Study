// 차량 ==> 색상, 연비, 연도

public class MainClass2 {
	// 변수 선언
	int a=10;
	int b=20;
	
	// 생성자
	MainClass2(){
		a=100;
		b=200;
	}
	
	// 사용자가 직접 => a, b값을 주는 경우 
	MainClass2(int c, int d)
	{
		a=c;
		b=d;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 방법(1)
		MainClass2 m=new MainClass2();
		System.out.println("a="+m.a);
		System.out.println("b="+m.b);
		
// 방법(2) : 매개변수 ==> 필요할 때마다 초기값 바꿔서 들어갈 수 있다는 장점!
		MainClass2 m1=new MainClass2(1000,2000);
		System.out.println("a="+m1.a);
		System.out.println("b="+m1.b);

	}

}
