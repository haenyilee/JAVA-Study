package com.sist.reservedata;
import java.io.*; // ���� �о�Ë�....input output
import java.util.Scanner;


public class theaterManager {
	
	static String[] theaterData=new String[2000];
	
	static {
		try {
			StringBuffer data=new StringBuffer();			
			// File �д� ��쿡�� �ݵ�� ���� ó���� �ؾ� ��
			FileReader fr=new FileReader("c:\\javaDev\\theater.txt");
			
			int i=0;
			while((i=fr.read())!=-1) // -1 EOF(End Of File)
			{
				data.append(String.valueOf((char)i)); // ĳ���͸� ��Ʈ������ ����ȯ
				
			}
			fr.close();			
			
			String[] theaterData=data.toString().split("],");
			
		} catch (Exception ex) {}
		System.out.println(theaterData);
		
	}

}
