package com.sist.io;
import java.io.*;

import javax.imageio.stream.FileImageInputStream;
public class 파일읽기 {

	public static void main(String[] args) {
		// 1. 파일 읽기
		
		// FileInputStream fis = null;
		FileReader fis = null; // 한글이 포함된 파일을 읽어올 때 : 자바 => Ansi로 저장
 		
		// 예외처리
		try {
			// 파일읽기
			// fis = new FileInputStream("c:\\javaDev\\news.txt");
			fis = new FileReader("c:\\javaDev\\news.txt");
			// 글자 하나씩 읽어오기
			int i=0;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			// 에러처리
			System.out.println(e.getMessage());
			
		}finally {
			// 파일닫기
			try {
				fis.close();
			} catch (Exception e2) {
			}
		}
		


	}
}
