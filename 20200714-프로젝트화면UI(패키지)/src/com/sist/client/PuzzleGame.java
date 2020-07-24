// 생성자 => 변수
// GridLayout ==> 똑같은 크기로 여러개 목록 출력하는 것(ex.계산기 자판)

package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
// 1. 윈도우창 => JFrame

public class PuzzleGame extends JFrame implements ActionListener{
	JButton b1,b2;
	
	// 2. 3행 3열 버튼 9개
	JButton[][] pan=new JButton[3][3];
	int[][] panCount=new int[3][3];
	
	int brow=0;
	int bcol=0;
	
	// 0~8 중복없이 난수발생하기
	public void getRand()
	{
		// 중복 없는 난수값을 저장
		int[] com=new int[9];
		
		// 난수 발생 시 저장한 변수
		int su=0;
		
		// 중복 여부 확인하는 논리
		boolean bCheck=false;
		
		for(int i=0;i<9;i++)
		{
			// 난수 발생
			bCheck=true;
			while(bCheck)
			{
				// 0~8 중에서 랜덤으로 su값으로 지정
				su=(int)(Math.random()*9);
				bCheck=false;
				
				// 저장된 데이터가 중복되었는지 확인하기
				for(int j=0;j<i;j++)
				{
					// 배열안에 같은 수 있냐?
					if(su==com[j])
					{
						// 있으면 while문 다시 수행
						bCheck=true;
						break;
						/*
						 	<반복문 한 개만 제어함>
						 	break
						 	continue
						 */
					}
				}
			}
			com[i]=su;
			
			panCount[i/3][i%3]=su;
			
			if(su==8)
			{
				brow=i/3;
				bcol=i%3;
			}
		}
	}
	
	
	// 배치함수	
	public void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==brow && j==bcol)
				{
					pan[i][j].setText("");
					pan[i][j].setEnabled(false);
				}
				else
				{
					pan[i][j].setText(String.valueOf(panCount[i][j]+1));
					pan[i][j].setEnabled(true);
				}				
			}
		}
	}
	
	
	// 버튼 클릭하면 처리하기
	
	
	
	
	// 3. 생성자 => 클래스를 메모리에 저장할 때 가장 먼저 호출되는 메소드
	public PuzzleGame()
	{
		// 4. 배치
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		// 5. b1이랑 b2 묶기
		JPanel p=new JPanel();
		p.add(b1);p.add(b2);
		add("South",p);
		
		
		// 6.그리드레이아웃
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(3,3,5,5));
		
		int k=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				pan[i][j]=new JButton(String.valueOf(k));
				pan[i][j].setFont(new Font("굴림체",Font.BOLD,50));
				p2.add(pan[i][j]);
				pan[i][j].addActionListener(this);
				k++;	
			}
		}
		
		add("Center",p2);
		
		// 윈도 뜨기 전에 getrand, display출력
		getRand();
		display();
		
		setSize(350,400);
		setVisible(true);
		
		b1.addActionListener(this); // 이벤트 등록

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 7. 생성자 호출하기
		new PuzzleGame();

	}
	
	// 종료여부 확인
	public boolean isEnd()
	{
		int k=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(panCount[i][j]!=k)
					return false;
				k++;
			}
		}
		return true;
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			getRand();
			display();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(e.getSource()==pan[i][j])
				{
					panCount[brow][bcol]=panCount[i][j];
					panCount[i][j]=8;
					brow=i;
					bcol=j;
					if(isEnd())
					{
						JOptionPane.showMessageDialog(this,"Game Over!!");
						System.exit(0);
					}
					display();
				
				}
			}
		}
		
	}

}
