package com.sist.string;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.*;

public class MainClass2 {

	public void find(String ss)
	{
		try {
			// 3페이지까지 읽어오기
			for(int i=1;i<=3;i++)
			{
				Document doc=Jsoup.connect("https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page="+i).get();
				Elements title=doc.select("a.name_movie");
				// 영화 갯수 만큼 가져오기
				for(int j=0;j<title.size();j++)
				{
					if(title.get(j).text().endsWith(ss))
					{
					//if(title.get(j).text().startsWith(ss));
					System.out.println(title.get(j).text());
					}
				}
			}
		} catch (Exception e) {
		}
	}
	public static void main(String[] args) {
		MainClass2 m = new MainClass2();
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 : ");
		String ss= scan.next();
		
		m.find("ss");
		

	}

}
