package listeners;

//import Ű���带 ����Ͽ� ���̺귯���� ����
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;

import gui.StudentViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	//ActionListener�� implements�ϴ� class�� �̸��� ButtonViewListener�� ����
	
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
