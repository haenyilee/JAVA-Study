import java.awt.*;
import javax.swing.*;

public class MainView extends JPanel{
	Image back;
	// Image�� ���� �ʱ�ȭ
	public MainView()
	{
		back=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\back.png");
	}
	
	
	// �޼ҵ� ���뺯�� (�������̵�)
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
	}
	
	

}
