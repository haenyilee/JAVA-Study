import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainForm extends JFrame implements ActionListener{
	
	JMenuBar bar=new JMenuBar();
	JMenuItem open=new JMenuItem("����");
	JMenuItem save=new JMenuItem("����");	
	JMenuItem copy=new JMenuItem("����");	
	JMenuItem close=new JMenuItem("����");
	
	// ������ => Ŭ���� ����
	public MainForm() {
		JMenu file=new JMenu("����");
		file.add(open);
		file.add(save);
		file.add(copy);
		file.add(close);
		bar.add(file);
		
		// �����쿡 �ø���
		setJMenuBar(bar);
		
		// ������ ũ�� ����
		setSize(1024,768);
		setVisible(true); //�����츦 �����ش�
		
		open.addActionListener(this);
		save.addActionListener(this);
		copy.addActionListener(this);
		close.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainForm();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==open) {
			JOptionPane.showMessageDialog(this, "���� ���� ����");
		}
		else if(e.getSource()==save) {
			JOptionPane.showMessageDialog(this, "���� ���� ����");
		}
		else if(e.getSource()== copy) {
			JOptionPane.showMessageDialog(this, "���� ���� ����");
		}
		else if(e.getSource()==close) {
			JOptionPane.showMessageDialog(this, "���� �ݱ� ����");
		}
	}

}
