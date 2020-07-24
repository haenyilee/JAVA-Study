/*
	임의의 정수 => 5개를 저장한 후에
	최대값, 최소값 구하는 프로그램
	
 */
public class 배열_최대최소값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 5개를 저장하는 공간을 만든다 ==> 배열
		int[] arr=new int[5]; // 0 0 0 0 0
		
		// 5개의 값을 변경
		for(int i=0;i<5;i++)
		{
			// 시작 = 0 ....끝 =4
			arr[i]=(int)(Math.random()*100)+1;
			// 		2번			1번 			3번
			// 1번:0.0~99.0 ==> 2번:정수변환 ==> 0~99 ==> 3번:1~100
		}
		
		// 출력
		// int i ==> index가 아니라 => 실제 저장된 값을 대입
		for(int i:arr) {
			System.out.println(i+" ");
		}
		
		System.out.println("\n=====결과출력=======");
		// 최소값을 저장하는 공간
		int min=100;
		/*
			min값은 범위 내 가장 큰값으로 설정해둬야 함 => 그럼 난수랑 비교해서 계속 작은 수로 바꿔줄것임 or 난수 중 하나로 설정
			20	30	50	60	80
		 */
		
	
		// 최대값을 저장하는 공간
		int max=1;// or int max=arr[0];
		
		// 최소값/최대값 구하기
		for(int i=0;i<5;i++) {
			if(min>arr[i]) {   // 최소조건
				min=arr[i];
			}
			if(max<arr[i]) {   // 최대조건
				max=arr[i];
			}
			
		}
		
		System.out.println("최소값:"+min);
		System.out.println("최대값:"+max);		
			
		}

	}

