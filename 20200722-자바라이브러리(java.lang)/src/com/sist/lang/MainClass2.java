package com.sist.lang;

class Change
{
	int x,y;
}
// change => x=0; , y=0; ==> ��������� �ڵ� �ʱ�ȭ(���������� �ʱ�ȭ �ȵ�)

public class MainClass2 {
	public void swap2(Change c)
	{
		int temp=c.x;
		c.x=c.y;
		c.y=temp;
	}
	public void swap(int x, int y)
	{
		int temp=x;
		x=y;
		y=temp;
	}

	public static void main(String[] args) {
		MainClass2 m = new MainClass2();
		int x=10;
		int y=20;
		System.out.println("������ x="+x);
		System.out.println("������ y="+y);
		
		m.swap(x,y);
		System.out.println("������ x="+x);
		System.out.println("������ y="+y);
		
		Change ccc= new Change();
		ccc.x=10;
		ccc.y=20;
		System.out.println("������ x="+ccc.x);
		System.out.println("������ y="+ccc.y);
		
		m.swap2(ccc);
		System.out.println("������ x="+ccc.x);
		System.out.println("������ y="+ccc.y);
		

	}

}
