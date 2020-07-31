package com.sist.data;

import java.util.*;
import java.io.*;

public class DramaManager2 {

	private static ArrayList<DramaVO> list = new ArrayList<DramaVO>();
	
	static
	{
		try {
			FileInputStream fr = new FileInputStream("c:\\javaDev\\rotten_drama.txt");
			BufferedReader in = new BufferedReader(new InputStreamReader(fr));
			
			while(true)
			{
				String drama = in.readLine();
				if(drama==null) break;
				
				//StringTokenizer st = new StringTokenizer(drama,"|");
				String[] datas=drama.split("\\|");
				DramaVO vo = new DramaVO();
					/*
						String msg=mno+"|"+cno+"|"
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
							" "
					 */
					vo.setMno(Integer.parseInt(datas[0]));
					vo.setCno(Integer.parseInt(datas[1]));
					vo.setTitle(datas[2]);
					vo.setPoster(datas[3]);
					
					vo.setTomato(datas[4]);
					vo.setScore(datas[5]);
					
					vo.setSynopsis(datas[6]);
					
					//String starring = st.nextToken();
					//starring=starring.substring(starring.lastIndexOf(":")+1);	
					vo.setStarring(datas[7]);
					
					
					vo.setBroad(datas[8]);
					vo.setDate(datas[9]);
					vo.setGenre(datas[10]);
					vo.setProducer(datas[11]);
					
					list.add(vo);
					
				}
		
			
		}catch (Exception e) {System.out.println(e.getMessage());}
	}
	
	
	// 드라마 리스트 데이터 페이지로 나누기
	public ArrayList<DramaVO> dramaListData(int page)
	{
		ArrayList<DramaVO> dramas = new ArrayList<DramaVO>();
		// 페이지 나누기
				int i = 0;
				int j = 0;
				int pagecnt=(page*10)-10;
				/*
				 * 1page = 0~9
				 * 2page = 10~19
				 */
				for(DramaVO vo:list)
				{
					// pagecnt => 저장위치
					if(i<10 && j>=pagecnt)
					{
						dramas.add(vo);
						i++; // i : 10개씩 나눠주는 변수
					} 
					j++; // j : for문 돌아가는 횟수
				}
				return dramas;
	}
	
	// 드라마 찾기(제목으로)
	public ArrayList<DramaVO> dramaFindData(String ss)
	{
		ArrayList<DramaVO> dramas = new ArrayList<DramaVO>();
		
		for(DramaVO vo:list)
		{
			if(vo.getTitle().contains(ss))
			{
				dramas.add(vo);
			}
		}
		return dramas;
	}
	
	
	// 드라마 전체 페이지
	public int dramaTotalPage() {
		return (int) (Math.ceil(list.size()/10.0));
	}
	
	
	// 드라마 상세
	public DramaVO dramaDetailData(int mno)
	{
		return list.get(mno-1);
	}
	
	
	// 모든 드라마
	public ArrayList<DramaVO> dramaAllData(int cno)
	{
		
		ArrayList<DramaVO> dramas = new ArrayList<DramaVO>();
		for(DramaVO vo : list)
		{
			if(vo.getCno()==cno)
			{
				dramas.add(vo);
			}
		}
		return dramas;
	}
	
	
	

	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("페이지:");
		int page = scan.nextInt();
		
		
		DramaManager d= new DramaManager();
		System.out.println(page+"page / "+d.dramaTotalPage()+" pages");
		*/
		
		
		
		for(DramaVO vo:list)
		{
			System.out.println(
//					vo.getTitle()
//					+vo.getBroad()+
//					vo.getCno()+
//					vo.getDate()+
//					vo.getGenre()+
//					vo.getPoster()
					);
		}
		
	}

}
