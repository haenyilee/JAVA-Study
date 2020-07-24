/*
 	윈도우
	 	= Container : Component를 여러개 묶어서 화면에 출력
	 		= 		      ┌ JFrame : 윈도우창
	 		= 단독시행 가능     │ JWindow : 타이틀바 없는 윈도우창
	 		= 			  └ JDialog : 윈도우 위에 윈도우 창 - modal(다른 동작시행불가) / modeless(다른동작시행가능)
	 		= 단독 시행 불가능 ─ JPanel  
	 	
	 	= Component :  한 개의 기능만 가지고 있음
	 		= JLabel => 일반 문자열 출력 , 이미지 출력
	 		= 버튼
	 			= 일반버튼
	 				JButton
	 			= 토글버튼 (클릭했을때 모양이 달라지는 버튼)
	 				체크박스 JCheckButton , 라디오버튼 JRadioButton
	 			= 메뉴
	 		= 입력창 
	 			= 한줄입력 : JTextField
	 			= 비밀번호 : JPasswordField
	 			= 여러줄입력 : JTextArea => 자기 소개, 내용출력
	 			= 여러줄입력 : JTextPan => 채팅 (한줄씩 글자크기/폰트 변경 가능한 것)
	 		= 목록창
	 			= 선택창 : JComboBox
	 			= 전체 내용 출력 : JList
	 			= JTree
	 			= JTable
	 		= 화면분할
	 			= JTabbedPane
	 			= JSplit
	 			= JInteralFrame
	 			
	=============================================================================================
	↑ javax.swing.*
	↓ java.awt.*
	=============================================================================================
	 배치(Layout) , 사용자 정의 배치
	 	1. BorderLayout => 5군데
	 		위 , 아래 , 가운데 , 왼쪽 , 오른쪽
	 	2. FlowLayout
	 	3. GridLayout
	 	4. CardLayout
	 	5. 사용자 정의 =====> setBounds(10,20,800,900)
	 	
	 	====> 프로젝트
	 		1. 로그인 ===> 서버에서 저장
	 		2. 회원가입
	 		------------------------ 오늘은 여기까지
	 		3. 목록 출력
	 		4. 상세보기
	 		5. 예매 , 장바구니
	 		6. 마이페이지 , 관리자페이지
	 		7. 채팅
	 		
 		
 */

import javax.swing.*;
import java.awt.*;
/*
 	 변수 ===> 데이터를 감추고 시작(은닉화 : private)
 	 	= 일반변수 => 기본형
 	 	
 	 	= 배열    ┐
 	 	 	   │=> 참조변수
 	 	= 클래스 ┘   
 	 	
 	 메소드 	 ┐
 	 	  	 │=> 다른 클래스와 연결하는 역할 : public
 	 생성자  	 ┘
 */
public class MainForm extends JFrame{

	private CardLayout card = new CardLayout(); // 포함클래스 => 변경할 내용이 없음
	
	// 화면 UI => 생성자 => 왜 생성자에서 만들어? => 시작할 때 바로보여줘야 해서, 시작하자마자 시행되는 생성자에 만듬~!
	// 생성자 => 한 번만 호출이 가능하고 시작과 동시에 호출이 되는 메소드
	// 생성자는 모든 클래스에서 호출이 가능해야 한다 => public이 붙은 상태에서 모든 클래스에서 사용 가능
	
	Login login=new Login();
	public MainForm()
	{
		// Layout 설정
		setLayout(card);
		add("LOGIN",login);
		
		/*
		 	JFrame , JWindow , JDialog ==> Border Layout
		 	JPanel ==> FlowLayout
		 	
		 	===> 사용자 정의 사용 ===> setLayout(null)
		 */
		setBounds(400,60,1024,950);
		// setSize(1000,900);
		// setsize는 왼쪽에 바싹 붙여서 화면 출력
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainForm();

	}

}
