package com.sist.collection;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		// �ν��Ͻ� �޼ҵ� 
//		
//		// �߰�
//		list.add(10);
//		list.add(10.5);
//		list.add("ȫ�浿");
//		list.add('A');
//		
//		// ���б�
//		int a=(int)list.get(0);
//		double d= (double) list.get(1);
//		
//		System.out.println(a);
//		System.out.println(d);
		
		list.add("ȫ�浿");
		list.add("��û��");
		list.add("�̼���");
		list.add("�����");
		list.add("�赿��");
		list.add("ȫȫȫ");
		
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		list.add(1,"������");
		System.out.println();
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
	}

}
