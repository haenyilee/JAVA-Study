/*
	지역변수 ==> 블록이 닫히면 메모리에서 사라지는 변수
	각 case내에서 {}설정 안했는데 변수명이 동일하면 안됨 ==> 전역변수이기 때문에 ==> 블록설정해서 지역변수로 바꿔줘야 함!
 */
public class 선택문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		// {int a=10} ==> a는 지역변수라서 블록 닫힘과 동시에 메모리에서 사라짐
		
		switch (a) {
		case 10:
			int b=100;
			System.out.println("a="+a+", b="+b);
			break;
		case 11:
			int c=200; // 변수 이름은 b로 설정하면, 앞의 블록과 중복되기 때문에 error ==> 1) 블록설정하거나 2) 다른 변수명 사용하기
			System.out.println("a="+a+" ,c="+c);

		default:
			break;
		}

	}

}
