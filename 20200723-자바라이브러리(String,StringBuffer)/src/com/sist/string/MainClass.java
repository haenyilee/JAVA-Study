package com.sist.string;

public class MainClass {

	public static void main(String[] args) {
		
		String str="0123456789";
		String str2 = str.substring(3,5);
		System.out.println(str2);
		
		String s = "background-image: url(' https://mp-seoul-image-production-s3.mangoplate.com/0776fea76b4a824ff583128cb51dd45c.jpg');";
		String temp= s.substring(s.indexOf("'")+1,s.lastIndexOf("'"));
		System.out.println(temp.trim());
		
		// 20글자 넘어가면 ...으로 표기되게 만드는 법
		String ss="와이프님 지인의 강력한 추천으로 방문한곳 망플에는 리뷰가 적지만 블로그에는 꽤나 핫한곳 해장국과 국밥을 먹었는데 확실히 맛있음 국밥의 경우 퓨어";
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
			System.out.println("같다");
		}
		else
		{
			System.out.println("같지않다");
		}
		

	}

}
