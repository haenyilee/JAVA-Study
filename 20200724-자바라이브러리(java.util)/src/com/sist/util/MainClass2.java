package com.sist.util;

import java.util.StringTokenizer;

public class MainClass2 {

	public static void main(String[] args) {
		
		// �迭�� ��� ������
		String[] data = {
				"1|2|3|4|5",
				"6|7|8",
				"10|11",
				"12|13|14|15|16|17|18",
				"29|30|31|"	
		};
		
		// data �迭 ������ŭ for���� ����
		for(int i=0;i<data.length;i++)
		{
			// st��� stack�� |�� �������� data[i]���� �ڸ�
			StringTokenizer st = new StringTokenizer(data[i],"|");
			System.out.println(data[i]);
			System.out.println("=========================");
			
			// �� �迭 ���� ���߳����ϴϱ� while hsmore����!
			while(st.hasMoreTokens())
			{
				System.out.println(st.nextToken());
			}
		}

	}

}
