package com.sist.temp;
import java.io.*;
import java.util.StringTokenizer;

public class 파일읽어오기연습3 {

	public static void main(String[] args) {
		// 1. 예외처리
		try {
			// 2. 파일 읽기
			FileReader fr = new FileReader("c:\\javaDev\\daum_movie.txt");
			int i =0;
			
			// 3. 데이터 저장(문자열로)
			String data = "";
			while((i=fr.read())!=-1)
			{
				data+=String.valueOf((char)i);
				
				
			}
			// 4. 파일닫기
			fr.close();
			// 5. 문자 읽기
			System.out.println(data);
			// 5-1. 분해방법(1)
			/*
			String[] movies =data.split("\n");
			for(String s:movies)
			{
				System.out.println(s);
				System.out.println("==================================");
			}
			*/
			// 5-2. 분해방법(2)
			StringTokenizer st = new StringTokenizer(data,"\n");
			while(st.hasMoreTokens())
			{
				System.out.println(st.nextToken());
				System.out.println("==================================");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
