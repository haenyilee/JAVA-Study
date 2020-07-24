/*
	삼항연산자
	
 */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		char ccc=65;	// 형변환 안해서 연산이 불가함
		char cc = (char) (c+32);	// 소문자 변환 => 형변환
		System.out.println(ccc);
		System.out.println(cc);
		System.out.println(cc>='A' && cc<='Z'?"대문자":"소문자");
		
		int x =2;
		int y=10;
		int z=0;
		z=x++*2+--y-5+x*(y%2);
		System.out.println(z);
		/*
			cc>='A' && cc<='Z' ==> 대문자
			cc<'A' && cc>'Z' ==> 소문자
			
		 */

	}

}
