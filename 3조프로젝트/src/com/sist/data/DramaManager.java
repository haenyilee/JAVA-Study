package com.sist.data;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DramaManager {
	
	
	// ���� ����
	public void dramaAllData()
	{
		try {
			String[] site=
				{
						// ���ø���
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
					//System.out.println("��ŷ:"+rank.text());
					
					
					// ���������� ����
					String url="https:"+link.get(i).attr("href");
					// System.out.println(link.get(i).attr("href"));
					
					Document doc2= Jsoup.connect(url).get();
					
					System.out.println("=====================================================");
					Element title=doc2.selectFirst("h1.mop-ratings-wrap__title");
					System.out.println("����:"+title.text());
					
					Element poster=doc2.selectFirst("img.posterImage");
					System.out.println("������:"+poster.attr("src"));
					
					Element tomato=doc2.select("span.mop-ratings-wrap__percentage").get(0);
					System.out.println("�丶������:"+tomato.text());
					
					// null���̸� �������� ���ֳ�? Stateless
					
					String score =null;
					try{
						Element s=doc2.select("span.mop-ratings-wrap__percentage").get(1);
						score =s.text();
						System.out.println("��������:"+score);
					}catch (Exception e) {
						score = " ";
						System.out.println("��������: ");
					}
						
						
						
					Element synopsis=doc2.selectFirst("div#movieSynopsis");
					System.out.println("�ó�ý�:"+synopsis.text());
					
					
					String starring = null;
					try {
						Elements s=doc2.select("div.tv-series__series-info-castCrew");
						starring = s.text();
						System.out.println("�⿬:"+starring);
					}
					catch(Exception e){
						starring = " ";
						System.out.println("�⿬: ");
						}
					
					
					
					Element broad=doc2.select("div.panel-body td").get(1);
					System.out.println("��۱�:"+broad.text());
					
					
					String date=null;
					try {
					Element dt=doc2.select("div.panel-body td").get(3);
					date=dt.text();
					System.out.println("�濵��:"+date);
					}
					catch(Exception e){
						date=" ";
						System.out.println("�濵��: ");}
					
					
					String genre=null;
					try {
					Element gr=doc2.select("div.panel-body td").get(5);
					genre=gr.text();
					System.out.println("�帣:"+genre);
					}
					catch(Exception e){
						genre=" ";
						System.out.println("�帣: ");}
					
					
					String producer=null;
					try {
					Element pd=doc2.select("div.panel-body td").get(7);
					producer=pd.text();
					System.out.println("���ε༭:"+producer);
					}
					catch(Exception e){
						producer=" ";
						System.out.println("���ε༭: ");}
				
					
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
	
	
	
	
	
	// ���� �б�
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


