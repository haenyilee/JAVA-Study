package com.sist.ann;
import java.util.*;


public class UserMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사용자 요청:");
		String ss = scan.next();
		MovieModel mm = new MovieModel();
		if(ss.equals("list"))
		{
			mm.list();
		}
		else if(ss.equals("delete"))
		{
			mm.delete();
		}
		else if(ss.equals("find"))
		{
			mm.find();
		}
		else if(ss.equals("update"))
		{
			mm.update();
		}
		else if(ss.equals("insert"))
		{
			mm.insert();
		}
		

	}

}
