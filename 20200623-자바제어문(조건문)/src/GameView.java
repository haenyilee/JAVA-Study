import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel{
	Image back,air;
	int x=15,y=15; // ����� ��ǥ ����
	
	public GameView()
	{
		// �̹����� ������ �´�
		back=Toolkit.
				getDefaultToolkit().
				getImage("C:\\javaDev\\back.png");
		air=Toolkit.
				getDefaultToolkit().
				getImage("C:\\javaDev\\air.png");			
	}

	// �̹��� ���
	public void paint(Graphics g)
	{
		g.drawImage(back, 0, 0, getWidth(), getHeight(),this);
		g.drawImage(air, x, y, 80, 50, this);
	}
}
