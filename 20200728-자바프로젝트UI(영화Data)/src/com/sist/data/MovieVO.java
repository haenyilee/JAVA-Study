package com.sist.data;

// 영화목록 출력 , 상세보기 , 추천까지만 쌤이 제공

//배열을 갯수가 지정되어있어서 만약 중간에 하나 정보가 없으면 여러개 못 읽어옴
// 반면 arraylist는 가지고 있는 데이터만큼만 가져올 수 있어서 null값이 있어도 상관없음

public class MovieVO {
	private int mno; // 영화번호
	private int cno; // 카테고리 번호
	private String title;
	private String poster;
	private String director;
	private String actor;
	private String genre;
	private String grade;
	private String regdate;
	private String score;
	private int showUser;
	private String story;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public int getShowUser() {
		return showUser;
	}
	public void setShowUser(int showUser) {
		this.showUser = showUser;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	
	

}
