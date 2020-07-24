package com.sist.oop;
/*
 	자바
 		1번째줄 => package명(한 번만 사용 가능)
 		2번째줄 => import(여러번 사용 가능)
 		3번째줄 => public class className{
 			필요한 변수 설정		=> 멤버변수
 			변수에 대한 초기화 	=> 생성자
 			기능				=> 메소드
 		}
 		
 		==> 다른 클래스에서 사용 시에는 
 			import com.sist.oop.*
 			패키지
 				com.회사명.기능명 : 회사 => com.sist.client , com.sist.server
 				org.조직명.기능명 : 그룹 => org.springframwork.web.servlet.view.*
 				
 	캡슐화
 		= 변수는 private
 		= 메소드 public ==> 변수 제어 (getter/setter)
 	
 	상속
 		= extends : 기존의 클래스 기능을 가지고 와서 사용(수정 가능)
 			= 단일 상속만 가능함
 			
 	다형성
 		= 수정 , 추가할 수 있다는 특징
 		= 문법 사항이 아니라 권장사항임
 		
 	오버로딩
 		= 생성자에서 주로 사용
 		= 같은 메소드명으로 여러개의 기능을 만든다
 		  ==========
 		  1. 매개변수가 다르다(갯수나 데이터형이 달라야 함)
 		  2. 리턴형은 관계없다. 
 		  3. 같은 클래스 안에서만 만든다.
 		  
 		  
 		  ??: 자동 형변환될텐데 왜케 많이 만들어?
 		  
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
	// 인스턴스 메소드 : new를 사용할 때마다 따라 저장되는 메소드
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
	
	
	public double plus(double d, char c) // public void plus(double d, char c)는 return값 있으니까 void 사용불가
	{
		return d+c;
	}
	
}
/*
 	변수
 		멤버변수
 		static 공유변수
 		
 	메소드
 		멤버메소드
 		static메소드
 		
 		
 		class A
 		{
 			int a;
 			static int b;
 			
 			public void disp1()
 			{
 				==> a , b 변수 사용 가능
 				==> disp2() 호출이 가능
 			}
 			
 			public static void disp2()
 			{
 				==> b 변수만 사용이 가능
 				==> disp1() 호출 , a를 사용할 수 없다
 					====================
 					==> 사용 시에는 반드시 new를 이용해서 사용
 			}
 		}
 */
public class 오버로딩_중복메소드정의 {
	int a=10;
	static int b=20;
	
	
	public void 오버로딩_중복메소드정의(){
		System.out.println("this="+this);
	}
	
	
	public void disp1()
	{
		System.out.println(a); // this. 생략가능
		System.out.println(this.b);		
		System.out.println("this="+this);
	}
	
	
	public static void disp2() // => static메서드는 인스턴스 변수 사용 불가
	{
		// System.out.println(a); ==> 인스턴스 변수 직접 사용 불가
		오버로딩_중복메소드정의 aa= new 오버로딩_중복메소드정의();
		System.out.println(aa.a);
		
		//System.out.println(this.b); ==> static에는 this가 존재하지 않음		
		System.out.println(b);		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메소드 전체가 저장
		Calc cc=new Calc();
		cc.plus("Hello","Java");
		cc.plus(100,200);
		System.out.println(cc.plus(5.6,'a'));
		
		System.out.println(b);
		
		// System.out.println(a); ==> a는 static변수가 아니라 new를 이용해서 사용
		오버로딩_중복메소드정의 aa= new 오버로딩_중복메소드정의();
		System.out.println("aa="+aa);
		System.out.println(aa.a);
		System.out.println();
				
		

	}

}



