package gui;

//import Ű���带 ����Ͽ� ���̺귯���� ����
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentViewer extends JFrame{
	//JFrame�� ��ӹ޴� class�� �̸��� MenuViewer���� ����
	
	public StudentViewer() { //������ ����
		DefaultTableModel model = new DefaultTableModel();
		//tablemodel model ����
		
		//model�� �� ���� �߰�
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Sex");
		model.addColumn("Roomnumber");
		model.addColumn("Temperature");
		model.addColumn("E-mail");
		
		JTable table = new JTable(model);
		//table table�� ���� ��, model�� �ȿ� �� �������� ����
		JScrollPane sp = new JScrollPane(table);
		//ScrollPane sp�� ���� ��, table�� �ȿ� �� �������� ����
		
		this.add(sp); //frame�� sp�� �߰�
		
		this.setSize(600, 300); //frame ũ�⸦ 600x300�� ũ��� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//x ��ư�� ������ ������ â�� �������� ����
		this.setVisible(true); //������ â�� �ش� ������ ���̵��� ����
	}
}
