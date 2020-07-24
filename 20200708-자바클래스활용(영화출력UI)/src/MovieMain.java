import java.util.*;
import java.awt.*;
import javax.swing.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.awt.event.*;
import java.net.*;

public class MovieMain extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5; // ��������� �ʱ�ȭ
	JLabel la=new JLabel(); // �׸����
	static MovieVO[] movies=new MovieVO[20];
	// MovieMain m=new MovieMain)()
	
	JPanel panel=new JPanel();
	
	
	// MovieMain�� �������Լ�(�ʱ�ȭ ���?) => (1) Ŭ���� �̸��� ���ƾ��� (2) �������� �����ϸ� �ȵȴ�(void���̸� �ȵ�)
	MovieMain(){
		b1=new JButton("����󿵿�ȭ");
		b2=new JButton("����������ȭ");
		b3=new JButton("�ڽ����ǽ�(�ְ�)");
		b4=new JButton("�ڽ����ǽ�(����)");
		b5=new JButton("�ڽ����ǽ�(����)");
		
		JPanel p=new JPanel();
		p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);
		add(p);
		setLayout(null);
		p.setBounds(10, 15, 1280, 35);
		
		panel.setBounds(10,60,1280,900);
		
		try {
			URL url=new URL("https://t1.daumcdn.net/movie/3651b17dc201e5b4ea6409b364f1e950a14b96a3");
			// URL url=new URL("https://t1.daumcdn.net/movie/3651b17dc201e5b4ea6409b364f1e950a14b96a3");
			// la.setIcon(new ImageIcon(getImage(new ImageIcon(url),200,200)));
		}catch (Exception ex) {
			// TODO: handle exception
			
		}
		add(panel);
		setSize(1300,1000);
		setVisible(true);
		
		try {
			
			movieData(1);
			imagePrint();
			
		}catch (Exception ex) {}
			// TODO: handle exception
			setVisible(true);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
		}

	
	Image getImage(ImageIcon ii,int w,int h)
    {
       Image dimg = ii.getImage().getScaledInstance(w, h,
               Image.SCALE_SMOOTH);
       return dimg;
    }

	
	void imagePrint() throws Exception {
		panel.setLayout(new GridLayout(4,5,8,8));
		for(MovieVO vo:movies) {
			URL url=new URL(vo.poster);
			panel.add(new JLabel(new ImageIcon(getImage(new ImageIcon(url), 250,280))));
		}
	}
	
	
	static void movieData(int no) throws Exception{
		
		String url="";
		switch(no) {
			case 1:
				url="https://movie.daum.net/premovie/released";
				break;
			case 2:
				url="https://movie.daum.net/premovie/scheduled";
				break;
			case 3:
				url="https://movie.daum.net/boxoffice/weekly";
				break;
			case 4:
				url="https://movie.daum.net/boxoffice/monthly";
				break;
			case 5:
				url="https://movie.daum.net/boxoffice/yearly";
				break;
		}
		/*
		 							<div class="info_movie">
		 								<span class="thumb_movie bg_noimage">
																																				<img src="//img1.daumcdn.net/thumb/C236x340/?fname=https://t1.daumcdn.net/movie/3986610f921d4371be92d6184bf75dc1c74d80e2" 
		 */
		Document doc=Jsoup.connect(url).get();
		Elements image=doc.select("div.info_movie span.thumb_movie img.img_g");
		for(int i=0;i<20;i++) {
			movies[i]=new MovieVO();
			String temp=image.get(i).attr("src");
			movies[i].poster=temp.substring(temp.indexOf("=")+1);
		}
		
	}
	
	
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMain();
		
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
		try {
			
			movieData(1);
			imagePrint();
			
		}catch (Exception ex) {}		
		}
		else if(e.getSource()==b2) {
			try {
				
				movieData(2);
				imagePrint();
				
			}catch (Exception ex) {}		
			
		}
		else if(e.getSource()==b3) {
			try {
				
				movieData(3);
				imagePrint();
				
			}catch (Exception ex) {}		
			
		}
		else if(e.getSource()==b4) {
			try {
				
				movieData(4);
				imagePrint();
				
			}catch (Exception ex) {}		
			
		}
		else if(e.getSource()==b5) {
			try {
				
				movieData(5);
				imagePrint();
				
			}catch (Exception ex) {}		
			
		}
		
	}

}
