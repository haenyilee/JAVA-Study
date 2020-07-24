import java.awt.*;
import javax.swing.*;

public class MainView extends JPanel{
	Image back;
	// Image에 대한 초기화
	public MainView()
	{
		back=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\back.png");
	}
	
	
	// 메소드 내용변경 (오버라이딩)
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
	}
	
	

}
