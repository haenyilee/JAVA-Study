package com.sist.collection;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		// ÀÎ½ºÅÏ½º ¸Ş¼Òµå 
//		
//		// Ãß°¡
//		list.add(10);
//		list.add(10.5);
//		list.add("È«±æµ¿");
//		list.add('A');
//		
//		// °ªÀĞ±â
//		int a=(int)list.get(0);
//		double d= (double) list.get(1);
//		
//		System.out.println(a);
//		System.out.println(d);
		
		list.add("È«±æµ¿");
		list.add("½ÉÃ»ÀÌ");
		list.add("ÀÌ¼ş½Ì");
		list.add("ÀÌÇà´×");
		list.add("±èµ¿·æ");
		list.add("È«È«È«");
		
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		list.add(1,"°­°¨Âù");
		System.out.println();
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
	}

}
