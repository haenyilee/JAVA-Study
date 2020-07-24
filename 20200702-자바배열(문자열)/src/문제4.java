import java.util.*;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[]= {"Java","C++","HTML","컴퓨터구조","안드로이드"};
		int score[]= {95,88,76,62,55};
		
/*		
		// 과목 입력 받기
		Scanner scan= new Scanner(System.in);
		System.out.println("과목을 입력하세요 >>");
		String input=scan.nextLine();
		boolean bCheck=false;
	
		
		for(int i=0;i<course.length;i++) {
			if(input.contains(course[i])) {
				bCheck=true;
				System.out.println(score[i]);
			}
		}

		 if(bCheck==false) {
			 System.out.println("없는 과목입니다!!");
		 }
*/		
		
		
		 
		 
		 // WHILE
			
			// 과목 입력 받기
			Scanner scan= new Scanner(System.in);


			boolean bCheck=false;
		
			while(true) {
				bCheck=false;
				System.out.println("과목을 입력하세요 >>");
				String input=scan.nextLine();
					if(input.equals("그만")) {
						break;
					}

			
				for(int i=0;i<course.length;i++) {
					if(input.equals(course[i])) {
						bCheck=true;
						System.out.println(score[i]);
					}
					
				}	
					if(bCheck==false) {
						System.out.println("없는 과목입니다!!");
						}
			}
	


		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
