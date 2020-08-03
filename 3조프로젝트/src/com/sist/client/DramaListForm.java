package com.sist.client;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.net.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.sist.data.DramaVO;
import com.sist.data.DramaManager2;


public class DramaListForm extends JPanel implements MouseListener{
	JButton b1,b2,b3,b4,b5;
	JTextField tf;
	JTable table;
	DefaultTableModel model;
	DramaDetailForm ddf = new DramaDetailForm();
	
	
	public DramaListForm()
	{
		setLayout(null);// FlowLayout => null 사용자 정의 배치
		   b1=new JButton("넷플릭스");
		   b2=new JButton("HBO");
		   b3=new JButton("Amazon Prime");
		   b4=new JButton("DISNEY+");
		   b5=new JButton("검색");
		   tf=new JTextField(20);
		   JPanel p=new JPanel();
		   p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(tf);
		   p.setBounds(10, 25, 900, 35);
		   add(p);
		   
		   String[] col={"번호","","제목","토마토지수","관객지수","장르"};
		   Object[][] row=new Object[0][5];
		   
		   model=new DefaultTableModel(row,col) {
		        // 편집이 불가능 
					@Override
					public boolean isCellEditable(int row, int column) {
						// TODO Auto-generated method stub
						return false;
					}
			        // 이미지 첨부 
					@Override
					public Class<?> getColumnClass(int columnIndex) {
						// TODO Auto-generated method stub
						return getValueAt(0, columnIndex).getClass();
					}
				   
			   };
			   
			   table=new JTable(model);
			   table.setRowHeight(50);
			   JScrollPane js=new JScrollPane(table);
			   
			   js.setBounds(10, 70, 700, 550);
			   add(js);
			   
			   ddf.setBounds(715,70 , 800, 650);
			   add(ddf);
			   dramaAllData(1);
			   ddf.dramaDetailPrint(1); // 이거 맞나,,,
			   
			   table.addMouseListener(this);
		   
	}
	
	
	
	
	

	public void dramaAllData(int cno) {
		// 데이터 가지고 오기
		DramaManager2 dm2=new DramaManager2();
		ArrayList<DramaVO> list = dm2.dramaAllData(cno);
		
		
		// 테이블 한 번 지우기
		// 마지막부터 지우기
		
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		
		// 데이터 출력
		for(DramaVO vo:list)
		{
			try {
				URL url = new URL(vo.getPoster());
				Image img = ClientMainFrame.getImage(new ImageIcon(url), 50, 50);
				
				
				Object[] data = {
						vo.getMno(),
						new ImageIcon(img),
						vo.getTitle(),
						vo.getTomato(),
						vo.getScore(),
						vo.getGenre()
				};
				model.addRow(data);
				
			} catch (Exception e) {e.printStackTrace();}
		}
		
	}
	
	//
	public void dramaFindData(String ss)
	{
		// 데이터 가지고 오기
		DramaManager2 dm2=new DramaManager2();
		ArrayList<DramaVO> list = dm2.dramaFindData(ss);
		
		// 테이블 한 번 지우기
		// 마지막부터 지운다
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		// 데이터 출력
		for(DramaVO vo:list)
		{
			try {
				URL url = new URL(vo.getPoster());
				 Image img=ClientMainFrame.getImage(new ImageIcon(url),
						   50, 50);
				 
				 Object[] data = {
							vo.getMno(),
							new ImageIcon(img),
							vo.getTitle(),
							vo.getTomato(),
							vo.getScore(),
							vo.getGenre()
					};
					model.addRow(data);
					
				} catch (Exception e) {e.printStackTrace();}
		}
		
		
	}





	@Override
	public void mouseClicked(MouseEvent e) {
		// 표 클릭하면 상세보기로 넘어가도록
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row = table.getSelectedRow();
				String mno= model.getValueAt(row, 0).toString();
				ddf.dramaDetailPrint(Integer.parseInt(mno));
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
