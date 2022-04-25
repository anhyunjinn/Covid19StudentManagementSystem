import java.util.ArrayList;
import java.util.Scanner;
//import Ű���带 �̿��Ͽ� ���̺귯�� ����

import student.ChilamDormitory;
import student.Student;

public class Manager {
	ArrayList<Student> students = new ArrayList<Student>();
	QandA qna;
	Scanner input;
	Manager(Scanner input){//Manager ������ ����
		this.input = input;//��� �޼ҵ忡�� input ���� ����� �� �ֵ��� ����
	}

	public void addStuInfo() {//addStudent �޼ҵ� ����
		int kind = 0;
		Student student;
		while(kind != 1 && kind != 2) {
			System.out.println("1 for Gajwa Dormitory");
			System.out.println("2 for Chilam Dormitory");
			System.out.print("Select number for Dormitory Kind "
					+ "between 1 and 2: ");
			kind = input.nextInt();
			if (kind == 1) {
				student = new Student();
				student.getUserInput(input);
				students.add(student);
				break;
			}
			else if (kind == 2) {
				student = new ChilamDormitory();
				student.getUserInput(input);
				students.add(student);
				break;
			}
			else {
				System.out.print("Select number for Dormitory Kind: ");
			}
		}
		System.out.println("Back to the menu");
	}

	public void deleteStudent() {//deleteStudent �޼ҵ� ����
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		int index = -1;
		for (int i=0; i<students.size(); i++) {
			if (students.get(i).getId() == studentId) {
				index = i;
				break;
			}
		}

		if (index>=0) {
			students.remove(index);
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
		for (int i = 0; i<students.size(); i++) {
			Student student = students.get(i);
			if (student.getId() == studentId) {
				System.out.print("Student temperature: ");
				double temp = input.nextDouble();
				student.setTemp(temp);
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
}