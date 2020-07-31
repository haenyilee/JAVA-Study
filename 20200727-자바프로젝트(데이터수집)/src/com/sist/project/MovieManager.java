package com.sist.project;

import java.io.FileWriter;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MovieManager {
	public void movieAllData()
	{
		try {
		ArrayList<MovieVO> list = new ArrayList<MovieVO>();
		
		String[] site = {
			"https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page=",
			"https://movie.daum.net/premovie/scheduled?reservationOnly=N&sort=reservation&page=",
			"https://movie.daum.net/boxoffice/weekly",
			"https://movie.daum.net/boxoffice/monthly",
			"https://movie.daum.net/boxoffice/yearly"	
		};
		
		// html => 화면 UI 구분 : id는 중복이 없을 때, class는 중복이 될 때
		int mno=106;
		int cno=5;
		
		// for(int i=1;i<=7;i++)
		{
			// 1. 싸이트 연결 => 데이터 한 번에 읽기 => 메모리에 저장 => 저장위치 : Document
			
				Document doc = Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get();
				Elements link = doc.select("a.name_movie");
				
				
				for(int j=0;j<link.size();j++)
				{
				try {	
					// 상세보기로 접근
					String url ="https://movie.daum.net"+ link.get(j).attr("href");
					// System.out.println(link.get(j).attr("href"));
					
					// 상세보기 movieVO 가져오기
					Document doc2= Jsoup.connect(url).get();
					Element poster=doc2.selectFirst("span.thumb_img img");
					System.out.println("포스터:"+poster.attr("src"));
					// <img src="이미지경로"> ==> attr()
					Element title=doc2.selectFirst("span.txt_name");
					System.out.println("제목:"+title.text());
					// <span class="txt_name">제목</span> ==> text()
					Element score= doc2.selectFirst("div.info_origin a");
					System.out.println("평점:"+score.text().substring(4));
					Element director= doc2.select("a.link_person").get(0);
					System.out.println("감독:"+director.text());
					Element actor=doc2.select("a.link_person").get(1);
					System.out.println("주연:"+actor.text());
					Element genre=doc2.selectFirst("dd.txt_main");
					System.out.println("장르:"+genre.text());		
					Element regdate=doc2.select("dd.txt_main").get(1);
					System.out.println("개봉일:"+regdate.text());					
					Element showUser=doc2.selectFirst("dd#totalAudience em.emph_g");
					System.out.println("관객수:"+showUser.text());					
					Element story = doc2.selectFirst("div.desc_movie p");
					System.out.println("줄거리:"+story.text());					
					Element grade=doc2.select("dl.list_movie dd").get(3);
					System.out.println("등급:"+grade.text());
					
					
					String msg=mno+"|"+cno+"|"
									+poster.attr("src")+"|"
									+title.text()+"|"
									+score.text().substring(4)+"|"
									+director.text()+"|"
									+actor.text()+"|"
									+genre.text()+"|"
									+regdate.text()+"|"
									+showUser.text()+"|"
									+grade.text()+"|"
									+story.text()+"\r\n";

					// 파일에 저장
					FileWriter fw=new FileWriter("c:\\javaDev\\daum_movie.txt",true);
					fw.write(msg);
					fw.close();
					
					mno++;
					
				}catch(Exception ex) {}
					
				}
			} 
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}// finally 는 파일 닫기 or 오라클 서버해제 or 네트워크 서버 에서만 주로 나옴
	}

	public static void main(String[] args) {
		// 객체생성 => static이면 그냥 불러들이는데 지금은 인스턴스 메소드
		MovieManager m = new MovieManager();
		m.movieAllData();

	}

}
