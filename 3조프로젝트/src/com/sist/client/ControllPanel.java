/*
 * <우상향창 : 버튼 클릭할 때마다 화면 바꿔주는 패널>
 * 1. 패널 위에 패널 올리기? (프레임 위에 프레임은 못올림 : 프레임 하나에 패널 여러개 들어갈 수 있음 : 패널 위에 패널도 여러개 들어갈 수 있음)
 * 2.card,listform,detailform 생성?
 * 
 */

package com.sist.client;

import java.awt.*;
import java.awt.Color;
import javax.swing.*;


public class ControllPanel extends JPanel { // JFrame이 아니라 JPanel 상속
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
