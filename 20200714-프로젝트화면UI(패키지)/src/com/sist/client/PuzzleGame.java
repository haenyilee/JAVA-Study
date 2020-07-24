// ������ => ����
// GridLayout ==> �Ȱ��� ũ��� ������ ��� ����ϴ� ��(ex.���� ����)

package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
// 1. ������â => JFrame

public class PuzzleGame extends JFrame implements ActionListener{
	JButton b1,b2;
	
	// 2. 3�� 3�� ��ư 9��
	JButton[][] pan=new JButton[3][3];
	int[][] panCount=new int[3][3];
	
	int brow=0;
	int bcol=0;
	
	// 0~8 �ߺ����� �����߻��ϱ�
	public void getRand()
	{
		// �ߺ� ���� �������� ����
		int[] com=new int[9];
		
		// ���� �߻� �� ������ ����
		int su=0;
		
		// �ߺ� ���� Ȯ���ϴ� ��
		boolean bCheck=false;
		
		for(int i=0;i<9;i++)
		{
			// ���� �߻�
			bCheck=true;
			while(bCheck)
			{
				// 0~8 �߿��� �������� su������ ����
				su=(int)(Math.random()*9);
				bCheck=false;
				
				// ����� �����Ͱ� �ߺ��Ǿ����� Ȯ���ϱ�
				for(int j=0;j<i;j++)
				{
					// �迭�ȿ� ���� �� �ֳ�?
					if(su==com[j])
					{
						// ������ while�� �ٽ� ����
						bCheck=true;
						break;
						/*
						 	<�ݺ��� �� ���� ������>
						 	break
						 	continue
						 */
					}
				}
			}
			com[i]=su;
			
			panCount[i/3][i%3]=su;
			
			if(su==8)
			{
				brow=i/3;
				bcol=i%3;
			}
		}
	}
	
	
	// ��ġ�Լ�	
	public void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==brow && j==bcol)
				{
					pan[i][j].setText("");
					pan[i][j].setEnabled(false);
				}
				else
				{
					pan[i][j].setText(String.valueOf(panCount[i][j]+1));
					pan[i][j].setEnabled(true);
				}				
			}
		}
	}
	
	
	// ��ư Ŭ���ϸ� ó���ϱ�
	
	
	
	
	// 3. ������ => Ŭ������ �޸𸮿� ������ �� ���� ���� ȣ��Ǵ� �޼ҵ�
	public PuzzleGame()
	{
		// 4. ��ġ
		b1=new JButton("����");
		b2=new JButton("����");
		
		// 5. b1�̶� b2 ����
		JPanel p=new JPanel();
		p.add(b1);p.add(b2);
		add("South",p);
		
		
		// 6.�׸��巹�̾ƿ�
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(3,3,5,5));
		
		int k=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				pan[i][j]=new JButton(String.valueOf(k));
				pan[i][j].setFont(new Font("����ü",Font.BOLD,50));
				p2.add(pan[i][j]);
				pan[i][j].addActionListener(this);
				k++;	
			}
		}
		
		add("Center",p2);
		
		// ���� �߱� ���� getrand, display���
		getRand();
		display();
		
		setSize(350,400);
		setVisible(true);
		
		b1.addActionListener(this); // �̺�Ʈ ���

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 7. ������ ȣ���ϱ�
		new PuzzleGame();

	}
	
	// ���Ῡ�� Ȯ��
	public boolean isEnd()
	{
		int k=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(panCount[i][j]!=k)
					return false;
				k++;
			}
		}
		return true;
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			getRand();
			display();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(e.getSource()==pan[i][j])
				{
					panCount[brow][bcol]=panCount[i][j];
					panCount[i][j]=8;
					brow=i;
					bcol=j;
					if(isEnd())
					{
						JOptionPane.showMessageDialog(this,"Game Over!!");
						System.exit(0);
					}
					display();
				
				}
			}
		}
		
	}

}
