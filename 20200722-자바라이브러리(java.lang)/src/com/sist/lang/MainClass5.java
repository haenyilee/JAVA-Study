package com.sist.lang;
// finalize()


class C
{
	public void display()
	{
		System.out.println("C:display() Call...");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("메모리 해제");
	}
	
}
public class MainClass5 {

	public static void main(String[] args) {
		// 메모리 저정
		C c =new C();
		c.display();
		// 소멸하라고 명령 내리기 , 가비지컬렉션(gc)
		c=null;
		System.gc();

	}

}
