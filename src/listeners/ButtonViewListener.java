package listeners;

//import Ű���带 ����Ͽ� ���̺귯���� ����
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import gui.StudentViewer;
import gui.WindowFrame;
import manage.Manager;

public class ButtonViewListener implements ActionListener{
	//ActionListener�� implements �ϴ� class �̸��� ButtonViewListener�� ����
	
	WindowFrame frame; //WindowFrame�� �ҷ���

	public ButtonViewListener (WindowFrame frame) {//������ ����
		this.frame = frame;
	}

	@Override //actionPerformed �޼ҵ� �������̵�
	public void actionPerformed(ActionEvent e) {
		StudentViewer viewer = frame.getStudentviewer();
		Manager m = getObject("m.ser");
		viewer.setM(m);
		frame.setupPanel(viewer);
	}

	public static Manager getObject(String filename) {
		//Manager Ŭ������ ��ȯ�ϴ� getObject �޼ҵ�
		Manager m = null; //m ���� �������� �д�
		try{ //try ���� (�������� �ƴ��� ����)
			FileInputStream file = new FileInputStream(filename);
			//���ڿ� filename�� �����ϴ� FileInputStream ��ü ����
			ObjectInputStream in = new ObjectInputStream(file);
			//file�� �ִ� ������ �����ϴ� ObjectInputStream ��ü ����
			m = (Manager)in.readObject();//in�� �ִ� file ���� ����(Manager�� ����ȯ)
			in.close(); 
			file.close();
		}catch(FileNotFoundException e) {
			//������ ���(FileNotFoundException)
			return m;
		}catch(IOException e) {
			//������ ��� (IOException)
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//������ ��� (ClassNotFoundException)
			e.printStackTrace();
		}
		return m;
	}
}

