package com.sist.front;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class BoardListPanel extends JPanel {
	JButton b;
	JTable table; // ǥ ��� ���� => ���� => View
	DefaultTableModel model; // ǥ ������ ���� => ����, �߰�, ������ִ� ��� => Model
	TableColumn column;
	
	public BoardListPanel() {
		b=new JButton("����");
		String[] col = {"��ȣ","����","�̸�","�ۼ���","��ȸ��"};
		String[][] row=new String[0][5];
		
		// ��� ���� ������ �� ������ '�͸��� Ŭ����' => jpanel�� ���ϻ�ӹۿ� �ȵǾ ���� ����~!
		model=new DefaultTableModel(row,col) {
			public boolean isCellEditable(int r, int c)
			{
				return false;				
			}
		};
		table = new JTable(model);
		table.getTableHeader().setBackground(Color.yellow);
		// table.setShowVerticalLines(false);
		table.setShowGrid(false);
		table.setRowHeight(35);
		table.setSelectionForeground(Color.white);
		table.getTableHeader().setReorderingAllowed(false);
		JScrollPane js = new JScrollPane(table);
		js.getViewport().setBackground(Color.white);

		
		// ��ġ
		setLayout(null);
		b.setBounds(10,15,100,30);
		js.setBounds(10,50,600,380);
		
		add(b);add(js);
		for(int i=0;i<5;i++)
		{
			column=table.getColumnModel().getColumn(i);
			DefaultTableCellRenderer render = new DefaultTableCellRenderer();
			
			
			if(i==0)
			{
				column.setPreferredWidth(30);
				render.setHorizontalAlignment(JLabel.CENTER);
			}
			else if(i==1)
			{
				column.setPreferredWidth(400);
				render.setHorizontalAlignment(JLabel.LEFT);
			}
			else if(i==2)
			{
				column.setPreferredWidth(60);
				render.setHorizontalAlignment(JLabel.CENTER);
			}
			else if(i==3)
			{
				column.setPreferredWidth(80);
				render.setHorizontalAlignment(JLabel.CENTER);
			}
			else if(i==4)
			{
				column.setPreferredWidth(40);
				render.setHorizontalAlignment(JLabel.CENTER);
			}
			column.setCellRenderer(render);
		}
		
		// ���
//		String[] data = {"1","ArrayList ������","ȫ�浿","2020-07-24","0"};
//		model.addRow(data);
		
	}

}
