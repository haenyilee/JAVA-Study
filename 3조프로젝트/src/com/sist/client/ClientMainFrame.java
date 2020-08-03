package com.sist.client;
/*
 * <윈도우 조립용 판>
 *  1. 윈도우 => JFrame 상속
 *  2. 윈도우 관련된 클래스를 읽어온다.
 *  3. 배치하는 패키지 불러오기
 *  4. 버튼 처리 등의 기능을 하는 패키지 불러오기
 *  5. 윈도우 크기 결정 : 생성자에서 사용
 *  6. 윈도우 크기 결정
 *  7. 창 종료되도록 설정
 *  8. setlayout 사용하지 않겠다고 설정
 *  9. 클래스에 타이틀 라벨 만들기
 *  10. 타이틀 라벨 폰트 설정
 *  11. 타이틀 라벨 크기 및 위치 선정
 *  12. 타이틀 라벨 출력
 *  13. 메뉴 패널 배치
 *  14. 채팅 패널 배치
 *  15. 컨트롤 패널 배치
 *  16.b1,b2 버튼 누르면 처리하는 인터페이스 받기
 * 
 *  
 */

import javax.swing.*; // 윈도우창, 다이얼로그, 버튼 등의 기능을 가진 패키지

import java.awt.*; // color , layout

import java.awt.event.*; // 인터페이스

																	// 패널은 마우스리스너
public class ClientMainFrame extends JFrame implements ActionListener,MouseListener{
	
	JLabel title=new JLabel("영화 예매 & 추천 프로그램", JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControllPanel cp;
	
	
	// 현재 페이지 기억쓰
	int curpage=1;
	int totalpage=16;

	public ClientMainFrame(){
		
		// 지금 떠있는 창(this)을 계속 보내기
		cp=new ControllPanel(this); 
		
		// 타이틀 부분 패널 배치
		title.setFont(new Font("굴림체",Font.BOLD,55));
		title.setOpaque(false); // 불투명모드
		// title.setBackground(Color.magenta); // 뒷 배경 색깔 설정
		title.setBounds(10,15,1570,100);
		add(title);
		
		// 메뉴 패널 배치
		mf.setBounds(10,120,100,400);
		add(mf);
		
		// 채팅 패널 배치
		cf.setBounds(115,760,1465,200);
		add(cf);
		
		// 컨트롤패널 배치
		cp.setBounds(115,120,1465,600);
		add(cp);
		
		
	
		// 윈도우 크기 결정
		setLayout(null); // JFrame(BorderLayout) 사용자 정의로 대체하겠다! null => 사용하지 않겠다
		setSize(1600,1000);
		
		// 윈도우 화면 보여주기
		setVisible(true);
		
		// X버튼 클릭 시 종료 => 이거 안하면 숨기기만 함
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		// 버튼 누르면 처리하기
		mf.b1.addActionListener(this); // 메뉴-홈버튼
		mf.b2.addActionListener(this); // 메뉴-영화찾기
		mf.b5.addActionListener(this); // 메뉴-뉴스
		
		mf.b4.addActionListener(this); // 메뉴 - 드라마
		
		cp.ff.b1.addActionListener(this); // 컨트롤패널 - 이전
		cp.ff.b2.addActionListener(this); // 컨트롤패널 - 다음
		
		cp.df.b2.addActionListener(this); // 디테일폼- 목록으로		
		
		cp.lf.b1.addActionListener(this); // 리스트폼
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.b6.addActionListener(this); // 리스트폼 - 검색버튼
		cp.lf.tf.addActionListener(this); // 리스트폼 - 검색창 : 엔터치면 검색되는 기능 추가
		
		// 드라마
		cp.dlf.b1.addActionListener(this); // 넷플릭스
		cp.dlf.b2.addActionListener(this); // HBO
		cp.dlf.b3.addActionListener(this); // Amazon Prime
		cp.dlf.b4.addActionListener(this); // DISNEY+
		cp.dlf.b5.addActionListener(this); // 검색버튼
		cp.dlf.tf.addActionListener(this); // 검색창 : 엔터치면 검색되는 기능 추가
		
		
		
		
		
		
		for(int i=0;i<10;i++) {
			cp.ff.mc[i].addMouseListener(this);
		}
	
	
	
	}
	
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		// 호출용 생성자
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ClientMainFrame();
		

	}
	public static Image getImage(ImageIcon ii,int w,int h)
	    {
	    	Image dimg = ii.getImage().getScaledInstance(w, h,
	    	        Image.SCALE_SMOOTH);
	    	return dimg;
	    }


	@Override
	public void actionPerformed(ActionEvent e) {
		
		// cp:컨트롤 패널 , mf:movieForm , b1:홈버튼 : 직접 movieform을 가져오지 못한 이유는 새로운 윈도우 창이 생겨버리기 때문쓰
		if(e.getSource()==mf.b1) { 
			cp.card.show(cp,"FF"); // cp는 상위클래스, cp위에 FF를 띄워라~!
		}
		else if(e.getSource()==mf.b2){
			cp.card.show(cp,"LF");
		}
		else if(e.getSource()==mf.b5){
			cp.card.show(cp,"NF");
		}
		
		// 드라마 창으로 넘어가기
		else if(e.getSource()==mf.b4) {
			cp.card.show(cp, "DLF");
		}
		
		
		// 목록으로 
		else if(e.getSource()==cp.df.b2){
			cp.card.show(cp,"FF");
		}
		// 이전버튼
		else if(e.getSource()==cp.ff.b1) {
			if(curpage>1)
			{
				curpage--;
				cp.ff.p.removeAll(); // jpanel의 모든 기능을 삭제
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate(); // jpanel의 원래 기능으로 재배치
			}
		}
		// 다음버튼 눌렀을때
		else if(e.getSource()==cp.ff.b2) {
			if(curpage<totalpage)
			{
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
			
			
		}
		else if(e.getSource()==cp.lf.b1)
		{
			cp.lf.movieAllData(1);
		}
		else if(e.getSource()==cp.lf.b2)
		{
			cp.lf.movieAllData(2);
		}
		else if(e.getSource()==cp.lf.b3)
		{
			cp.lf.movieAllData(3);
		}
		else if(e.getSource()==cp.lf.b4)
		{
			cp.lf.movieAllData(4);
		}
		else if(e.getSource()==cp.lf.b5)
		{
			cp.lf.movieAllData(5);
		}
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf)
		{
			//1. 입력된 값 읽기
			String ss= cp.lf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력해주세요");
				cp.lf.tf.requestFocus(); // 커서 깜빡이게 해주기
				return; // 메소드 종료
			}
			else {
				cp.lf.movieFindData(ss);
			}
			
		}
		
		
		// 드라마 방송국별로 넘어가기
		else if(e.getSource()==cp.dlf.b1)
		{
			cp.dlf.dramaAllData(1);
		}
		else if(e.getSource()==cp.dlf.b2)
		{
			cp.dlf.dramaAllData(2);
		}
		else if(e.getSource()==cp.dlf.b3)
		{
			cp.dlf.dramaAllData(3);
		}
		else if(e.getSource()==cp.dlf.b4)
		{
			cp.dlf.dramaAllData(4);
		}
		
		else if(e.getSource()==cp.dlf.b5 || e.getSource()==cp.dlf.tf)
		{
			//1. 입력된 값 읽기
			String ss= cp.dlf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력해주세요");
				cp.dlf.tf.requestFocus(); // 커서 깜빡이게 해주기
				return; // 메소드 종료
			}
			else {
				cp.dlf.dramaFindData(ss);
			}
			
		}
		
		
		
		
		
	}


	@Override
	public void mouseClicked(MouseEvent e) 
	{
		for(int i=0;i<10;i++) 
		{
			if(e.getSource()==cp.ff.mc[i]) 
			{
				if(e.getClickCount()==2)
				{
					int a=(i+1)+((curpage*10)-10);
					// JOptionPane.showMessageDialog(this, "mno="+a);
					cp.df.detailPrint(a);
					cp.card.show(cp,"DF");
					break;
				}
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
