package gui;

//import Ű���带 ����Ͽ� ���̺귯���� ����
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel {
	//JPanel�� ��ӹ޴� class�� �̸��� MenuSelection���� ����
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) { //������ ����	
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		//panel�� �⺻ default ���� BorderLayout���� ����
		
		JPanel panel1 = new JPanel(); //panel panel1 ����
		JPanel panel2 = new JPanel(); //panel panel2 ����
		JLabel label = new JLabel("Menu Selection"); //label label ����
		
		//button button1, 2, 3, 4, 5 ����
		JButton button1 = new JButton("Add Student Information");
		JButton button2 = new JButton("Delete Student");
		JButton button3 = new JButton("Edit Temperature");
		JButton button4 = new JButton("View Student Information");
		JButton button5 = new JButton("Exit");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button4.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label); //panel1�� label �߰�
		panel2.add(button1); //panel2�� button1 �߰�
		panel2.add(button2); //panel2�� button2 �߰�
		panel2.add(button3); //panel2�� button3 �߰�
		panel2.add(button4); //panel2�� button4 �߰�
		panel2.add(button5); //panel2�� button5 �߰�
		
		this.add(panel1, BorderLayout.NORTH);//�����ӿ� panel1�� ���̾ƿ��� ���ʿ� ��ġ
		this.add(panel2, BorderLayout.CENTER);//�����ӿ� panel2�� ���̾ƿ��� �߾ӿ� ��ġ
	}
}
