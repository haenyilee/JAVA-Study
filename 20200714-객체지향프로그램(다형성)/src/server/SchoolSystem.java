package server;

import client.Student;

/*
 	���� ( ��� , ���� ) ==> private ==> setter / getter
 	�޼ҵ� ==> public
 	������ ==> public
 	================================================ ĸ��ȭ �ڵ�
 */

public class SchoolSystem {
	public void display() {
		Student s=new Student();
		s.name="�ڹ���";
		s.setHakbun(2);
		s.setSubject("����");
		s.setTel("010-2121-2121");
		
		System.out.println("�̸�: "+s.name);
		System.out.println("�й�: "+s.getHakbun());
		System.out.println("����: "+s.getSubject());
		System.out.println("�й�: "+s.getTel());
	}
	
	public static void main(String[] args) {
		SchoolSystem ss=new SchoolSystem();
		ss.display();
	}
	

}
