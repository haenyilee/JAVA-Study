/*
 * <������ ����: ä��â(�г�?)>
 * 1. ��Ű�� ����Ʈ
 * 2. ��Ű�� ���
 * 3. ������ > ���� ����(���̾ƿ� ũ�� �ӽ� Ȯ�ο�)
 * ũ�� : 1465,200
 * 4. ��ư �� ��� �߰� & ��ġ
 * 
 */

package com.sist.client;

import java.awt.Color;
import javax.swing.*;
import javax.swing.table.*;

public class ChatForm extends JPanel{
	
	JTextArea ta;
	JTextField tf;
	JComboBox box;
	JTable table;
	DefaultTableModel model;
	JButton b1,b2;
	
	
	
	public ChatForm() {
		// setBackground(Color.yellow);
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		setLayout(null);
		js.setBounds(10,15,850,140);
		add(js);
		tf=new JTextField();
		tf.setBounds(10,160,740,30);
		add(tf);
		
		box=new JComboBox();
		box.addItem("black");
		box.addItem("red");
		box.addItem("green");
		box.addItem("grey");
		box.addItem("yellow");
		box.addItem("cyan");
		
		box.setBounds(755,160,105,30);
		add(box);
		
		String[] col= {"ID","��ȭ��","����"};
		String[][] row=new String[0][3];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js1=new JScrollPane(table);
		js1.setBounds(865,15,500,135);
		add(js1);
		
		JPanel p=new JPanel();
		b1=new JButton("��������");
		b2=new JButton("����������");
		p.add(b1);
		p.add(b2);
		p.setBounds(865,155,500,35);
		add(p);
		
		
		
	}

}
