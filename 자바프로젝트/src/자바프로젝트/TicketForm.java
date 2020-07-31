package 자바프로젝트;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import 자바프로젝트.예매.ReserveControll;

import java.awt.*;

public class TicketForm extends JPanel{
   JButton b1,b2;
   JButton num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;
   JLabel la1,la2,la3,la4,la5,la6,la7;
   JPanel pan1,pan2,pan3,pan4,pan5,pan6;
   JTextArea ta1,ta2,ta3,ta4;
   
   
   public TicketForm(){
      
      
      la1 = new JLabel("영화선택",SwingConstants.CENTER);
      la2 = new JLabel("날짜선택",SwingConstants.CENTER);
      la3 = new JLabel("극장선택",SwingConstants.CENTER);
      la4 = new JLabel("시간선택",SwingConstants.CENTER);
      la1.setOpaque(true);
      la2.setOpaque(true);
      la3.setOpaque(true);
      la4.setOpaque(true);
      la1.setBackground(Color.GRAY);
      la2.setBackground(Color.GRAY);
      la3.setBackground(Color.GRAY);
      la4.setBackground(Color.GRAY);
      add(la1);add(la2);add(la3);add(la4);
      la1.setBounds(0, 30, 380, 50);
      la2.setBounds(380, 30, 400, 50);
      la3.setBounds(780, 30, 350, 50);
      la4.setBounds(1130, 30, 400, 50);
      la1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      la2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      la3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      la4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      
      // 영화 선택
      pan1= new JPanel();
      add(pan1);
      pan1.setLayout(null);
      pan1.setBounds(0, 80, 380, 570);
      pan1.setBorder(BorderFactory.createLineBorder(Color.black));
      
      JTable table = new JTable();
      DefaultTableModel model = new DefaultTableModel();
      
      
      
      // 날짜 선택
      pan2= new JPanel();
      add(pan2);
      pan2.setLayout(null);
      pan2.setBounds(380, 80, 400, 570);
      pan2.setBorder(BorderFactory.createLineBorder(Color.black));
      
      
      // 극장 선택
      pan3= new JPanel();
      add(pan3);
      pan3.setLayout(null);
      pan3.setBounds(780, 80, 350, 570);
      pan3.setBorder(BorderFactory.createLineBorder(Color.black));
      
      
      // 시간 선택
      pan4= new JPanel();
      add(pan4);
      pan4.setLayout(null);
      pan4.setBounds(1130, 80, 400, 260);
      pan4.setBorder(BorderFactory.createLineBorder(Color.black));
    
      
      // 인원 선택하기
      la5 = new JLabel("인원선택",SwingConstants.CENTER);
      la5.setOpaque(true);
      la5.setBackground(Color.GRAY);
      add(la5);
      la5.setBounds(1130,340,400,50);
      la5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      
      
      la6=new JLabel("성인");
      
      num1=new JButton("0");
      num2=new JButton("1");
      num3=new JButton("2");
      num4=new JButton("3");
      num5=new JButton("4");
      num6=new JButton("5");
      num7=new JButton("6");
      num8=new JButton("7");
      num9=new JButton("8");
      num10=new JButton("9");
      
      JPanel p= new JPanel();
      p.add(num1);p.add(num2);p.add(num3);p.add(num4);p.add(num5);p.add(num6);p.add(num7);p.add(num8);p.add(num9);p.add(num10);
      
   
      
      la7=new JLabel("청소년");
      
      
      pan5= new JPanel();
      
      
      pan5.add(la6);
      //setLayout(null);
      la6.setBounds(1150,395,100,55);
      
     
      pan5.add(p);
     //setLayout(null);
      p.setBounds(1150, 450, 380, 60);
      
      pan5.add(la7);
      // setLayout(null);
      la7.setBounds(1150,515,100,55);
    

      add(pan5);
      pan5.setLayout(null);
      pan5.setBounds(1130, 390, 400, 260);
      pan5.setBorder(BorderFactory.createLineBorder(Color.black));
      
      
      
      
      
      // 하단에 선택된 정보 출력
      pan6= new JPanel();
      add(pan6);
      pan6.setLayout(null);
      pan6.setBounds(0, 650, 380, 80);
      pan6.setBorder(BorderFactory.createLineBorder(Color.black));
              
      ta1= new JTextArea();
      add(ta1);
      ta1.setLayout(null);
      ta1.setBounds(380, 650, 400, 80);
      ta1.setBorder(BorderFactory.createLineBorder(Color.black));
      
      ta2= new JTextArea();
      add(ta2);
      ta2.setLayout(null);
      ta2.setBounds(780, 650, 350, 80);
      ta2.setBorder(BorderFactory.createLineBorder(Color.black));
      
      ta3= new JTextArea();
      add(ta3);
      ta3.setLayout(null);
      ta3.setBounds(1130, 650, 130, 80);
      ta3.setBorder(BorderFactory.createLineBorder(Color.black));
      
      ta4= new JTextArea();
      add(ta4);
      ta4.setLayout(null);
      ta4.setBounds(1260, 650, 130, 80);
      ta4.setBorder(BorderFactory.createLineBorder(Color.black));
      
      
      // b1을 맨 위로 올리면 왜 안나타남???
      b1= new JButton("선택 초기화");
      add(b1);
      b1.setBounds(1375, 5, 150, 20);
      b2= new JButton("좌석 선택>");
      add(b2);      
      b2.setBounds(1405, 655, 120, 70);
      
      
      
      
      
      
     
      
      
      
      
   }


}