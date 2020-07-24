package com.sist.util;

import java.util.*;

public class MainClass3 {

	public static void main(String[] args) {
		
		/*
		 * 1. (0~9 + 5)���������� �������� ���� ����
		 * 2. ����� ���ڸ�ŭ�� �迭 ������ �ϴ� �迭 resDay ��������� �����(new)
		 * 3. resDay�迭�� ũ�⸸ŭ for���� ���� => for what? resDay�迭 �� ���� ���� 1~31 �߿��� �� �ϳ� ����
		 * 4. day��� �迭�� ���� resDay�迭�� ����� ���� | �����ؼ� �־��ֱ�
		 * 5. day�迭 �������� ���� |�� ��������
		 */
		Random r = new Random();
		int[] resDay= new int[r.nextInt(10)+5];
		
		String day="";
		for(int i=0;i<resDay.length;i++)
		{
			resDay[i]=r.nextInt(31)+1;
			day+=resDay[i]+"|";
		}
		day=day.substring(0,day.lastIndexOf("|"));
		
		// �� ������ Ȯ�ο�
		System.out.println(day);
		
		/*
		 * 
		 * 6. <��¥���� �и��ϱ�> : resdays��� �迭�� day�迭 ���� |�� �����ؼ� �־��ֱ� 
		 * 	1) split���� �߶󺸱�
		 * 	2) stringtokenizer�� �߶󺸱�
		 * 
		 */
		String[] resdays=day.split("\\|"); // split�� ���Խ��� �̿��ؾ� �ؼ� stringtokenizer�� �� ���� ��~
		
		// �� ©�ȴ��� Ȯ�ο�
		for(String s: resdays)
		{
			System.out.println(s);
		}
		
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(day,"|");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
