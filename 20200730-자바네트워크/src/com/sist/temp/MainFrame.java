package com.sist.temp;
import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {
	GameView gv = new GameView();
	
	public MainFrame()
	{
		add("Center",gv);
		setSize(1000,950);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new MainFrame();
	
	}

}
