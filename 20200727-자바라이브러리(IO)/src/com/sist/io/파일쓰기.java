package com.sist.io;
import java.io.*; // => ȸ������, ���, �Խ���
/*
 * 1. ���Ͽ� ���� => ������ ���� ArrayList�� �ְ� ����
 * 2. �����͸� ArrayList�� ���� ���� => ����
 */

public class ���Ͼ��� {

	public static void main(String[] args) {
		// FileOutputStream fos = null;
		FileWriter fos=null;
		
		try {
			// ���� : ��θ� �ڿ� true���̸� append���! ���� ���Ͽ� �̾� ���̱�
			//fos = new FileOutputStream("c:\\javaDev\\temp.txt",true);
			fos= new FileWriter("c:\\javaDev\\temp.txt",true);
			
			// ����
			// �ѹ��� ���� : ���ڿ��� ����Ʈ �迭�� �����ؼ� ����
			String str="ADFAGAG";
			//fos.write(str.getBytes());
			fos.write(str+"\r\n");

			/* �ѱ��ھ� ����
			fos.write('L');
			fos.write('M');
			fos.write('N');
			*/
			System.out.println("����Ϸ�!!");
		} catch (Exception e) {
			// ����ó��
			System.out.println(e.getMessage());
		}finally {
			// ���� �ݱ� or �����ݱ�, ����Ŭ ���� �����ϱ�
			try {
				
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
			
			
		}

	}

}
