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
	JButton b1,b2,b3,b4,b5,b6,b7;
	
	public MenuForm() {
		
		// setBackground(Color.orange); // 레이아웃 확인용(임시)
		b1=new JButton("홈");
		b2=new JButton("레시피");
		b3=new JButton("랭킹");
		b4=new JButton("추천");
		b5=new JButton("쉐프");
		b6=new JButton("맛집");
		b7=new JButton("종료");
		
		setLayout(new GridLayout(7,1,5,5)); // (좌우간격,위아래간격)
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
	}
	
	

}
