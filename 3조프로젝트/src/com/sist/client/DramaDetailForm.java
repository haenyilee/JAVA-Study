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
	JButton b1,b2; // ��û�ϱ�, ������� ���ư���
	
	public DramaDetailForm() {
		setLayout(null);
		poster.setBounds(10,15,250,350);
		add(poster);
		
		la1.setBounds(265,15,500,45);
		// la1.setOpaque(false);
		// la1.setBackground(Color.BLUE);
		la1.setFont(new Font("���ü", Font.BOLD, 30));
		add(la1);
		
		JPanel p =new JPanel();
		p.setLayout(new GridLayout(7,1,5,5));
		String[] str = {"�丶������","��������","�⿬ �� ����","��۱�","�濵��","�帣","���ε༭"};
		for(int i=0;i<7;i++)
		{
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("���ü",Font.BOLD,15));
			p.add(la[i]);
		}
		
		p.setBounds(265,80,450,300);
		add(p);
		
		// �ó�ý� �κ�
		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		js.setBounds(10,390,730,150);
		add(js);
		
		/*
		b1=new JButton("�����ϱ�");
		b2=new JButton("�������");
		b1.setBackground(Color.red);
		JPanel p2= new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.setBounds(365,385,200,35);
		add(p2);
		*/
	
	}
	
	
	// ��� ������ ����Ʈ? ������ Ŭ���ϸ� ������ ������ �׷��ǰ�
	public void dramaDetailPrint(int mno)
	{
		DramaManager2 d = new DramaManager2();
		DramaVO vo= d.dramaDetailData(mno);
		la1.setText(vo.getTitle());
		
		// ������ url��������?
				try {
					URL url=new URL(vo.getPoster());
					Image img = ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(),poster.getHeight());
					poster.setIcon(new ImageIcon(img));
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				la[0].setText("�丶������:"+vo.getTomato());
				la[1].setText("��������:"+vo.getScore());
				la[2].setText("�⿬ �� ����:"+vo.getStarring());
				la[3].setText("��۱�:"+vo.getBroad());
				la[4].setText("�濵��:"+vo.getDate());
				la[5].setText("�帣:"+vo.getGenre());
				la[6].setText("���ε༭:"+vo.getProducer());
				ta.setText(vo.getSynopsis());
		
		
		
		
		
	}

}
