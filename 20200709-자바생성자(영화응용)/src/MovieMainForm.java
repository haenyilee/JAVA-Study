import javax.swing.*; // 윈도우 관련 클래스
import java.awt.*; // 레이아웃(화면배치)
import java.awt.event.*; // 버튼, 텍스트에 엔터 => 행위(이벤트)
// 자바에서 지원하는 윈도우의 모든 기능을 사용한다.
// 자바에서 상속은 한 개만 가능 (단일 상속)
public class MovieMainForm extends JFrame implements ActionListener{
	JMenuBar bar=new JMenuBar();
	JMenuItem home=new JMenuItem("HOME");
	JMenuItem find=new JMenuItem("찾기");
	JMenuItem exit=new JMenuItem("종료");
	
	// 실행하자마자 ==> 윈도우를 보여준다 ==> 생성자

		// 카드레이아웃 : 화면을 뒤에 감췄다가 내가 요청하면 위치를 바꿔주는 기능?
		CardLayout card=new CardLayout();
		MovieList ml=new MovieList();
		MovieDetail md=new MovieDetail();
		MovieFind mf=new MovieFind();
	
	MovieMainForm(){
		// 메뉴 설정
		JMenu menu=new JMenu("메뉴");
		menu.add(home);
		menu.add(find);
		menu.addSeparator(); // 구분선 삽입
		menu.add(exit);
		bar.add(menu);
		
		// 윈도우에 설정
		setJMenuBar(bar);
		
		// 레이아웃 설정
		setLayout(card);
		add("ML",ml); // 맨 처음 실행해야 하는 화면 먼저 놓기!
		add("MD",md);
		add("MF",mf);



		
		// 윈도우 크기 결정
		setSize(1300,1000);
		
		// 윈도우 보여준다
		setVisible(true);
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// 생성자함수는 반드시 "new 생성자();" 형식으로 호출해야 한다
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMainForm();

	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==home)
		{
			card.show(getContentPane(), "ML");
		}
		else if(e.getSource()==find)
		{
			card.show(getContentPane(), "MF");
		}
		else if(e.getSource()==exit)
		{
			System.exit(0);
		}

	}
	

}
