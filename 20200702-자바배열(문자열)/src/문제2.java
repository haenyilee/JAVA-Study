// 양의 정수 10개 배열 > 3의 배수만 출력
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,5,6,7,8,9,10,11};
		
		for(int i:arr) {
		// for(int i=0;i<arr.length;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
			

	}

}
