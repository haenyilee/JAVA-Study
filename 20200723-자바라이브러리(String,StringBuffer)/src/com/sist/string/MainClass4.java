package com.sist.string;
import java.io.*; // CheckException => ����ó�� ���ϸ� ����
public class MainClass4 {

	public static void main(String[] args) {
		try {
			
			// ���� �б� (StringBufferȰ���ؼ� ����ȭ)
			StringBuffer data=new StringBuffer();
			FileReader fr= new FileReader("c:\\javaDev\\movie.txt");
			
			// ������ ���������� �е��� while�� Ȱ��
			int i=0;
			while((i=fr.read())!=-1) // -1 : end of file
			{
				data.append(String.valueOf((char)i));
			}
			fr.close();
			
			System.out.println(data);
			
		} catch (Exception e) {
		}

	}

}
