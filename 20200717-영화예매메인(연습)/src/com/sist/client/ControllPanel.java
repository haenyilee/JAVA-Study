/*
 * <�����â : ��ư Ŭ���� ������ ȭ�� �ٲ��ִ� �г�>
 * 1. �г� ���� �г� �ø���? (������ ���� �������� ���ø� : ������ �ϳ��� �г� ������ �� �� ���� : �г� ���� �гε� ������ �� �� ����)
 * 2.card,listform,detailform ����?
 * 
 */

package com.sist.client;

import java.awt.*;
import java.awt.Color;
import javax.swing.*;


public class ControllPanel extends JPanel { // JFrame�� �ƴ϶� JPanel ���
	
	JPanel p=new JPanel();
	
	
	public ControllPanel() {
		p.setBounds(15,300,1000,500);
		add(p);
		p.setBackground(Color.magenta);
		
	}

}
