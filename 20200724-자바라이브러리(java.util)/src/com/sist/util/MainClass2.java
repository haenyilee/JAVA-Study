package com.sist.util;

import java.util.StringTokenizer;

public class MainClass2 {

	public static void main(String[] args) {
		
		// 배열에 담긴 데이터
		String[] data = {
				"1|2|3|4|5",
				"6|7|8",
				"10|11",
				"12|13|14|15|16|17|18",
				"29|30|31|"	
		};
		
		// data 배열 갯수만큼 for문을 돌림
		for(int i=0;i<data.length;i++)
		{
			// st라는 stack에 |를 기준으로 data[i]값을 자름
			StringTokenizer st = new StringTokenizer(data[i],"|");
			System.out.println(data[i]);
			System.out.println("=========================");
			
			// 각 배열 값이 들쭉날쭉하니까 while hsmore돌림!
			while(st.hasMoreTokens())
			{
				System.out.println(st.nextToken());
			}
		}

	}

}
