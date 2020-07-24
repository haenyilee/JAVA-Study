// switch 중첩

/*
	if(조건문)
	{
		if (조건문)
		{
		}
		else
		{
		}
	}
	
	// Computer와의 가위바위보 프로그램 만들 때 사용~!
	 * 가위
	 	바위
	 	가위
	 	보
	 * 바위
	 	가위
	 	바위
	 	보
	 * 보
	 	가위
	 	바위
	 	보
	 	
	switch (정수)
	{
		case 1:
			switch(정수)
			{
				case 'A':
				{
				}
			}
	}
	
 */

import java.util.*;
public class 선택문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0;
		int com=(int)(Math.random()*3); // 0,1,2
		/*            =============
							1
							=========
								2
				=====
				 3
				 
				 1. Math.random() => 0.0 ~ 0.99
				 2. *3 => 0.0 ~ 2.9...
				 3. (int) => 0 ~ 2
				 	0:가위
				 	1:바위
				 	2:보
 				 				 
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("0(가위),1(바위),2(보) 중에 하나 선택 : ");
		
		user=scan.nextInt();
		
		// 결과값 출력
/*	안좋은 예시!!!!!(하드코딩)
		switch (com) {
		case 0:
				switch (user) {
				case 0:
					System.out.println("컴퓨터:가위,사용자:가위");
					System.out.println("비겼다!");
					break;
				case 1:
					System.out.println("컴퓨터:가위,사용자:바위");
					System.out.println("사용자  WIN!");					
					break;
				case 2:
					System.out.println("컴퓨터:가위,사용자:보");
					System.out.println("컴퓨터  WIN!");					
					break;				
				default:
					System.out.println("0~2사이 값을 작성하세요");
					break;
				}
			break;
			
		case 1:
			switch (user) {
			case 0:
				System.out.println("컴퓨터:바위,사용자:가위");
				System.out.println("컴퓨터  WIN!");					
				break;
			case 1:
				System.out.println("컴퓨터:바위,사용자:바위");
				System.out.println("비겼다!");				
				break;
			case 2:
				System.out.println("컴퓨터:바위,사용자:보");
				System.out.println("사용자  WIN!");						
				break;				
			default:
				System.out.println("0~2사이 값을 작성하세요");
				break;
			}			
			break;
			
		case 2:
			switch (user) {
			case 0:
				System.out.println("컴퓨터:보,사용자:가위");
				System.out.println("사용자  WIN!");						
				break;
			case 1:
				System.out.println("컴퓨터:보,사용자:바위");
				System.out.println("컴퓨터  WIN!");					
				break;
			case 2:
				System.out.println("컴퓨터:보,사용자:보");
				System.out.println("비겼다!");	
				break;				
			default:
				System.out.println("0~2사이 값을 작성하세요");
				break;
			}			
			break;			
			
		}
		
		COM		가위		바위		보
	사용자		0		1		2
		가위 	0	0		-1(C)	-2(사)
		바위 	1	1(사)	0		-1(C)
		보 	2	2(C)	1(사)	0
		
*/
			String[] str= {"가위","바위","보"};
			if(user>=0 && user<3) 
			{
			System.out.println("컴퓨터:"+str[com]);
			System.out.println("사용자:"+str[user]);
			}
			switch (user-com) {
			case 2: case -1:
				System.out.println("컴퓨터 Win!!!");
				break;
			case 1: case -2:
				System.out.println("사용자 Win!!!");
				break;
			case 0:
				System.out.println("비겼다!!!");
				break;
			default:
				System.out.println("0~2사이 값을 입력하세요.");
			}

	}

}
