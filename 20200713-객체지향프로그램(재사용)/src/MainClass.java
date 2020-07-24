/*
 	���� => ������ ������� Ŭ������ ��� (�ҽ��� �ݺ��ڵ��� ����)
 		1) ��� (is-a)
 			= �̹� ������� ����� �����ؼ� ����� ��
 			public class MyWindow extends JFrame
 			
 		2) ���� (has-a)
 			= �̹� ������� ����� ������� �״�� ����� ��
 			public class MyWindow 
 			{
 				JFrame f=new JFrame();
 			}
 */

/*
	AŬ������ ������ �ִ� ��� ���� ��ӵ� => ����(private, static, ������)
	
 	public class A
 	{
 		private int tel;
 		String name;
 		int age;
 		public void display();
 	}
 	
 	public class B extends A
 	{
 		String name; 			��
 		int age;				��==> extends A�� ���ؼ� ������ ������ ���Ե� ���!(private���� ��ӵ�)
 		public void display();	��
 	}
 	
 	<��ȣȭ> : ȭ��ǥ �޴� ���� ����� ������ ��!
 	A
 	��
 	B
 */

/*
 	�������̵� => ��ӹ޾Ƽ� ������ ����ϴ� ��
 	**** �ڹ� ����� '���� ���'
 	
 */


import javax.swing.*;

public class MainClass extends JFrame{
	
	public MainClass() // �����ڴ� ������ public�޼ҵ�� �����
	{
		super.setSize(300,300);	// JFrame
		this.setVisible(true);	// MainClass ==> this�� ��������
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();

	}

}
