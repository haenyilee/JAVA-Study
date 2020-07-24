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

public class ClientMainFrame extends JFrame implements ActionListener{
	
	JLabel title=new JLabel("영화 예매 사이트", JLabel.CENTER);
	
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControllPanel cp = new ControllPanel();
	
	JButton b1=new JButton("로그인");
	JButton b2=new JButton("회원가입");
	

	public ClientMainFrame(){
		
	// 타이틀 부분 패널 배치
	title.setFont(new Font("굴림체",Font.BOLD,70));
	// title.setOpaque(true); // 불투명모드
	// title.setBackground(Color.magenta); // 뒷 배경 색깔 설정
	title.setBounds(250,15,1000,100);
	
	JPanel p=new JPanel();
	p.add(b1);
	p.add(b2);
	p.setBounds(1400,15,200,35);
	add(p);
	add(title);
	
	// 메뉴 패널 배치
	mf.setBounds(20,130,1600,300);
	add(mf);
	
	// 채팅 패널 배치
	// cf.setBounds(115,760,1465,200);
	// add(cf);
	
	// 컨트롤패널 배치
	//cp.setBounds(15,300,1550,435);
	//add(cp);
	
	
	

	// 윈도우 크기 결정
	setLayout(null); // JFrame(BorderLayout) 사용자 정의로 대체하겠다! null => 사용하지 않겠다
	setSize(1600,1000);
	
	// 윈도우 화면 보여주기
	setVisible(true);
	
	// X버튼 클릭 시 종료 => 이거 안하면 숨기기만 함
	setDefaultCloseOperation(EXIT_ON_CLOSE); 
	
	// 버튼 누르면 처리하기
	// mf.b1.addActionListener(this);
	// mf.b2.addActionListener(this);
	
	
	
	}
	
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		// 호출용 생성자
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ClientMainFrame();
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*
		if(e.getSource()==mf.b1) {
			cp.card.show(cp,"DF");
		}
		else if(e.getSource()==mf.b2){
			cp.card.show(cp,"LF");
		}
		*/
		
	}

}
