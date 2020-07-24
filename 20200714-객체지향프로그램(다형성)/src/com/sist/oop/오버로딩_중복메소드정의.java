package com.sist.oop;
/*
 	�ڹ�
 		1��°�� => package��(�� ���� ��� ����)
 		2��°�� => import(������ ��� ����)
 		3��°�� => public class className{
 			�ʿ��� ���� ����		=> �������
 			������ ���� �ʱ�ȭ 	=> ������
 			���				=> �޼ҵ�
 		}
 		
 		==> �ٸ� Ŭ�������� ��� �ÿ��� 
 			import com.sist.oop.*
 			��Ű��
 				com.ȸ���.��ɸ� : ȸ�� => com.sist.client , com.sist.server
 				org.������.��ɸ� : �׷� => org.springframwork.web.servlet.view.*
 				
 	ĸ��ȭ
 		= ������ private
 		= �޼ҵ� public ==> ���� ���� (getter/setter)
 	
 	���
 		= extends : ������ Ŭ���� ����� ������ �ͼ� ���(���� ����)
 			= ���� ��Ӹ� ������
 			
 	������
 		= ���� , �߰��� �� �ִٴ� Ư¡
 		= ���� ������ �ƴ϶� ���������
 		
 	�����ε�
 		= �����ڿ��� �ַ� ���
 		= ���� �޼ҵ������ �������� ����� �����
 		  ==========
 		  1. �Ű������� �ٸ���(������ ���������� �޶�� ��)
 		  2. �������� �������. 
 		  3. ���� Ŭ���� �ȿ����� �����.
 		  
 		  
 		  ??: �ڵ� ����ȯ���ٵ� ���� ���� �����?
 		  
 		  plus() :
 		  int + int 		====> plus(int a, int b)
 		  double + double	====> plus(double d1, double d2)
 		  int + double		====> plus(int a, double d)
 		  String + String	====> plus(String s1, String s2)
 		  float + double
 		  long + int
 		  itn + char
 		  char + double
 		  String + char
 		  
 		  
 		  
 		
 */
class Calc{
	// �ν��Ͻ� �޼ҵ� : new�� ����� ������ ���� ����Ǵ� �޼ҵ�
	public void plus(int a, int b)
	{
		System.out.printf("%d+%d=%d\n",a,b,a+b);		
	}
	
	
	public void plus(double a, double b)
	{
		System.out.printf("%f+%f=%f\n",a,b,a+b);
	}
	
	
	public void plus(String a, String b)
	{
		System.out.printf("%s+%s=%s\n",a,b,a+b);
	}
	
	
	public double plus(double d, char c) // public void plus(double d, char c)�� return�� �����ϱ� void ���Ұ�
	{
		return d+c;
	}
	
}
/*
 	����
 		�������
 		static ��������
 		
 	�޼ҵ�
 		����޼ҵ�
 		static�޼ҵ�
 		
 		
 		class A
 		{
 			int a;
 			static int b;
 			
 			public void disp1()
 			{
 				==> a , b ���� ��� ����
 				==> disp2() ȣ���� ����
 			}
 			
 			public static void disp2()
 			{
 				==> b ������ ����� ����
 				==> disp1() ȣ�� , a�� ����� �� ����
 					====================
 					==> ��� �ÿ��� �ݵ�� new�� �̿��ؼ� ���
 			}
 		}
 */
public class �����ε�_�ߺ��޼ҵ����� {
	int a=10;
	static int b=20;
	
	
	public void �����ε�_�ߺ��޼ҵ�����(){
		System.out.println("this="+this);
	}
	
	
	public void disp1()
	{
		System.out.println(a); // this. ��������
		System.out.println(this.b);		
		System.out.println("this="+this);
	}
	
	
	public static void disp2() // => static�޼���� �ν��Ͻ� ���� ��� �Ұ�
	{
		// System.out.println(a); ==> �ν��Ͻ� ���� ���� ��� �Ұ�
		�����ε�_�ߺ��޼ҵ����� aa= new �����ε�_�ߺ��޼ҵ�����();
		System.out.println(aa.a);
		
		//System.out.println(this.b); ==> static���� this�� �������� ����		
		System.out.println(b);		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �޼ҵ� ��ü�� ����
		Calc cc=new Calc();
		cc.plus("Hello","Java");
		cc.plus(100,200);
		System.out.println(cc.plus(5.6,'a'));
		
		System.out.println(b);
		
		// System.out.println(a); ==> a�� static������ �ƴ϶� new�� �̿��ؼ� ���
		�����ε�_�ߺ��޼ҵ����� aa= new �����ε�_�ߺ��޼ҵ�����();
		System.out.println("aa="+aa);
		System.out.println(aa.a);
		System.out.println();
				
		

	}

}



