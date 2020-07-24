package com.sist.inter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

public class MainClass5 extends JFrame{
	JTable table; // 테이블 모양만 만드는 것
	DefaultTableModel model; // 테이블 안에 있는 데이터 제어

	public MainClass5()
	{
		// 타이틀바
		String[] col= {"","이름","성별","주소"};
		Object[][] row= new Object[0][4];
		
		model=new DefaultTableModel(row,col){
			
			// 여기서 재정의해야 함~~~ 상속 안받아도 생성자 뒤에서 오버라이딩 가능
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
		
		// table에 첨부
		table=new JTable(model);
		table.setRowHeight(80);
		JScrollPane js=new JScrollPane(table);
		
		// 윈도우에 추가
		add("Center",js);
		setSize(350,450);
		
		// 데이터 추가
		Object[] data= {new ImageIcon("c:\\javaDev\\a.png"),"홍길동","남자","서울"};
		model.addRow(data);
		model.addRow(data);
		model.addRow(data);
		String[] data2= {"이히리","여자","대구"};
		model.addRow(data2);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 호출
		new MainClass5();

	}

}
