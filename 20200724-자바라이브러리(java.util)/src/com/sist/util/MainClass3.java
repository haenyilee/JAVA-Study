package com.sist.util;

import java.util.*;

public class MainClass3 {

	public static void main(String[] args) {
		
		/*
		 * 1. (0~9 + 5)범위내에서 랜덤으로 숫자 추출
		 * 2. 추출된 숫자만큼을 배열 갯수로 하는 배열 resDay 저장공간을 만들기(new)
		 * 3. resDay배열의 크기만큼 for문을 돌림 => for what? resDay배열 한 개에 각각 1~31 중에서 값 하나 선택
		 * 4. day라는 배열을 만들어서 resDay배열에 추출된 값을 | 구분해서 넣어주기
		 * 5. day배열 마지막에 붙은 |을 빼버리기
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
		
		// 잘 들어갔는지 확인용
		System.out.println(day);
		
		/*
		 * 
		 * 6. <날짜별로 분리하기> : resdays라는 배열에 day배열 값을 |로 구분해서 넣어주기 
		 * 	1) split으로 잘라보기
		 * 	2) stringtokenizer로 잘라보기
		 * 
		 */
		String[] resdays=day.split("\\|"); // split은 정규식을 이용해야 해서 stringtokenizer가 더 편할 듯~
		
		// 잘 짤렸는지 확인용
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
