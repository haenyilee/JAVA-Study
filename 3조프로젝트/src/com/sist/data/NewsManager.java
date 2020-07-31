package com.sist.data;
import java.util.*;
import java.io.*;

public class NewsManager {
	private static ArrayList<NewsVO> list = new ArrayList<NewsVO>();
	
	// ���α׷� ���� => ������ �о => arraylist�� �����ؾ� ��
	
	/*
	 * ����
	 * �����ͺ��̽�
	 * ========== �ѹ��� ����!
	 */
	static 
	{
		try {
			/* ������� �����
			String data = title.get(j).text()+"|"							
					+ content.get(j).text().replace("|", " ")+"|"
					+ author.get(j).text()+"|"
					+ link.get(j).attr("href")
					+"https:"+img+"\r\n";
			*/
			// 1����Ʈ�� �б�
			FileInputStream fis = new FileInputStream("c:\\javaDev\\daum_news.txt");
			
			// 2����Ʈ�� �����ؼ� ����α�
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			
			while (true) {
				// ������ �о data string�� ����
				String data = in.readLine();
				if(data==null) break;
				
				// ������ ¥����
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
		int i=0; // i : 5���� �����ִ� ����
		int j=0; // j : for���� ����Ǵ� Ƚ��
		
		int pagecnt= (page*5)-5; // ����� ������ġ
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
