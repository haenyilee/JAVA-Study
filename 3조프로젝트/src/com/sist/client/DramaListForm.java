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
		setLayout(null);// FlowLayout => null ����� ���� ��ġ
		   b1=new JButton("���ø���");
		   b2=new JButton("HBO");
		   b3=new JButton("Amazon Prime");
		   b4=new JButton("DISNEY+");
		   b5=new JButton("�˻�");
		   tf=new JTextField(20);
		   JPanel p=new JPanel();
		   p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(tf);
		   p.setBounds(10, 25, 900, 35);
		   add(p);
		   
		   String[] col={"��ȣ","","����","�丶������","��������","�帣"};
		   Object[][] row=new Object[0][5];
		   
		   model=new DefaultTableModel(row,col) {
		        // ������ �Ұ��� 
					@Override
					public boolean isCellEditable(int row, int column) {
						// TODO Auto-generated method stub
						return false;
					}
			        // �̹��� ÷�� 
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
			   ddf.dramaDetailPrint(1); // �̰� �³�,,,
			   
			   table.addMouseListener(this);
		   
	}
	
	
	
	
	

	public void dramaAllData(int cno) {
		// ������ ������ ����
		DramaManager2 dm2=new DramaManager2();
		ArrayList<DramaVO> list = dm2.dramaAllData(cno);
		
		
		// ���̺� �� �� �����
		// ���������� �����
		
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		
		// ������ ���
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
		// ������ ������ ����
		DramaManager2 dm2=new DramaManager2();
		ArrayList<DramaVO> list = dm2.dramaFindData(ss);
		
		// ���̺� �� �� �����
		// ���������� �����
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		// ������ ���
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
		// ǥ Ŭ���ϸ� �󼼺���� �Ѿ����
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
