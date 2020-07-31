package com.sist.back;

import java.util.*;

public class BoardManager {
	
	private static ArrayList<BoardVO> list= new ArrayList<BoardVO>();
	
	// <자동증가> : BoardVO => private int no; => 글이 작성될 때마다 컴퓨터가 자동으로 하나씩 증가시켜줘야 함 => 시퀀스 활용!
	public int sequence()
	{
		int max=0;
		for(BoardVO vo:list)
		{
			if(max<vo.getNo())
				max=vo.getNo();
		}
		return max+1;
	}
	
	// 글 추가기능
	public void insert(BoardVO vo)
	{
		vo.setRegdate(new Date()); // 오늘 날짜 넣기
		vo.setNo(sequence()); // 글번호 매겨주기
		list.add(vo);
	}
	
	// 목록출력
	public ArrayList<BoardVO> select()
	{
		return list;
	}

}
