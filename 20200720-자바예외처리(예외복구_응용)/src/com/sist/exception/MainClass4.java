package com.sist.exception;

public class MainClass4 {

	public static void main(String[] args) {
		CategoryVO[] cate=MainClass3.categoryListData();
		for(CategoryVO vo:cate)
		{
			System.out.println(vo.getCno());
			System.out.println(vo.getTitle());
			System.out.println(vo.getSubject());
			System.out.println(vo.getPoster());
			System.out.println("=========================================");
		}

	}

}
