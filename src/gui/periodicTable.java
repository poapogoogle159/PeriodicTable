package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import PeriodicTable.Search;
import PeriodicTable.PeriodicTable;
import type.SearchHeaper;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class periodicTable{
	public static periodicTable windows;
	public JFrame frame;
    //for Search
    public SearchHeaper SearchHP = new SearchHeaper();
    public Search User_Search;
    public int select_number = 0;
    //isPage
    private JPanel[] page = {null,new Panel_menu(),new Panel_periodicTable(),null,null};
    private Dialog_inputDataSearch Pupup;
    //set page
  	private int[] page_befor = new int[5]; //meaning can open page 5 page
    private int page_number = 0;
   
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windows = new periodicTable();
					windows.frame.setVisible(true);
					windows.page[1].setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public periodicTable() {
		//Set JFream
		initialize();
		//getContentPane in windows
		frame.getContentPane().add(page[1]);
		frame.getContentPane().add(page[2]);
		page[1].setVisible(false);
		page[2].setVisible(false);
		
		//DialogPage_Search
		Pupup = new Dialog_inputDataSearch();
		Pupup.setVisible(false);	
	}
	public void selectNumber(int index) {
		select_number = index;
	}
	public int getSelectNumber() {
		return select_number;
	}
	public void setNextPage(int page_new){
		int page_old = isPage();
		page[page_old].setVisible(false);
		if(page[page_new] != null) {
			frame.getContentPane().remove(page[page_new]);
		}
		switch(page_new) {
		case 1:
			//Don't need to Create new_Panel
			//page[page_new] = new Panel_menu();
			break;
		case 2:
			//Don't need to Create new_Panel
			//page[page_new] = new Panel_periodicTable();
			break;
		case 3:
			page[page_new] = new Panel_Searched();
			break;
		case 4:
			page[page_new] = new Panel_periodic();
			break;
		}
		frame.getContentPane().add(page[page_new]);
		if(page_old != page_new)
			page_befor[page_number++] = page_old;
		page[page_new].setVisible(true);
	}
	public void backPage() {
		page[isPage()].setVisible(false);
		page[page_befor[--page_number]].setVisible(true);
	}
	public void setVisiblePupup(boolean value) {
		Pupup.setVisible(value);
	}
	private int isPage() {
		for(int i=1;i<page.length;i++) {
			if(page[i] != null && page[i].isVisible())
				return i;
		}
		return 0;
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//setFrame
		frame = new JFrame();
		frame.setBounds(125,175, 720, 512);
		frame.setTitle("Periodic Table");
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
