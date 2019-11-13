package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import PeriodicTable.PeriodicTable;
import PeriodicTable.Search;
import type.AtomicElement;
import type.SearchHeaper;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;


import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Panel_periodic extends JPanel{

    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    
	public Panel_periodic(){
		initialize();
		
		// Panel Mainmeue
		JPanel Searched = new JPanel();
		Searched.setBounds(0, 0, 714, 483);
		add(Searched);
		Searched.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				periodicTable.windows.backPage();
			}
		});
		btnBack.setBounds(10, 11, 73, 23);
		Searched.add(btnBack);
		
		JLabel lblSYMBOL = new JLabel(PeriodicTable.getSymbol(periodicTable.windows.select_number));
		lblSYMBOL.setForeground(Color.GRAY);
		lblSYMBOL.setHorizontalAlignment(SwingConstants.CENTER);
		lblSYMBOL.setFont(new Font("Tahoma", Font.ITALIC, 59));
		lblSYMBOL.setBounds(188, 11, 263, 115);
		Searched.add(lblSYMBOL);
		
		JLabel lblthaiName = new JLabel("ชื่อภาษาไทย (thai name)              :");
		lblthaiName.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblthaiName.setBounds(435, 118, 173, 14);
		Searched.add(lblthaiName);
		
		JLabel lblenglishName = new JLabel("ชื่อภาษาอังกฤษ (English name)     :");
		lblenglishName.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblenglishName.setBounds(435, 162, 173, 14);
		Searched.add(lblenglishName);
		
		JLabel lblatomicNumber = new JLabel("เลขอะตอม (Atomic Number)        :");
		lblatomicNumber.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblatomicNumber.setBounds(435, 205, 173, 14);
		Searched.add(lblatomicNumber);
		
		JLabel lblStatus = new JLabel("สถานะ ( Status )                            :");
		lblStatus.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblStatus.setBounds(435, 246, 183, 14);
		Searched.add(lblStatus);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 137, 397, 320);
		Searched.add(scrollPane);
		
		JEditorPane editorPaneDatafromwiki = new JEditorPane();
		editorPaneDatafromwiki.setText("ข้อมูลเพื่มเติมสามารถเปิดได้จากปู๋ม เปิดหน้าวิกิพี่เดียข้างล้างขวามือ");
		editorPaneDatafromwiki.setFont(new Font("Tahoma", Font.ITALIC, 16));
		editorPaneDatafromwiki.setBackground(UIManager.getColor("Button.light"));
		editorPaneDatafromwiki.setEditable(false);
		scrollPane.setViewportView(editorPaneDatafromwiki);
		
		JButton btnWikipedie = new JButton("เปิด Wikipedie");
		btnWikipedie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URI(PeriodicTable.getLink(periodicTable.windows.select_number)));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnWikipedie.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnWikipedie.setBounds(554, 361, 114, 32);
		Searched.add(btnWikipedie);
		
		textField = new JTextField(PeriodicTable.getThai(periodicTable.windows.select_number));
		textField.setFont(new Font("Tahoma", Font.ITALIC, 11));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(603, 118, 90, 20);
		Searched.add(textField);
		
		textField_1 = new JTextField(PeriodicTable.getEng(periodicTable.windows.select_number));
		textField_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(603, 159, 90, 20);
		Searched.add(textField_1);
		
		String name_textField_2 = ((String.valueOf(PeriodicTable.getNumber(periodicTable.windows.select_number))));
		textField_2 = new JTextField(name_textField_2);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(603, 202, 90, 20);
		Searched.add(textField_2);
		
		textField_3 = new JTextField(PeriodicTable.getFullStatus(periodicTable.windows.select_number));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(603, 243, 90, 20);
		Searched.add(textField_3);
		
		
	}
	private void initialize() {
		setBounds(0, 0, 714, 483);
		setLayout(null);
	}
}
