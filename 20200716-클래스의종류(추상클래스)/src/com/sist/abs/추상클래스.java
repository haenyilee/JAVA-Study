package com.sist.abs;

/*
 	클래스의 종류
 		===========================
 		- 추상 클래스
 		- 인터페이스 => 추상 클래스를 확장	
 										==> 서로 다른 여러개의 클래스를 모아서 관리(연결 사용) 
 										
 										** 주 사용 용도
 										   1. 기능이 여러개로 나눠질 때 
 										   	예) 버튼 : 로그인 버튼, 취소버튼, 시작버튼....등 너무 많은 기능을 수행해야할때 구체적인 기능을 구현하지 않는 인터페이스/추상클래스 사용
 										   	
 										   2. 여러개의 클래스가 한 개의 클래스로 제어할 때! 
 										   	여러개의 클래스 => 관리 어려움
 										   	
 										** 결합성이 낮은 프로그램
 										   =====
 										   1. 결합성 : 클래스를 수정하면 다른 클래스에 영향이 있는지?(있으면 결합성 강한 프로그램)
 										   2. 응집성 : 한 개의 기능을 수행할 수 있는 능력이 있는지?(메소드와 관련)
 										
		===========================
 		- 내부클래스
 			- 멤버클래스
 			- 익명클래스
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class 추상클래스  extends JFrame implements MouseListener{
									// MouseListener에서 구현 안한 메소드가 있으면 에러발생

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

									@Override
									public void mouseClicked(MouseEvent e) {
										// TODO Auto-generated method stub
										
									}

									@Override
									public void mousePressed(MouseEvent e) {
										// TODO Auto-generated method stub
										
									}

									@Override
									public void mouseReleased(MouseEvent e) {
										// TODO Auto-generated method stub
										
									}

									@Override
									public void mouseEntered(MouseEvent e) {
										// TODO Auto-generated method stub
										
									}

									@Override
									public void mouseExited(MouseEvent e) {
										// TODO Auto-generated method stub
										
									}

}
