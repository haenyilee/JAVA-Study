package com.sist.temp;
import java.io.*;
import java.util.StringTokenizer;

public class �����о���⿬��3 {

	public static void main(String[] args) {
		// 1. ����ó��
		try {
			// 2. ���� �б�
			FileReader fr = new FileReader("c:\\javaDev\\daum_movie.txt");
			int i =0;
			
			// 3. ������ ����(���ڿ���)
			String data = "";
			while((i=fr.read())!=-1)
			{
				data+=String.valueOf((char)i);
				
				
			}
			// 4. ���ϴݱ�
			fr.close();
			// 5. ���� �б�
			System.out.println(data);
			// 5-1. ���ع��(1)
			/*
			String[] movies =data.split("\n");
			for(String s:movies)
			{
				System.out.println(s);
				System.out.println("==================================");
			}
			*/
			// 5-2. ���ع��(2)
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
