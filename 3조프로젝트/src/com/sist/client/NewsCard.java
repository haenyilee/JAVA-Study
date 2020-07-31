package com.sist.client;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.Document;

import java.awt.Image;
import java.net.*; // 이미지 주소가 웹에 접속해야 해서 url사용

import com.sist.data.NewsVO;

public class NewsCard extends JPanel {
	JLabel poster = new JLabel();
	JLabel title = new JLabel();
	JTextPane tp = new JTextPane(); // 두 줄 이상이면 textpane
	JLabel author = new JLabel();
	
	public NewsCard() 
	{
		setLayout(null);
		poster.setBounds(10,5,300,200);
		add(poster);
		title.setBounds(315,5,900,35);
		add(title);
		JScrollPane js = new JScrollPane(tp);
		js.setBounds(315,45,900,120);
		add(js);
		author.setBounds(315,170,900,35);
		add(author);
	}
	// 값 채우기!
	public void newsPrint(NewsVO vo) {
		try {
			URL url = new URL(vo.getPoster());
			Image img = ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(), poster.getHeight());
			poster.setIcon(new ImageIcon(img));
			title.setText(vo.getTitle());
			tp.setText(vo.getContent());
			author.setText(vo.getAuthor());
		} catch (Exception e) {
			
		}
	}
}
