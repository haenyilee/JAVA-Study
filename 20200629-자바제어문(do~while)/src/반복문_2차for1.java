/*
 	��ø for��
 	
 	����) 
 		for(�ʱⰪ;���ǽ�;������)
 		{
 			for(�ʱⰪ;���ǽ�;������)
 			{
 				�ݺ� ���� ����
 			}
 		}
 		
 	�������)
 			1		2	4	
  		for(�ʱⰪ;���ǽ�;������)
 		{
 			3
 				1		2	4	
 			for(�ʱⰪ;���ǽ�;������)
 			{	
 					3
 				�ݺ� ���� ����
 			}
 		}
 		
 	��)
 		for(int i=1;i<=3;i++) // ���� ���(�ټ�)
 		{
 			for(int j=1;j<=3;j++) // ���� ���
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
   		i=4	==> i<=3 false ===> ����
   		
 				
 				
 				
 		
 */

/* ������ ����ϱ�
 *                2*1=2      ====     9*1=9  ===> 8
 *                
 *                2*9=18     ====     9*9=81
 */
public class �ݺ���_2��for1 {

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
