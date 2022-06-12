package event;

//import Ű���带 ����Ͽ� ���̺귯���� ����
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
	//ActionListener�� implements �ϴ� class �̸��� StudentAdderListener�� ����
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
		//������ ����
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldSex = fieldSex;
		this.fieldRoomnumber = fieldRoomnumber;
		this.fieldTemp = fieldTemp;
		this.fieldEmail = fieldEmail;
		this.m = m;
	}

	@Override //actionPerformed �޼ҵ� �������̵�
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
			putObject(m, "m.ser"); //putObject �޼ҵ� ����
		} catch (EmailFormatException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(Manager m, String filename) {
		//putObejct �޼ҵ�
		try{//try ���� (�������� �ƴ��� ����)
			FileOutputStream file = new FileOutputStream(filename);
			//���ڿ� filename�� �����ϴ� FileOutputStream ��ü ����
			ObjectOutputStream out = new ObjectOutputStream(file);
			//file�� �ִ� ������ �����ϴ� ObjectOutputStream ��ü ����
			
			out.writeObject(m);
			//m�� ����Ǿ��ִ� ���� out�� �ִ� writeObject �޼ҵ带 ����Ͽ� ���
			out.close();
			file.close();
		}catch(FileNotFoundException e) {
			//������ ���(FileNotFoundException)
			e.printStackTrace();
		}catch(IOException e) {
			//������ ��� (IOException)
			e.printStackTrace();
		}
	}
}
