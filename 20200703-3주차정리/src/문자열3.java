// �α��� ó��
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;


public class ���ڿ�3 extends JFrame implements ActionListener{
	
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	JLabel poster=new JLabel();
	
	final String id="haeni";
	final String pw="1234";
	
	
	public ���ڿ�3()
	{
		la1=new JLabel("ID");
		la2=new JLabel("PW");
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("�α���");
		b2=new JButton("���");
		
		setLayout(null);
		
		la1.setBounds(10,15,30,30);
		           // ������ �ϳ��� ��ġ ����
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
		
		b1.addActionListener(this); // �α��� �������� ==> id�� pw���İ� ���������
		b2.addActionListener(this); // ��ҹ�ư ������ �� ==> ������ ����
		
		
		
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ���ڿ�3();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			String id=tf.getText();
			if(id.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this, "ID�� �Է��ϼ���!!");
				tf.requestFocus();
				return;
			}
			
			String pwd=String.valueOf(pf.getPassword());
			
				if(pwd.trim().length()<1)
				{
					JOptionPane.showMessageDialog(this, "PASSWORD�� �Է��ϼ���!!");
					pf.requestFocus();
					return;
				}
				
				// �Է��� �Ϸ�
				// ó�� 
				if(id.equals(id)) {
					if(pwd.equals(pwd)) {
						JOptionPane.showMessageDialog(this, id+"���� �α��εǾ����ϴ�.");
					}
					else {
						JOptionPane.showMessageDialog(this, "PW�� ��ġ���� �ʽ��ϴ�.");
						pf.setText("");
						pf.requestFocus();
					}
				}
				else {
					JOptionPane.showMessageDialog(this, "ID�� �������� �ʽ��ϴ�.");
					tf.setText("");
					pf.setText("");
					tf.requestFocus();
				}
				
				
				
				
				
			
		}
		else if(e.getSource()==b2) {
			System.exit(0); // ��������
		}
		
	}

}
