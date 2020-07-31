package com.sist.io;
import java.io.*; // => 회원가입, 댓글, 게시판
/*
 * 1. 파일에 저장 => 저장한 값을 ArrayList에 넣고 제어
 * 2. 데이터를 ArrayList에 모은 다음 => 저장
 */

public class 파일쓰기 {

	public static void main(String[] args) {
		// FileOutputStream fos = null;
		FileWriter fos=null;
		
		try {
			// 생성 : 경로명 뒤에 true붙이면 append모드! 기존 파일에 이어 붙이기
			//fos = new FileOutputStream("c:\\javaDev\\temp.txt",true);
			fos= new FileWriter("c:\\javaDev\\temp.txt",true);
			
			// 저장
			// 한번에 저장 : 문자열을 바이트 배열로 변경해서 저장
			String str="ADFAGAG";
			//fos.write(str.getBytes());
			fos.write(str+"\r\n");

			/* 한글자씩 저장
			fos.write('L');
			fos.write('M');
			fos.write('N');
			*/
			System.out.println("저장완료!!");
		} catch (Exception e) {
			// 에러처리
			System.out.println(e.getMessage());
		}finally {
			// 파일 닫기 or 서버닫기, 오라클 연결 해제하기
			try {
				
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
			
			
		}

	}

}
