package 자바프로젝트.예매VO;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class 예매JSON {
	
	String getJson= callURL("");
	
	public static String getJson= callURL(""){
		System.out.println("Requeted URL"+myURL);
		StringBuilder sb = new StringBuilder();
		URLConnection urlconn = null;
		InputStreamReader in =null;
		
		HostnameVerifier allHostsValid = new HostnameVerifier() {
			
			@Override
			public boolean verify(String hostname, SSLSession session) {
				return true;
			}
		};
		
		try {
			URL url = new URL(myURL);
			urlconn = url.openConnection();
			
			if(urlconn)
		}
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
