package 자바프로젝트;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainPage extends JPanel implements ActionListener {
	//배경화면
	private Image back;
	
	//제목
	ImageIcon title = new ImageIcon("/자바프로젝트/이미지파일/title.jpg");
	JLabel imageTitle = new JLabel(title); 
	
	//버튼 객체
	MainButton btn = new MainButton();
	
	//컨트롤패널
	ControlPanel cp=new ControlPanel();
	
	//채팅
	ChatForm cf=new ChatForm();
	
	public MainPage()
	{
		//바탕화면
		back=Toolkit.getDefaultToolkit().getImage("/자바프로젝트/이미지파일/white.jpg");
		
		//사용자 정의 배치
		setLayout(null); 
		
		//제목
		imageTitle.setBounds(0, 50, 1600, 130);
		add(imageTitle);
		
		//버튼
		add(btn.login);
		add(btn.join);
		add(btn.tf_search); //검색 텍스트 박스
		add(btn.search);	//검색
		
		add(btn.list);
		add(btn.ticket);
		add(btn.event);
		add(btn.chat);
		
        //card
		cp.setBounds(30, 230, 1530, 730);
		add(cp);

		btn.list.addActionListener(this);
		btn.ticket.addActionListener(this);
		btn.event.addActionListener(this);
		btn.chat.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn.list)
		{
			cp.card.show(cp, "LF");
		}
		
		else if(e.getSource()==btn.ticket) 
		{
			cp.card.show(cp, "TF");
		}
		
		else if(e.getSource()==btn.event)
		{
			cp.card.show(cp, "EF");
		}
		
		else if(e.getSource()==btn.chat)
		{
			cf.setVisible(true);
		}
		
		
		
	}
	
	
	
	
	
	protected void paintComponent(Graphics g) {
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
	}
}
