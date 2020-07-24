// 로그인 처리
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;


public class 문자열3 extends JFrame implements ActionListener{
	
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	JLabel poster=new JLabel();
	
	final String id="haeni";
	final String pw="1234";
	
	
	public 문자열3()
	{
		la1=new JLabel("ID");
		la2=new JLabel("PW");
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("로그인");
		b2=new JButton("취소");
		
		setLayout(null);
		
		la1.setBounds(10,15,30,30);
		           // 꼭지점 하나씩 위치 지정
		tf.setBounds(45,15,150,30);
		la2.setBounds(10,50,30,30);
		pf.setBounds(45,50,150,30);
		

		
		JPanel p=new JPanel();
		p.add(b1);p.add(b2);
		p.setBounds(10,90,195,35);
		
		add(la1);add(tf);
		add(la2);add(pf);
		add(p);
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1.addActionListener(this); // 로그인 눌렀을때 ==> id랑 pw같냐고 물어봐야함
		b2.addActionListener(this); // 취소버튼 눌렀을 때 ==> 윈도우 종료
		
		
		
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new 문자열3();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			String id=tf.getText();
			if(id.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this, "ID를 입력하세요!!");
				tf.requestFocus();
				return;
			}
			
			String pwd=String.valueOf(pf.getPassword());
			
				if(pwd.trim().length()<1)
				{
					JOptionPane.showMessageDialog(this, "PASSWORD를 입력하세요!!");
					pf.requestFocus();
					return;
				}
				
				// 입력이 완료
				// 처리 
				if(id.equals(id)) {
					if(pwd.equals(pwd)) {
						JOptionPane.showMessageDialog(this, id+"님이 로그인되었습니다.");
					}
					else {
						JOptionPane.showMessageDialog(this, "PW가 일치하지 않습니다.");
						pf.setText("");
						pf.requestFocus();
					}
				}
				else {
					JOptionPane.showMessageDialog(this, "ID가 존재하지 않습니다.");
					tf.setText("");
					pf.setText("");
					tf.requestFocus();
				}
				
				
				
				
				
			
		}
		else if(e.getSource()==b2) {
			System.exit(0); // 정상종료
		}
		
	}

}
