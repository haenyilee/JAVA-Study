package com.sist.reservemain;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	MainPage mainpage=new MainPage();
	
	public MainFrame()
	{
		
		setSize(1600,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //»ó¼ö 3
		
		
	}
	

	public static void main(String[] args) {
		new MainFrame();
		

	}

}
