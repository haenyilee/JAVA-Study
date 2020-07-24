/*
	20 10 40 50 30
	
	=> DESC(내림차순)	50 40 30 20 10
	=> ASC(올림차순)	10 20 30 40 50 
	
	1. 선택정렬 ==> 왼쪽 고정 ==> 맨 마지막까지 검색해야함
		20 10 40 50 30
		== ==
		10 20 40 50 30
		==	  ==
		==       ==
		==          ==
		-----------------------1 round
		10 20 40 50 30
		   == ==
		   ==    ==
		   ==       ==
		-----------------------2 round
		10 20 40 50 30
		      == ==
		      ==    ==
		      30    40
		-----------------------3 round		      
				 == ==
				 40 50
		-----------------------4 round
		10 20 30 40 50
					 ==> n개 ==> (n-1)round까지 실행
						
						
	2. 버블정렬
		20 10 40 50 30
		== ==
		10 20 40 50 30
		   == ==
		10 20 40 50 30   
		      == ==
		10 20 40 50 30       
		         == ==
		10 20 40 30 50      
		-----------------------1 round   
		10 20 40 30 50  
		== ==
		   == ==
		      == ==
		      30 40 
		      	 == ==     	 
		-----------------------2 round   		      	 
		10 20 30 40 50  
		== ==		      	 
		      	 
 */
public class 배열_정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {30,10,40,20,50}; // ASC => DESC
		System.out.println("정렬전:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n정렬후: ");	
		
		// 선택정렬(올림차순)
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) { 			// "<"이면 내림차순 , ">"이면 올림차순
					// 바꿔주기
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}



