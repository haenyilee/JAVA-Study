package com.sist.client;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.sist.data.*;

public class NewsForm extends JPanel{
	public NewsForm()
	{
		NewsManager m = new NewsManager();
		ArrayList<NewsVO> news = m.newsListData(1);
		setLayout(new GridLayout(5,1)); // 5За 1ї­
		
		for(NewsVO vo:news)
		{
			NewsCard nc=new NewsCard();
			nc.newsPrint(vo);
			add(nc);
		}
		
	}

	
	
}
