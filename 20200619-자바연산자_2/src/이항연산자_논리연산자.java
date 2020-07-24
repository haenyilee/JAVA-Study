/*
논리연산자 ==> if문에서 주로 사용함
	형식) && (직렬연산자) , || (병렬연산자)
		==============	==============
		두 개가 true		한 개 이상 true
		
		&& ==> 범위, 기간을 포함할 때 사용
		|| ==> 범위나 기간을 벗어나는 경우에 주로 사용
		 
	예) 성적
		score>=90 (&&) score<=100
		score<=0  (||) score>100
		
	
	사용법) 조건 (&&,||) 조건
		  ====		  ====
		  T/F		  T/F

 	경우의 수)
 						 &&		 ||
 		===============================
 		true	ture	true	true
 		-------------------------------
 		true	false	false	true
 		-------------------------------
 		false	ture	false 	true
 		-------------------------------
 		flase	false	false	flase
 		===============================
 		
 		6<5 && 10==10 // false && true ==> false
 		
 	효율적인 연산)
 		int a = 10;
 		int b = 9;
 		
 		a==b && ++b==a ==> false
 		====	======
 		수행 		수행 x
 			
 		b=? 
 		==> 9 // 앞의 피연산자가 false가 되는 순간 뒤에 것을 계산하지 않아서 ++b는 계산되지 못함
 		
 		&& ==> 왼쪽에 있는 조건이 false면 오른쪽은 실행 X
 		|| ==> 왼쪽에 있는 조건이 true면 오른쪽은 실행 X
 
 */

public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A';
		int i = 65;
		char c2 = 'B';
		
		System.out.println(c1==i && --c2==i);
		System.out.println(c2);

		boolean bCheck=c1==i || ++c1==c2;
		System.out.println(bCheck);
		System.out.println(c2);
	}

}
