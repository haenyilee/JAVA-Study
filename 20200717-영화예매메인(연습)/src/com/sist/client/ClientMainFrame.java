package com.sist.client;
/*
 * <������ ������ ��>
 *  1. ������ => JFrame ���
 *  2. ������ ���õ� Ŭ������ �о�´�.
 *  3. ��ġ�ϴ� ��Ű�� �ҷ�����
 *  4. ��ư ó�� ���� ����� �ϴ� ��Ű�� �ҷ�����
 *  5. ������ ũ�� ���� : �����ڿ��� ���
 *  6. ������ ũ�� ����
 *  7. â ����ǵ��� ����
 *  8. setlayout ������� �ʰڴٰ� ����
 *  9. Ŭ������ Ÿ��Ʋ �� �����
 *  10. Ÿ��Ʋ �� ��Ʈ ����
 *  11. Ÿ��Ʋ �� ũ�� �� ��ġ ����
 *  12. Ÿ��Ʋ �� ���
 *  13. �޴� �г� ��ġ
 *  14. ä�� �г� ��ġ
 *  15. ��Ʈ�� �г� ��ġ
 *  16.b1,b2 ��ư ������ ó���ϴ� �������̽� �ޱ�
 * 
 *  
 */

import javax.swing.*; // ������â, ���̾�α�, ��ư ���� ����� ���� ��Ű��

import java.awt.*; // color , layout

import java.awt.event.*; // �������̽�

public class ClientMainFrame extends JFrame implements ActionListener{
	
	JLabel title=new JLabel("��ȭ ���� ����Ʈ", JLabel.CENTER);
	
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControllPanel cp = new ControllPanel();
	
	JButton b1=new JButton("�α���");
	JButton b2=new JButton("ȸ������");
	

	public ClientMainFrame(){
		
	// Ÿ��Ʋ �κ� �г� ��ġ
	title.setFont(new Font("����ü",Font.BOLD,70));
	// title.setOpaque(true); // ��������
	// title.setBackground(Color.magenta); // �� ��� ���� ����
	title.setBounds(250,15,1000,100);
	
	JPanel p=new JPanel();
	p.add(b1);
	p.add(b2);
	p.setBounds(1400,15,200,35);
	add(p);
	add(title);
	
	// �޴� �г� ��ġ
	mf.setBounds(20,130,1600,300);
	add(mf);
	
	// ä�� �г� ��ġ
	// cf.setBounds(115,760,1465,200);
	// add(cf);
	
	// ��Ʈ���г� ��ġ
	//cp.setBounds(15,300,1550,435);
	//add(cp);
	
	
	

	// ������ ũ�� ����
	setLayout(null); // JFrame(BorderLayout) ����� ���Ƿ� ��ü�ϰڴ�! null => ������� �ʰڴ�
	setSize(1600,1000);
	
	// ������ ȭ�� �����ֱ�
	setVisible(true);
	
	// X��ư Ŭ�� �� ���� => �̰� ���ϸ� ����⸸ ��
	setDefaultCloseOperation(EXIT_ON_CLOSE); 
	
	// ��ư ������ ó���ϱ�
	// mf.b1.addActionListener(this);
	// mf.b2.addActionListener(this);
	
	
	
	}
	
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		// ȣ��� ������
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
