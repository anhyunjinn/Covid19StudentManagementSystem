package gui;

//import Ű���带 ����Ͽ� ���̺귯���� ����
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import manage.Manager;
import student.UserInput;

public class StudentViewer extends JPanel{
	//JPanel�� ��ӹ޴� class�� �̸��� MenuViewer���� ����
	
	WindowFrame frame; //WindowFrame�� �ҷ���
	Manager m; //Manager�� �ҷ���
	
	public Manager getM() {
		return m;
	}

	public void setM(Manager m) {
		this.m = m;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		//tablemodel model ����
		
		//model�� �� ���� �߰�
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Sex");
		model.addColumn("Roomnumber");
		model.addColumn("Temperature");
		model.addColumn("E-mail");
		
		for (int i = 0; i<m.size(); i++) { //for �ݺ��� ����
			Vector row = new Vector(); //Vector�� row ����
			UserInput ui = m.get(i); //UserInput�� �ҷ���
			row.add(ui.getId()); //row�� �߰�
			row.add(ui.getName());
			row.add(ui.getSex());
			row.add(ui.getRoomnumber());
			row.add(ui.getTemp());
			row.add(ui.getEmail());
			model.addRow(row); //model�� row�� �߰�
		}
		
		JTable table = new JTable(model);
		//table table�� ���� ��, model�� �ȿ� �� �������� ����
		JScrollPane sp = new JScrollPane(table);
		//ScrollPane sp�� ���� ��, table�� �ȿ� �� �������� ����
		this.add(sp); //frame�� sp�� �߰�
	}

	public StudentViewer(WindowFrame frame, Manager m) {
		//������ ����
		this.frame = frame;
		this.m = m;
		
		System.out.println("***" + m.size()+"***");
		//m�� ũ�⸦ ���
		
		DefaultTableModel model = new DefaultTableModel();
		//tablemodel model ����
		
		//model�� �� ���� �߰�
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Sex");
		model.addColumn("Roomnumber");
		model.addColumn("Temperature");
		model.addColumn("E-mail");
		
		for (int i = 0; i<m.size(); i++) { //for �ݺ��� ����
			Vector row = new Vector(); //Vector�� row ����
			UserInput ui = m.get(i); //UserInput�� �ҷ���
			row.add(ui.getId()); //row�� �߰�
			row.add(ui.getName());
			row.add(ui.getSex());
			row.add(ui.getRoomnumber());
			row.add(ui.getTemp());
			row.add(ui.getEmail());
			model.addRow(row); //model�� row�� �߰�
		}
		
		JTable table = new JTable(model);
		//table table�� ���� ��, model�� �ȿ� �� �������� ����
		JScrollPane sp = new JScrollPane(table);
		//ScrollPane sp�� ���� ��, table�� �ȿ� �� �������� ����
		this.add(sp); //frame�� sp�� �߰�
	}
}
