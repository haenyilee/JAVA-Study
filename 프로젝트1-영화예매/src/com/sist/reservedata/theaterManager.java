package com.sist.reservedata;
import java.io.*; // 파일 읽어올떄....input output
import java.util.Scanner;


public class theaterManager {
	
	static String[] theaterData=new String[2000];
	
	static {
		try {
			StringBuffer data=new StringBuffer();			
			// File 읽는 경우에는 반드시 예외 처리를 해야 함
			FileReader fr=new FileReader("c:\\javaDev\\theater.txt");
			
			int i=0;
			while((i=fr.read())!=-1) // -1 EOF(End Of File)
			{
				data.append(String.valueOf((char)i)); // 캐릭터를 스트링으로 형변환
				
			}
			fr.close();			
			
			String[] theaterData=data.toString().split("],");
			
		} catch (Exception ex) {}
		System.out.println(theaterData);
		
	}

}
