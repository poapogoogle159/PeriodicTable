package gui;

import javax.swing.JPanel;

import PeriodicTable.PeriodicTable;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Desktop;

public class Panel_menu extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel_menu() {
		initialize();
		
		JButton btnToperiodicTable = new JButton("เปิดตารางธาตุ");
		btnToperiodicTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//goto page_periodicTable
				periodicTable.windows.setNextPage(2);
				}
		});
		btnToperiodicTable.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnToperiodicTable.setBounds(228, 218, 247, 71);
		add(btnToperiodicTable);
		
		JButton btnToSearch = new JButton("ค้นหาธาตุจากตาราง");
		btnToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//goto Dialog_Search
				periodicTable.windows.setVisiblePupup(true);
			}
		});
		btnToSearch.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnToSearch.setBounds(238, 302, 225, 71);
		add(btnToSearch);
		
		JButton btnHelp = new JButton("HELP");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://github.com/poapogoogle159/PeriodicTable"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnHelp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHelp.setBounds(591, 427, 89, 23);
		add(btnHelp);
		
		JLabel lblBy = new JLabel("BY. ทีมงานโต้รุ่ง  มุ่งมั้นทำงาน");
		lblBy.setForeground(new Color(255, 99, 71));
		lblBy.setFont(new Font("Tahoma", Font.ITALIC, 40));
		lblBy.setBounds(79, 86, 536, 76);
		add(lblBy);
	}
	private void initialize() {
		setBounds(0, 0, 714, 483);
		setLayout(null);
	}
}
