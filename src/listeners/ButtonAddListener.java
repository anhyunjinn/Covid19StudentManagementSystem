package listeners;

//import 키워드를 사용하여 라이브러리를 선언
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import gui.StudentAdder;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	//ActionListener을 implements하는 class의 이름을 ButtonViewListener로 설정
	
	WindowFrame frame;
	
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		StudentAdder adder = frame.getStudentadder();
		frame.setupPanel(adder);
	}

}
