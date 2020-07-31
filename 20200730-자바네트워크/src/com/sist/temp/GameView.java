package com.sist.temp;
import java.awt.*;
import javax.swing.*;

public class GameView extends JPanel{
	Image img;
	// int x=10,y=500;
	// 멀티쓰레드:5개 동시에
	HorseThread[] ht = new HorseThread[5];
	
	public GameView()
	{
		img=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\unicorn.gif");
		// new HorseThread().start();
		
		ht[0]=new HorseThread(0,690);
		ht[1]=new HorseThread(0,570);
		ht[2]=new HorseThread(0,450);
		ht[3]=new HorseThread(0,330);
		ht[4]=new HorseThread(0,210);
		
		for(int i=0;i<5;i++)
		{
			ht[i].start();
		}
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		for(int i=0;i<5;i++)
		{
			g.drawImage(img, ht[i].x,ht[i].y, 150, 100, this);
		}
		
		
		
	}
	
	// 멤버클래스 사용 : 공유해야 하는 데이터가 있어서 사용했음
	class HorseThread extends Thread
	{
		int x,y;
		public HorseThread(int i, int j) {
			// TODO Auto-generated constructor stub
			x=i;
			y=j;
		}
		// 쓰레드 동작 메소드
		public void run()
		{
			while(true)
			{
				try 
				{
					x+=5;
					if(x>1000)
					{
						interrupt();
					}
					int a= (int)(Math.random()*101);
					Thread.sleep(a);
				}
				catch (Exception e) {}
				}	
			

		}
	}
	}
