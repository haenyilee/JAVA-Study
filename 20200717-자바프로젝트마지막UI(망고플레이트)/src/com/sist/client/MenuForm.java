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
	JButton b1,b2,b3,b4,b5,b6,b7;
	
	public MenuForm() {
		
		// setBackground(Color.orange); // ���̾ƿ� Ȯ�ο�(�ӽ�)
		b1=new JButton("Ȩ");
		b2=new JButton("������");
		b3=new JButton("��ŷ");
		b4=new JButton("��õ");
		b5=new JButton("����");
		b6=new JButton("����");
		b7=new JButton("����");
		
		setLayout(new GridLayout(7,1,5,5)); // (�¿찣��,���Ʒ�����)
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
	}
	
	

}
