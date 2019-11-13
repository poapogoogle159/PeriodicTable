package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PeriodicTable.Search;
import type.SearchHeaper;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dialog_inputDataSearch extends JDialog {

	private JPanel contentPanel = new JPanel();
	private JTextField textSymbol;
	private JTextField textThainame;
	private JTextField textEngname;
	private JTextField textAtomicNb;
	private JComboBox comboStatus;
	private JComboBox comboIOperator;
	
	
	private JLabel lblCheck;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Dialog_inputDataSearch dialog = new Dialog_inputDataSearch();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Dialog_inputDataSearch() {
		setTitle("Search");
		setBounds(200, 150, 450, 428);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel labelTop = new JLabel("โปรดใส่ข้อมูลที่ต้องการค้นหา");
		labelTop.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		labelTop.setBounds(80, 11, 266, 33);
		contentPanel.add(labelTop);
		
		JLabel lblSymbol = new JLabel("ตัวย่อ ( symbol)                             :");
		lblSymbol.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblSymbol.setBounds(32, 80, 173, 20);
		contentPanel.add(lblSymbol);
		
		JLabel lblthaiName = new JLabel("ชื่อภาษาไทย (thai name)              :");
		lblthaiName.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblthaiName.setBounds(32, 128, 173, 14);
		contentPanel.add(lblthaiName);
		
		JLabel lblenglishName = new JLabel("ชื่อภาษาอังกฤษ (English name)     :");
		lblenglishName.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblenglishName.setBounds(32, 171, 173, 14);
		contentPanel.add(lblenglishName);
		
		JLabel lblatomicNumber = new JLabel("เลขอะตอม (Atomic Number)        :");
		lblatomicNumber.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblatomicNumber.setBounds(32, 210, 173, 14);
		contentPanel.add(lblatomicNumber);
		
		JLabel lbloperator = new JLabel("ตัวดำเนินการ (Operator )   :");
		lbloperator.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lbloperator.setBounds(67, 243, 132, 14);
		contentPanel.add(lbloperator);
		
		JLabel lblStatus = new JLabel("สถานะ ( Status )                             :");
		lblStatus.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblStatus.setBounds(32, 280, 183, 14);
		contentPanel.add(lblStatus);
		
		lblCheck = new JLabel();
		lblCheck.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblCheck.setForeground(Color.RED);
		lblCheck.setBounds(154, 55, 124, 14);
		contentPanel.add(lblCheck);
		
		textSymbol = new JTextField("");
		textSymbol.setFont(new Font("Tahoma", Font.ITALIC, 11));
		textSymbol.setBounds(215, 80, 155, 20);
		contentPanel.add(textSymbol);
		textSymbol.setColumns(10);
		
		textThainame = new JTextField();
		textThainame.setText(null);
		textThainame.setFont(new Font("Tahoma", Font.ITALIC, 11));
		textThainame.setBounds(215, 125, 155, 20);
		contentPanel.add(textThainame);
		textThainame.setColumns(10);
		
		textEngname = new JTextField("");
		textEngname.setFont(new Font("Tahoma", Font.ITALIC, 11));
		textEngname.setBounds(215, 168, 155, 20);
		contentPanel.add(textEngname);
		textEngname.setColumns(10);
	
		textAtomicNb = new JTextField("");
		textAtomicNb.setFont(new Font("Tahoma", Font.ITALIC, 11));
		textAtomicNb.setBounds(215, 207, 96, 20);
		contentPanel.add(textAtomicNb);
		textAtomicNb.setColumns(10);
		
		comboIOperator = new JComboBox();
		comboIOperator.setModel(new DefaultComboBoxModel(new String[] {"=", ">", "<"}));
		comboIOperator.setBounds(215, 239, 48, 22);
		contentPanel.add(comboIOperator);
		
		comboStatus = new JComboBox();
		comboStatus.setModel(new DefaultComboBoxModel(new String[] {null, "solid", "liquid", "gas", "unknow"}));
		comboStatus.setBounds(215, 276, 96, 22);
		contentPanel.add(comboStatus);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(textAtomicNb.getText().length()!=0 && !checkUserInput.isInt(textAtomicNb.getText().toString())) {
							lblCheck.setText("กรุณาใส่กรอกหมายเลขที่ถูกต้อง");
						}
						//User_input is't empty
						else if(textSymbol.getText().length()!=0||
						   textThainame.getText().length()!=0||
						   textEngname.getText().length()!=0||
						   textAtomicNb.getText().length()!=0||
						   (comboIOperator.getSelectedItem()!="=" && textAtomicNb.getText().length()!=0)||
						   (comboIOperator.getSelectedItem()!="=" && textAtomicNb.getText().length()!=0 && comboStatus.getSelectedItem()!=null)||
						   comboStatus.getSelectedItem()!=null
						   ) 
						{
							
							periodicTable.windows.SearchHP = new SearchHeaper();
							setvalue();
							setVisible(false);
							//go to nextpage
							periodicTable.windows.setNextPage(3);
						}
						else
						{
							lblCheck.setText("โปรดใส่ข้อมูลอีกครั้ง ");
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				buttonPane.add(cancelButton);
			}
		}
	}
	private void setvalue() {
		periodicTable.windows.SearchHP.symbol = (textSymbol.getText().length()==0)? "":textSymbol.getText().toString();
		periodicTable.windows.SearchHP.thai   = (textThainame.getText().length()==0)? "":textThainame.getText().toString();
		periodicTable.windows.SearchHP.eng    = (textEngname.getText().length()==0)?"":textEngname.getText().toString();
		periodicTable.windows.SearchHP.atomicNumber =(textAtomicNb.getText().length()==0)? 0:Integer.valueOf(textAtomicNb.getText());
		periodicTable.windows.SearchHP.C_atomicNumber = comboIOperator.getSelectedItem().toString().charAt(0);
		
		
		String getStatus = (comboStatus.getSelectedItem()==null)? null:comboStatus.getSelectedItem().toString();
		if(getStatus == "solid") {periodicTable.windows.SearchHP.status = 's'; }
		else if(getStatus == "liquid") {periodicTable.windows.SearchHP.status = 'l';}
		else if(getStatus == "gas") {periodicTable.windows.SearchHP.status = 'g';}
		else if(getStatus == "unknow") {periodicTable.windows.SearchHP.status = 'u';}
	}
}
