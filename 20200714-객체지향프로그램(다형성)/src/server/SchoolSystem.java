package server;

import client.Student;

/*
 	변수 ( 멤버 , 공유 ) ==> private ==> setter / getter
 	메소드 ==> public
 	생성자 ==> public
 	================================================ 캡슐화 코딩
 */

public class SchoolSystem {
	public void display() {
		Student s=new Student();
		s.name="박문수";
		s.setHakbun(2);
		s.setSubject("영업");
		s.setTel("010-2121-2121");
		
		System.out.println("이름: "+s.name);
		System.out.println("학번: "+s.getHakbun());
		System.out.println("과목: "+s.getSubject());
		System.out.println("학번: "+s.getTel());
	}
	
	public static void main(String[] args) {
		SchoolSystem ss=new SchoolSystem();
		ss.display();
	}
	

}
