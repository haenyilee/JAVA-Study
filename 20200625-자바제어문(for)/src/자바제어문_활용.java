import org.jsoup.Jsoup;

import com.sun.xml.internal.txw2.Document;

/*

 */
public class 자바제어문_활용 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		org.jsoup.nodes.Document doc=Jsoup.connect("https://movie.daum.net/premovie/released").get();
		System.out.println(doc);
	}

}
