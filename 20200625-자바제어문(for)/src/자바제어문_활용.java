import org.jsoup.Jsoup;

import com.sun.xml.internal.txw2.Document;

/*

 */
public class �ڹ����_Ȱ�� {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		org.jsoup.nodes.Document doc=Jsoup.connect("https://movie.daum.net/premovie/released").get();
		System.out.println(doc);
	}

}
