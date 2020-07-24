package com.sist.reservedata;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class movieData {
	
	

	public void find(String ss)
	{
		try {
			ArrayList<String> titles=new ArrayList<String>();
			ArrayList<String> grades=new ArrayList<String>();
			
			Document doc=Jsoup.connect("https://movie.naver.com/movie/running/current.nhn").get();
			Elements title=doc.select("dt.tit a");
			Elements grade=doc.select("dt.tit span");
				
			// 영화 갯수 만큼 가져오기
			for(int j=0;j<title.size();j++)
			{
				titles.add(title.get(j).text());
				grades.add(grade.get(j).text());
				// System.out.println(title.get(j).text());
				// System.out.println(grade.get(j).text());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace(); 
			System.out.println("에러발생");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
	
     movieData md=new movieData();
     md.find("");
	}

}
