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
	
	// ��Ʈ��ũ ���� ���̺귯��
	Socket s; // ������(�ڵ����̶�� �����ϸ� ����)
	BufferedReader in; // ������ �޾Ƽ� �б�
	OutputStream out; // ������ ������
	
	public Client()
	{
		// JFrame ������
		ta=new JTextArea();
		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		tf=new JTextField(30);
		tf.setEnabled(false);
		b1=new JButton("����");
		b2=new JButton("����");
		
		JPanel p =new JPanel();
		p.add(tf);p.add(b1);p.add(b2);
		
		add("Center",js);
		add("South",p);
		setSize(500,500);
		setVisible(true);
		
		b1.addActionListener(this); // ����
		b2.addActionListener(this); // ����
		tf.addActionListener(this); // ���������� ���� ������ ����
		
		
	}
	
	
	// �������� ������ ������� �޾Ƽ� ����ϴ� �κ�
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
				
				tf.setEnabled(true); // ���� Ȱ��ȭ
				b1.setEnabled(false);				
			} catch (Exception e2) {}
			// �����κ��� �� �о�Ͷ�
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
