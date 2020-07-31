package com.sist.front;

import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import com.sist.back.BoardManager;
import com.sist.back.BoardVO;

import java.util.*;
import java.text.*;

public class BoardMainFrame extends JFrame implements ActionListener{
	
	BoardListPanel bp=new BoardListPanel();
	BoardInsertPanel bi = new BoardInsertPanel();
	JTabbedPane tp=new JTabbedPane();
	
	// ���α׷� ���� => ArrayList => BoardManager => import ��Ű��
	BoardManager bm=new BoardManager();
	
	public BoardMainFrame() {
		
		tp.addTab("�Խ��Ǹ��", bp);
		tp.addTab("�۾���", bi);
		tp.setTabPlacement(tp.BOTTOM);
		// tp.setSelectedIndex(1);
		add("Center",tp);
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bp.b.addActionListener(this); // ����
		bi.b1.addActionListener(this); // �۾���
		bi.b2.addActionListener(this); // cnlth
		
	}

	public static void main(String[] args) {
		new BoardMainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bp.b) // ���� ��ư Ŭ��
		{
			// �۾��� ȭ������ �̵�
			tp.setSelectedIndex(1);
		}
		else if(e.getSource()==bi.b1) // �۾��� ��ư Ŭ��
		{
			// ArrayList�� ����
			
			// �Է��� ������ �б�
			String name=bi.tf1.getText();
			String subject=bi.tf2.getText();
			String content=bi.ta.getText();
			String pwd=String.valueOf(bi.pf.getPassword()); // ������ : ���ڿ��� �����ϴ� ��
			
			// password�� char[]��
			BoardVO vo =new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			// ArrayList�� �߰� 
			bm.insert(vo);
			listPrint();
			// ��� �߰� => �޼ҵ�?
			tp.setSelectedIndex(0);
			
			
		}
		else if(e.getSource()==bi.b2) // ��� ��ư
		{
			// ������� �̵�
			tp.setSelectedIndex(0);
		}
		
	}
	
	// ��� �߰� => �޼ҵ�!
	public void listPrint() {
		
		// <ArrayList�� �޾ƿͼ� ��Ͽ� �� ������ֱ�~>
		
		// ArrayList �޾ƿ���
		ArrayList<BoardVO> list = bm.select();
		
		// ���� ���̺� ������ �����(�ؿ�������...���������� ����� 0���� ��������)
		
		for(int i=bp.model.getRowCount()-1;i>=0;i--)
		{
			bp.model.removeRow(i);
		}
		// ���̺� ���
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		// MM(��) mm(��)
		for(BoardVO vo:list)
		{
			String[] data= {
					String.valueOf(vo.getNo()),
					vo.getSubject(),
					vo.getName(),
					sdf.format(vo.getRegdate()),
					String.valueOf(vo.getHit())
			};
			
			bp.model.addRow(data);
		}
		
		
	}

}
