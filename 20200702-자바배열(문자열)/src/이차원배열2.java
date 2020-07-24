
public class 이차원배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	
											
		0		1		2		3		4	
==========================================	
0		1		2		3		4		5
==========================================
1				6		7		8			
==========================================
2						9					
==========================================  
3				10		11		12			
==========================================
4		13		14		15		16		17	
==========================================

		  j시작		j끝		=> for(j=?;j<=?;j++)
						
i=0			0		4	
i=1			1		3
i=2			2		2

			i=j		i+j=4
			j=i		j=4-i
							=> for(j=i;j<=4-i;j++)
--------------------------
		
i=3			1		3
i=4			0		4

			i+j=4	i=j
			j=4-i	j=i
							=> for(j=4-i;j<=i;j++)
*/

		int[][] arr1=new int[5][5]; // int[5,5] => c#
		
		// 3줄 먼저 짜기(0행,1행,2행)
		// j_s + j_e = 4
		
		int p=1;

		for(int i=0;i<3;i++) {
		for(int j=i;j<=4-i;j++) {
		arr1[i][j]=p;
		p++;
		
		}
		}
		
		
		for(int i=3;i<=4;i++) {
			for(int j=4-i;j<=i;j++) {
				arr1[i][j]=p;
				p++;
			}
		}
		
		
		
		// 출력
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arr1[i][j]==0)
					System.out.print("\t");
				else
					System.out.print(arr1[i][j]+"\t");
			}
			System.out.println("\n");
		}

	}

}
