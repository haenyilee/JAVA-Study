package 자바프로젝트;
import java.awt.*;
import javax.swing.*;

public class ControlPanel extends JPanel{
	
	CardLayout card=new CardLayout();
	
	ListForm lf=new ListForm();
	TicketForm tf=new TicketForm();
	EventForm ef=new EventForm();
	
	public ControlPanel()
	{
		setLayout(card);
		add("LF",lf);
		add("TF",tf);
		add("EF",ef);
	}
}
