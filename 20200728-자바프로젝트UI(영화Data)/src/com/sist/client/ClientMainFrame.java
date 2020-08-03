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

import javax.print.DocFlavor.STRING;
import javax.swing.*; // ������â, ���̾�α�, ��ư ���� ����� ���� ��Ű��

import com.sist.common.Function;

import java.awt.*; // color , layout

import java.awt.event.*; // �������̽�

import java.io.*;
import java.util.*;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.net.*;
/*
 * 1. ����ڰ� ������ ��û
 * 2. �������� ������ ������ �޾Ƽ� ���(������) => �ڵ�ȭ ó��
 * 
 */

																	// �г��� ���콺������
public class ClientMainFrame extends JFrame implements ActionListener,MouseListener,Runnable{
	
	JLabel title=new JLabel("��ȭ ���� & ��õ ���α׷�", JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	DetailForm df=new DetailForm();
	Login login = new Login();
	
	ControllPanel cp;
	
	
	// ���� ������ ��ﾲ
	int curpage=1;
	int totalpage=16;
	
	// ��Ʈ��ũ ���� ���α׷�
	Socket s;// ���� ���
	OutputStream out; // ������ ��û�� ���� => ����? => �α���, ä�� ���ڿ�, ����...
	BufferedReader in; // �����κ��� �� �޾ƿ��� Ŭ���� => ������
	

	public ClientMainFrame(){
		
		// ���� ���ִ� â(this)�� ��� ������
		cp=new ControllPanel(this); 
		
		// Ÿ��Ʋ �κ� �г� ��ġ
		title.setFont(new Font("����ü",Font.BOLD,55));
		title.setOpaque(false); // ��������
		// title.setBackground(Color.magenta); // �� ��� ���� ����
		setLayout(null);
		title.setBounds(10,15,1570,100);
		add(title);
		
		// �޴� �г� ��ġ
		mf.setBounds(10,120,100,300);
		add(mf);
		
		// ä�� �г� ��ġ
		cf.setBounds(115,760,1465,200);
		add(cf);
		
		// ��Ʈ���г� ��ġ
		cp.setBounds(115,120,1465,635);
		add(cp);
		
		
	
		// ������ ũ�� ����
		// setLayout(null); // JFrame(BorderLayout) ����� ���Ƿ� ��ü�ϰڴ�! null => ������� �ʰڴ�
		setSize(1600,1000);
		
		// ������ ȭ�� �����ֱ�
		setVisible(true);
		
		// X��ư Ŭ�� �� ���� => �̰� ���ϸ� ����⸸ ��
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); 
		
		// ��ư ������ ó���ϱ�
		mf.b1.addActionListener(this); // �޴�-Ȩ��ư
		mf.b2.addActionListener(this); // �޴�-��ȭã��
		mf.b5.addActionListener(this); // �޴�-����
		
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
		
		// �α��� ó��
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		
		// ����
		mf.b7.addActionListener(this);
		
		// ä��
		cf.tf.addActionListener(this);
		
		
		/*
		for(int i=0;i<10;i++) {
			cp.ff.mc[i].addMouseListener(this);
		}
		*/
	
	
	
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
			//else {
				cp.lf.movieFindData(ss);
			}
			
			else if(e.getSource()==login.b1)
			{
				String id = login.tf1.getText();
				if(id.length()<1) // id�� �Է����� ���� ���
				{
					JOptionPane.showMessageDialog(this, "���̵� �Է��ϼ���");
					login.tf1.requestFocus();
					return;
				}
				String name=login.tf2.getText();
				if(name.length()<1) // id�� �Է����� ���� ���
				{
					JOptionPane.showMessageDialog(this, "��ȭ�� �Է��ϼ���");
					login.tf2.requestFocus();
					return;
				}
				String sex="";
				if(login.rb1.isSelected())
					sex="����";
				else
					sex="����";
				
				// ������ �Է¹��� ������ ����
				try
				{
					// ����
					s=new Socket("localhost",3355);
					// �ۼ��� ��ġ Ȯ��
					in =new BufferedReader(new InputStreamReader(s.getInputStream()));
					out=s.getOutputStream();
					
					// �α��� ��û(������ ���۵Ǵ� �κ�)
					out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
					
				}catch (Exception e2) {}
				// �������� �����ϴ� �����͸� �о ���
				new Thread(this).start();
				// run�� ��ġ Ȯ��=> �ڽ��� Ŭ���� �ȿ� �����ϱ� ������ (this)�ۼ�
			}
			else if(e.getSource()==login.b2)
			{
				System.exit(0);
			}
		
			else if(e.getSource()==cf.tf)
			{
				String msg=cf.tf.getText();
				if(msg.length()<1)
					return;
				
				// �����͸� ������ ����
				try
				{
					out.write((msg+"\n").getBytes());
				}catch (Exception e1) {}
				cf.tf.setText("");
			}
			else if(e.getSource()==mf.b7)
			{
				try {
					out.write((Function.EXIT+"\n").getBytes());
					
				} catch (Exception e2) {}
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
					cp.df.setVisible(true);
					// cp.card.show(cp,"DF");
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


	@Override
	public void run() {
		// �������� ������ �����͸� �޾Ƽ� ó���ϴ� �κ�
		try {
			while(true)
			{
				String msg=in.readLine();
				System.out.println("server=>"+msg);
				StringTokenizer st = new StringTokenizer(msg,"|");
				int protocol = Integer.parseInt(st.nextToken());
				
				switch (protocol) 
				{
				case Function.MYLOG:
				{
					setTitle(st.nextToken());
					login.setVisible(false);// �α��� â
					setVisible(true); // ��ȭâ(Main)
				}
				break;
				case Function.LOGIN:
				{
					// ���̺� ��¸� �ϸ� ����
					String[] data= {
							st.nextToken(), // id
							st.nextToken(), // name
							st.nextToken()  // sex
					};
					cf.model.addRow(data);
				}
				break;
				case Function.CHAT:
				{
					cf.ta.append(st.nextToken()+"\n");
				}
				break;
				case Function.EXIT:
				{
					String id=st.nextToken();
					for(int i=0;i<cf.model.getRowCount();i++)
					{
						String mid = cf.model.getValueAt(i, 0).toString();
						if(id.equals(mid))
						{
							cf.model.removeRow(i);
							break;
						}
					}
				}
				break;
				case Function.MYEXIT:
				{
					dispose(); // ������ �޸� ����
					System.exit(0);
				}
				break;

				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
