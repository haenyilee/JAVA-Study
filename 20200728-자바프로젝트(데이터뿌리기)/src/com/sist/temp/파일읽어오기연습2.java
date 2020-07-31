package com.sist.temp;
import java.io.*;

public class 파일읽어오기연습2 {

	public static void main(String[] args) {
		
		// 1. 예외처리
		try {
			// 2. 파일 읽어오기
			FileInputStream fis = new FileInputStream("c:\\javaDev\\daum_movie.txt");
			// 2-1. 1바이트씩 읽어오기 => 2byte로 변환하기
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			// 2-2. 한줄씩 읽어오기
			while(true)
			{
				
				String data = br.readLine();
				if(data == null) break;
				System.out.println(data);
			}
			fis.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
