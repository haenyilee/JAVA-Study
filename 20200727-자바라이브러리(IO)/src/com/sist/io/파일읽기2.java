package com.sist.io;

import java.io.*;
import java.util.*;


public class 파일읽기2 {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		
		
		// 예외처리
		try {
			ois = new ObjectInputStream(new FileInputStream("c:\\javaDev\\movie_test.txt"));
			ArrayList<Movie> list = (ArrayList<Movie>) ois.readObject();
						
			// 출력
			for(Movie m:list)
			{
				System.out.println(m.getMno()+" "+m.getActor()+" "+m.getTitle());
			}
		} catch (Exception e) {
			// 에러확인
			System.out.println(e.getMessage());
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
