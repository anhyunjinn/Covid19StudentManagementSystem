package event;

//import Ű���带 ����Ͽ� ���̺귯���� ����
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.WindowFrame;

public class ButtonAdderListener implements ActionListener {
	//ActionListener�� implements �ϴ� class �̸��� ButtonAdderListener�� ����

	WindowFrame frame; //WindowFrame�� �ҷ���
	
	public ButtonAdderListener(WindowFrame frame) { //������ ����
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
