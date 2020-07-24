// 10개 저장 배열 생성 > 1~10 범위 정수 랜덤 생성 > 배열에 저장 > 배열에 든 숫자들의 평균 출력

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*10);
		}
		
		int total=0;
		for(int i:arr) {
			total+=i;
		}
		System.out.println("평균 : "+total/10.0);
		
	}

}
