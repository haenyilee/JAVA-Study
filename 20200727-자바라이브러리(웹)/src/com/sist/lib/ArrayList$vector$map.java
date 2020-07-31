package com.sist.lib;
import java.util.*;
public class ArrayList$vector$map {

	public static void main(String[] args) {
		// ArrayList<String> names = new ArrayList<String>();		
		// Vector<String> names = new Vector<String>();		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("홍길동"); // 0
		names.add("심청이"); // 1 
		names.add("이순신"); // 2
		names.add("강감찬"); // 3
		names.add("성춘향"); // 4
		
		System.out.println("저장된갯수:"+names.size());
		// 출력
		for(int i=0;i<names.size();i++)
		{
			// 데이터 받을 때
			String name= names.get(i);
			// 원하는 위치에 저장된 데이터 읽기
			System.out.println(name+":"+i);
		}
		
		System.out.println();
		
		// 원하는 위치에 출력
		// add(index num, "value")
		names.add(3,"을지문덕");
		
		System.out.println("저장된갯수:"+names.size());
		for(int i=0;i<names.size();i++)
		{
			String name= names.get(i);
			System.out.println(name+":"+i);
		}
		
		// 삭제
		names.remove(2);
		System.out.println();
		System.out.println("저장된갯수:"+names.size());
		for(int i=0;i<names.size();i++)
		{
			String name= names.get(i);
			System.out.println(name+":"+i);
		}
		
		// 수정
		names.set(2, "둘리");
		System.out.println();
		System.out.println("저장된갯수:"+names.size());
		for(int i=0;i<names.size();i++)
		{
			String name= names.get(i);
			System.out.println(name+":"+i);
		}
		
		// 삭제
		names.clear();
		System.out.println();
		System.out.println("저장된갯수:"+names.size());
		for(int i=0;i<names.size();i++)
		{
			String name= names.get(i);
			System.out.println(name+":"+i);
		}
		

	}

}
