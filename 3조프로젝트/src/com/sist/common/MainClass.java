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
		System.out.println("����:"+title.text());
		
		Element poster=doc2.selectFirst("img.posterImage");
		System.out.println("������:"+poster.attr("src"));
		
		Element tomato=doc2.select("span.mop-ratings-wrap__percentage").get(0);
		System.out.println("�丶������:"+tomato.text());
		
		// null���̸� �������� ���ֳ�? Stateless
		
		String score =null;
		try{
			Element s=doc2.select("span.mop-ratings-wrap__percentage").get(1);
			score = "��������:"+s.text();
			System.out.println("��������:"+score);
		}catch (Exception e) {
			score = "��������: ";
			System.out.println("��������: ");
		}
			
			
			
		Element synopsis=doc2.selectFirst("div#movieSynopsis");
		System.out.println("�ó�ý�:"+synopsis.text());
		
		
		String starring = null;
		try {
			Elements s=doc2.select("div.tv-series__series-info-castCrew");
			String st= (s.text()).substring(s.lastIndexOf(":")+2);
			starring = "�⿬:"+st;
			System.out.println("�⿬:"+starring);
		}
		catch(Exception e){
			starring = "�⿬: ";
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
			date="�濵��: ";
			System.out.println("�濵��: ");}
		
		
		String genre=null;
		try {
		Element gr=doc2.select("div.panel-body td").get(5);
		genre="�帣:"+gr.text();
		System.out.println("�帣:"+genre);
		}
		catch(Exception e){
			genre="�帣: ";
			System.out.println("�帣: ");}
		
		
		String producer=null;
		try {
		Element pd=doc2.select("div.panel-body td").get(7);
		producer=pd.text();
		System.out.println("���ε༭:"+producer);
		}
		catch(Exception e){
			producer="���ε༭: ";
			System.out.println("���ε༭: ");}

	}catch (Exception e) {
		// TODO: handle exception
	}
}}