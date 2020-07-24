package com.sist.client;

import java.awt.*;
import java.net.URL;

import javax.swing.*;

import com.sist.data.FoodHouseVO;


public class FoodListCard extends JPanel{
	// poster 라벨? or 패널? => 라벨! why? 패널쓰게되면 재정의 안되서 paint 쓸 수 없음
	// 라벨의 단점은? 그림 크기 조절이 어려움
	JLabel posterLa=new JLabel();
	JLabel la1,la2,la3;
	JTextPane ta;
	
	// 매개변수는 사용자가 넣어주는 값임 => 3개 이상이면 1.배열  or 2.클래스로 넣어주는게 더 편함~!
	public FoodListCard(FoodHouseVO vo) {
		// posterLa.setOpaque(true);
		// posterLa.setBackground(Color.black);
		
		// 패키지 com.sist.data --> 클래스 MainClass3 --> 
		try {
			URL url=new URL(vo.getPoster());
			Image img=ClientMainFrame.getImage(new ImageIcon(url), 200, 200);
			posterLa.setIcon(new ImageIcon(img));
		} catch (Exception e) {
		}
		
		
		la1=new JLabel(vo.getTitle());
		la2=new JLabel(String.valueOf(vo.getScore()));
		la2.setForeground(Color.orange);
		la3=new JLabel(vo.getAddress());
		ta=new JTextPane();
		ta.setText(vo.getReview());
		
		setLayout(null);
		posterLa.setBounds(10,15,200,200);
		la1.setBounds(215,15,350,30);
		la2.setBounds(570,15,60,30);
		la3.setBounds(215,50,415,30);
		ta.setBounds(215,85,415,230);
		
		add(posterLa);
		add(la1);add(la2);
		add(la3);add(ta);
	}
	
	
	

}
