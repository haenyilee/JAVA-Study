package com.sist.io;
import java.util.*;
import java.io.*;
// ���Ͼ��ε�(���� COPY)
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ���ε�copy extends JFrame implements ActionListener{
	JTextField tf = new JTextField(25);
	JButton b = new JButton("���ϼ���");
	
	public ���ε�copy() {
		JPanel p = new JPanel();
		p.add(tf);
		p.add(b);
		add("Center",p);
		setSize(450,250);
		setVisible(true);
		b.addActionListener(this);
	}

	public static void main(String[] args) {
		// ������ ȣ��
		new ���ε�copy();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) // b��ư�� Ŭ������ ��!
		{
			JFileChooser jc= new JFileChooser();
			if(jc.showOpenDialog(this)==jc.APPROVE_OPTION)
			{
				tf.setText(jc.getSelectedFile().getPath());
				
				// ���� ī��
				try
				{
					FileInputStream fis= new FileInputStream(tf.getText());
					FileOutputStream fos = new FileOutputStream("c:\\upload\\"+jc.getSelectedFile().getName());
					
					int i=0;
					byte[] buffer = new byte[1024];
					while((i=fis.read(buffer, 0, 1024))!=-1)
					{
						fos.write(buffer,0,i);
						// i => ���� ����Ʈ �� 
					}
					fis.close();
					fos.close();
					JOptionPane.showMessageDialog(this, "���� ���ε� �Ϸ�");
					
				}catch (Exception e1) {
				}
			}
		}
			
		
	}

}
