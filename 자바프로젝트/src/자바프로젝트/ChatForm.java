package 자바프로젝트;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.*;
import javax.swing.table.*;

//1465, 200

public class ChatForm extends JFrame{
	JTextArea ta;
	JTextField tf;
	JComboBox box;
	JTable table;
	DefaultTableModel model;
	JButton b1,b2;
	
	public ChatForm()
	{
		setLayout(null);
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		js.setBounds(10, 15, 300, 400);
		add(js);
		
		tf=new JTextField();
		tf.setBounds(10, 410, 280, 60);
		add(tf);
		
		box= new JComboBox();
		box.addItem("Black");
		box.addItem("Red");
		box.addItem("Blue");
		box.addItem("Green");
		box.addItem("Gray");
		box.addItem("Yellow");
		box.addItem("Cyan");
		box.setBounds(755, 165, 105, 30);
		add(box);
		
		String[] col= {"ID", "대화면", "성별"};
		String[][] row=new String[0][3];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js1=new JScrollPane(table);
		js1.setBounds(865, 15, 500, 135);
		add(js1);
		
		JPanel p=new JPanel();
		b1=new JButton("정보보기");
		b2=new JButton("쪽지보내기");
		p.add(b1);
		p.add(b2);
		p.setBounds(865, 155, 500, 35);
		add(p);
		
		setSize(800, 600);
	}

}