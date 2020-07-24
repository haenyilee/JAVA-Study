package com.sist.string;
import java.io.*; // CheckException => 예외처리 안하면 오류
public class MainClass4 {

	public static void main(String[] args) {
		try {
			
			// 파일 읽기 (StringBuffer활용해서 최적화)
			StringBuffer data=new StringBuffer();
			FileReader fr= new FileReader("c:\\javaDev\\movie.txt");
			
			// 파일이 끝날때까지 읽도록 while문 활용
			int i=0;
			while((i=fr.read())!=-1) // -1 : end of file
			{
				data.append(String.valueOf((char)i));
			}
			fr.close();
			
			System.out.println(data);
			
		} catch (Exception e) {
		}

	}

}
