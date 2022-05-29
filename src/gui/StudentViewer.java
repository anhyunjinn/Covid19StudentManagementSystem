package gui;

//import 키워드를 사용하여 라이브러리를 선언
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentViewer extends JFrame{
	//JFrame을 상속받는 class의 이름을 MenuViewer으로 설정
	
	public StudentViewer() { //생성자 생성
		DefaultTableModel model = new DefaultTableModel();
		//tablemodel model 생성
		
		//model에 들어갈 내용 추가
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Sex");
		model.addColumn("Roomnumber");
		model.addColumn("Temperature");
		model.addColumn("E-mail");
		
		JTable table = new JTable(model);
		//table table을 선언 후, model을 안에 들어갈 내용으로 설정
		JScrollPane sp = new JScrollPane(table);
		//ScrollPane sp를 선언 후, table을 안에 들어갈 내용으로 설정
		
		this.add(sp); //frame에 sp를 추가
		
		this.setSize(600, 300); //frame 크기를 600x300의 크기로 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//x 버튼을 누르면 윈도우 창이 닫히도록 설정
		this.setVisible(true); //윈도우 창에 해당 내용이 보이도록 설정
	}
}
