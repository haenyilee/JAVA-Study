/*
	5개의 정수를 보낸다. (매개변수) 
	5개의 정수 => sort => 전송 (리턴 : 배열)
			=========
			select
	메소드 목적
		1) 재사용
		2) 반복
		select()
		{
		}
		delete()
		{
		}
		update()
		{
		}
		find()
		{
		}
		insert()
		{
		}
 */
public class 자바메소드1 {
	static int[] sort(int[] arr, String type) {
		// sort 기능 만들어주기
		for(int i=0;i<arr.length-1;i++) {		// i=0일때
			for(int j=i+1;j<arr.length;j++) { 	// j=1,2,3,4,5까지 비교해서 작은 값을 앞으로
				if(type.equals("ASC")) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
				}
				}
					if(type.equals("DESC")) {
						if(arr[i]<arr[j]) {
							int temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
					}

				}
						
			}
		}
			return arr;
	}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 호출
		int[] arr= {10,40,30,50,20};  // sort 거치면 => 오름차순으로 배열 정렬해줌
		System.out.println("정렬 전 : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n오름차순 : ");
		int[] result=sort(arr,"ASC");
		for(int i:result) {
			System.out.print(i+" ");
		}
		System.out.println("\n내림차순 : ");
		result=sort(arr,"DESC");
		for(int i:result) {
			System.out.print(i+" ");
		}
	}

}
