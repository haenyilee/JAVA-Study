package com.sist.util;

import java.util.*;

public class MainClass4 {

	public static void main(String[] args) {
		/*
		 * Ŭ���� ����
		 */
		Calendar cal = Calendar.getInstance();
		
		// �ý����� ���� ��¥�� �о�´�.
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)+1);
//		System.out.println(cal.get(Calendar.DATE));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		
//		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		String[] strWeek= {"��","��","ȭ","��","��","��","��"};
		// System.out.println(strWeek[week]+"����");
		// System.out.println(cal.getActualMaximum(7));
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�⵵ �Է�:");
		int year=scan.nextInt();

		System.out.println("�� �Է�:");
		int month=scan.nextInt();
		
		System.out.println("�� �Է�:");
		int day=scan.nextInt();
		
		// �Է� ���� ��¥�� �ٲٱ�
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DATE,day);
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1);
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(strWeek[week]+"����");
		
	}

}
