import java.util.*;
// startsWith / endsWith
/* aadkadakJavaadkadk ==> .contains는 이런애들도 다 찾아봄
           ====
  
*/

public class 문자열4 {

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
		System.out.println("검색어입력:");
		String ss= scan.nextLine(); // next() : 공백(스페이스)포함 , nextLine(): 엔터 적용		
		for(String s:data) {
			if(s.startsWith(ss) || s.endsWith(ss)) {
				System.out.println(s);
				Thread.sleep(500);
			}
		}
		
		

	}

}
