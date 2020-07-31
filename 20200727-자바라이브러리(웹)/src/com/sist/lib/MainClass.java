package com.sist.lib;

import java.util.*;
import java.text.*; // 날짜, 시간 변환 : simpleDateFormat()

public class MainClass {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		System.out.println(date);

	}

}
