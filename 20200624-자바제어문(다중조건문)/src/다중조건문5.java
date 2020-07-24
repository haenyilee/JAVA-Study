/*
 	
 	
	¹®ÀÚ¸¦ ÀÔ·ÂÀ» ¹Þ¾Æ¼­ char ch
		1) ¼ýÀÚ ÀÔ·Â ch>='0' && ch<='9'
		2) ¾ËÆÄºª ÀÔ·Â ch>='A' && ch<='Z' || ch>='a' && ch<='z'
		3) ÇÑ±Û ch>='°¡' && ch<='ÆR'
		4) Æ¯¼ö¹®ÀÚ
		
 */
import java.util.*;

public class ´ÙÁßÁ¶°Ç¹®5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// º¯¼ö ¼±¾ð
		char ch;
		
		// ¹®ÀÚÀÔ·Â¹Þ±â
		Scanner scan = new Scanner(System.in);
		System.out.println("¹®ÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä:");
		ch=scan.next().charAt(0);
		
		// ´ÙÁßÁ¶°Ç¹®
		if (ch>='0' && ch<='9')
			System.out.println(ch+"´Â ¼ýÀÚÀÔ´Ï´Ù.");
		else if (ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			System.out.println(ch+"´Â ¾ËÆÄºªÀÔ´Ï´Ù.");		
		else if ( ch>='°¡' && ch<='ÆR')
			System.out.println(ch+"´Â ÇÑ±ÛÀÔ´Ï´Ù.");		
		
		// ¿¹¿ÜÃ³¸®
		else
			System.out.println(ch+"´Â Æ¯¼ö¹®ÀÚÀÔ´Ï´Ù.");		
		
		

	}

}
