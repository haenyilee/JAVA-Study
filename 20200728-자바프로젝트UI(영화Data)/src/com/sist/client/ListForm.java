package com.sist.client;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.ArrayList;
import java.net.*; // url , 예외처리해야함(java.io도)

import javax.swing.*;
import javax.swing.table.*;

import com.sist.data.MovieVO;
import com.sist.data.MovieManager;

public class ListForm extends JPanel implements MouseListener{
	JButton b1,b2,b3,b4,b5,b6;
	JTextField tf;
	JTable table;
	DefaultTableModel model;
	MovieDetailForm mdf=new MovieDetailForm();
	
	// 기능만들려면 => 메소드 만들기 => 메소드는 리턴형, 매개변수 잡는 것이 중요
	public ListForm() {
		// setBackground(Color.pink);
		setLayout(null);
		b1=new JButton("현재상영영화");
		b2=new JButton("개봉예정영화");
		b3=new JButton("박스오피스(주간)");
		b4=new JButton("박스오피스(월간)");
		b5=new JButton("박스오피스(연간)");
		b6=new JButton("검색");
		tf=new JTextField(20);
		JPanel p = new JPanel();
		p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(tf);p.add(b6);
		p.setBounds(10,25,900,35);
		add(p);
		
		String[] col= {"번호","포스터","제목","감독","장르","등급"};
		
		Object[][] row = new Object[0][6]; 
		// 한줄에 6개씩
		// 글자뿐만 아니라 이미지도 출력해야 해서 object
		
		// DefaultTableModel => 익명의 클래스(내부클래스) : 오버라이딩할 메소드가 있다는 뜻!
		/*
		 * 내부클래스
		 * 1.
		 * class A
		 * {
		 * 		class B
		 * 		{
		 * 		}
		 * }
		 */
		model=new DefaultTableModel(row,col) {
			
			// 편집을 불가능하게 하는 기능
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
						
			// 이미지 첨부하는 프로그램
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			
		};
		
		table=new JTable(model);
		table.setRowHeight(50);
		JScrollPane js = new JScrollPane(table);
		
		
		js.setBounds(10,70,700,550);
		add(js);
		
		mdf.setBounds(715,70,800,650);
		add(mdf);
		
		movieAllData(1);
		mdf.detailPrint(1);
		
		table.addMouseListener(this);
		
		
	}
	public void movieAllData(int cno)
	{
		// 데이터 가지고 오기
		MovieManager m = new MovieManager();
		ArrayList<MovieVO> list = m.movieAllData(cno);
		
		// 테이블 한번 지우기
		// 맨 마지막부터 지운다
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		// 데이터 출력
		for(MovieVO vo:list)
		{
			try {
				URL url=new URL(vo.getPoster());
				Image img=ClientMainFrame.getImage(new ImageIcon(url), 50, 50);				
				
				Object[] data = {
						vo.getMno(),
						// 포스터는 URL읽어와야함 => java.net => 예외처리 해야함(checkexeption)
						new ImageIcon(img),
						vo.getTitle(),
						vo.getDirector(),
						vo.getGenre(),
						vo.getGrade()
				};
				model.addRow(data);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
	
	public void movieFindData(String ss)
	{
		// 데이터 가지고 오기
		MovieManager m = new MovieManager();
		ArrayList<MovieVO> list = m.movieFindData(ss);
		
		// 테이블 한번 지우기
		// 맨 마지막부터 지운다
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		// 데이터 출력
		for(MovieVO vo:list)
		{
			try {
				URL url=new URL(vo.getPoster());
				Image img=ClientMainFrame.getImage(new ImageIcon(url), 50, 50);				
				
				Object[] data = {
						vo.getMno(),
						// 포스터는 URL읽어와야함 => java.net => 예외처리 해야함(checkexeption)
						new ImageIcon(img),
						vo.getTitle(),
						vo.getDirector(),
						vo.getGenre(),
						vo.getGrade()
				};
				model.addRow(data);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row = table.getSelectedRow();
				String mno = model.getValueAt(row, 0).toString();
				mdf.detailPrint(Integer.parseInt(mno));
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
