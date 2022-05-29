package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {
	public MenuSelection() { //생성자 생성
		this.setSize(300, 300); //frame 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//x 버튼을 누르면 창이 종료됨
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		JButton button1 = new JButton("Add Student Information");
		JButton button2 = new JButton("Delete Student");
		JButton button3 = new JButton("Edit Temperature");
		JButton button4 = new JButton("Q&A");
		JButton button5 = new JButton("Exit");
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.setVisible(true); //윈도우 창에 나타나도록 설정
		
	}

}
