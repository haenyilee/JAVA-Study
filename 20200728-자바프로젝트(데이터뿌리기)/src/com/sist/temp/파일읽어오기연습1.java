package com.sist.temp;
import java.io.*; 
import java.util.*; // split, StringTokenizer

public class 파일읽어오기연습1 {

	public static void main(String[] args) {
		// 1. 파일 읽기
		// 1-3. 파일 읽기 해주는 애 
		FileReader fr = null;
		// (참고) 파일에 저장해주는 애 : FileWriter(문자스트림,한글포함,*fileinputstream,fileoutputstream : 1byte,jpg,png)
		
		
		
		// 1-1. 예외처리
		try {
			// 1-5. 파일 읽기 시작
			fr= new FileReader("c:\\javaDev\\daum_movie.txt");
			int i=0; // 한글자씩 읽기 => 문자의  번호를 읽어오는 것임
			
				// 1-6. 문자열 결합
				StringBuffer sb = new StringBuffer(); 
			
			while((i=fr.read())!=-1)
			{
				// System.out.print("" + i); 
				sb.append(String.valueOf((char)i));
			}
			
		} catch (Exception e) {
			// 1-3. 에러처리(디버깅) : 에러 메세지 확인(getMessage) or Trace(printStackTrace:실행과정 확인=>해당 위치에서 찾기)
			e.printStackTrace();
			
		}
		// 1-2. 파일 닫아주기(예외처리)
		finally {
			// 파일 닫기, 서버 종료, 오라클 연동 해제, 쓰레드 종료
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
