
/*
 * 변수 선언
 * 변수 초기화
 * 변수의 값 변경
 * 다른 변수에 값 전달
 * 
 */

public class 자바변수값변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i, j는 사용하지 않는다. 필기체로 바꾸면 폰트가 헷갈리기 때문에 a,b.....n,m...사용하기
		
		int a = 100; // 맨앞에 final이 붙으면 상수가 됨 ==> 뒤에 오류남
		System.out.println("a="+a);
		a = 200;
		System.out.println("a="+a);
		a=300;
		System.out.println("a="+a);
		// 메모리 한 개에 저장하고 값을 계속 바꿔나가는 형태임
		
		int b = 'A'; // A라는 문자가 아니라 int데이터타입이기 때문에 65가 출력됨
		int c=b;
		// c라는 메모리에  b가 가지고 있는 값을 대입한다. 
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		c = 300;
		int d = b+c;
		System.out.println("d="+d);
		
		int x,y,z;
		x=y=z=100; //뒤에서부터 적용됨, z부터 100으로 선언됨
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		
	}

}
