package com.sist.method;
class AA
{
	public void AA() // 일반 인스턴스 메소드 ==> 생성자가 될 수 없음 , void는 리턴형의 일종임(결과값이 존재하지 않음을 뜻함)
	{
		System.out.println("AA() Call...");
	}
	
	public AA() // 생성자 ==> 데이터형이나 리턴형이 존재하면 안됨(void사용불가) : 생성자는 특수메소드
	{
		System.out.println("AA() Call...");
	}
}

public class 생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 생성자 호출 ==> 리턴형이 없음
		AA a=new AA();
		
		// 일반 메소드 AA호출(리턴형 불러오기)
		a.AA();

	}

}
