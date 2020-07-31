package com.sist.io;
import java.io.*;
import java.util.*;

class Movie implements Serializable
{
	private int mno;
	private String title;
	private String actor;
	
	
	public int getMno() {
		return mno;
	}
	
	
	public void setMno(int mno) {
		this.mno = mno;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getActor() {
		return actor;
	}
	
	
	public void setActor(String actor) {
		this.actor = actor;
	}



}


public class ArrayList활용저장 {
	
	public static void main(String[] args) {
		try {
			ArrayList<Movie> list= new ArrayList<Movie>();
			
			Movie m= new Movie();
			
			// index=0
			m.setMno(1);
			m.setTitle("홍길동전");
			m.setActor("홍길동");
			list.add(m);
			System.out.println("m:"+m);

			// index=1
			m=new Movie();
			m.setMno(2);
			m.setTitle("심청전");
			m.setActor("심청");
			list.add(m);
			System.out.println("m:"+m);

			// index=2
			m=new Movie();
			m.setMno(3);
			m.setTitle("춘향전");
			m.setActor("춘향");
			list.add(m);
			System.out.println("m:"+m);
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:\\javaDev\\movie_test.txt"));
			oos.writeObject(list);
			System.out.println("저장완료!");
			
//			for(int i=0;i<list.size();i++)
//			{
//				Movie mm = list.get(i);
//				System.out.println(mm.getActor());
//			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			
		}

	}
	
	

}
