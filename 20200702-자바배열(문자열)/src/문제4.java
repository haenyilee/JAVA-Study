import java.util.*;
public class ����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[]= {"Java","C++","HTML","��ǻ�ͱ���","�ȵ���̵�"};
		int score[]= {95,88,76,62,55};
		
/*		
		// ���� �Է� �ޱ�
		Scanner scan= new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� >>");
		String input=scan.nextLine();
		boolean bCheck=false;
	
		
		for(int i=0;i<course.length;i++) {
			if(input.contains(course[i])) {
				bCheck=true;
				System.out.println(score[i]);
			}
		}

		 if(bCheck==false) {
			 System.out.println("���� �����Դϴ�!!");
		 }
*/		
		
		
		 
		 
		 // WHILE
			
			// ���� �Է� �ޱ�
			Scanner scan= new Scanner(System.in);


			boolean bCheck=false;
		
			while(true) {
				bCheck=false;
				System.out.println("������ �Է��ϼ��� >>");
				String input=scan.nextLine();
					if(input.equals("�׸�")) {
						break;
					}

			
				for(int i=0;i<course.length;i++) {
					if(input.equals(course[i])) {
						bCheck=true;
						System.out.println(score[i]);
					}
					
				}	
					if(bCheck==false) {
						System.out.println("���� �����Դϴ�!!");
						}
			}
	


		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
