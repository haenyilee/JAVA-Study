package com.sist.inter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainClass2 extends JFrame implements ActionListener,MouseListener,ItemListener{

	JButton b1;
	JTextField tf;
	JLabel la;
	JComboBox box;
	
	// 초기화 => 메모리에 저장하기 위해서 => 생성자 이용
	public MainClass2() {
		b1=new JButton("클릭");
		tf=new JTextField();
		la=new JLabel(new ImageIcon("c:\\javaDev\\air.png"));
		box=new JComboBox();
		box.addItem("홍길동");
		box.addItem("박문수");
		box.addItem("이순신");
		
		
		// jframe => borderlayout
		add("West",b1);
		add("Center",la);
		add("South",tf);
		add("North",box);
		// East, West도 사용 가능
		
		// 윈도우 화면크기 만들기
		setSize(450,500);
		setVisible(true);
		
		// 이벤트 등록 => (예) b1이라는 버튼을 누르면 actionPerformed()를 호출해라
		b1.addActionListener(this); // this는 자기자신 => MainClass2
		tf.addActionListener(this);
		la.addMouseListener(this);
		box.addItemListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass2();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la)
		{
			if(e.getClickCount()==2)
			{
				JOptionPane.showMessageDialog(this, "상세보기로 이동");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) // getSource란? b1을 클릭했을 때!
		{
			JOptionPane.showMessageDialog(this, "버튼클릭");
		}
		else if(e.getSource()==tf) // 엔터치면 글자 출력?
		{
			String msg=tf.getText();
			JOptionPane.showMessageDialog(this, msg);
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==(String)box.getSelectedItem());
		JOptionPane.showMessageDialog(this,box);
			
		
	}
	
	

}
