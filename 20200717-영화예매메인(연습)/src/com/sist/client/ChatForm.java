/*
 * <우하향 고정: 채팅창(패널?)>
 * 1. 패키지 임포트
 * 2. 패키지 상속
 * 3. 생성자 > 색깔 지정(레이아웃 크기 임시 확인용)
 * 크기 : 1465,200
 * 4. 버튼 등 기능 추가 & 배치
 * 
 */

package com.sist.client;

import java.awt.Color;
import javax.swing.*;
import javax.swing.table.*;

public class ChatForm extends JPanel{
	
	JTextArea ta;
	JTextField tf;
	JComboBox box;
	JTable table;
	DefaultTableModel model;
	JButton b1,b2;
	
	
	
	public ChatForm() {
		// setBackground(Color.yellow);
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		setLayout(null);
		js.setBounds(10,15,850,140);
		add(js);
		tf=new JTextField();
		tf.setBounds(10,160,740,30);
		add(tf);
		
		box=new JComboBox();
		box.addItem("black");
		box.addItem("red");
		box.addItem("green");
		box.addItem("grey");
		box.addItem("yellow");
		box.addItem("cyan");
		
		box.setBounds(755,160,105,30);
		add(box);
		
		String[] col= {"ID","대화명","성별"};
		String[][] row=new String[0][3];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js1=new JScrollPane(table);
		js1.setBounds(865,15,500,135);
		add(js1);
		
		JPanel p=new JPanel();
		b1=new JButton("정보보기");
		b2=new JButton("쪽지보내기");
		p.add(b1);
		p.add(b2);
		p.setBounds(865,155,500,35);
		add(p);
		
		
		
	}

}
