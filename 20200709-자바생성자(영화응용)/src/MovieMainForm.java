import javax.swing.*; // ������ ���� Ŭ����
import java.awt.*; // ���̾ƿ�(ȭ���ġ)
import java.awt.event.*; // ��ư, �ؽ�Ʈ�� ���� => ����(�̺�Ʈ)
// �ڹٿ��� �����ϴ� �������� ��� ����� ����Ѵ�.
// �ڹٿ��� ����� �� ���� ���� (���� ���)
public class MovieMainForm extends JFrame implements ActionListener{
	JMenuBar bar=new JMenuBar();
	JMenuItem home=new JMenuItem("HOME");
	JMenuItem find=new JMenuItem("ã��");
	JMenuItem exit=new JMenuItem("����");
	
	// �������ڸ��� ==> �����츦 �����ش� ==> ������

		// ī�巹�̾ƿ� : ȭ���� �ڿ� ����ٰ� ���� ��û�ϸ� ��ġ�� �ٲ��ִ� ���?
		CardLayout card=new CardLayout();
		MovieList ml=new MovieList();
		MovieDetail md=new MovieDetail();
		MovieFind mf=new MovieFind();
	
	MovieMainForm(){
		// �޴� ����
		JMenu menu=new JMenu("�޴�");
		menu.add(home);
		menu.add(find);
		menu.addSeparator(); // ���м� ����
		menu.add(exit);
		bar.add(menu);
		
		// �����쿡 ����
		setJMenuBar(bar);
		
		// ���̾ƿ� ����
		setLayout(card);
		add("ML",ml); // �� ó�� �����ؾ� �ϴ� ȭ�� ���� ����!
		add("MD",md);
		add("MF",mf);



		
		// ������ ũ�� ����
		setSize(1300,1000);
		
		// ������ �����ش�
		setVisible(true);
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// �������Լ��� �ݵ�� "new ������();" �������� ȣ���ؾ� �Ѵ�
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMainForm();

	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==home)
		{
			card.show(getContentPane(), "ML");
		}
		else if(e.getSource()==find)
		{
			card.show(getContentPane(), "MF");
		}
		else if(e.getSource()==exit)
		{
			System.exit(0);
		}

	}
	

}
