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
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Label;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Panel_Searched extends JPanel{

    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JButton btnChoice;
    private JButton btnChoice_1;
    private JButton btnChoice_2;
    private JButton btnChoice_3;
    private int num_page = 0;
    private JPanel Searched;
    
	
	public Panel_Searched() {
		initialize();
		periodicTable.windows.User_Search = new Search(periodicTable.windows.SearchHP);
		// Panel Mainmeue
		Searched = new JPanel();
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
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("CheckBox.background"));
		panel.setBounds(384, 54, 320, 399);
		Searched.add(panel);
		panel.setLayout(null);
		
		JLabel lblSymbol = new JLabel("ตัวย่อ ( symbol)                             :");
		lblSymbol.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblSymbol.setForeground(SystemColor.scrollbar);
		lblSymbol.setBounds(21, 99, 164, 14);
		panel.add(lblSymbol);
		
		JLabel lblthaiName = new JLabel("ชื่อภาษาไทย (thai name)              :");
		lblthaiName.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblthaiName.setForeground(SystemColor.scrollbar);
		lblthaiName.setBounds(21, 136, 165, 14);
		panel.add(lblthaiName);
		
		JLabel lblenglishName = new JLabel("ชื่อภาษาอังกฤษ (English name)     :");
		lblenglishName.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblenglishName.setForeground(SystemColor.scrollbar);
		lblenglishName.setBounds(22, 173, 167, 14);
		panel.add(lblenglishName);
		
		JLabel lblatomicNumber = new JLabel("เลขอะตอม (Atomic Number)        :");
		lblatomicNumber.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblatomicNumber.setForeground(SystemColor.scrollbar);
		lblatomicNumber.setBounds(22, 206, 165, 14);
		panel.add(lblatomicNumber);
		
		JLabel lbloperator = new JLabel("ตัวดำเนินการ (Operator )   :");
		lbloperator.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lbloperator.setForeground(SystemColor.scrollbar);
		lbloperator.setBounds(55, 231, 130, 14);
		panel.add(lbloperator);
		
		JLabel lblStatus = new JLabel("สถานะ ( Status )                             :");
		lblStatus.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblStatus.setForeground(SystemColor.scrollbar);
		lblStatus.setBounds(17, 267, 169, 14);
		panel.add(lblStatus);
		
		JLabel label = new JLabel("ค่าที่ระบุให้ค้นหา");
		label.setBackground(UIManager.getColor("Button.background"));
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setForeground(SystemColor.controlShadow);
		label.setBounds(10, 32, 252, 38);
		panel.add(label);
		
		JButton btsetDatatoSearch = new JButton("แก้ไขค่า");
		btsetDatatoSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				periodicTable.windows.setVisiblePupup(true);
			}
		});
		btsetDatatoSearch.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btsetDatatoSearch.setBounds(97, 321, 89, 23);
		panel.add(btsetDatatoSearch);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.ITALIC, 11));
		textField.setText(periodicTable.windows.SearchHP.symbol);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(197, 96, 65, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		textField_1.setText(periodicTable.windows.SearchHP.thai);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(196, 133, 66, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText(periodicTable.windows.SearchHP.eng);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(197, 170, 65, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		String name_textField_3 = (periodicTable.windows.SearchHP.atomicNumber == 0)? null:String.valueOf(periodicTable.windows.SearchHP.atomicNumber);
		textField_3.setText(name_textField_3);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(197, 203, 65, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText(String.valueOf(periodicTable.windows.SearchHP.C_atomicNumber));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(197, 228, 65, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText(PeriodicTable.getFullStatus(periodicTable.windows.SearchHP.status));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(196, 264, 65, 20);
		panel.add(textField_5);
		
		
		//Searched panal
		btnChoice = new JButton();
		btnChoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				periodicTable.windows.select_number = periodicTable.windows.User_Search.Searched[num_page*4+1-1];
				//gotonextpage
				periodicTable.windows.setNextPage(4);
			}
		});
		btnChoice.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnChoice.setBounds(37, 125, 309, 44);
		btnChoice_1 = new JButton();
		btnChoice_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				periodicTable.windows.select_number = periodicTable.windows.User_Search.Searched[num_page*4+2-1];
				//gotonextpage
				periodicTable.windows.setNextPage(4);
			}
		});
		btnChoice_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnChoice_1.setBounds(37, 180, 309, 44);
		btnChoice_2 = new JButton();
		btnChoice_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				periodicTable.windows.select_number = periodicTable.windows.User_Search.Searched[num_page*4+3-1];
				//gotonextpage
				periodicTable.windows.setNextPage(4);
			}
		});
		btnChoice_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnChoice_2.setBounds(37, 244, 309, 44);
		btnChoice_3 = new JButton();
		btnChoice_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				periodicTable.windows.select_number = periodicTable.windows.User_Search.Searched[num_page*4+4-1];
				//gotonextpage
				periodicTable.windows.setNextPage(4);
			}
		});
		btnChoice_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnChoice_3.setBounds(37, 312, 309, 44);
		Searched.add(btnChoice);
		Searched.add(btnChoice_1);
		Searched.add(btnChoice_2);
		Searched.add(btnChoice_3);
		setButton_Choice();
		
		JButton btnNext = new JButton("next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num_page * 4+5 <= periodicTable.windows.User_Search.number) {
					num_page += 1;
					setButton_Choice();
				}
			}
		});
		btnNext.setBounds(212, 406, 89, 23);
		Searched.add(btnNext);
		
		JButton btnBefor = new JButton("befor");
		btnBefor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num_page > 0) {
					num_page -= 1;
					setButton_Choice();
				}
			}
		});

		btnBefor.setBounds(84, 406, 89, 23);
		Searched.add(btnBefor);
		
		JLabel label_1 = new JLabel("ธาตุที่ค้นหาเจอทั้งหมด  "+String.valueOf(periodicTable.windows.User_Search.number));
		label_1.setForeground(Color.GRAY);
		label_1.setFont(new Font("Tahoma", Font.ITALIC, 29));
		label_1.setBounds(37, 54, 366, 38);
		Searched.add(label_1);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(0, 0, 714, 483);
		setLayout(null);		
	}
	void setButton_Choice()
	{
		btnChoice.setVisible(true);
		btnChoice.setText(String.valueOf(num_page*4+1)+" } "+PeriodicTable.getThai(periodicTable.windows.User_Search.Searched[num_page*4+1-1]));
		if(num_page*4+1 > periodicTable.windows.User_Search.number)
			btnChoice.setVisible(false);
		btnChoice_1.setVisible(true);
		btnChoice_1.setText(String.valueOf(num_page*4+2)+" } "+PeriodicTable.getThai(periodicTable.windows.User_Search.Searched[num_page*4+2-1]));
		if(num_page*4+2 > periodicTable.windows.User_Search.number)
			btnChoice_1.setVisible(false);
		btnChoice_2.setVisible(true);
		btnChoice_2.setText(String.valueOf(num_page*4+3)+" } "+PeriodicTable.getThai(periodicTable.windows.User_Search.Searched[num_page*4+3-1]));
		if(num_page*4+3 > periodicTable.windows.User_Search.number)	
			btnChoice_2.setVisible(false);
		btnChoice_3.setVisible(true);
		btnChoice_3.setText(String.valueOf(num_page*4+4)+" } "+PeriodicTable.getThai(periodicTable.windows.User_Search.Searched[num_page*4+4-1]));;
		if(num_page*4+4 > periodicTable.windows.User_Search.number)
			btnChoice_3.setVisible(false);
	}
}
