package com.sist.string;

public class MainClass6 {

	public static void main(String[] args) {
		String[] arr= {"홍길동","고길동","둘리","심청이","박문수"};
		System.out.println(String.join("|",arr));
		
		String str=String.format("%d - %d = %d", 10,2,10-2);
		System.out.println(str);

	}

}
