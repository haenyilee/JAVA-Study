package com.sist.data;
import java.util.*;
import java.io.*;

public class NewsManager {
	private static ArrayList<NewsVO> list = new ArrayList<NewsVO>();
	
	// 프로그램 시작 => 데이터 읽어서 => arraylist에 저장해야 함
	
	/*
	 * 파일
	 * 데이터베이스
	 * ========== 한번만 수행!
	 */
	static 
	{
		try {
			/* 저장순서 참고용
			String data = title.get(j).text()+"|"							
					+ content.get(j).text().replace("|", " ")+"|"
					+ author.get(j).text()+"|"
					+ link.get(j).attr("href")
					+"https:"+img+"\r\n";
			*/
			// 1바이트씩 읽기
			FileInputStream fis = new FileInputStream("c:\\javaDev\\daum_news.txt");
			
			// 2바이트로 변경해서 묶어두기
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			
			while (true) {
				// 데이터 읽어서 data string에 저장
				String data = in.readLine();
				if(data==null) break;
				
				// 데이터 짜르기
				StringTokenizer st = new StringTokenizer(data,"|");
				NewsVO vo = new NewsVO();
				vo.setTitle(st.nextToken());
				vo.setContent(st.nextToken());
				vo.setAuthor(st.nextToken());
				vo.setLink(st.nextToken());
				vo.setPoster(st.nextToken());
				list.add(vo);
				
			}
			fis.close();
			
		} catch (Exception e) {}
	}

	
	public ArrayList<NewsVO> newsListData(int page)
	{
		ArrayList<NewsVO> news = new ArrayList<NewsVO>();
		int i=0; // i : 5개씩 나눠주는 변수
		int j=0; // j : for문이 수행되는 횟수
		
		int pagecnt= (page*5)-5; // 출력할 시작위치
		for(NewsVO vo:list)
		{
			if(i<5 && j>=pagecnt)
			{
				news.add(vo);
				i++;
			}
			j++;
		}
		
		return news; 
	}

	public static void main(String[] args) {
		NewsManager m = new NewsManager();
		ArrayList<NewsVO> list = m.newsListData(1);
		int i=1;
		for(NewsVO vo:list)
		{
			System.out.println(i+"."+vo.getTitle());
			i++;
		}
		
		

	}

}
