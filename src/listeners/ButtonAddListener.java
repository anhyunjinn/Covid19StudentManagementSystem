package listeners;

//import Ű���带 ����Ͽ� ���̺귯���� ����
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import gui.StudentAdder;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	//ActionListener�� implements�ϴ� class�� �̸��� ButtonViewListener�� ����
	
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
