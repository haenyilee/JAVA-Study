package 자바프로젝트;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {
	
	MainPage mainpage=new MainPage();

	
	public MainFrame()
	{
		add(mainpage);
		
		setSize(1600,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //상수 3
		
		
	}
	
	
	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new MainFrame();
	}

	

}
