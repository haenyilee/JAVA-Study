/*
	사용자가 알파벳을 입력하면(B) => AB출력
						D  => ABCD출력
 
	char => scan.next().charAt(0)
 */

import java.util.*;
public class 반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("알파벳을 입력하세요(대문자):");
		char user=scan.next().charAt(0);
		
		char ch='A';
		while (ch<=user) {
			System.out.print(ch);
			ch++;			
		}

		
		
		
		
		
	}

}
