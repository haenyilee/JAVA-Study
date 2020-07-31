package com.sist.data;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DramaManager {
	
	
	// 파일 수집
	public void dramaAllData()
	{
		try {
			String[] site=
				{
						// 넷플릭스
						"https://editorial.rottentomatoes.com/guide/best-netflix-shows-and-movies-to-binge-watch-now/", 
						
						// DISNEY+
						//"https://editorial.rottentomatoes.com/guide/disney-plus-shows-and-movies-ranked-by-tomatometer/",
					
						// HBO
						"https://editorial.rottentomatoes.com/guide/best-hbo-series-of-all-time-ranked/",
						
						// Amazon Prime
						"https://editorial.rottentomatoes.com/guide/best-tv-shows-and-movies-original-to-amazon-prime-video/",
						
						// BEST
						// "https://editorial.rottentomatoes.com/guide/best-tv-shows-of-2020/"
				
						// 100 Hidden Gem Series on Netflix
						// "https://editorial.rottentomatoes.com/guide/hidden-gem-series-on-netflix/"
				
				};
			
			int mno=300;
			int cno=4;
			
			Document doc = Jsoup.connect("https://editorial.rottentomatoes.com/guide/disney-plus-shows-and-movies-ranked-by-tomatometer/").get();
			Elements link = doc.select("div.article_movie_title a");
			
			for(int i=0;i<link.size();i++)
			{
				try {
					
					// Element rank = doc.selectFirst("div.countdown-index");
					//System.out.println("랭킹:"+rank.text());
					
					
					// 상세페이지로 접속
					String url="https:"+link.get(i).attr("href");
					// System.out.println(link.get(i).attr("href"));
					
					Document doc2= Jsoup.connect(url).get();
					
					System.out.println("=====================================================");
					Element title=doc2.selectFirst("h1.mop-ratings-wrap__title");
					System.out.println("제목:"+title.text());
					
					Element poster=doc2.selectFirst("img.posterImage");
					System.out.println("포스터:"+poster.attr("src"));
					
					Element tomato=doc2.select("span.mop-ratings-wrap__percentage").get(0);
					System.out.println("토마토평점:"+tomato.text());
					
					// null값이면 공백으로 못넣나? Stateless
					
					String score =null;
					try{
						Element s=doc2.select("span.mop-ratings-wrap__percentage").get(1);
						score =s.text();
						System.out.println("관객평점:"+score);
					}catch (Exception e) {
						score = " ";
						System.out.println("관객평점: ");
					}
						
						
						
					Element synopsis=doc2.selectFirst("div#movieSynopsis");
					System.out.println("시놉시스:"+synopsis.text());
					
					
					String starring = null;
					try {
						Elements s=doc2.select("div.tv-series__series-info-castCrew");
						starring = s.text();
						System.out.println("출연:"+starring);
					}
					catch(Exception e){
						starring = " ";
						System.out.println("출연: ");
						}
					
					
					
					Element broad=doc2.select("div.panel-body td").get(1);
					System.out.println("방송국:"+broad.text());
					
					
					String date=null;
					try {
					Element dt=doc2.select("div.panel-body td").get(3);
					date=dt.text();
					System.out.println("방영일:"+date);
					}
					catch(Exception e){
						date=" ";
						System.out.println("방영일: ");}
					
					
					String genre=null;
					try {
					Element gr=doc2.select("div.panel-body td").get(5);
					genre=gr.text();
					System.out.println("장르:"+genre);
					}
					catch(Exception e){
						genre=" ";
						System.out.println("장르: ");}
					
					
					String producer=null;
					try {
					Element pd=doc2.select("div.panel-body td").get(7);
					producer=pd.text();
					System.out.println("프로듀서:"+producer);
					}
					catch(Exception e){
						producer=" ";
						System.out.println("프로듀서: ");}
				
					
					String msg=mno+"|"+cno+"|"
							// + rank.text()+"|"
							+ title.text()+"|"
							+ poster.attr("src")+"|"
							+ tomato.text()+"|"
							+ score+"|"
							+ synopsis.text()+"|"
							+ starring+"|"
							+ broad.text()+"|"
							+ date+"|"
							+ genre+"|"
							+ producer+"\r\n";
					
					
					FileWriter fw= new FileWriter("c:\\javaDev\\rotten_drama.txt",true);
					fw.write(msg);
					fw.close();
					
					mno++;
					
					
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	// 파일 읽기
	static
	{
		try {			
			
			
			
		} catch (Exception e) {
			
		}
	}
public static void main(String[] args) {
	DramaManager d = new DramaManager();
	d.dramaAllData();
	
	
}
}


