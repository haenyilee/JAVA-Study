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
		System.out.println("�޸� ����");
	}
	
}
public class MainClass5 {

	public static void main(String[] args) {
		// �޸� ����
		C c =new C();
		c.display();
		// �Ҹ��϶�� ��� ������ , �������÷���(gc)
		c=null;
		System.gc();

	}

}
