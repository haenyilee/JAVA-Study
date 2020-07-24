package com.sist.abs;
/*
 	�Խ���
 		=> �亯�� => �亯�ϱ�
 		=> ����� => ��۴ޱ�
 		=> ������ => ���ε�
 		=> �ڷ�� => ���ε� , �ٿ�ε�
 		
 	<�������̽� or �߻�Ŭ������ ����� ���� ���� ��ɵ�>
	 - ���̰� �ִ� ��ɵ� : ����
	 	�۾���
	 	���뺸��
	 	
 	- ������ ��� : ����+�������� ==> �ʿ��ϴٸ� ������
	 	����
	 	����
	 	ã��
	 	
 	
 */

/*
 1. �Խ��� �߻�Ŭ���� �����
 1-1. ���� �Խ��� Ŭ���� �����
 2. ���� Ŭ���� �ȿ� �۾���/ ���뺸�� �߻�Ŭ���� ����
 3. ���� Ŭ���� �ȿ� ����/ã��/���� �޼ҵ� ����
 4. �亯�ޱ� Ŭ������ �Խ��� ��ӹޱ�
 5. �Խ��� �޼ҵ�(�۾���, ���뺸��) �����ϱ�
 5-1. �۾��⿡�� �亯�� �Խ��� �۾��� ������� �ٲٱ�
 5-2. �Խ����� ������ �ִ� ����� ������
 6. �ڷ�� Ŭ�������� �Խ��� Ŭ���� ���
 6-1. ��ӹ��� ��� ����(�������̵�)
 7. ������ Ŭ�������� �Խ��� Ŭ���� ���
 7-1. ��ӹ��� ��� ����(�������̵�)
 8. ������ Ŭ�������� �Խ��� Ŭ���� ���
 8-1. ��ӹ��� ��� ����(�������̵�)
 9. ���� Ŭ�������� Board b�� �亯�� �Խ��� ����??
 9-1. b.write(); / b.content(); ����??
 10. b=new Gallery(); �޸� �Ҵ�?? 
 10-1. b.write(); / b.content(); ����??
 
 */

abstract class Board{
	public abstract void write();
	public abstract void content();
	public void update(){
		System.out.println("�Խù� ����");
	}
	public void delete(){
		System.out.println("�Խù� ����");
	}
	public void find(){
		System.out.println("�Խù� ã��");
	}
}

class ReplyBoard extends Board{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("�亯�� �Խ��� �۾���");
		
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("���뺸��");
		
	}
	
}

class DataBoard extends Board{

	@Override
	public void write() {
		System.out.println("�۾���+���ε�");
		
	}

	@Override
	public void content() {
		System.out.println("���뺸��+�ٿ�ε�");
		
	}
	
}

class GalleryBoard extends Board{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("�۾���+�̹��� ���ε�");
		
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("���뺸��+�̹������ => �ı�Խ���");
		
	}
	
}

class ReplyBoard2 extends Board{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("�۾���");
		
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("���뺸�� + ���");
		
	}
	
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b= new ReplyBoard();
		System.out.println("=====�亯�� �Խ���=====");
		b.write();
		b.content();
		
		b=new GalleryBoard();
		System.out.println("=====������ �Խ���=====");
		b.write();
		b.content();
		
		b=new DataBoard();
		System.out.println("=====�ڷ�� �Խ���=====");
		b.write();
		b.content();
		
		b=new ReplyBoard2();
		System.out.println("=====����� �Խ���=====");
		b.write();
		b.content();

	}

}
