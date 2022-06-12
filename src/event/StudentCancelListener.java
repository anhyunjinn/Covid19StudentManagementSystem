package event;

//import Ű���带 ����Ͽ� ���̺귯���� ����
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.WindowFrame;

public class StudentCancelListener implements ActionListener {
	//ActionListener�� implements �ϴ� class �̸��� StudentCancelListener�� ����
	
	WindowFrame frame; //WindowFrame�� �ҷ���
	
	public StudentCancelListener(WindowFrame frame) { //������ ����
		this.frame = frame;
	}

	@Override //actionPerformed �޼ҵ� �������̵�
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}
}
