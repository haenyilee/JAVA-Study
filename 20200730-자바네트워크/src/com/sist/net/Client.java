package com.sist.net;
import java.net.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Client extends JFrame implements Runnable,ActionListener{

	JTextArea ta;
	JTextField tf;
	JButton b1,b2;
	
	// 네트워크 관련 라이브러리
	Socket s; // 연결기계(핸드폰이라고 생각하면 편함)
	BufferedReader in; // 데이터 받아서 읽기
	OutputStream out; // 데이터 보내기
	
	public Client()
	{
		// JFrame 모양잡기
		ta=new JTextArea();
		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		tf=new JTextField(30);
		tf.setEnabled(false);
		b1=new JButton("접속");
		b2=new JButton("종료");
		
		JPanel p =new JPanel();
		p.add(tf);p.add(b1);p.add(b2);
		
		add("Center",js);
		add("South",p);
		setSize(500,500);
		setVisible(true);
		
		b1.addActionListener(this); // 접속
		b2.addActionListener(this); // 종료
		tf.addActionListener(this); // 엔터쳤을때 값을 서버에 전송
		
		
	}
	
	
	// 서버에서 들어오는 결과값을 받아서 출력하는 부분
	public void run()
	{
		try
		{
			while(true)
			{
				String msg=in.readLine();
				ta.append(msg+"\n");
			}
		}catch (Exception e) {}
	}
	
	
	public static void main(String[] args) {
		/*
		try 
		{
			Socket s = new Socket("211.238.142.199",3333);
		} catch (Exception e) {}
		*/
		new Client();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			try 
			{
				s=new Socket("211.238.142.180",3333);
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				out=s.getOutputStream();
				
				tf.setEnabled(true); // 접속 활성화
				b1.setEnabled(false);				
			} catch (Exception e2) {}
			// 서버로부터 값 읽어와라
			new Thread(this).start();
		}
		else if(e.getSource()==tf)
		{
			try
			{
				String msg = tf.getText();
				if(msg.length()<1) return;
				out.write((msg+"\n").getBytes());
				tf.setText("");
			}catch (Exception e3) {}
		}
		
	}

}
