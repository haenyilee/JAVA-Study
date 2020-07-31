package com.sist.io;

import java.io.*;
import java.util.*;


public class �����б�2 {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		
		
		// ����ó��
		try {
			ois = new ObjectInputStream(new FileInputStream("c:\\javaDev\\movie_test.txt"));
			ArrayList<Movie> list = (ArrayList<Movie>) ois.readObject();
						
			// ���
			for(Movie m:list)
			{
				System.out.println(m.getMno()+" "+m.getActor()+" "+m.getTitle());
			}
		} catch (Exception e) {
			// ����Ȯ��
			System.out.println(e.getMessage());
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
