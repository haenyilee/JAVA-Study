package com.sist.cgv;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MovieManager {
	
	static MovieVO[] movies =new MovieVO[7];
	// 시작되자마자 데이터 불러오고 끝! => 이 데이터를 가지고 여기저기 활용
	static
	{
		try {
			Document doc=Jsoup.connect("http://www.cgv.co.kr/movies").get();
			Elements link = doc.select("div.box-contents a");
			int j=0;
			for(int i=0;i<7;i++)
			{
				movies[i]=new MovieVO();
				// <a href="/movies/detail-view/?midx=83160"> => attr("href")
				// <a>aaaa </a> => text()
				// System.out.println("http://www.cgv.co.kr"+link.get(j).attr("href"));
				Document doc2=Jsoup.connect("http://www.cgv.co.kr"+link.get(j).attr("href")).get();
				
				// element는 요소 한 개씩 가져올때 <-> elements는 정보 여러개 모아서 가져올 때!
				Element title= doc2.selectFirst("div.title strong");
				Element poster=doc2.selectFirst("span.thumb-image img");
				Element grade=doc2.selectFirst("span.ico-grade");
				Element reserve=doc2.selectFirst("strong.percent span");
				Element director=doc2.select("div.spec dd").get(0);
				movies[i].setDirector(director.text());
				
				Element actor=doc2.select("div.spec dd").get(2);
				movies[i].setActor(actor.text());
				
				Element etc=doc2.select("div.spec dd").get(4);
				// [전체, 128분, 미국]를 자르는 과정
				String[] temp=etc.text().split(",");
				movies[i].setTime(temp[1].trim()); // trim()의 용도 : 공백제거
				movies[i].setFrom(temp[2].trim());
				
				
				Element regdate=doc2.select("div.spec dd").get(5);
				movies[i].setRegdate(regdate.text());
				
				if(i==0)
				{
					Element genre=doc2.select("div.spec dt").get(3);
					// System.out.println(genre.text());
					// substring의 용도 : '장르 :'부분을 짤라내기 위해 사용함
					movies[i].setGenre(genre.text().substring(genre.text().indexOf(":")+1));
				}
				else
				{
					Element genre=doc2.select("div.spec dt").get(2);
					// System.out.println(genre.text());
					movies[i].setGenre(genre.text().substring(genre.text().indexOf(":")+1));
				}
				
		
				// 데이터 모은 값들 확인용들 주석처리함
				// System.out.println(title.text());
				movies[i].setTitle(title.text());
				
				// System.out.println(poster.attr("src"));
				movies[i].setPoster(poster.attr("src"));
				
				// System.out.println(grade.text());
				movies[i].setGrade(grade.text());
				
				// System.out.println(reserve.text());
				movies[i].setReserve(reserve.text());
				
				// System.out.println(director.text());
				movies[i].setDirector(director.text());
				
				// System.out.println(actor.text());
				movies[i].setActor(actor.text());
				
				// System.out.println(etc.text());
				
				// System.out.println(regdate.text());
				movies[i].setRegdate(regdate.text());
				
				
				movies[i].setMno(i+1);
				
				
				Element story=doc2.selectFirst("div.sect-story-movie");
				movies[i].setStory(story.text());	
									
				j+=2;
			}
			
		} catch (Exception e) {
		}
	}

	/* 데이터 잘 모인것 확인 했으니 주석처리
	 * public static void main(String[] args) {
		MovieManager m=new MovieManager();
		for(MovieVO vo:movies)
		{
			System.out.println("==============================");
			System.out.println("영화번호: "+vo.getMno());
			System.out.println("제목: "+vo.getTitle());
			System.out.println("감독: "+vo.getDirector());
			System.out.println("출연: "+vo.getActor());
			System.out.println("장르: "+vo.getGenre());
			System.out.println("등급: "+vo.getGrade());
			System.out.println("상영시간: "+vo.getTime());
			System.out.println("국가: "+vo.getFrom());
			System.out.println("상영일: "+vo.getRegdate());
			System.out.println("예매율: "+vo.getReserve());
			System.out.println("줄거리: "+vo.getStory());
		}

	}*/

}
