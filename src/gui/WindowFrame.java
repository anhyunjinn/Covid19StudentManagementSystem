package gui;

//import 키워드를 사용하여 라이브러리를 선언
import javax.swing.JFrame;
import javax.swing.JPanel;
import manage.Manager;

public class WindowFrame extends JFrame {
	//JFrame을 상속받는 class의 이름을 WindowFrame로 설정
	
	MenuSelection menuselection; //MenuSelection 불러옴
	StudentAdder studentadder; //StudentAdder 불러옴
	StudentViewer studentviewer; //StudentViewer 불러옴
	Manager m; //Manager 불러옴

	public WindowFrame(Manager m) { //생성자 생성
		this.setSize(600, 300); //frame 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//x 버튼을 누르면 창이 종료됨
		this.setTitle("My Frame"); //frame 제목 설정
		
		this.m = m; //Manager의 객체 생성
		menuselection = new MenuSelection(this);
		//MenuSelection의 객체 생성
		studentadder = new StudentAdder(this, this.m);
		//StudentAdder의 객체 생성
		studentviewer = new StudentViewer(this, this.m);
		//StudentViewer의 객체 생성
		
		this.add(menuselection); //menuselection을 해당 프레임에 추가
		
		this.setVisible(true); //윈도우 창에 나타나도록 설정
	}

	public void setupPanel(JPanel panel) {
		//setupPanel 메소드 생성
		this.getContentPane().removeAll();
		//좀 더 정확하게 하기 위헤 getContentPane 추가
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	//다양한 생성자 생성
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
