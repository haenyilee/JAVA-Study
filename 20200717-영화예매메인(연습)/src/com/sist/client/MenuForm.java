/*
 * <�������� : �޴��г�>
 * 1. �ʿ��� ��Ű�� ��������
 * 2. ��ư ���� ����?
 * 3. ��ư �ʱ�ȭ => �����ڿ���
 * 4. ��ư ��� ��ġ ���� => �����ڿ���
 */
package com.sist.client;
import java.awt.*;
import javax.swing.*;

public class MenuForm extends JPanel{
	JButton b1,b2,b3,b4,b5,b6;
	JTextField tf=new JTextField();
	
	
	
	public MenuForm() {
		
		// setBackground(Color.orange); // ���̾ƿ� Ȯ�ο�(�ӽ�)
		b1=new JButton("��ȭ");
		b2=new JButton("����");
		b3=new JButton("�̺�Ʈ");
		
		JPanel p= new JPanel();
		p.setLayout(new GridLayout(1,3,5,5)); // (�¿찣��,���Ʒ�����)
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		setLayout(null);
		p.setBounds(10,15,600,35);
		add(p);
		
		tf.setBounds(1100,15,200,35);
		add(tf);
		
		b4=new JButton("�˻�");
		b4.setBounds(1305,15,100,35);
		add(b4);
		
		b5=new JButton("ê��");
		b5.setBounds(1470,15,50,35);
		add(b5);
		
		
		b6=new JButton("����ī�װ�");
		b6.setBounds(10,55,1520,60);
		b6.setBackground(Color.yellow);
		add(b6);
		
	}
	
	

}
