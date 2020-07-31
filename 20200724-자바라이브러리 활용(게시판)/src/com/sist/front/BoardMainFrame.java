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
	
	// 프로그램 연결 => ArrayList => BoardManager => import 패키지
	BoardManager bm=new BoardManager();
	
	public BoardMainFrame() {
		
		tp.addTab("게시판목록", bp);
		tp.addTab("글쓰기", bi);
		tp.setTabPlacement(tp.BOTTOM);
		// tp.setSelectedIndex(1);
		add("Center",tp);
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bp.b.addActionListener(this); // 새글
		bi.b1.addActionListener(this); // 글쓰기
		bi.b2.addActionListener(this); // cnlth
		
	}

	public static void main(String[] args) {
		new BoardMainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bp.b) // 새글 버튼 클릭
		{
			// 글쓰기 화면으로 이동
			tp.setSelectedIndex(1);
		}
		else if(e.getSource()==bi.b1) // 글쓰기 버튼 클릭
		{
			// ArrayList에 저장
			
			// 입력한 데이터 읽기
			String name=bi.tf1.getText();
			String subject=bi.tf2.getText();
			String content=bi.ta.getText();
			String pwd=String.valueOf(bi.pf.getPassword()); // 밸류어브 : 문자열로 변경하는 애
			
			// password는 char[]로
			BoardVO vo =new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			// ArrayList에 추가 
			bm.insert(vo);
			listPrint();
			// 목록 추가 => 메소드?
			tp.setSelectedIndex(0);
			
			
		}
		else if(e.getSource()==bi.b2) // 취소 버튼
		{
			// 목록으로 이동
			tp.setSelectedIndex(0);
		}
		
	}
	
	// 목록 추가 => 메소드!
	public void listPrint() {
		
		// <ArrayList를 받아와서 목록에 딱 출력해주기~>
		
		// ArrayList 받아오기
		ArrayList<BoardVO> list = bm.select();
		
		// 기존 테이블 데이터 지우기(밑에서부터...위에서부터 지우면 0번이 안지워짐)
		
		for(int i=bp.model.getRowCount()-1;i>=0;i--)
		{
			bp.model.removeRow(i);
		}
		// 테이블 출력
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		// MM(월) mm(분)
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
