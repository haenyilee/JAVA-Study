package com.sist.string;

import java.io.FileReader;

public class MainClass5 {

	public static void main(String[] args) throws Exception{
		long start = System.currentTimeMillis();
		
		// ���ڿ� ���� ��� 3����
		// String data="";
		// StringBuffer data = new StringBuffer();
		StringBuilder data= new StringBuilder();
		
		FileReader fr= new FileReader("c:\\javaDev\\movie.txt");
		
		// ������ ���������� �е��� while�� Ȱ��
		int i=0;
		while((i=fr.read())!=-1) // -1 : end of file
		{
			// data+=(String.valueOf((char)i));
			data.append(String.valueOf((char)i));
		}
		fr.close();
		long end=System.currentTimeMillis();
		System.out.println("����ð�="+(end-start));

	}

}
