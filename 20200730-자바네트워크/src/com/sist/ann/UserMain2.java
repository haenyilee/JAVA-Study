package com.sist.ann;
import java.lang.reflect.Method;
import java.util.*;
public class UserMain2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��û:");
		String ss = scan.next();
		try {
			Class clsName = Class.forName("com.sist.ann.MovieModel");
			// Ŭ���� ���� �б�
			Object obj = clsName.newInstance(); // �޸� �Ҵ�
			// �޼ҵ� ã��
			Method[] methods=clsName.getDeclaredMethods();
			for(Method m:methods)
			{
				// System.out.println(m.getName());
				RequestMapping rm=m.getAnnotation(RequestMapping.class);
				if(rm.value().equals(ss))
				{
					m.invoke(obj, null);
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
