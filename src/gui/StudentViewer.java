package gui;

import java.util.Vector;

//import 키워드를 사용하여 라이브러리를 선언
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manage.Manager;
import student.UserInput;

public class StudentViewer extends JPanel{
	//JPanel을 상속받는 class의 이름을 MenuViewer으로 설정
	
	WindowFrame frame;
	Manager m;
	
	public StudentViewer(WindowFrame frame, Manager m) { //생성자 생성
		this.frame = frame;
		this.m = m;
		
		System.out.println("***" + m.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		//tablemodel model 생성
		
		//model에 들어갈 내용 추가
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Sex");
		model.addColumn("Roomnumber");
		model.addColumn("Temperature");
		model.addColumn("E-mail");
		
		for (int i = 0; i<m.size(); i++) {
			Vector row = new Vector();
			UserInput ui = m.get(i);
			row.add(ui.getId());
			row.add(ui.getName());
			row.add(ui.getSex());
			row.add(ui.getRoomnumber());
			row.add(ui.getTemp());
			row.add(ui.getEmail());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		//table table을 선언 후, model을 안에 들어갈 내용으로 설정
		JScrollPane sp = new JScrollPane(table);
		//ScrollPane sp를 선언 후, table을 안에 들어갈 내용으로 설정
		
		this.add(sp); //frame에 sp를 추가
	}
}
