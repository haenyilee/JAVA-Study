/*
 * <좌측고정 : 메뉴패널>
 * 1. 필요한 패키지 가져오기
 * 2. 버튼 변수 선언?
 * 3. 버튼 초기화 => 생성자에서
 * 4. 버튼 출력 위치 지정 => 생성자에서
 */
package com.sist.client;
import java.awt.*;
import javax.swing.*;

public class MenuForm extends JPanel{
	JButton b1,b2,b3,b4,b5,b6;
	JTextField tf=new JTextField();
	
	
	
	public MenuForm() {
		
		// setBackground(Color.orange); // 레이아웃 확인용(임시)
		b1=new JButton("영화");
		b2=new JButton("예매");
		b3=new JButton("이벤트");
		
		JPanel p= new JPanel();
		p.setLayout(new GridLayout(1,3,5,5)); // (좌우간격,위아래간격)
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		setLayout(null);
		p.setBounds(10,15,600,35);
		add(p);
		
		tf.setBounds(1100,15,200,35);
		add(tf);
		
		b4=new JButton("검색");
		b4.setBounds(1305,15,100,35);
		add(b4);
		
		b5=new JButton("챗봇");
		b5.setBounds(1470,15,50,35);
		add(b5);
		
		
		b6=new JButton("하위카테고리");
		b6.setBounds(10,55,1520,60);
		b6.setBackground(Color.yellow);
		add(b6);
		
	}
	
	

}
