package com.sist.io;
import java.io.*;

import javax.imageio.stream.FileImageInputStream;
public class �����б� {

	public static void main(String[] args) {
		// 1. ���� �б�
		
		// FileInputStream fis = null;
		FileReader fis = null; // �ѱ��� ���Ե� ������ �о�� �� : �ڹ� => Ansi�� ����
 		
		// ����ó��
		try {
			// �����б�
			// fis = new FileInputStream("c:\\javaDev\\news.txt");
			fis = new FileReader("c:\\javaDev\\news.txt");
			// ���� �ϳ��� �о����
			int i=0;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			// ����ó��
			System.out.println(e.getMessage());
			
		}finally {
			// ���ϴݱ�
			try {
				fis.close();
			} catch (Exception e2) {
			}
		}
		


	}
}
