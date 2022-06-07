package gui;

//import 키워드를 사용하여 라이브러리를 선언
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel {
	//JPanel을 상속받는 class의 이름을 MenuSelection으로 설정
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) { //생성자 생성	
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		//panel의 기본 default 값을 BorderLayout으로 설정
		
		JPanel panel1 = new JPanel(); //panel panel1 생성
		JPanel panel2 = new JPanel(); //panel panel2 생성
		JLabel label = new JLabel("Menu Selection"); //label label 생성
		
		//button button1, 2, 3, 4, 5 생성
		JButton button1 = new JButton("Add Student Information");
		JButton button2 = new JButton("Delete Student");
		JButton button3 = new JButton("Edit Temperature");
		JButton button4 = new JButton("View Student Information");
		JButton button5 = new JButton("Exit");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button4.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label); //panel1에 label 추가
		panel2.add(button1); //panel2에 button1 추가
		panel2.add(button2); //panel2에 button2 추가
		panel2.add(button3); //panel2에 button3 추가
		panel2.add(button4); //panel2에 button4 추가
		panel2.add(button5); //panel2에 button5 추가
		
		this.add(panel1, BorderLayout.NORTH);//프레임에 panel1을 레이아웃의 북쪽에 배치
		this.add(panel2, BorderLayout.CENTER);//프레임에 panel2를 레이아웃의 중앙에 배치
	}
}
