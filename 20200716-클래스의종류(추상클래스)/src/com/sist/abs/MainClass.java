package com.sist.abs;
/*
  	�߻�Ŭ���� 
 */
abstract class ����{
	public abstract void draw();
	
	// �߻� Ŭ������ ��� �߰��ϴ� ���
	public void color() {
		System.out.println("���������� �׸��� �׸���");
	}
}

class �ﰢ�� extends ����
{
	// ��ӹ��� �߻�Ŭ������ ����
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�ﰢ���� �׸���");		
	}	
}

class �� extends ����
{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("���� �׸���");		
	
	}
	
	// ���������� �׸��� �׸��� �ʹٸ�? ==> ���� ����(������)
	@Override
	public void color() {
		System.out.println("���������� �׸��� �׸���");
	}	
}

class �簢�� extends ����
{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�簢���� �׸���");		
	}	
}


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���� g=new �ﰢ��();
		g.color();
		g.draw();
		
		g=new �簢��();
		g.color();
		g.draw();
		
		g=new ��();
		g.color();
		g.draw();
		
		// ���� : ���� a=new ����();

	}

}
