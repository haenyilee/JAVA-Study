package com.sist.string;

public class MainClass {

	public static void main(String[] args) {
		
		String str="0123456789";
		String str2 = str.substring(3,5);
		System.out.println(str2);
		
		String s = "background-image: url(' https://mp-seoul-image-production-s3.mangoplate.com/0776fea76b4a824ff583128cb51dd45c.jpg');";
		String temp= s.substring(s.indexOf("'")+1,s.lastIndexOf("'"));
		System.out.println(temp.trim());
		
		// 20���� �Ѿ�� ...���� ǥ��ǰ� ����� ��
		String ss="�������� ������ ������ ��õ���� �湮�Ѱ� ���ÿ��� ���䰡 ������ ��α׿��� �ϳ� ���Ѱ� ���屹�� ������ �Ծ��µ� Ȯ���� ������ ������ ��� ǻ��";
		if(ss.length()>20) {
			String sss=ss.substring(0,20)+"...";
			System.out.println(sss);
		}
		String s1="Hello";
		String s2="Hello";
		String s3= new String("Hello");
		
		if(s1==s2)
		{
			System.out.println("s1==s2?"+(s1==s2));
		}
		else
		{
			System.out.println("s1==s2?"+(s1!=s2));
		}
		
		
		if(s1.equals(s3))
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("�����ʴ�");
		}
		

	}

}
