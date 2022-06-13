package listeners;

//import Ű���带 ����Ͽ� ���̺귯���� ����
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import gui.StudentAdder;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	//ActionListener�� implements�ϴ� class�� �̸��� ButtonViewListener�� ����

	WindowFrame frame; //WindowFrame�� �ҷ���

	public ButtonAddListener(WindowFrame frame) { //������ ����
		this.frame = frame;
	}

	@Override //actionPerformed �޼ҵ� �������̵�
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getStudentadder());
		frame.revalidate();
		frame.repaint();		
	}
}
