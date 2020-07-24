package com.sist.lang;




class A implements Cloneable
{
	int aa=10;
	public A clone()
	{
		A a= new A();
		try {
			a=(A) super.clone();
			// (A)�� ����ȯ�� ����
		} catch (Exception e) {}
		return a;
	}
}


public class MainClass {

	public static void main(String[] args) {
		A a = new A();
		A b = new A();
		
		// ����
		A c = new A();
		A d = c;
		System.out.println(c.aa);
		System.out.println(d.aa);
		System.out.println(c);
		System.out.println(d);
		d.aa=1000;
		System.out.println(c.aa);
		System.out.println(d.aa);
		System.out.println(c);
		System.out.println(d);
		
		// ����
		A e=c.clone();
		System.out.println(c.aa);
		System.out.println(e.aa);
		System.out.println(c);
		System.out.println(e);
		
		

	}

}
