import java.util.*;
// startsWith / endsWith
/* aadkadakJavaadkadk ==> .contains�� �̷��ֵ鵵 �� ã�ƺ�
           ====
  
*/

public class ���ڿ�4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String[] data= {
				"Java Program",
				"Oracle Program",
				"JSP Program",
				"Java AND Oracle",
				"Java AND JSP",
				"Ajax Program",
				"Spring AND Mobile",
				"Kotlin Program",
				"XML AND Annotation",
				"Java AND JQuery"
		};
		
		// startWith
		Scanner scan=new Scanner(System.in);
		System.out.println("�˻����Է�:");
		String ss= scan.nextLine(); // next() : ����(�����̽�)���� , nextLine(): ���� ����		
		for(String s:data) {
			if(s.startsWith(ss) || s.endsWith(ss)) {
				System.out.println(s);
				Thread.sleep(500);
			}
		}
		
		

	}

}
