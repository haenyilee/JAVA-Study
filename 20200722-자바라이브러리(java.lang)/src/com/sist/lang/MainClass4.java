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
		String[] col = {"이름" , "나이" , "주소"};
		String[][] row = new String[0][3];
		
		model= new DefaultTableModel(row,col) {
			// 메소드 재정의 : 클릭 시에 편집을 방지하는 프로그램
			public boolean isCellEditable(int r,int c)
			{
				return false;
			}
			public void aaa()
			{
				// 함수 추가 가능
			}
		};
		
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		add("Center",js);
		
		for(int i=0;i<10;i++)
		{
			String[] data = {"홍길동"+(i+1),"30","서울"};
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
			// 더블클릭하면
			if(e.getClickCount()==2) //더블클릭
			{
				// 몇 번째 줄인지 가져오는 함수
				int row=table.getSelectedRow();
				// 해당 위치의 data 가져오기 **to string** 잘보기~~
				String name=model.getValueAt(row, 0).toString();
				String age=model.getValueAt(row, 1).toString();
				String addr=model.getValueAt(row, 2).toString();
				String data="이름 : "+name+"\n"
							+"나이 : "+age+"\n"
							+"주소 : "+addr;
				// JFrame위에 글자 팝업 띄우기
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
