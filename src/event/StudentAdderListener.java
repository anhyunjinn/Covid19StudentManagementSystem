package event;

//import 키워드를 사용하여 라이브러리를 선언
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JTextField;
import exceptions.EmailFormatException;
import manage.Manager;
import student.DormitoryKind;
import student.GajwaDormitory;
import student.UserInput;

public class StudentAdderListener implements ActionListener {
	//ActionListener을 implements 하는 class 이름을 StudentAdderListener로 설정
		JTextField fieldID;
		JTextField fieldName;
		JTextField fieldSex;
		JTextField fieldRoomnumber;
		JTextField fieldTemp;
		JTextField fieldEmail;
		
		Manager m;
		
	public StudentAdderListener(JTextField fieldID,
			JTextField fieldName, JTextField fieldSex,
			JTextField fieldRoomnumber, JTextField fieldTemp,
			JTextField fieldEmail, Manager m) {
		//생성자 생성
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldSex = fieldSex;
		this.fieldRoomnumber = fieldRoomnumber;
		this.fieldTemp = fieldTemp;
		this.fieldEmail = fieldEmail;
		this.m = m;
	}

	@Override //actionPerformed 메소드 오버라이드
	public void actionPerformed(ActionEvent e) {
		UserInput user = new GajwaDormitory(DormitoryKind.GajwaDormitory);
		try {
			user.setId(Integer.parseInt(fieldID.getText()));
			user.setName(fieldName.getText());
			user.setSex(fieldSex.getText());
			user.setRoomnumber(Integer.parseInt(fieldRoomnumber.getText()));
			user.setTemp(Double.parseDouble(fieldTemp.getText()));
			user.setEmail(fieldEmail.getText());
			m.addStuInfo(user);
			putObject(m, "m.ser"); //putObject 메소드 실행
		} catch (EmailFormatException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(Manager m, String filename) {
		//putObejct 메소드
		try{//try 실행 (예외인지 아닌지 구분)
			FileOutputStream file = new FileOutputStream(filename);
			//문자열 filename을 저장하는 FileOutputStream 객체 생성
			ObjectOutputStream out = new ObjectOutputStream(file);
			//file에 있는 내용을 저장하는 ObjectOutputStream 객체 생성
			
			out.writeObject(m);
			//m에 저장되어있는 값을 out에 있는 writeObject 메소드를 사용하여 출력
			out.close();
			file.close();
		}catch(FileNotFoundException e) {
			//예외인 경우(FileNotFoundException)
			e.printStackTrace();
		}catch(IOException e) {
			//예외인 경우 (IOException)
			e.printStackTrace();
		}
	}
}
