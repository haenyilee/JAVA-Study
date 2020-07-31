package �ڹ�������Ʈ;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainPage extends JPanel implements ActionListener {
	//���ȭ��
	private Image back;
	
	//����
	ImageIcon title = new ImageIcon("C:\\Users\\SIST\\Desktop\\������Ʈ\\title.jpg");
	JLabel imageTitle = new JLabel(title); 
	
	//��ư ��ü
	MainButton btn = new MainButton();
	
	//��Ʈ���г�
	ControlPanel cp=new ControlPanel();
	
	//ä��
	ChatForm cf=new ChatForm();
	
	public MainPage()
	{
		//����ȭ��
		back=Toolkit.getDefaultToolkit().getImage("C:\\Users\\SIST\\Desktop\\������Ʈ\\white.jpg");
		
		//����� ���� ��ġ
		setLayout(null); 
		
		//����
		imageTitle.setBounds(0, 50, 1600, 130);
		add(imageTitle);
		
		//��ư
		add(btn.login);
		add(btn.join);
		add(btn.tf_search); //�˻� �ؽ�Ʈ �ڽ�
		add(btn.search);	//�˻�
		
		add(btn.list);
		add(btn.ticket);
		add(btn.event);
		add(btn.chat);
		
        //card
		cp.setBounds(30, 230, 1530, 730);
		add(cp);

		btn.list.addActionListener(this);
		btn.ticket.addActionListener(this);
		btn.event.addActionListener(this);
		btn.chat.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn.list)
		{
			cp.card.show(cp, "LF");
		}
		
		else if(e.getSource()==btn.ticket) 
		{
			cp.card.show(cp, "TF");
		}
		
		else if(e.getSource()==btn.event)
		{
			cp.card.show(cp, "EF");
		}
		
		else if(e.getSource()==btn.chat)
		{
			cf.setVisible(true);
		}
		
		
		
	}
	
	
	
	
	
	protected void paintComponent(Graphics g) {
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
	}
}
