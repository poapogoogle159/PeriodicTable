package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import PeriodicTable.Search;
import type.SearchHeaper;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import PeriodicTable.PeriodicTable;

public class Panel_periodicTable extends JPanel{
	/**
	 * Create the application.
	 */
	public Panel_periodicTable(){
		//set Panel
		initialize();
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// back page
				periodicTable.windows.backPage();
			}
		});
		btnBack.setBounds(10, 11, 73, 23);
		add(btnBack);
		JLabel label = new JLabel("1          2           3           4          5          6          7          8           9         10         11         12        13        14         15        16        17        18");
		label.setFont(new Font("Tahoma", Font.BOLD, 10));
		label.setBounds(31, 45, 658, 40);
		add(label);
		
		int StartX =20;
		int StartY =100;
		int distanceX =2;
		int distanceY =5;
		JButtonX[][] btshow = new JButtonX[9][18];
		int[][] location = {
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
	            { 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 6, 7, 8, 9, 10 },
	            { 11, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 11, 15, 16, 17, 18 },
	            { 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36 },
	            { 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54 },
	            { 55, 56, 57, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86 },
	            { 87, 88, 89, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118 },
	            { 0, 0, 0, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 0 },
	            { 0, 0, 0, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 0 }
		};
		for(int i=0;i<location.length;i++) {
			for(int j=0;j<location[i].length;j++) {
				if(location[i][j]==0) {continue;}
				String name_bt = "<html>"+PeriodicTable.getSymbol(location[i][j])+"\n"+String.valueOf(location[i][j])+"</htmp>";
				btshow[i][j] = new JButtonX(location[i][j]);
				btshow[i][j].setText(name_bt);
				btshow[i][j].setBounds(StartX+(distanceX*j)+(35*j),StartY+(distanceY*i)+(32*i), 35, 32);
				add(btshow[i][j]);
			}
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(0, 0, 714, 483);
		setLayout(null);
	}
}

class JButtonX extends JButton {
	public int atom;
	JButtonX(int input){
		atom = input;
		char _color = PeriodicTable.getStatus(atom);
		if(_color == 's') {
			setBackground(new Color(255, 228, 181));
		}
		else if(_color == 'l') {
			setBackground(new Color(224, 255, 255));
		}
		else if(_color == 'g'){
			setBackground(new Color(123, 104, 238));
		}
		setFont(new Font("Tahoma", Font.ITALIC, 9));
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get value befor goto page_peripdic
				periodicTable.windows.select_number = atom;
				//goto page_peripdic
				periodicTable.windows.setNextPage(4);
			}
		});
	}
}
