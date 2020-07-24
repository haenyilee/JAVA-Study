package com.sist.data;
/*
주소	서울특별시 마포구 잔다리로3안길 44
지번 서울시 마포구 서교동 395-124
전화번호	02-3144-1312
음식 종류	스테이크 / 바베큐
가격대	2만원-3만원
주차	주차공간없음
영업시간	월-토: 17:00 - 23:00
일: 17:00 - 22:00
 */

// 맛집 1개에 대한 정보
public class FoodHouseVO {
	// 첫 화면 카드 숫자
	private int no;
	
	// 맛집 목록 숫자
	private int cno;
	
	// 맛집 개별 정보
	private String poster; // split
	private String title;
	private double score;
	private String address;
	private String tel;
	private String type;
	private String price;
	private String parking;
	private String time;
	private int good;
	private int soso;
	private int bad;
	private String review;
	
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public int getSoso() {
		return soso;
	}
	public void setSoso(int soso) {
		this.soso = soso;
	}
	public int getBad() {
		return bad;
	}
	public void setBad(int bad) {
		this.bad = bad;
	}
	
	

}
