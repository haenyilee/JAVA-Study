package com.sist.abs;
/*
 	게시판
 		=> 답변형 => 답변하기
 		=> 댓글형 => 댓글달기
 		=> 갤러리 => 업로드
 		=> 자료실 => 업로드 , 다운로드
 		
 	<인터페이스 or 추상클래스로 만드는 것이 좋은 기능들>
	 - 차이가 있는 기능들 : 선언만
	 	글쓰기
	 	내용보기
	 	
 	- 공통의 기능 : 선언+구현까지 ==> 필요하다면 재정의
	 	수정
	 	삭제
	 	찾기
	 	
 	
 */

/*
 1. 게시판 추상클래스 만들기
 1-1. 개별 게시판 클래스 만들기
 2. 보드 클래스 안에 글쓰기/ 내용보기 추상클래스 선언
 3. 보드 클래스 안에 수정/찾기/삭제 메소드 구현
 4. 답변달기 클래스가 게시판 상속받기
 5. 게시판 메소드(글쓰기, 내용보기) 구현하기
 5-1. 글쓰기에서 답변형 게시판 글쓰기 기능으로 바꾸기
 5-2. 게시판이 가지고 있는 기능을 재정의
 6. 자료실 클래스에서 게시판 클래스 상속
 6-1. 상속받은 기능 수정(오버라이딩)
 7. 갤러리 클래스에서 게시판 클래스 상속
 7-1. 상속받은 기능 수정(오버라이딩)
 8. 갤러리 클래스에서 게시판 클래스 상속
 8-1. 상속받은 기능 수정(오버라이딩)
 9. 메인 클래스에서 Board b에 답변형 게시판 선언??
 9-1. b.write(); / b.content(); 구현??
 10. b=new Gallery(); 메모리 할당?? 
 10-1. b.write(); / b.content(); 구현??
 
 */

abstract class Board{
	public abstract void write();
	public abstract void content();
	public void update(){
		System.out.println("게시물 수정");
	}
	public void delete(){
		System.out.println("게시물 삭제");
	}
	public void find(){
		System.out.println("게시물 찾기");
	}
}

class ReplyBoard extends Board{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("답변형 게시판 글쓰기");
		
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("내용보기");
		
	}
	
}

class DataBoard extends Board{

	@Override
	public void write() {
		System.out.println("글쓰기+업로드");
		
	}

	@Override
	public void content() {
		System.out.println("내용보기+다운로드");
		
	}
	
}

class GalleryBoard extends Board{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("글쓰기+이미지 업로드");
		
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("내용보기+이미지출력 => 후기게시판");
		
	}
	
}

class ReplyBoard2 extends Board{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("글쓰기");
		
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("내용보기 + 댓글");
		
	}
	
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b= new ReplyBoard();
		System.out.println("=====답변형 게시판=====");
		b.write();
		b.content();
		
		b=new GalleryBoard();
		System.out.println("=====갤러리 게시판=====");
		b.write();
		b.content();
		
		b=new DataBoard();
		System.out.println("=====자료실 게시판=====");
		b.write();
		b.content();
		
		b=new ReplyBoard2();
		System.out.println("=====댓글형 게시판=====");
		b.write();
		b.content();

	}

}
