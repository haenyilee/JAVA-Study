package com.sist.temp;
import java.io.*; 
import java.util.*; // split, StringTokenizer

public class �����о���⿬��1 {

	public static void main(String[] args) {
		// 1. ���� �б�
		// 1-3. ���� �б� ���ִ� �� 
		FileReader fr = null;
		// (����) ���Ͽ� �������ִ� �� : FileWriter(���ڽ�Ʈ��,�ѱ�����,*fileinputstream,fileoutputstream : 1byte,jpg,png)
		
		
		
		// 1-1. ����ó��
		try {
			// 1-5. ���� �б� ����
			fr= new FileReader("c:\\javaDev\\daum_movie.txt");
			int i=0; // �ѱ��ھ� �б� => ������  ��ȣ�� �о���� ����
			
				// 1-6. ���ڿ� ����
				StringBuffer sb = new StringBuffer(); 
			
			while((i=fr.read())!=-1)
			{
				// System.out.print("" + i); 
				sb.append(String.valueOf((char)i));
			}
			
		} catch (Exception e) {
			// 1-3. ����ó��(�����) : ���� �޼��� Ȯ��(getMessage) or Trace(printStackTrace:������� Ȯ��=>�ش� ��ġ���� ã��)
			e.printStackTrace();
			
		}
		// 1-2. ���� �ݾ��ֱ�(����ó��)
		finally {
			// ���� �ݱ�, ���� ����, ����Ŭ ���� ����, ������ ����
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
