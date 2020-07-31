/*
 * <�����â : ��ư Ŭ���� ������ ȭ�� �ٲ��ִ� �г�>
 * 1. �г� ���� �г� �ø���? (������ ���� �������� ���ø� : ������ �ϳ��� �г� ������ �� �� ���� : �г� ���� �гε� ������ �� �� ����)
 * 2.card,listform,detailform ����?
 * 
 */

package com.sist.client;

import java.awt.*;
import java.awt.Color;
import javax.swing.*;


public class ControllPanel extends JPanel { // JFrame�� �ƴ϶� JPanel ���
	CardLayout card=new CardLayout();
	ListForm lf=new ListForm();
	DetailForm df=new DetailForm();
	MovieForm ff;
	ClientMainFrame c;
	NewsForm nf = new NewsForm();
	
	
	
	public ControllPanel(ClientMainFrame c) {
		this.c=c;
		ff=new MovieForm(c);
		
		setLayout(card);
		//setBackground(Color.gray);
		add("FF",ff);
		add("DF",df);
		add("NF",nf);
		add("LF",lf);
		
		
	}

}
