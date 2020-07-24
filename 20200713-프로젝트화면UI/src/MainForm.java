/*
 	������
	 	= Container : Component�� ������ ��� ȭ�鿡 ���
	 		= 		      �� JFrame : ������â
	 		= �ܵ����� ����     �� JWindow : Ÿ��Ʋ�� ���� ������â
	 		= 			  �� JDialog : ������ ���� ������ â - modal(�ٸ� ���۽���Ұ�) / modeless(�ٸ����۽��డ��)
	 		= �ܵ� ���� �Ұ��� �� JPanel  
	 	
	 	= Component :  �� ���� ��ɸ� ������ ����
	 		= JLabel => �Ϲ� ���ڿ� ��� , �̹��� ���
	 		= ��ư
	 			= �Ϲݹ�ư
	 				JButton
	 			= ��۹�ư (Ŭ�������� ����� �޶����� ��ư)
	 				üũ�ڽ� JCheckButton , ������ư JRadioButton
	 			= �޴�
	 		= �Է�â 
	 			= �����Է� : JTextField
	 			= ��й�ȣ : JPasswordField
	 			= �������Է� : JTextArea => �ڱ� �Ұ�, �������
	 			= �������Է� : JTextPan => ä�� (���پ� ����ũ��/��Ʈ ���� ������ ��)
	 		= ���â
	 			= ����â : JComboBox
	 			= ��ü ���� ��� : JList
	 			= JTree
	 			= JTable
	 		= ȭ�����
	 			= JTabbedPane
	 			= JSplit
	 			= JInteralFrame
	 			
	=============================================================================================
	�� javax.swing.*
	�� java.awt.*
	=============================================================================================
	 ��ġ(Layout) , ����� ���� ��ġ
	 	1. BorderLayout => 5����
	 		�� , �Ʒ� , ��� , ���� , ������
	 	2. FlowLayout
	 	3. GridLayout
	 	4. CardLayout
	 	5. ����� ���� =====> setBounds(10,20,800,900)
	 	
	 	====> ������Ʈ
	 		1. �α��� ===> �������� ����
	 		2. ȸ������
	 		------------------------ ������ �������
	 		3. ��� ���
	 		4. �󼼺���
	 		5. ���� , ��ٱ���
	 		6. ���������� , ������������
	 		7. ä��
	 		
 		
 */

import javax.swing.*;
import java.awt.*;
/*
 	 ���� ===> �����͸� ���߰� ����(����ȭ : private)
 	 	= �Ϲݺ��� => �⺻��
 	 	
 	 	= �迭    ��
 	 	 	   ��=> ��������
 	 	= Ŭ���� ��   
 	 	
 	 �޼ҵ� 	 ��
 	 	  	 ��=> �ٸ� Ŭ������ �����ϴ� ���� : public
 	 ������  	 ��
 */
public class MainForm extends JFrame{

	private CardLayout card = new CardLayout(); // ����Ŭ���� => ������ ������ ����
	
	// ȭ�� UI => ������ => �� �����ڿ��� �����? => ������ �� �ٷκ������ �ؼ�, �������ڸ��� ����Ǵ� �����ڿ� ����~!
	// ������ => �� ���� ȣ���� �����ϰ� ���۰� ���ÿ� ȣ���� �Ǵ� �޼ҵ�
	// �����ڴ� ��� Ŭ�������� ȣ���� �����ؾ� �Ѵ� => public�� ���� ���¿��� ��� Ŭ�������� ��� ����
	
	Login login=new Login();
	public MainForm()
	{
		// Layout ����
		setLayout(card);
		add("LOGIN",login);
		
		/*
		 	JFrame , JWindow , JDialog ==> Border Layout
		 	JPanel ==> FlowLayout
		 	
		 	===> ����� ���� ��� ===> setLayout(null)
		 */
		setBounds(400,60,1024,950);
		// setSize(1000,900);
		// setsize�� ���ʿ� �ٽ� �ٿ��� ȭ�� ���
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainForm();

	}

}
