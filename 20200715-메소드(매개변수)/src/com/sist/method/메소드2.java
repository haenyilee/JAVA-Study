// 책 287page

package com.sist.method;

import java.lang.reflect.Method;

class A
{
	public void display1(String name) 
	{
		System.out.println("Hello~~\n"+name);
	}
	
	public void display2(String name) 
	{
		System.out.println("Hello~~\n"+name);
	}
	
}

public class 메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A a=new A();
		// a.display("홍길동");
		
		try 
		{
			Class clsName=Class.forName("com.sist.method.A");
			Object obj=clsName.newInstance();
			// System.out.println(obj);
			
			// obj.display; ==> 실행 불가
			
			// 방법1 : 형변환
			/*
			A a=(A)obj;
			a.display("심청이");
			*/
			
			// 방법 2
			Method[] method=clsName.getDeclaredMethods();
			// method[0].invoke(obj,"이순신");
			
			// display1,2 순서 확인
			for(Method m:method)
			{
				System.out.println(m.getName());
			}
			
		}catch(Exception ex) {}

	}

}
