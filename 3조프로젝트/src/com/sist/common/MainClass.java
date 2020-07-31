package com.sist.common;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass {

	public static void main(String[] args) {
		try {
		Document doc2 = Jsoup.connect("https://www.rottentomatoes.com/tv/the_circle_2020").get();
		
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
			score = "관객평점:"+s.text();
			System.out.println("관객평점:"+score);
		}catch (Exception e) {
			score = "관객평점: ";
			System.out.println("관객평점: ");
		}
			
			
			
		Element synopsis=doc2.selectFirst("div#movieSynopsis");
		System.out.println("시놉시스:"+synopsis.text());
		
		
		String starring = null;
		try {
			Elements s=doc2.select("div.tv-series__series-info-castCrew");
			String st= (s.text()).substring(s.lastIndexOf(":")+2);
			starring = "출연:"+st;
			System.out.println("출연:"+starring);
		}
		catch(Exception e){
			starring = "출연: ";
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
			date="방영일: ";
			System.out.println("방영일: ");}
		
		
		String genre=null;
		try {
		Element gr=doc2.select("div.panel-body td").get(5);
		genre="장르:"+gr.text();
		System.out.println("장르:"+genre);
		}
		catch(Exception e){
			genre="장르: ";
			System.out.println("장르: ");}
		
		
		String producer=null;
		try {
		Element pd=doc2.select("div.panel-body td").get(7);
		producer=pd.text();
		System.out.println("프로듀서:"+producer);
		}
		catch(Exception e){
			producer="프로듀서: ";
			System.out.println("프로듀서: ");}

	}catch (Exception e) {
		// TODO: handle exception
	}
}}