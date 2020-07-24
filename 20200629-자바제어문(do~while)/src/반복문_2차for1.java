/*
 	중첩 for문
 	
 	형식) 
 		for(초기값;조건식;증가식)
 		{
 			for(초기값;조건식;증가식)
 			{
 				반복 수행 문장
 			}
 		}
 		
 	실행순서)
 			1		2	4	
  		for(초기값;조건식;증가식)
 		{
 			3
 				1		2	4	
 			for(초기값;조건식;증가식)
 			{	
 					3
 				반복 수행 문장
 			}
 		}
 		
 	예)
 		for(int i=1;i<=3;i++) // 세로 출력(줄수)
 		{
 			for(int j=1;j<=3;j++) // 가로 출력
 			{
 				System.out.println("i="+i+",j="+j);
 			}
 		}
 		
 		i=1	==> j=1
 				j=2
 				j=3
 				======i++
 		i=2	==> j=1
 				j=2
 				j=3
 				======i++ 				
  		i=3	==> j=1
 				j=2
 				j=3
 				======i++		
   		i=4	==> i<=3 false ===> 종료
   		
 				
 				
 				
 		
 */

/* 구구단 출력하기
 *                2*1=2      ====     9*1=9  ===> 8
 *                
 *                2*9=18     ====     9*9=81
 */
public class 반복문_2차for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{	
				System.out.printf("%d*%d=%d\t",j,i,j*i);
			}
			System.out.println();
		}

	}

}
