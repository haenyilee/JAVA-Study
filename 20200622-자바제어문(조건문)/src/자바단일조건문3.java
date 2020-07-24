import sun.security.krb5.KdcComm;

/*
	Á¶°Ç¹® Á¦ÀÛÇÏ´Â ¹æ¹ý
	
	if(Á¶°Ç¹®) : °á°ú°ªÀÌ ¹«Á¶°Ç true / false
		==> ÇÊ¿äÇÑ °æ¿ì¿¡¸¸ ¹®ÀåÀ» ¼öÇà : Á¶°ÇÀÌ trueÀÏ ¶§¸¸
			falseÀÏ °æ¿ì¿¡´Â °Ç³Ê¶Ü(¹®ÀåÀ» ¼öÇàÇÏÁö ¸øÇÑ´Ù)
 */
public class ÀÚ¹Ù´ÜÀÏÁ¶°Ç¹®3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ¾ËÆÄºªÀ» ÀúÀå ==> ´ë¹®ÀÚ, ¼Ò¹®ÀÚ
		char alpha= 'n';
		if(alpha>='A' && alpha<='Z')
			System.out.println(alpha+"´Â(Àº) ´ë¹®ÀÚÀÌ´Ù");
		if (alpha>='a' && alpha<='z')
			System.out.println(alpha+"´Â(Àº) ¼Ò¹®ÀÚÀÌ´Ù");
		if(alpha>='0' && alpha<='9')
			System.out.println(alpha+"´Â(Àº) ¼ýÀÚÀÌ´Ù");
		if(alpha>='°¡' && alpha<='ÆR')
			System.out.println(alpha+"´Â(Àº) ÇÑ±ÛÀÌ´Ù");
		
		// Æ¯¼ö¹®ÀÚ
		if (alpha =='\t' || alpha=='\n')
			System.out.println("Æ¯¼ö¹®ÀÚÀÔ´Ï´Ù");
	}

}
