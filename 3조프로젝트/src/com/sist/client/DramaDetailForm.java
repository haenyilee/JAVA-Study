package com.sist.client;

import java.awt.*;

import javax.swing.*;
import java.net.*;

import com.sist.data.DramaManager2;
import com.sist.data.DramaVO;


public class DramaDetailForm extends JPanel{
	JLabel poster=new JLabel();
	JLabel la1 = new JLabel("",JLabel.CENTER);
	JLabel[] la = new JLabel[7];
	JTextPane ta = new JTextPane();
	JButton b1,b2; // 시청하기, 목록으로 돌아가기
	
	public DramaDetailForm() {
		setLayout(null);
		poster.setBounds(10,15,250,350);
		add(poster);
		
		la1.setBounds(265,15,500,45);
		// la1.setOpaque(false);
		// la1.setBackground(Color.BLUE);
		la1.setFont(new Font("고딕체", Font.BOLD, 30));
		add(la1);
		
		JPanel p =new JPanel();
		p.setLayout(new GridLayout(7,1,5,5));
		String[] str = {"토마토지수","관객지수","출연 및 감독","방송국","방영일","장르","프로듀서"};
		for(int i=0;i<7;i++)
		{
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("고딕체",Font.BOLD,15));
			p.add(la[i]);
		}
		
		p.setBounds(265,80,450,300);
		add(p);
		
		// 시놉시스 부분
		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		js.setBounds(10,390,730,150);
		add(js);
		
		/*
		b1=new JButton("예매하기");
		b2=new JButton("목록으로");
		b1.setBackground(Color.red);
		JPanel p2= new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.setBounds(365,385,200,35);
		add(p2);
		*/
	
	}
	
	
	// 드라마 디테일 프린트? 포스터 클릭하면 상세정보 나오는 그런건가
	public void dramaDetailPrint(int mno)
	{
		DramaManager2 d = new DramaManager2();
		DramaVO vo= d.dramaDetailData(mno);
		la1.setText(vo.getTitle());
		
		// 포스터 url가져오기?
				try {
					URL url=new URL(vo.getPoster());
					Image img = ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(),poster.getHeight());
					poster.setIcon(new ImageIcon(img));
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				la[0].setText("토마토지수:"+vo.getTomato());
				la[1].setText("관객지수:"+vo.getScore());
				la[2].setText("출연 및 감독:"+vo.getStarring());
				la[3].setText("방송국:"+vo.getBroad());
				la[4].setText("방영일:"+vo.getDate());
				la[5].setText("장르:"+vo.getGenre());
				la[6].setText("프로듀서:"+vo.getProducer());
				ta.setText(vo.getSynopsis());
		
		
		
		
		
	}

}
