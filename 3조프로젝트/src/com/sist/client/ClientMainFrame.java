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

																	// �г��� ���콺������
public class ClientMainFrame extends JFrame implements ActionListener,MouseListener{
	
	JLabel title=new JLabel("��ȭ ���� & ��õ ���α׷�", JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControllPanel cp;
	
	
	// ���� ������ ��ﾲ
	int curpage=1;
	int totalpage=16;

	public ClientMainFrame(){
		
		// ���� ���ִ� â(this)�� ��� ������
		cp=new ControllPanel(this); 
		
		// Ÿ��Ʋ �κ� �г� ��ġ
		title.setFont(new Font("����ü",Font.BOLD,55));
		title.setOpaque(false); // ��������
		// title.setBackground(Color.magenta); // �� ��� ���� ����
		title.setBounds(10,15,1570,100);
		add(title);
		
		// �޴� �г� ��ġ
		mf.setBounds(10,120,100,400);
		add(mf);
		
		// ä�� �г� ��ġ
		cf.setBounds(115,760,1465,200);
		add(cf);
		
		// ��Ʈ���г� ��ġ
		cp.setBounds(115,120,1465,600);
		add(cp);
		
		
	
		// ������ ũ�� ����
		setLayout(null); // JFrame(BorderLayout) ����� ���Ƿ� ��ü�ϰڴ�! null => ������� �ʰڴ�
		setSize(1600,1000);
		
		// ������ ȭ�� �����ֱ�
		setVisible(true);
		
		// X��ư Ŭ�� �� ���� => �̰� ���ϸ� ����⸸ ��
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		// ��ư ������ ó���ϱ�
		mf.b1.addActionListener(this); // �޴�-Ȩ��ư
		mf.b2.addActionListener(this); // �޴�-��ȭã��
		mf.b5.addActionListener(this); // �޴�-����
		
		mf.b4.addActionListener(this); // �޴� - ���
		
		cp.ff.b1.addActionListener(this); // ��Ʈ���г� - ����
		cp.ff.b2.addActionListener(this); // ��Ʈ���г� - ����
		
		cp.df.b2.addActionListener(this); // ��������- �������		
		
		cp.lf.b1.addActionListener(this); // ����Ʈ��
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.b6.addActionListener(this); // ����Ʈ�� - �˻���ư
		cp.lf.tf.addActionListener(this); // ����Ʈ�� - �˻�â : ����ġ�� �˻��Ǵ� ��� �߰�
		
		// ���
		cp.dlf.b1.addActionListener(this); // ���ø���
		cp.dlf.b2.addActionListener(this); // HBO
		cp.dlf.b3.addActionListener(this); // Amazon Prime
		cp.dlf.b4.addActionListener(this); // DISNEY+
		cp.dlf.b5.addActionListener(this); // �˻���ư
		cp.dlf.tf.addActionListener(this); // �˻�â : ����ġ�� �˻��Ǵ� ��� �߰�
		
		
		
		
		
		
		for(int i=0;i<10;i++) {
			cp.ff.mc[i].addMouseListener(this);
		}
	
	
	
	}
	
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		// ȣ��� ������
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ClientMainFrame();
		

	}
	public static Image getImage(ImageIcon ii,int w,int h)
	    {
	    	Image dimg = ii.getImage().getScaledInstance(w, h,
	    	        Image.SCALE_SMOOTH);
	    	return dimg;
	    }


	@Override
	public void actionPerformed(ActionEvent e) {
		
		// cp:��Ʈ�� �г� , mf:movieForm , b1:Ȩ��ư : ���� movieform�� �������� ���� ������ ���ο� ������ â�� ���ܹ����� ������
		if(e.getSource()==mf.b1) { 
			cp.card.show(cp,"FF"); // cp�� ����Ŭ����, cp���� FF�� �����~!
		}
		else if(e.getSource()==mf.b2){
			cp.card.show(cp,"LF");
		}
		else if(e.getSource()==mf.b5){
			cp.card.show(cp,"NF");
		}
		
		// ��� â���� �Ѿ��
		else if(e.getSource()==mf.b4) {
			cp.card.show(cp, "DLF");
		}
		
		
		// ������� 
		else if(e.getSource()==cp.df.b2){
			cp.card.show(cp,"FF");
		}
		// ������ư
		else if(e.getSource()==cp.ff.b1) {
			if(curpage>1)
			{
				curpage--;
				cp.ff.p.removeAll(); // jpanel�� ��� ����� ����
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate(); // jpanel�� ���� ������� ���ġ
			}
		}
		// ������ư ��������
		else if(e.getSource()==cp.ff.b2) {
			if(curpage<totalpage)
			{
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
			
			
		}
		else if(e.getSource()==cp.lf.b1)
		{
			cp.lf.movieAllData(1);
		}
		else if(e.getSource()==cp.lf.b2)
		{
			cp.lf.movieAllData(2);
		}
		else if(e.getSource()==cp.lf.b3)
		{
			cp.lf.movieAllData(3);
		}
		else if(e.getSource()==cp.lf.b4)
		{
			cp.lf.movieAllData(4);
		}
		else if(e.getSource()==cp.lf.b5)
		{
			cp.lf.movieAllData(5);
		}
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf)
		{
			//1. �Էµ� �� �б�
			String ss= cp.lf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this, "�˻�� �Է����ּ���");
				cp.lf.tf.requestFocus(); // Ŀ�� �����̰� ���ֱ�
				return; // �޼ҵ� ����
			}
			else {
				cp.lf.movieFindData(ss);
			}
			
		}
		
		
		// ��� ��۱����� �Ѿ��
		else if(e.getSource()==cp.dlf.b1)
		{
			cp.dlf.dramaAllData(1);
		}
		else if(e.getSource()==cp.dlf.b2)
		{
			cp.dlf.dramaAllData(2);
		}
		else if(e.getSource()==cp.dlf.b3)
		{
			cp.dlf.dramaAllData(3);
		}
		else if(e.getSource()==cp.dlf.b4)
		{
			cp.dlf.dramaAllData(4);
		}
		
		else if(e.getSource()==cp.dlf.b5 || e.getSource()==cp.dlf.tf)
		{
			//1. �Էµ� �� �б�
			String ss= cp.dlf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this, "�˻�� �Է����ּ���");
				cp.dlf.tf.requestFocus(); // Ŀ�� �����̰� ���ֱ�
				return; // �޼ҵ� ����
			}
			else {
				cp.dlf.dramaFindData(ss);
			}
			
		}
		
		
		
		
		
	}


	@Override
	public void mouseClicked(MouseEvent e) 
	{
		for(int i=0;i<10;i++) 
		{
			if(e.getSource()==cp.ff.mc[i]) 
			{
				if(e.getClickCount()==2)
				{
					int a=(i+1)+((curpage*10)-10);
					// JOptionPane.showMessageDialog(this, "mno="+a);
					cp.df.detailPrint(a);
					cp.card.show(cp,"DF");
					break;
				}
			}
		}
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
