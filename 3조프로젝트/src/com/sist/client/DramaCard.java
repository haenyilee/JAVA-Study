package com.sist.client;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.Document;

import java.awt.Image;
import java.net.*; // �̹��� �ּҰ� ���� �����ؾ� �ؼ� url���

import com.sist.data.DramaVO;

public class DramaCard extends JPanel{
	JLabel poster = new JLabel();
	JLabel title = new JLabel();
	JTextPane tp = new JTextPane(); // �� �� �̻��̸� textpane
	JLabel author = new JLabel();
	
	public DramaCard()
	{
		
	}
}
