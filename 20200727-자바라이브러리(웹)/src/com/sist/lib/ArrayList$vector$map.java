package com.sist.lib;
import java.util.*;
public class ArrayList$vector$map {

	public static void main(String[] args) {
		// ArrayList<String> names = new ArrayList<String>();		
		// Vector<String> names = new Vector<String>();		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("ȫ�浿"); // 0
		names.add("��û��"); // 1 
		names.add("�̼���"); // 2
		names.add("������"); // 3
		names.add("������"); // 4
		
		System.out.println("����Ȱ���:"+names.size());
		// ���
		for(int i=0;i<names.size();i++)
		{
			// ������ ���� ��
			String name= names.get(i);
			// ���ϴ� ��ġ�� ����� ������ �б�
			System.out.println(name+":"+i);
		}
		
		System.out.println();
		
		// ���ϴ� ��ġ�� ���
		// add(index num, "value")
		names.add(3,"��������");
		
		System.out.println("����Ȱ���:"+names.size());
		for(int i=0;i<names.size();i++)
		{
			String name= names.get(i);
			System.out.println(name+":"+i);
		}
		
		// ����
		names.remove(2);
		System.out.println();
		System.out.println("����Ȱ���:"+names.size());
		for(int i=0;i<names.size();i++)
		{
			String name= names.get(i);
			System.out.println(name+":"+i);
		}
		
		// ����
		names.set(2, "�Ѹ�");
		System.out.println();
		System.out.println("����Ȱ���:"+names.size());
		for(int i=0;i<names.size();i++)
		{
			String name= names.get(i);
			System.out.println(name+":"+i);
		}
		
		// ����
		names.clear();
		System.out.println();
		System.out.println("����Ȱ���:"+names.size());
		for(int i=0;i<names.size();i++)
		{
			String name= names.get(i);
			System.out.println(name+":"+i);
		}
		

	}

}
