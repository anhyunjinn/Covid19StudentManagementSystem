package listeners;

//import 키워드를 사용하여 라이브러리를 선언
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import gui.StudentAdder;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	//ActionListener을 implements하는 class의 이름을 ButtonViewListener로 설정

	WindowFrame frame; //WindowFrame을 불러옴

	public ButtonAddListener(WindowFrame frame) { //생성자 생성
		this.frame = frame;
	}

	@Override //actionPerformed 메소드 오버라이드
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getStudentadder());
		frame.revalidate();
		frame.repaint();		
	}
}
