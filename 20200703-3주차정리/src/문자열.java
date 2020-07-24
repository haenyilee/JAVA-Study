/*
	문자열 => 저장하는 공간(String)
	기본형 => 정수, 실수, 논리, 문자
	참조형 => 실제 저장 장소가 다른 곳에 있고 => 저장은 주소
	=====
		= 배열 , 클래스
			1) 저장방법
				String s="문자저장"; ==> 많이 사용된다.
				String s=new String("")
				
			2) 주요기능
				문자를 제어할 수 있는 기능(메소드) ==> 라이브러리 핵심(메소드)
				*** 주의점 ****
				원본은 변경되지 않는다!
				
				=> length() : 문자 갯수
				=> substring() : 문자를 자를 때
				
				예)
					String s="Hello Java";
					s.substring(0,5) => Hello
					s = ? = "Hello Java"
					
					s=s.substring(0,5);
					s="Hello"
					
				
				
			
			
 */

import javax.swing.*;
import java.awt.event.*;

public class 문자열 extends JFrame implements ActionListener{
	JTextField tf=new JTextField();
	JTextField tf1=new JTextField();
	public 문자열()
	{
		add("North",tf);
		add("South",tf1);
		
		tf.setText(String.valueOf(20));
		setSize(350,300);
		setVisible(true);
		
		tf.addActionListener(this); // tf에서 엔터를 치면 엑션 퍼폼드 자동으로 호출
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 문자열();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf) // tf에서 입력 ==> 엔터
		{
			tf1.setText(tf.getText().toUpperCase()); 
			// tf1.setText(tf.getText().toLowerCase());
		}
	}

}
