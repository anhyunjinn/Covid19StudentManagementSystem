import java.util.Scanner;
//import Ű���带 �̿��Ͽ� ���̺귯�� ����

public class Manager {
	Student student;
	QandA qna;
	Scanner input;
	Manager(Scanner input){//Manager ������ ����
		this.input = input;//��� �޼ҵ忡�� input ���� ����� �� �ֵ��� ����
	}

	public void addStudent() {//addStudent �޼ҵ� ����
		student = new Student();//student�� ���� �޸𸮸� �ҷ���
		System.out.print("Enter the Student ID : ");
		student.id = input.nextInt();
		//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ student.id�� ����
		System.out.print("Enter the Student Name : ");
		student.name = input.next();
		//input���� ������ next�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ���ڸ� student.name�� ����
		System.out.print("Enter the Dormitory room number : ");
		student.roomnumber = input.nextInt();
		//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ student.roomnumber�� ����
		student.printInfo();//printInfo �޼ҵ� ����
		System.out.println("Back to the menu");
	}

	public void addTemp() {//addTemp �޼ҵ� ����
		System.out.print("Enter the student ID to add the temperature information : ");
		int studentID = input.nextInt();
		//input���� ������ nextInt �Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ studentID�� ����
		if (student.id == studentID) {
			System.out.print("Enter the student's temperature : ");
			student.temp = input.nextDouble();
			//input���� ������ nextInt �Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� �Ǽ��� student.temp�� ����
			student.addTemperature();//addTemperature �޼ҵ� ����
		}
		System.out.println("Back to the menu");
	}

	public void showPN() {//showPN �޼ҵ� ����
		System.out.println("Administrator's Phone number is 010-XXXX-XXXX");
		//�������� ��ȭ��ȣ ���
		System.out.println("Back to the menu");
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
