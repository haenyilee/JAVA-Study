package com.sist.string;

import java.io.FileReader;

public class MainClass5 {

	public static void main(String[] args) throws Exception{
		long start = System.currentTimeMillis();
		
		// 문자열 결합 방법 3가지
		// String data="";
		// StringBuffer data = new StringBuffer();
		StringBuilder data= new StringBuilder();
		
		FileReader fr= new FileReader("c:\\javaDev\\movie.txt");
		
		// 파일이 끝날때까지 읽도록 while문 활용
		int i=0;
		while((i=fr.read())!=-1) // -1 : end of file
		{
			// data+=(String.valueOf((char)i));
			data.append(String.valueOf((char)i));
		}
		fr.close();
		long end=System.currentTimeMillis();
		System.out.println("수행시간="+(end-start));

	}

}
