import javax.swing.*;
/* <������ ������ ����> : ���
  	�ִ� �״�� => ����
  	class A extends JFrame
*/

/*
 	<���� �Ұ�> : ���԰���
 	class A
 	{
 		JFrame f= new JFrame();
 	}
 */
public class MainWindow extends JFrame {
	// �������ڸ��� => �����츦 ����
	// ������
	public MainWindow()
	{
		// ������ ȭ�� ����
		setSize(800, 600); 		// JFrame�� ������ �ִ� �Լ� => �޼ҵ� => ���
		setVisible(true);

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ȣ��
		new MainWindow();

	}

}
