/*
	부정연산자 : !
		==> true -> false , false -> true
		==> 결과값 : boolean
		
			단항 : 
				증감 => int
				부정 => boolean
			이항 : 
				산술 => ?
					int + int = int
					double + int = double
				비교, 논리 => boolean
			삼항 : 값1 or 값2 (결과값은 지정한 값에 따라 달라짐)
				조건?값1:값2
					sex==1?"남자":"여자"
					sex==1?1:2
					sex==1?"m":"w"
	
 */
public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck = true;
		bCheck=!bCheck; // true의 반대값을 저장한다.
		bCheck=!bCheck; // false의 반대값을 저장한다. ==> 온/오프, 일시정지/재생 등을 반복할 때 사용
		System.out.println("bCheck="+bCheck);
	}

}
