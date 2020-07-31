package com.sist.data;
// ������ ����

import java.util.*;
import java.io.*;

public class MovieManager {
	// 1. ������ ����
	private static ArrayList<MovieVO> list = new ArrayList<MovieVO>();
	
	// 2. ������ ���� => Arraylist�� ���� �� ����
	static
	{
		try {
			// ����� ���� �б�
			FileInputStream fr = new FileInputStream("c:\\javaDev\\daum_movie.txt");
			// 3. �޸𸮿� ��ü �����͸� ��Ƽ� �����ϱ� : ���۴� �ӽñ����ġ
			BufferedReader in = new BufferedReader(new InputStreamReader(fr));
			while(true)
			{
				String movie = in.readLine(); // readLine() => \n
				if(movie==null) break; // ������ �� �о��� ��, �����Ű��
				
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
					regdate=regdate.substring(0,regdate.lastIndexOf("��"));
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
		
		// ������ ������
		int i = 0;
		int j = 0;
		int pagecnt=(page*10)-10;
		/*
		 * 1page = 0~9
		 * 2page = 10~19
		 */
		for(MovieVO vo:list)
		{
			// pagecnt => ������ġ
			if(i<10 && j>=pagecnt)
			{
				movies.add(vo);
				i++; // i : 10���� �����ִ� ����
			} 
			j++; // j : for�� ���ư��� Ƚ��
		}
				
		
		return movies;
	}
	// �˻�
	// ���� ��ȭ���� �ϳ��� arraylist�� ���� ���� ��
	public ArrayList<MovieVO> movieFindData(String ss)
	{
		ArrayList<MovieVO> movies = new ArrayList<MovieVO>(); // �� ���� ã���� �𸣴ϱ� ������ �迭�� arraylist�� ���
		
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
		// ceil�� �ø� �޼ҵ�
	}
	
	/*
	private static Object indexOf(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	
	// �󼼺��� : 'Ȩ'�޴����� ��ȭ ������ ����Ŭ���ϸ� ��ȭ ������ �����ִ� ���
	public MovieVO movieDetailData(int mno)
	{
		return list.get(mno-1);
	}
	// ��ȭ ��ü �б� => listForm���� ���
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
		System.out.println("������:");
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
		
		// ������ �б�
		ArrayList<MovieVO> list = m.movieListData(page);
		
		for(MovieVO vo:list)
		{
			System.out.println(vo.getTitle());
		}
	}

}
