package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class StudentAdder extends JFrame {
	
	public StudentAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID : ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelSex = new JLabel("Sex : ", JLabel.TRAILING);
		JTextField fieldSex = new JTextField(10);
		labelSex.setLabelFor(fieldSex);
		panel.add(labelSex);
		panel.add(fieldSex);
		
		JLabel labelRoomnumber = new JLabel("Roomnumber : ", JLabel.TRAILING);
		JTextField fieldRoomnumber = new JTextField(10);
		labelRoomnumber.setLabelFor(fieldRoomnumber);
		panel.add(labelRoomnumber);
		panel.add(fieldRoomnumber);
		
		JLabel labelTemp = new JLabel("Temperature : ", JLabel.TRAILING);
		JTextField fieldTemp = new JTextField(10);
		labelTemp.setLabelFor(fieldTemp);
		panel.add(labelTemp);
		panel.add(fieldTemp);
		
		JLabel labelEmail = new JLabel("E-mail : ", JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelEmail.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail);
		
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);
		
		this.setSize(500, 500);
		this.setContentPane(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
