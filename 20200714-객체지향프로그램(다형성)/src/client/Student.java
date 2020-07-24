package client;

public class Student {
	
	// student클래스 내에선 아래 4개 변수 모두 사용 가능
	private int hakbun;
	public String name;
	String subject;
	protected String tel;
	
	
	// 생성자를 default로 잡으면 다른 패키지에서 사용 불가
	/*
	Student() {
		hakbun=1;
		name="홍길동";
		subject="물리";
		tel="010-1111-1111";
	*/
		
	// 다른 패키지에서 사용하기 위해서 생성자는 되도록 public을 써야 함
	public Student() {
		hakbun=1;
		name="홍길동";
		subject="물리";
		tel="010-1111-1111";		
	}


	
	// public 이외 변수에 대한 getter/setter
	public int getHakbun() {
		return hakbun;
	}


	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}

}
