/*
	1) 단일 조건문은 여러개를 사용해도 처음부터 마지막까지 수행된다. 
	2) {}을 생략할땐  수행문장이 1개인 경우
 */
public class 자바단일조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15; // 3배수, 5배수, 7배수
		if (a%3==0)
			System.out.println(a+"는 3의 배수입니다.");
		if (a%5==0)
			System.out.println(a+"는 5의 배수입니다.");
		if (a%7==0)
			System.out.println(a+"는 7의 배수입니다.");

	}

}
