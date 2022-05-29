package gui;

//import 키워드를 사용하여 라이브러리를 선언
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class StudentAdder extends JFrame {
	//JFrame을 상속받는 class의 이름을 StudentAdder로 설정
	
	public StudentAdder() { //생성자 생성
		JPanel panel = new JPanel(); //panel panel 선언
		panel.setLayout(new SpringLayout());
		//panel의 레이아웃으로 SpringLayout을 설정
		
		//ID를 입력 받는 칸 생성
		JLabel labelID = new JLabel("ID : ", JLabel.TRAILING);
		//label labelID 생성 후 TRAILING(오른쪽으로 정렬)으로 선언
		JTextField fieldID = new JTextField(10);
		//textfield fieldID 생성
		labelID.setLabelFor(fieldID);
		panel.add(labelID); //panel에 labelID 주가
		panel.add(fieldID); //panel에 fieldID 추가
		
		//이름을 입력 받는 칸 생성
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		//label labelName 생성 후 TRAILING(오른쪽으로 정렬)으로 선언
		JTextField fieldName = new JTextField(10);
		//textfield fieldName 생성
		labelName.setLabelFor(fieldName);
		panel.add(labelName); //panel에 labelName 추가
		panel.add(fieldName); //panel에 fieldName 추가
		
		//성별을 입력 받는 칸 생성
		JLabel labelSex = new JLabel("Sex : ", JLabel.TRAILING);
		//label labelSex 생성 후 TRAILING(오른쪽으로 정렬)으로 선언
		JTextField fieldSex = new JTextField(10);
		//textfield fieldSex 생성
		labelSex.setLabelFor(fieldSex);
		panel.add(labelSex); //panel에 labelSex 추가
		panel.add(fieldSex); //panel에 fieldSex 추가
		
		//방 번호를 입력 받는 칸 생성
		JLabel labelRoomnumber = new JLabel("Roomnumber : ", JLabel.TRAILING);
		//label labelRoomnumber 생성 후 TRAILING(오른쪽으로 정렬)으로 선언
		JTextField fieldRoomnumber = new JTextField(10);
		//textfield fieldRoomnumber 생성
		labelRoomnumber.setLabelFor(fieldRoomnumber);
		panel.add(labelRoomnumber); //panel에 labelRoomnumber 추가
		panel.add(fieldRoomnumber); //panel에 fieldRoomnumber 추가
		
		//학생 체온을 입력 받는 칸 생성
		JLabel labelTemp = new JLabel("Temperature : ", JLabel.TRAILING);
		//label labelTemp 생성 후 TRAILING(오른쪽으로 정렬)으로 선언
		JTextField fieldTemp = new JTextField(10);
		//textfield fieldTemp 생성
		labelTemp.setLabelFor(fieldTemp);
		panel.add(labelTemp); //panel에 labelTemp 추가
		panel.add(fieldTemp); //panel에 fieldTemp 추가
		
		//이메일 주소를 입력 받는 칸 생성
		JLabel labelEmail = new JLabel("E-mail : ", JLabel.TRAILING);
		//label labelEmail 생성 후 TRAILING(오른쪽으로 정렬)으로 선언
		JTextField fieldEmail = new JTextField(10);
		//textfield fieldEmail 생성
		labelEmail.setLabelFor(fieldEmail);
		panel.add(labelEmail); //panel에 labelEmail 추가
		panel.add(fieldEmail); //panel에 fieldEmail 추가
		
		panel.add(new JButton("Save")); //panel에 button을 추가
		panel.add(new JButton("Cancel")); //panel에 button을 추가
		
		SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);
		
		this.setSize(500, 500); //프레임 크기 설정
		this.setContentPane(panel); //panel을 추가
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x버튼을 누를 시 종료
		this.setVisible(true); //윈도우 창에 보이도록 설정
	}
}
