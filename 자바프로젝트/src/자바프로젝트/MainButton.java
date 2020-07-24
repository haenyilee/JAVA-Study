package 자바프로젝트;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainButton extends JPanel{
	ImageIcon nomalLoginIcon = new ImageIcon("/자바프로젝트/이미지파일/login1.jpg");
	ImageIcon rolLoginIcon = new ImageIcon("/자바프로젝트/이미지파일/login2.jpg");
	
	ImageIcon nomalJoinIcon = new ImageIcon("/자바프로젝트/이미지파일/join1.jpg");
	ImageIcon rolJoinIcon = new ImageIcon("/자바프로젝트/이미지파일/join2.jpg");
	
	ImageIcon nomalSerchIcon = new ImageIcon("/자바프로젝트/이미지파일/돋보기1.jpg");
	ImageIcon rolSerchIcon = new ImageIcon("/자바프로젝트/이미지파일/돋보기2.jpg");
	
	ImageIcon nomallistIcon = new ImageIcon("/자바프로젝트/이미지파일/영화.jpg");
	ImageIcon rollistIcon = new ImageIcon("/자바프로젝트/이미지파일/영화1.jpg");
	
	ImageIcon nomalticketIcon = new ImageIcon("/자바프로젝트/이미지파일/예매.jpg");
	ImageIcon rolticketIcon = new ImageIcon("/자바프로젝트/이미지파일/예매1.jpg");
	
	ImageIcon nomaleventIcon = new ImageIcon("/자바프로젝트/이미지파일/이벤트.jpg");
	ImageIcon roleventIcon = new ImageIcon("/자바프로젝트/이미지파일/이벤트1.jpg");
	
	ImageIcon nomalchatIcon = new ImageIcon("/자바프로젝트/이미지파일/채팅.jpg");
	ImageIcon rolchatIcon = new ImageIcon("/자바프로젝트/이미지파일/채팅1.jpg");
	
	
	JButton login;
	JButton join;
	JTextField tf_search;
	JButton search;
	
	JButton list;
	JButton ticket;
	JButton event;	
	JButton chat;
	
	public MainButton()
	{
		//로그인버튼
		login=new JButton(nomalLoginIcon); 
		setIcon(login); //버튼 모양 세팅
		login.setRolloverIcon(rolLoginIcon);
		login.setBounds(1350, 15, 100, 30); 
		
		//회원가입버튼
		join=new JButton(nomalJoinIcon);
		setIcon(join); //버튼 모양 세팅
		join.setRolloverIcon(rolJoinIcon);
		join.setBounds(1450, 15, 100, 30);
		
		//검색박스 
		tf_search=new JTextField();
		tf_search.setBounds(1240, 180, 300, 40);
		
		//검색버튼
		search=new JButton(nomalSerchIcon);
		setIcon(search); //버튼 모양 세팅
		search.setRolloverIcon(rolSerchIcon);
		search.setBounds(1510, 173, 100, 50);
		
		//영화탭
		list=new JButton(nomallistIcon);
		setIcon(list); //버튼 모양 세팅
		list.setRolloverIcon(rollistIcon);
		list.setBounds(20, 170, 150, 50);
		
		//예매
		ticket=new JButton(nomalticketIcon);
		setIcon(ticket); //버튼 모양 세팅
		ticket.setRolloverIcon(rolticketIcon);
		ticket.setBounds(175, 170, 150, 50);
		
		//이벤트
		event=new JButton(nomaleventIcon);
		setIcon(event); //버튼 모양 세팅
		event.setRolloverIcon(roleventIcon);
		event.setBounds(330, 170, 150, 50);
		
		//채팅
		chat=new JButton(nomalchatIcon);
		setIcon(chat); //버튼 모양 세팅
		chat.setRolloverIcon(rolchatIcon);
		chat.setBounds(485, 170, 150, 50);
		
	}
	
	//버튼 모양 세팅
	private void setIcon (JButton A) 
	{
		A.setFocusPainted(false);
		A.setBorderPainted(false);
		A.setContentAreaFilled(false);
	}
}
