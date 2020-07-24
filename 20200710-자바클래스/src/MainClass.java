/*
	클래스
	=====
		= [변수 설정] => 여러개를 저장할 때 반드시 공통으로 들어가는 데이터를 설정
								  ===========================
								  		추상화 작업
			 예)
			 	영화정보
			 	======
			 	영화명, 감독, 출연, 장르, 개봉, 줄거리, 음악
		
		
		= [변수의 종류]
		
		  ==========================================================================================
		  	= <멤버변수> 	=> new를 사용할 때마다 따로 저장되는 변수
		  		(인스턴스 변수)
		  		**** 메모리가 만들어지는 시점이 => new를 이용했을 때!
		  		**** heap : 프로그래머가 관리하는 영역(자동처리가 안된다)
		  					메모리를 사용하지 않을 경우에 직접 처리 , GC(가비지컬렉션)
		  																							==> 사라지는 시점 : 프로그램 종료될 때
		  	= <공유변수> 	=> 메모리가 한 개 => 공통으로 사용되는 변수
		  		(정적변수) => static
		  		**** 메모리가 만들어지는 시점이 => 컴파일할 때 자동으로 생성됨! 그대로 가져다 쓸 수 있음
		  		**** 메소드 영역(static , 메소드)
		  		**** 편하긴 하지만 메모리 공간을 하나밖에 못 쓰기 때문에 개별적으로 다른 정보 저장이 어려워서 많이 안씀		  		
		  ==========================================================================================
		  
		  	= <지역변수>	=> 한 번 쓰고 버려야 하는 변수
		  		(지역변수 , 매개변수)
		  		**** 메모리가 만들어지는 시점 => 메소드 호출할 때!
		  		**** 메모리가 자체 관리 영역 {}을 벗어나면 자동 회수 ==> stack(LIFO , last in first out)
		  		int a;
		  		int b;
		  		int c; ==> 마지막부터 제거되기 시작
		 			
		 			 
		= [생성자]
			=> 멤버변수에 초기값 부여할 때 사용
			=> 제어문을 이용하거나 , 파일을 읽을 때 사용
			=> 구현하고 , 데이터값을 가지고 올 때 사용 
			=> 보안(감췄다 보여줄 때)에서 사용
				=> 생성자는 필요없다면 생략할 수도 있다!
				=> 하지만 생성자는 반드시 필요하다 => 생략 시, 자동으로 컴파일러가 추가를 해줌
				=> 메모리에 저장(클래스)할 때 호출되는 메소드이기 때문에 반드시 필요한 것임
				   ----------
				   new 생성자() => 한 번만 호출 / 또 호출하면 메모리가 달라짐 => this(현재 저장되어 있는 데이터를 가지고 올 때/자기자신)
		
				
		= [메소드] : 기능 수행
			= 선언부 , 구현부
			= 리턴형 메소드명 (매개변수...) => 선언부
			  {
				구현부
			  }
			  ====> 선언부 + 구현부 = 저장됨
			= 인스턴스 메소드 : 클래스마다 따로 사용하는 메소드
			= 정적 메소드 => static => 모든 클래스가 공통으로 사용되는 메소드
			= 추상 메소드 : 선언부만 존재하는 것(아직 구현이 되지 않은 것 ==> 프로그래머가 구현 후 사용!) ex. implements ActionListener같은 event들
			
			
			class A
			{
				int a; => 멤버변수...heap에 저장
				A(int a) => 지역변수...stack에 저장
				{
					a => 지역변수(stack)
					this.a => 멤버변수...(heap)
				}
			}
		
		
 */

class Student{
	// 학생 1명에 대한 정보 ==> 학생 여러명이면? ==> 메모리 공간 여러개 만들 수 있다(new)
	String name;
	String subject;
	int year;
	static String school;
	
	
	// 생성자 생략 시 컴파일러가 아래 생성자를 자동 추가 => default 생성자 (책 : 292p)
	Student(){}
	
}

public class MainClass {

	public static void main(String[] args) {
		// static 공유변수 사용하려면
		Student.school="SIST";
		
		// 멤버변수 사용하려면...
		Student s=new Student(); // name, year, subject가 s라는 주소에 저장됨
		
		System.out.println(s);
		System.out.println(s.name); 	// null
		System.out.println(s.subject); 	// null
		System.out.println(s.year); 	// 0
		System.out.println(Student.school);
		
		System.out.println();
		
		s.name="홍길동";
		s.subject="자바";
		s.year=3;
		// 메소드도 동일
		System.out.println(s);
		System.out.println(s.name);		// 홍길동
		System.out.println(s.subject);	// 자바
		System.out.println(s.year);		// 3
		System.out.println(Student.school);
		
		System.out.println();

		Student s1=new Student();
		System.out.println(s1);
		s1.name="고길동";
		s1.subject="중어중문";
		s1.year=2;
		System.out.println(s1.name);	// 고길동
		System.out.println(s1.subject);	// 중어중문
		System.out.println(s1.year);	// 2
		System.out.println(Student.school);
		
		System.out.println();
		
		String ss="Hello Java";
		ss.replace('H','k');
		System.out.println(ss);
		ss=ss.replace('H','k');
		System.out.println(ss);		
		
		String.valueOf(10);	// 10을 String으로 형변환 해주는 함수 => 특정 대상이 없기 때문에 static임
		

	}

}
