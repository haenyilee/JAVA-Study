package �ڹ�������Ʈ;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainButton extends JPanel{
	ImageIcon nomalLoginIcon = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\login1.jpg");
	ImageIcon rolLoginIcon = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\login2.jpg");
	
	ImageIcon nomalJoinIcon = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\join1.jpg");
	ImageIcon rolJoinIcon = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\join2.jpg");
	
	ImageIcon nomalSerchIcon = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\������1.jpg");
	ImageIcon rolSerchIcon = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\������2.jpg");
	
	ImageIcon nomallistIcon = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\��ȭ.jpg");
	ImageIcon rollistIcon = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\��ȭ1.jpg");
	
	ImageIcon nomalticketIcon = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\����.jpg");
	ImageIcon rolticketIcon = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\����1.jpg");
	
	ImageIcon nomaleventIcon = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\�̺�Ʈ.jpg");
	ImageIcon roleventIcon = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\�̺�Ʈ1.jpg");
	
	ImageIcon nomalchatIcon = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\ä��.jpg");
	ImageIcon rolchatIcon = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\ä��1.jpg");
	
	
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
		//�α��ι�ư
		login=new JButton(nomalLoginIcon); 
		setIcon(login); //��ư ��� ����
		login.setRolloverIcon(rolLoginIcon);
		login.setBounds(1350, 15, 100, 30); 
		
		//ȸ�����Թ�ư
		join=new JButton(nomalJoinIcon);
		setIcon(join); //��ư ��� ����
		join.setRolloverIcon(rolJoinIcon);
		join.setBounds(1450, 15, 100, 30);
		
		//�˻��ڽ� 
		tf_search=new JTextField();
		tf_search.setBounds(1240, 180, 300, 40);
		
		//�˻���ư
		search=new JButton(nomalSerchIcon);
		setIcon(search); //��ư ��� ����
		search.setRolloverIcon(rolSerchIcon);
		search.setBounds(1510, 173, 100, 50);
		
		//��ȭ��
		list=new JButton(nomallistIcon);
		setIcon(list); //��ư ��� ����
		list.setRolloverIcon(rollistIcon);
		list.setBounds(20, 170, 150, 50);
		
		//����
		ticket=new JButton(nomalticketIcon);
		setIcon(ticket); //��ư ��� ����
		ticket.setRolloverIcon(rolticketIcon);
		ticket.setBounds(175, 170, 150, 50);
		
		//�̺�Ʈ
		event=new JButton(nomaleventIcon);
		setIcon(event); //��ư ��� ����
		event.setRolloverIcon(roleventIcon);
		event.setBounds(330, 170, 150, 50);
		
		//ä��
		chat=new JButton(nomalchatIcon);
		setIcon(chat); //��ư ��� ����
		chat.setRolloverIcon(rolchatIcon);
		chat.setBounds(485, 170, 150, 50);
		
	}
	
	//��ư ��� ����
	private void setIcon (JButton A) 
	{
		A.setFocusPainted(false);
		A.setBorderPainted(false);
		A.setContentAreaFilled(false);
	}
}
