package com.sist.inter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

public class MainClass5 extends JFrame{
	JTable table; // ���̺� ��縸 ����� ��
	DefaultTableModel model; // ���̺� �ȿ� �ִ� ������ ����

	public MainClass5()
	{
		// Ÿ��Ʋ��
		String[] col= {"","�̸�","����","�ּ�"};
		Object[][] row= new Object[0][4];
		
		model=new DefaultTableModel(row,col){
			
			// ���⼭ �������ؾ� ��~~~ ��� �ȹ޾Ƶ� ������ �ڿ��� �������̵� ����
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}

			
			
			
		};
		
		// table�� ÷��
		table=new JTable(model);
		table.setRowHeight(80);
		JScrollPane js=new JScrollPane(table);
		
		// �����쿡 �߰�
		add("Center",js);
		setSize(350,450);
		
		// ������ �߰�
		Object[] data= {new ImageIcon("c:\\javaDev\\a.png"),"ȫ�浿","����","����"};
		model.addRow(data);
		model.addRow(data);
		model.addRow(data);
		String[] data2= {"������","����","�뱸"};
		model.addRow(data2);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ȣ��
		new MainClass5();

	}

}
