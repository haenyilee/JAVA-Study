package com.sist.client;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.Document;

import java.awt.Image;
import java.net.*; // 이미지 주소가 웹에 접속해야 해서 url사용

import com.sist.data.DramaVO;

public class DramaCard extends JPanel{
	JLabel poster = new JLabel();
	JLabel title = new JLabel();
	JTextPane tp = new JTextPane(); // 두 줄 이상이면 textpane
	JLabel author = new JLabel();
	
	public DramaCard()
	{
		
	}
}
