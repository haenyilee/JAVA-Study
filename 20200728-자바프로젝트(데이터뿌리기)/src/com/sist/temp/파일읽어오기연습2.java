package com.sist.temp;
import java.io.*;

public class �����о���⿬��2 {

	public static void main(String[] args) {
		
		// 1. ����ó��
		try {
			// 2. ���� �о����
			FileInputStream fis = new FileInputStream("c:\\javaDev\\daum_movie.txt");
			// 2-1. 1����Ʈ�� �о���� => 2byte�� ��ȯ�ϱ�
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			// 2-2. ���پ� �о����
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
