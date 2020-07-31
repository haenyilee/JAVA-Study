package com.sist.client;
import java.util.*;
import javax.swing.*;

import com.sist.common.Function;

import java.awt.*;
import java.awt.event.*;

// ��Ʈ��ũ ���� Ŭ����
import java.net.*;
import java.io.*;

public class ClientMainFrame extends JFrame implements ActionListener,Runnable{

	CardLayout card = new CardLayout();
	Login login = new Login();
	WaitRoom wr = new WaitRoom();
	
	// ��Ʈ��ũ ���� ����
	Socket s; // ��ȭ��
	BufferedReader in; // ����
	OutputStream out; // �۽�
	
	public ClientMainFrame()
	{
		setLayout(card);
		add("LOGIN",login);
		add("WR",wr);
		
		setSize(1024,950);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		login.b1.addActionListener(this); // �α��� ó��
		login.b2.addActionListener(this); // ���
		
		wr.tf.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new ClientMainFrame();

	}

	public void connection(String id, String name, String sex)
	{
		// ������ �����Ű�� �α��� ��û
		try 
		{
			s= new Socket("localhost",3355); // "���β� ����",���� ��Ʈ��ȣ �ֱ�
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out=s.getOutputStream();
			
			// ������ �Ǹ� �α��� ��û
			out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			
		} catch (Exception e) {}
		
		// ������ �Ǹ� �����κ��� ���ø� �ޱ� => ������ ȣ��(runnable ���) 
		new Thread(this).start();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login.b1)
		{
			String id=login.tf.getText();
			String name=login.pf.getText();
			String sex="";
			if(login.rb1.isSelected())
				sex="����";
			else {
				sex="����";
			}
			connection(id, name, sex);
		}
		else if(e.getSource()==wr.tf)
		{
			// �Էµ� ������ �б�
			String msg=wr.tf.getText();
			// ä�� �Է� ���ϸ� ����
			if(msg.length()<1) return;
			
			// ������ �� ������
			try {
				out.write((Function.WAITCHAT+"|"+msg+"\n").getBytes());
			} catch (Exception e2) {}
			
			wr.tf.setText("");
		}
	}

	@Override
	public void run() {
		
		try {
			while(true)
			{
				String msg=in.readLine();
				StringTokenizer st = new StringTokenizer(msg,"|");
				int protocol = Integer.parseInt(st.nextToken());
				switch (protocol) 
				{
					case Function.LOGIN:
					{
						String[] data = {
								st.nextToken(),
								st.nextToken(),
								st.nextToken(),
								st.nextToken()
						};
						wr.model2.addRow(data);
					}
					break;
					case Function.MYLOG:
					{
						setTitle(st.nextToken());
						card.show(getContentPane(), "WR");
					}
					break;
					case Function.WAITCHAT:
					{
						wr.bar.setValue(wr.bar.getMaximum());
						wr.ta.append(st.nextToken()+"\n");
					}

				}
			}
			
		} catch (Exception e) {}
	}

}
