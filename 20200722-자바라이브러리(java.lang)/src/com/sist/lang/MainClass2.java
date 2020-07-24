package com.sist.lang;

class Change
{
	int x,y;
}
// change => x=0; , y=0; ==> 멤버변수는 자동 초기화(지역변수는 초기화 안됨)

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
		System.out.println("변경전 x="+x);
		System.out.println("변경전 y="+y);
		
		m.swap(x,y);
		System.out.println("변경후 x="+x);
		System.out.println("변경후 y="+y);
		
		Change ccc= new Change();
		ccc.x=10;
		ccc.y=20;
		System.out.println("변경전 x="+ccc.x);
		System.out.println("변경전 y="+ccc.y);
		
		m.swap2(ccc);
		System.out.println("변경후 x="+ccc.x);
		System.out.println("변경후 y="+ccc.y);
		

	}

}
