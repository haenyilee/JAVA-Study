package com.sist.client;
// 10개씩 출력하는 위치
import java.awt.*;
import javax.swing.*;
import com.sist.data.*;
import java.util.*; // arraylist

public class MovieForm extends JPanel{
	JButton b1,b2;
	JPanel p = new JPanel();
	MovieCard[] mc= new MovieCard[10];
	ClientMainFrame c;
	
	
	
	public MovieForm(ClientMainFrame c) {
		this.c=c;
		setLayout(new BorderLayout());
		// 이전버튼
		b1= new JButton("◀");
		
		// 다음버튼
		b2= new JButton("▶");
		
		
		p.setLayout(new GridLayout(2,5,5,5));
		
		moviePrint(1);
		add("West",b1);add("Center",p); add("East",b2);
	}
	
	// 페이지 바뀔 때마다 다른 영화 호출하도록 메소드로 만들어준 것
	public void moviePrint(int page)
	{
		MovieManager m = new MovieManager();
		ArrayList<MovieVO> list = m.movieListData(page);
		
		int i=0;
		for(MovieVO vo:list)
		{
			mc[i]=new MovieCard(vo.getTitle(), vo.getPoster());
			p.add(mc[i]);
			mc[i].addMouseListener(c);
			i++;
		}
	}

}
