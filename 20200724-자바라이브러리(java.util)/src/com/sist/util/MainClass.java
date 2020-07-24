package com.sist.util;

import java.util.Random;

public class MainClass {
	
	public void random() {
		Random r = new Random();
		int a = r.nextInt(101); // int a = (int)(Math.random()*101)
		System.out.println(a);
	}

	public static void main(String[] args) {
		MainClass m = new MainClass();
		m.random();
		MainClass m1= new MainClass();
		m1.random();
	}

}
