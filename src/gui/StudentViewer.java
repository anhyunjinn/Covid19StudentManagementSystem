package gui;

//import 키워드를 사용하여 라이브러리를 선언
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import manage.Manager;
import student.UserInput;

public class StudentViewer extends JPanel{
	//JPanel을 상속받는 class의 이름을 MenuViewer으로 설정
	
	WindowFrame frame; //WindowFrame을 불러옴
	Manager m; //Manager을 불러옴
	
	public Manager getM() {
		return m;
	}

	public void setM(Manager m) {
		this.m = m;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		//tablemodel model 생성
		
		//model에 들어갈 내용 추가
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Sex");
		model.addColumn("Roomnumber");
		model.addColumn("Temperature");
		model.addColumn("E-mail");
		
		for (int i = 0; i<m.size(); i++) { //for 반복문 실행
			Vector row = new Vector(); //Vector의 row 생성
			UserInput ui = m.get(i); //UserInput을 불러옴
			row.add(ui.getId()); //row을 추가
			row.add(ui.getName());
			row.add(ui.getSex());
			row.add(ui.getRoomnumber());
			row.add(ui.getTemp());
			row.add(ui.getEmail());
			model.addRow(row); //model에 row를 추가
		}
		
		JTable table = new JTable(model);
		//table table을 선언 후, model을 안에 들어갈 내용으로 설정
		JScrollPane sp = new JScrollPane(table);
		//ScrollPane sp를 선언 후, table을 안에 들어갈 내용으로 설정
		this.add(sp); //frame에 sp를 추가
	}

	public StudentViewer(WindowFrame frame, Manager m) {
		//생성자 생성
		this.frame = frame;
		this.m = m;
		
		System.out.println("***" + m.size()+"***");
		//m의 크기를 출력
		
		DefaultTableModel model = new DefaultTableModel();
		//tablemodel model 생성
		
		//model에 들어갈 내용 추가
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Sex");
		model.addColumn("Roomnumber");
		model.addColumn("Temperature");
		model.addColumn("E-mail");
		
		for (int i = 0; i<m.size(); i++) { //for 반복문 실행
			Vector row = new Vector(); //Vector의 row 생성
			UserInput ui = m.get(i); //UserInput을 불러옴
			row.add(ui.getId()); //row을 추가
			row.add(ui.getName());
			row.add(ui.getSex());
			row.add(ui.getRoomnumber());
			row.add(ui.getTemp());
			row.add(ui.getEmail());
			model.addRow(row); //model에 row를 추가
		}
		
		JTable table = new JTable(model);
		//table table을 선언 후, model을 안에 들어갈 내용으로 설정
		JScrollPane sp = new JScrollPane(table);
		//ScrollPane sp를 선언 후, table을 안에 들어갈 내용으로 설정
		this.add(sp); //frame에 sp를 추가
	}
}
