// 부분처리
package com.sist.exception;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			for(int i=1;i<=10;i++)
			{
				try {
					System.out.println("i="+i);
					int a=i/(int)(Math.random()*3); // 0으로 나누게 되면  error발생
					System.out.println("a="+a);
				}catch(Exception e) {System.out.println("for문 i++로 이동");} // 에러발생하면 다시 위에 for문으로 올라감

			}
		}catch (Exception e) {
			System.out.println("에러 발생");
		}
		System.out.println("프로그램 정상 종료!!");

	}

}
