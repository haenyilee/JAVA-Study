/*
	���ڿ� => �����ϴ� ����(String)
	�⺻�� => ����, �Ǽ�, ��, ����
	������ => ���� ���� ��Ұ� �ٸ� ���� �ְ� => ������ �ּ�
	=====
		= �迭 , Ŭ����
			1) ������
				String s="��������"; ==> ���� ���ȴ�.
				String s=new String("")
				
			2) �ֿ���
				���ڸ� ������ �� �ִ� ���(�޼ҵ�) ==> ���̺귯�� �ٽ�(�޼ҵ�)
				*** ������ ****
				������ ������� �ʴ´�!
				
				=> length() : ���� ����
				=> substring() : ���ڸ� �ڸ� ��
				
				��)
					String s="Hello Java";
					s.substring(0,5) => Hello
					s = ? = "Hello Java"
					
					s=s.substring(0,5);
					s="Hello"
					
				
				
			
			
 */

import javax.swing.*;
import java.awt.event.*;

public class ���ڿ� extends JFrame implements ActionListener{
	JTextField tf=new JTextField();
	JTextField tf1=new JTextField();
	public ���ڿ�()
	{
		add("North",tf);
		add("South",tf1);
		
		tf.setText(String.valueOf(20));
		setSize(350,300);
		setVisible(true);
		
		tf.addActionListener(this); // tf���� ���͸� ġ�� ���� ������ �ڵ����� ȣ��
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ���ڿ�();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf) // tf���� �Է� ==> ����
		{
			tf1.setText(tf.getText().toUpperCase()); 
			// tf1.setText(tf.getText().toLowerCase());
		}
	}

}
