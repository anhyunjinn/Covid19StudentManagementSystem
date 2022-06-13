package gui;

//import Ű���带 ����Ͽ� ���̺귯���� ����
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import event.StudentAdderListener;
import event.StudentCancelListener;
import manage.Manager;

public class StudentAdder extends JPanel {
	//JPanel�� ��ӹ޴� class�� �̸��� StudentAdder�� ����
	
	WindowFrame frame; //WindowFrame�� �ҷ���
	Manager m;//Manager�� �ҷ���
	
	public StudentAdder(WindowFrame frame, Manager m) { //������ ����
		this.frame = frame;
		this.m = m;
		
		JPanel panel = new JPanel(); //panel panel ����
		panel.setLayout(new SpringLayout());
		//panel�� ���̾ƿ����� SpringLayout�� ����
		
		//ID�� �Է� �޴� ĭ ����
		JLabel labelID = new JLabel("ID : ", JLabel.TRAILING);
		//label labelID ���� �� TRAILING(���������� ����)���� ����
		JTextField fieldID = new JTextField(10);
		//textfield fieldID ����
		labelID.setLabelFor(fieldID);
		panel.add(labelID); //panel�� labelID �ְ�
		panel.add(fieldID); //panel�� fieldID �߰�
		
		//�̸��� �Է� �޴� ĭ ����
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		//label labelName ���� �� TRAILING(���������� ����)���� ����
		JTextField fieldName = new JTextField(10);
		//textfield fieldName ����
		labelName.setLabelFor(fieldName);
		panel.add(labelName); //panel�� labelName �߰�
		panel.add(fieldName); //panel�� fieldName �߰�
		
		//������ �Է� �޴� ĭ ����
		JLabel labelSex = new JLabel("Sex : ", JLabel.TRAILING);
		//label labelSex ���� �� TRAILING(���������� ����)���� ����
		JTextField fieldSex = new JTextField(10);
		//textfield fieldSex ����
		labelSex.setLabelFor(fieldSex);
		panel.add(labelSex); //panel�� labelSex �߰�
		panel.add(fieldSex); //panel�� fieldSex �߰�
		
		//�� ��ȣ�� �Է� �޴� ĭ ����
		JLabel labelRoomnumber = new JLabel("Roomnumber : ", JLabel.TRAILING);
		//label labelRoomnumber ���� �� TRAILING(���������� ����)���� ����
		JTextField fieldRoomnumber = new JTextField(10);
		//textfield fieldRoomnumber ����
		labelRoomnumber.setLabelFor(fieldRoomnumber);
		panel.add(labelRoomnumber); //panel�� labelRoomnumber �߰�
		panel.add(fieldRoomnumber); //panel�� fieldRoomnumber �߰�
		
		//�л� ü���� �Է� �޴� ĭ ����
		JLabel labelTemp = new JLabel("Temperature : ", JLabel.TRAILING);
		//label labelTemp ���� �� TRAILING(���������� ����)���� ����
		JTextField fieldTemp = new JTextField(10);
		//textfield fieldTemp ����
		labelTemp.setLabelFor(fieldTemp);
		panel.add(labelTemp); //panel�� labelTemp �߰�
		panel.add(fieldTemp); //panel�� fieldTemp �߰�
		
		//�̸��� �ּҸ� �Է� �޴� ĭ ����
		JLabel labelEmail = new JLabel("E-mail : ", JLabel.TRAILING);
		//label labelEmail ���� �� TRAILING(���������� ����)���� ����
		JTextField fieldEmail = new JTextField(10);
		//textfield fieldEmail ����
		labelEmail.setLabelFor(fieldEmail);
		
		JButton saveButton = new JButton("Save"); //saveButton ����
		saveButton.addActionListener(new StudentAdderListener(fieldID, fieldName,
				fieldSex, fieldRoomnumber, fieldTemp, fieldEmail, m));
		
		JButton cancelButton = new JButton("Cancel"); //cancelButton ����
		cancelButton.addActionListener(new StudentCancelListener(frame));
		
		panel.add(labelEmail); //panel�� labelEmail �߰�
		panel.add(fieldEmail); //panel�� fieldEmail �߰�
		panel.add(saveButton); //panel�� saveButton�� �߰�
		panel.add(cancelButton); //panel�� cancelButton�� �߰�
		
		SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);
		
		this.add(panel); //panel�� �߰�
		this.setVisible(true); //������ â�� ���̵��� ����
	}
}
