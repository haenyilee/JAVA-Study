/*
	형변환 연산자
		==> 필요시에 데이터형을 변경해서 사용할 때 사용 : 강제형변환
			(int) double
			(char) int
			==> 큰 데이터형을 작은 데이터형으로 바꿀 때 사용!
		
		
		==> 자동형변환
			int + double = double + double
			char + int = int + int
			char + int + long + double = double ==> 속도가 느려지니까 다른 데이터형끼리 연산 잘 안함
			int + long = long
 		
 		==> 특이사항
 			1) boolean은 제외
 			2) int 이하는 연산을 하면 결과값이  int
 				byte+byte		=int
 				char+char		=int
 				short+ short	=int
 				short+byte		=int
 				char+byte+short =int
 
 */
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		byte c=20;
		// byte d=b+c; ==> error ==> byte+ byte = int이기 때문에
		// byte d=(byte)(b+c); // (byte)로 형변한 시켜줘야 함
		int d = b+c;
		
		// 자동형변환
		int a = 'A'; // a = 65
		double e = 10; // d= 10.0
		char f = 65; // c= 'A'
		
		System.out.println("a="+a);
		System.out.println("e="+e);
		System.out.println("f="+f);
		
		// 강제형변환
		// int i = 10.5; ==> error
		int i = (int) 10.5;
		int ii = (int) 'A';
		System.out.println("i="+i);
		System.out.println("ii="+ii);
		
		
		

	}

}
