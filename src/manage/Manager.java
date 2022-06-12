package manage;
//import Ű���带 �̿��Ͽ� ���̺귯�� ����
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import student.ChilamDormitory;
import student.DormitoryKind;
import student.GajwaDormitory;
import student.Student;
import student.TongyeongDormitory;
import student.UserInput;

public class Manager implements Serializable{
	//Serializable�� implement�ϴ� class �̸��� Manager�� ����
	/**
	 * 
	 */
	private static final long serialVersionUID = 1530146543357958383L;
	//�ø��� �ѹ� �ޱ�
	
	ArrayList<UserInput> students = new ArrayList<UserInput>();
	//UserInput�� ����Ű�� students �迭 ����
	transient QandA qna;  //qna�� ���� ����
	transient Scanner input;  //input�� ���� ����
	Manager(Scanner input){//Manager ������ ����
		this.input = input;//��� �޼ҵ忡�� input ���� ����� �� �ֵ��� ����
	}
	
	public void addStuInfo(String id, String name, String sex,
			String roomnumber, String temp, String email) {
		UserInput userInput = new GajwaDormitory(DormitoryKind.GajwaDormitory);
		//GajwaDormitory�� ����Ű�� userInput ��ü ����
		userInput.getUserInput(input);
		//userInput�� getUserInput �޼ҵ� ����
		students.add(userInput); //students �迭�� userInput �� ����
		userInput.printInfo(); //userInput�� printInfo �޼ҵ� ����
	}
	
	public void addStuInfo(UserInput userInput) {
		students.add(userInput); //students �迭�� userInput �� ����
		userInput.printInfo(); //userInput�� printInfo �޼ҵ� ����
	}

	public void addStuInfo() {//addStudent �޼ҵ� ����
		int kind = 0;
		UserInput userInput;  //UserInput Interface�� ����Ű�� ��ü userInput ����
		while(kind < 1 || kind > 3) {//while �ݺ��� ����
			try { //try ����
				System.out.println("1 for Gajwa Dormitory");
				System.out.println("2 for Chilam Dormitory");
				System.out.println("3 for Tongyeong Dormitory");
				System.out.printf("Select number for Dormitory Kind "
						+ "between 1 and 3: ");
				kind = input.nextInt();
				//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ kind�� ����
				if (kind == 1) { //kind�� 1�� ��
					userInput = new GajwaDormitory(DormitoryKind.GajwaDormitory);
					//GajwaDormitory�� ����Ű�� userInput ��ü ����
					userInput.getUserInput(input);
					//userInput�� getUserInput �޼ҵ� ����
					students.add(userInput); //students �迭�� userInput �� ����
					userInput.printInfo(); //userInput�� printInfo �޼ҵ� ����
					break;
				}
				else if (kind == 2) { //kind�� 2�� ��
					userInput = new ChilamDormitory(DormitoryKind.ChilamDormitory);
					//ChilamDormitory class�� ����Ű�� ��ü userInput ����
					userInput.getUserInput(input);
					//userInput�� getUserInput �޼ҵ� ����
					students.add(userInput); //students �迭�� userInput �� ����
					userInput.printInfo();//userInput�� printInfo �޼ҵ� ����
					break;
				}
				else if (kind == 3) { //kind�� 3�� ��
					userInput = new TongyeongDormitory(DormitoryKind.TongyeongDormitory);
					//TongyeongDormitory class�� ����Ű�� ��ü userInput ����
					userInput.getUserInput(input);
					//userInput�� getUserInput �޼ҵ� ����
					students.add(userInput); //students �迭�� userInput �� ����
					userInput.printInfo();//userInput�� printInfo �޼ҵ� ����
					break;
				}
				else { //1,2,3 ���� �ٸ� ������ �Է��Ͽ��� ��
					System.out.print("Select number for Dormitory Kind: ");
				}
			} catch (InputMismatchException e) {//������ ��� (������ �ƴ� ���� �Է��Ͽ��� ��)
				System.out.println("Please put an integer between 1 to 3!");
				if (input.hasNext()) { //input�� next�� �ִ� ���
					input.next();
				}
				kind = -1;
			}
		}
		System.out.println("Back to the menu");
	}

	public void deleteStudent() {//deleteStudent �޼ҵ� ����
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ studentId�� ����
		int index = -1;
		for (int i=0; i<students.size(); i++) {
			//���� i�� students �迭�� ũ�⺸�� ���� ���� 1�� ���ϸ� �ݺ�
			if (students.get(i).getId() == studentId) {
				//students �迭�� i��° �ε����� Id ���� ����ڰ� �Է��� Id ���� ��ġ�� ��
				index = i;
				break;
			}
		}

		if (index>=0) {  //index�� 0 �̻��� ��
			students.remove(index);
			//students �迭�� index ���� ����
			System.out.println("the student "+ studentId + " is deleted");
		}
		else {
			System.out.println("the student has not been registered");
			return;
		}
		System.out.println("Back to the menu");
	}

	public void editTemperature() {//editTemperature �޼ҵ� ����
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ studentId�� ����
		for (int i = 0; i<students.size(); i++) {
			UserInput userInput = students.get(i);
			if (userInput.getId() == studentId) {
				System.out.print("Student temperature: ");
				double temp = input.nextDouble();
				//input���� ������ nextDouble�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ temp�� ����
				userInput.setTemp(temp);  //setTemp �޼ҵ带 �̿��Ͽ� temp �� ����
			}
			else {
				System.out.println("the student has not been registered");
				return;
			}
		}
	}

	public void QnA() {//QnA �޼ҵ� ����
		qna = new QandA();//qna�� ���� �޸𸮸� �ҷ���
		System.out.println("This is the bulletin board.");
		System.out.println("If you have something to inquire,"
				+ "type your opinion or question here");
		input.nextLine();
		qna.question = input.nextLine();
		//input���� ������ nextLine �Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ���ڸ� question�� ����
		qna.printQnA();//printQnA �޼ҵ� ����
		System.out.println("Back to the menu");
	}

	public void exit() {//exit �޼ҵ� ����
		System.out.println("Close the menu");
	}
	
	public int size() {
		return students.size();
	}
	
	public UserInput get(int index) {
		return (Student) students.get(index);
	}
}