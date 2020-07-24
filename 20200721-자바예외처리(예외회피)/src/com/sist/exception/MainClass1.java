package com.sist.exception;

public class MainClass1 {
	public void display() throws ArrayIndexOutOfBoundsException, 
	ArithmeticException, NumberFormatException,Exception
	{
		
	}

	public static void main(String[] args) {
		MainClass1 m= new MainClass1();
		try {
			m.display();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
