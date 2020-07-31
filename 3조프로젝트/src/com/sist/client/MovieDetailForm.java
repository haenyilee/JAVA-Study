package com.sist.client;
import java.awt.*;
import java.net.URL;

import javax.swing.*;

import com.sist.data.MovieManager;
import com.sist.data.MovieVO;

import java.util.*;

public class MovieDetailForm extends JPanel{
	JLabel poster=new JLabel();
	JLabel la1 = new JLabel("");
	JLabel[] la = new JLabel[7];
	JTextPane ta = new JTextPane();
	JButton b1,b2; // �����ϱ�, ������� ���ư���
	
	public MovieDetailForm() 
	{
		setLayout(null);
		poster.setBounds(10,15,350,400);
		add(poster);
		
		la1.setBounds(365,15,500,45);
		// la1.setOpaque(false);
		// la1.setBackground(Color.BLUE);
		la1.setFont(new Font("���ü", Font.BOLD, 35));
		add(la1);
		
		JPanel p =new JPanel();
		p.setLayout(new GridLayout(7,1,5,5));
		String[] str = {"����","�⿬","�帣","���","������","����","����������"};
		for(int i=0;i<7;i++)
		{			
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("���ü",Font.BOLD,25));
			p.add(la[i]);
		}
		p.setBounds(365,80,500,300);
		add(p);
		
		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		js.setBounds(10,415,600,150);
		add(js);
		
		b1=new JButton("�����ϱ�");
		b2=new JButton("�������");
		b1.setBackground(Color.red);
		JPanel p2= new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.setBounds(365,385,200,35);
		add(p2);
	}
	
	public void detailPrint(int mno)
	{
		MovieManager m = new MovieManager();
		MovieVO vo=m.movieDetailData(mno);
		la1.setText(vo.getTitle());
		
		// ������ url��������?
		try {
			URL url=new URL(vo.getPoster());
			Image img = ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(),poster.getHeight());
			poster.setIcon(new ImageIcon(img));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		la[0].setText("����:"+vo.getDirector());
		la[1].setText("�⿬:"+vo.getActor());
		la[2].setText("�帣:"+vo.getGenre());
		la[3].setText("���:"+vo.getGrade());
		la[4].setText("����:"+vo.getRegdate());
		la[5].setText("����:"+vo.getScore());
		la[6].setText("����:"+vo.getShowUser());
		ta.setText(vo.getStory());
	}
}
