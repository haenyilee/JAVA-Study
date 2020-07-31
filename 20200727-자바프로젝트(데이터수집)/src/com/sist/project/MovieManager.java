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
		
		// html => ȭ�� UI ���� : id�� �ߺ��� ���� ��, class�� �ߺ��� �� ��
		int mno=106;
		int cno=5;
		
		// for(int i=1;i<=7;i++)
		{
			// 1. ����Ʈ ���� => ������ �� ���� �б� => �޸𸮿� ���� => ������ġ : Document
			
				Document doc = Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get();
				Elements link = doc.select("a.name_movie");
				
				
				for(int j=0;j<link.size();j++)
				{
				try {	
					// �󼼺���� ����
					String url ="https://movie.daum.net"+ link.get(j).attr("href");
					// System.out.println(link.get(j).attr("href"));
					
					// �󼼺��� movieVO ��������
					Document doc2= Jsoup.connect(url).get();
					Element poster=doc2.selectFirst("span.thumb_img img");
					System.out.println("������:"+poster.attr("src"));
					// <img src="�̹������"> ==> attr()
					Element title=doc2.selectFirst("span.txt_name");
					System.out.println("����:"+title.text());
					// <span class="txt_name">����</span> ==> text()
					Element score= doc2.selectFirst("div.info_origin a");
					System.out.println("����:"+score.text().substring(4));
					Element director= doc2.select("a.link_person").get(0);
					System.out.println("����:"+director.text());
					Element actor=doc2.select("a.link_person").get(1);
					System.out.println("�ֿ�:"+actor.text());
					Element genre=doc2.selectFirst("dd.txt_main");
					System.out.println("�帣:"+genre.text());		
					Element regdate=doc2.select("dd.txt_main").get(1);
					System.out.println("������:"+regdate.text());					
					Element showUser=doc2.selectFirst("dd#totalAudience em.emph_g");
					System.out.println("������:"+showUser.text());					
					Element story = doc2.selectFirst("div.desc_movie p");
					System.out.println("�ٰŸ�:"+story.text());					
					Element grade=doc2.select("dl.list_movie dd").get(3);
					System.out.println("���:"+grade.text());
					
					
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

					// ���Ͽ� ����
					FileWriter fw=new FileWriter("c:\\javaDev\\daum_movie.txt",true);
					fw.write(msg);
					fw.close();
					
					mno++;
					
				}catch(Exception ex) {}
					
				}
			} 
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}// finally �� ���� �ݱ� or ����Ŭ �������� or ��Ʈ��ũ ���� ������ �ַ� ����
	}

	public static void main(String[] args) {
		// ��ü���� => static�̸� �׳� �ҷ����̴µ� ������ �ν��Ͻ� �޼ҵ�
		MovieManager m = new MovieManager();
		m.movieAllData();

	}

}
