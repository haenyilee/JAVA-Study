/*
 	재사용 => 기존에 만들어진 클래스를 사용 (소스의 반복코딩을 제거)
 		1) 상속 (is-a)
 			= 이미 만들어진 기능을 변경해서 사용할 때
 			public class MyWindow extends JFrame
 			
 		2) 포함 (has-a)
 			= 이미 만들어진 기능을 변경없이 그대로 사용할 때
 			public class MyWindow 
 			{
 				JFrame f=new JFrame();
 			}
 */

/*
	A클래스가 가지고 있는 모든 것이 상속됨 => 예외(private, static, 생성자)
	
 	public class A
 	{
 		private int tel;
 		String name;
 		int age;
 		public void display();
 	}
 	
 	public class B extends A
 	{
 		String name; 			┐
 		int age;				│==> extends A로 인해서 보이진 않지만 갖게된 기능!(private빼고 상속됨)
 		public void display();	┘
 	}
 	
 	<기호화> : 화살표 받는 쪽이 상속을 내리는 쪽!
 	A
 	↑
 	B
 */

/*
 	오버라이딩 => 상속받아서 변경해 사용하는 것
 	**** 자바 상속은 '단일 상속'
 	
 */


import javax.swing.*;

public class MainClass extends JFrame{
	
	public MainClass() // 생성자는 가급적 public메소드로 만든다
	{
		super.setSize(300,300);	// JFrame
		this.setVisible(true);	// MainClass ==> this는 생략가능
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();

	}

}
