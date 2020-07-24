package com.sist.lang;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;



public class MainClass4 extends JFrame implements MouseListener{
	JTable table;
	DefaultTableModel model;
	public MainClass4()
	{
		String[] col = {"�̸�" , "����" , "�ּ�"};
		String[][] row = new String[0][3];
		
		model= new DefaultTableModel(row,col) {
			// �޼ҵ� ������ : Ŭ�� �ÿ� ������ �����ϴ� ���α׷�
			public boolean isCellEditable(int r,int c)
			{
				return false;
			}
			public void aaa()
			{
				// �Լ� �߰� ����
			}
		};
		
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		add("Center",js);
		
		for(int i=0;i<10;i++)
		{
			String[] data = {"ȫ�浿"+(i+1),"30","����"};
			model.addRow(data);
		}
		
		setSize(350,400);
		setVisible(true);
		
		table.addMouseListener(this);
	}
	
	

	public static void main(String[] args) {
		new MainClass4();

	}



	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==table)
		{
			// ����Ŭ���ϸ�
			if(e.getClickCount()==2) //����Ŭ��
			{
				// �� ��° ������ �������� �Լ�
				int row=table.getSelectedRow();
				// �ش� ��ġ�� data �������� **to string** �ߺ���~~
				String name=model.getValueAt(row, 0).toString();
				String age=model.getValueAt(row, 1).toString();
				String addr=model.getValueAt(row, 2).toString();
				String data="�̸� : "+name+"\n"
							+"���� : "+age+"\n"
							+"�ּ� : "+addr;
				// JFrame���� ���� �˾� ����
				JOptionPane.showMessageDialog(this,data);
			}
		}
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
