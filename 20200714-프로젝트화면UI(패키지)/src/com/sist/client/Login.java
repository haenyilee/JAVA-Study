package com.sist.client;
import javax.swing.*;
import java.awt.*;


public class Login extends JPanel {
	
// ��Ų
	
	// private�� �� ������? �ٸ� ������ �ҷ� �� �ʿ� ���...
	private Image back;
	private JLabel la1,la2;
	
	// Login
	// private�� �� �� ������? �ٸ� ������ �ҷ� ����ؼ�...�ܼ� ��ư�̶� �������� NO!... ���� ����ȭ�� �ʿ䰡 ����
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	
	// MainForm
	public Login()
	{
		// �̹��� ���� �б�
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
		
		setLayout(null);
		
		la1=new JLabel("���̵�", JLabel.RIGHT);
		la1.setBounds(745,775,80,30);
		tf=new JTextField();
		tf.setBounds(830,775,150,30);
		
		add(la1);add(tf);
		
		la2=new JLabel("��й�ȣ", JLabel.RIGHT);
		la2.setBounds(745,810,80,30);
		pf=new JPasswordField();
		pf.setBounds(830,810,150,30);
		
		add(la2);add(pf);
		
		b1=new JButton("�α���");
		b2=new JButton("ȸ������");
		JPanel p=new JPanel(); // ��ư�� ��� �ִ� ��ǥ ��Ⱑ ����, �г� ����� �� �ȿ� ��ư �ִ� ����
		p.setBounds(745,850,320,35);
		p.add(b1);
		p.setOpaque(false); // �г� �� ���� �������� �ٲ�
		p.add(b2);
		add(p);
	}
	
	@Override
	public void paintComponent(Graphics g) // protected�� ����
	{
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
	}

}
