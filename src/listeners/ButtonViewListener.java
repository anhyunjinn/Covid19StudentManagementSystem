package listeners;

//import 키워드를 사용하여 라이브러리를 선언
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;

import gui.StudentViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	//ActionListener을 implements하는 class의 이름을 ButtonViewListener로 설정
	
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		StudentViewer viewer = frame.getStudentviewer();
		frame.setupPanel(viewer);
	}

}
