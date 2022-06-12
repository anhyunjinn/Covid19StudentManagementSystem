package gui;

//import Ű���带 ����Ͽ� ���̺귯���� ����
import javax.swing.JFrame;
import javax.swing.JPanel;
import manage.Manager;

public class WindowFrame extends JFrame {
	//JFrame�� ��ӹ޴� class�� �̸��� WindowFrame�� ����
	
	MenuSelection menuselection; //MenuSelection �ҷ���
	StudentAdder studentadder; //StudentAdder �ҷ���
	StudentViewer studentviewer; //StudentViewer �ҷ���
	Manager m; //Manager �ҷ���

	public WindowFrame(Manager m) { //������ ����
		this.setSize(600, 300); //frame ũ�� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//x ��ư�� ������ â�� �����
		this.setTitle("My Frame"); //frame ���� ����
		
		this.m = m; //Manager�� ��ü ����
		menuselection = new MenuSelection(this);
		//MenuSelection�� ��ü ����
		studentadder = new StudentAdder(this, this.m);
		//StudentAdder�� ��ü ����
		studentviewer = new StudentViewer(this, this.m);
		//StudentViewer�� ��ü ����
		
		this.add(menuselection); //menuselection�� �ش� �����ӿ� �߰�
		
		this.setVisible(true); //������ â�� ��Ÿ������ ����
	}

	public void setupPanel(JPanel panel) {
		//setupPanel �޼ҵ� ����
		this.getContentPane().removeAll();
		//�� �� ��Ȯ�ϰ� �ϱ� ���� getContentPane �߰�
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	//�پ��� ������ ����
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public StudentAdder getStudentadder() {
		return studentadder;
	}

	public void setStudentadder(StudentAdder studentadder) {
		this.studentadder = studentadder;
	}

	public StudentViewer getStudentviewer() {
		return studentviewer;
	}

	public void setStudentviewer(StudentViewer studentviewer) {
		this.studentviewer = studentviewer;
	}
}
