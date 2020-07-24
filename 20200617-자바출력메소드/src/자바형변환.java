// 형변환 ==> 자신의 데이터형을 다른 형식의 데이터형으로 변환

/*
	boolean : 제외
	byte < char < int < long < float < double
	
	정수 => 실수, 문자, 정수 ==> 정수를 정수로 : int a =(int) 10L
	실수 => 정수, 문자
	문자 => 정수, 실수
	
	연산이 되는 순간 가장 큰 데이터형으로 바꿔놓고 시작함
	
 */
public class 자바형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 5/2; 	 		// 결과 : 2.0
		double e = 5/(double)2; 	// 결과 : 2.5
		System.out.println("d="+d);
		System.out.println("e="+e);
		
		int i = 'A'; // i = 65
		

	}

}
