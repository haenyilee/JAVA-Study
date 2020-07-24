package com.sist.client;
import javax.swing.*;
import java.awt.*;


public class Login extends JPanel {
	
// 스킨
	
	// private로 쓴 이유는? 다른 곳에서 불러 쓸 필요 없어서...
	private Image back;
	private JLabel la1,la2;
	
	// Login
	// private로 안 쓴 이유는? 다른 곳에서 불러 써야해서...단순 버튼이라 개인정보 NO!... 굳이 은닉화할 필요가 없음
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	
	// MainForm
	public Login()
	{
		// 이미지 정보 읽기
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
		
		setLayout(null);
		
		la1=new JLabel("아이디", JLabel.RIGHT);
		la1.setBounds(745,775,80,30);
		tf=new JTextField();
		tf.setBounds(830,775,150,30);
		
		add(la1);add(tf);
		
		la2=new JLabel("비밀번호", JLabel.RIGHT);
		la2.setBounds(745,810,80,30);
		pf=new JPasswordField();
		pf.setBounds(830,810,150,30);
		
		add(la2);add(pf);
		
		b1=new JButton("로그인");
		b2=new JButton("회원가입");
		JPanel p=new JPanel(); // 버튼을 가운데 넣는 좌표 잡기가 힘들어서, 패널 만들고 그 안에 버튼 넣는 것임
		p.setBounds(745,850,320,35);
		p.add(b1);
		p.setOpaque(false); // 패널 뒷 배경색 투명으로 바꿈
		p.add(b2);
		add(p);
	}
	
	@Override
	public void paintComponent(Graphics g) // protected도 무관
	{
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
	}

}
