package listeners;

//import 키워드를 사용하여 라이브러리를 선언
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
	//ActionListener을 implements 하는 class 이름을 ButtonViewListener로 설정
	
	WindowFrame frame; //WindowFrame을 불러옴

	public ButtonViewListener (WindowFrame frame) {//생성자 생성
		this.frame = frame;
	}

	@Override //actionPerformed 메소드 오버라이드
	public void actionPerformed(ActionEvent e) {
		StudentViewer viewer = frame.getStudentviewer();
		Manager m = getObject("m.ser");
		viewer.setM(m);
		frame.setupPanel(viewer);
	}

	public static Manager getObject(String filename) {
		//Manager 클래스를 반환하는 getObject 메소드
		Manager m = null; //m 값을 공백으로 둔다
		try{ //try 실행 (예외인지 아닌지 구분)
			FileInputStream file = new FileInputStream(filename);
			//문자열 filename을 저장하는 FileInputStream 객체 생성
			ObjectInputStream in = new ObjectInputStream(file);
			//file에 있는 내용을 저장하는 ObjectInputStream 객체 생성
			m = (Manager)in.readObject();//in에 있는 file 값을 읽음(Manager로 형변환)
			in.close(); 
			file.close();
		}catch(FileNotFoundException e) {
			//예외인 경우(FileNotFoundException)
			return m;
		}catch(IOException e) {
			//예외인 경우 (IOException)
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//예외인 경우 (ClassNotFoundException)
			e.printStackTrace();
		}
		return m;
	}
}

