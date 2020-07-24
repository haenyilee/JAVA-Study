package com.sist.string;

import java.awt.*;
import javax.swing.*;


public class MainClass3 extends JFrame{
	JTextField tf=new JTextField();
	JLabel la=new JLabel();
	
	public MainClass3()
	{
		// string ¾Æ´Ï¸é ¾ÈµÅ~~~
		tf.setText(String.valueOf(10));
		la.setText(String.valueOf(10.5));
		
		add("North",tf);
		add("Center",la);
		
		setSize(350,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MainClass3();

	}

}
