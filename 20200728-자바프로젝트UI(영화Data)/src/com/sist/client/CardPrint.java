package com.sist.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import com.sist.data.*;

public class CardPrint extends JFrame{
	
	public CardPrint()
	{
		//FoodHouseVO[] food=MainClass3.categoryFoodData();
		
		
		JPanel p= new JPanel();
		p.setLayout(new GridLayout(5,2));
		add("Center",p);
		
		/*
		for(FoodHouseVO vo:food)
		{
			MovieListCard fc=new MovieListCard(vo);
			p.add(fc);
		}
		*/
		
		setSize(1200,1000);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CardPrint();
	}

}
