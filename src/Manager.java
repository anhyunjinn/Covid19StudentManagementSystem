import java.util.ArrayList;
import java.util.Scanner;
//import 키워드를 이용하여 라이브러리 선언

import student.ChilamDormitory;
import student.Student;

public class Manager {
	ArrayList<Student> students = new ArrayList<Student>();
	QandA qna;
	Scanner input;
	Manager(Scanner input){//Manager 생성자 선언
		this.input = input;//모든 메소드에서 input 값을 사용할 수 있도록 설정
	}

	public void addStuInfo() {//addStudent 메소드 생성
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

	public void deleteStudent() {//deleteStudent 메소드 생성
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

	public void editTemperature() {//editTemperature 메소드 생성
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


	public void QnA() {//QnA 메소드 생성
		qna = new QandA();//qna에 관한 메모리를 불러옴
		System.out.println("This is the bulletin board.");
		System.out.println("If you have something to inquire,"
				+ "type your opinion or question here");
		input.nextLine();
		qna.question = input.nextLine();
		//input에서 가져온 nextLine 함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 문자를 question에 저장
		qna.printQnA();//printQnA 메소드 실행
		System.out.println("Back to the menu");
	}

	public void exit() {//exit 메소드 생성
		System.out.println("Close the menu");
	}
}