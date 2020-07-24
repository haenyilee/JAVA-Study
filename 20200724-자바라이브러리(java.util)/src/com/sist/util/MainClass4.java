package com.sist.util;

import java.util.*;

public class MainClass4 {

	public static void main(String[] args) {
		/*
		 * 클래스 생성
		 */
		Calendar cal = Calendar.getInstance();
		
		// 시스템의 실제 날짜를 읽어온다.
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)+1);
//		System.out.println(cal.get(Calendar.DATE));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		
//		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		String[] strWeek= {"일","월","화","수","목","금","토"};
		// System.out.println(strWeek[week]+"요일");
		// System.out.println(cal.getActualMaximum(7));
		
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();

		System.out.println("월 입력:");
		int month=scan.nextInt();
		
		System.out.println("일 입력:");
		int day=scan.nextInt();
		
		// 입력 받은 날짜로 바꾸기
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DATE,day);
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1);
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(strWeek[week]+"요일");
		
	}

}
