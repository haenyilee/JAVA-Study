package com.sist.io;
import java.util.*;
import java.io.*;
// 파일업로드(파일 COPY)
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class 업로드copy extends JFrame implements ActionListener{
	JTextField tf = new JTextField(25);
	JButton b = new JButton("파일선택");
	
	public 업로드copy() {
		JPanel p = new JPanel();
		p.add(tf);
		p.add(b);
		add("Center",p);
		setSize(450,250);
		setVisible(true);
		b.addActionListener(this);
	}

	public static void main(String[] args) {
		// 생성자 호출
		new 업로드copy();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) // b버튼을 클릭했을 때!
		{
			JFileChooser jc= new JFileChooser();
			if(jc.showOpenDialog(this)==jc.APPROVE_OPTION)
			{
				tf.setText(jc.getSelectedFile().getPath());
				
				// 파일 카피
				try
				{
					FileInputStream fis= new FileInputStream(tf.getText());
					FileOutputStream fos = new FileOutputStream("c:\\upload\\"+jc.getSelectedFile().getName());
					
					int i=0;
					byte[] buffer = new byte[1024];
					while((i=fis.read(buffer, 0, 1024))!=-1)
					{
						fos.write(buffer,0,i);
						// i => 읽은 바이트 수 
					}
					fis.close();
					fos.close();
					JOptionPane.showMessageDialog(this, "파일 업로드 완료");
					
				}catch (Exception e1) {
				}
			}
		}
			
		
	}

}
