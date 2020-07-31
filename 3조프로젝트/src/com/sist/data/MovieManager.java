package com.sist.data;
// 데이터 관리

import java.util.*;
import java.io.*;

public class MovieManager {
	// 1. 데이터 저장
	private static ArrayList<MovieVO> list = new ArrayList<MovieVO>();
	
	// 2. 데이터 수집 => Arraylist에 저장 후 시작
	static
	{
		try {
			// 저장된 파일 읽기
			FileInputStream fr = new FileInputStream("c:\\javaDev\\daum_movie.txt");
			// 3. 메모리에 전체 데이터를 모아서 관리하기 : 버퍼는 임시기억장치
			BufferedReader in = new BufferedReader(new InputStreamReader(fr));
			while(true)
			{
				String movie = in.readLine(); // readLine() => \n
				if(movie==null) break; // 파일을 다 읽었을 때, 종료시키기
				
				StringTokenizer st = new StringTokenizer(movie,"|");
				while(st.hasMoreTokens())
				{
					MovieVO vo = new MovieVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setPoster("http:"+st.nextToken());
					vo.setTitle(st.nextToken());
					vo.setScore(st.nextToken());
					vo.setDirector(st.nextToken());
					vo.setActor(st.nextToken());
					vo.setGenre(st.nextToken());
					
					String regdate = st.nextToken();
					regdate=regdate.substring(0,regdate.lastIndexOf("개"));
					vo.setRegdate(regdate);
					
					vo.setShowUser(Integer.parseInt(st.nextToken().replace(",", "")));
					
					String grade= st.nextToken();
					grade=grade.substring(grade.indexOf(",")+1);
					vo.setGrade(grade.trim());
					
					vo.setStory(st.nextToken());
					
					
					
					
					list.add(vo);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public ArrayList<MovieVO> movieListData(int page)
	{
		ArrayList<MovieVO> movies = new ArrayList<MovieVO>();
		
		// 페이지 나누기
		int i = 0;
		int j = 0;
		int pagecnt=(page*10)-10;
		/*
		 * 1page = 0~9
		 * 2page = 10~19
		 */
		for(MovieVO vo:list)
		{
			// pagecnt => 저장위치
			if(i<10 && j>=pagecnt)
			{
				movies.add(vo);
				i++; // i : 10개씩 나눠주는 변수
			} 
			j++; // j : for문 돌아가는 횟수
		}
				
		
		return movies;
	}
	// 검색
	// 개별 영화정보 하나를 arraylist에 각각 담은 것
	public ArrayList<MovieVO> movieFindData(String ss)
	{
		ArrayList<MovieVO> movies = new ArrayList<MovieVO>(); // 몇 개를 찾을지 모르니까 가변형 배열인 arraylist를 사용
		
		// list
		for(MovieVO vo:list)
		{
			if(vo.getTitle().contains(ss))
			{
				movies.add(vo);
			}
		}
		return movies;
	}
	
	
	
	
	
	public int movieTotalPage() {
		return (int) (Math.ceil(list.size()/10.0));
		// ceil는 올림 메소드
	}
	
	/*
	private static Object indexOf(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	
	// 상세보기 : '홈'메뉴에서 영화 포스터 더블클릭하면 영화 상세정보 보여주는 기능
	public MovieVO movieDetailData(int mno)
	{
		return list.get(mno-1);
	}
	// 영화 전체 읽기 => listForm에서 사용
	public ArrayList<MovieVO> movieAllData(int cno)
	{
		ArrayList<MovieVO> movies= new ArrayList<MovieVO>();
		for(MovieVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				movies.add(vo);
			}
		}
		return movies;
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("페이지:");
		int page = scan.nextInt();
		
		MovieManager m = new MovieManager();
		System.out.println(page+" page / "+m.movieTotalPage()+" pages");
		/*
		for(MovieVO vo:list)
		{
			if(vo.getTitle().contains(ss))
			System.out.println(vo.getTitle());
		}
		*/
		
		// 데이터 읽기
		ArrayList<MovieVO> list = m.movieListData(page);
		
		for(MovieVO vo:list)
		{
			System.out.println(vo.getTitle());
		}
	}

}
