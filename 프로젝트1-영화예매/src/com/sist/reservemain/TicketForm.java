package com.sist.reservemain;

import javax.swing.*;
import java.awt.*;

public class TicketForm extends JPanel{
	JButton b1,b2;
	JButton num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;
	JLabel la1,la2,la3,la4,la5,la6,la7;
	JPanel pan1,pan2,pan3,pan4,pan5,pan6;
	JTextArea ta1,ta2,ta3,ta4;
	
	public TicketForm(){
		b1= new JButton("���� �ٽ��ϱ�");
		b2= new JButton("�¼� ����>");
		add(b1);add(b2);
		b1.setBounds(1375, 5, 150, 20);
		b2.setBounds(1405, 655, 120, 70);
		
		
		
		JPanel p= new JPanel();
		p.add(num1);p.add(num2);p.add(num3);p.add(num4);p.add(num5);p.add(num6);p.add(num7);p.add(num8);p.add(num9);p.add(num10);
		p.add(la6);p.add(la7);
		add(p);
		setLayout(null);
		p.setBounds(1150, 400, 350, 100);
		num1=new JButton("0");
		num2=new JButton("1");
		num3=new JButton("2");
		num4=new JButton("3");
		num5=new JButton("4");
		num6=new JButton("5");
		num7=new JButton("6");
		num8=new JButton("7");
		num9=new JButton("8");
		num10=new JButton("9");
		la6=new JLabel("����");
		la7=new JLabel("û�ҳ�");
		
		
		JPanel p2=new JPanel();
		p2.add(la1);p2.add(la2);p2.add(la3);p2.add(la4);
		add(p2);
		setLayout(null);
		p2.setBounds(10, 15, 1280, 35);
		la1 = new JLabel("��ȭ����");
		la2 = new JLabel("��¥����");
		la3 = new JLabel("���弱��");
		la4 = new JLabel("�ð�����");
		
		
		la5 = new JLabel("�ο�����");
		add(la5);
		la5.setBounds(1130,340,400,50);
		
		
		
	}

}
