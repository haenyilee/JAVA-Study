package com.sist.exception;

public class MainClass {
	public int div(int a,int b) throws Exception
	{
		return a/b;
	}

	public static void main(String[] args) throws Exception {
		MainClass m = new MainClass();
		int res = m.div(10, 2);
		System.out.println(res);
	}

}
