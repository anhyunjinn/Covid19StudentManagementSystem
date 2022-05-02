import java.util.ArrayList;
import java.util.Scanner;
import student.ChilamDormitory;
import student.DormitoryKind;
import student.Student;
import student.TongyeongDormitory; //import Ű���带 �̿��Ͽ� ���̺귯�� ����

public class Manager {  //class �̸��� Manager�� ����
	ArrayList<Student> students = new ArrayList<Student>();
	//students �迭 ����
	QandA qna;
	Scanner input;
	Manager(Scanner input){//Manager ������ ����
		this.input = input;//��� �޼ҵ忡�� input ���� ����� �� �ֵ��� ����
	}

	public void addStuInfo() {//addStudent �޼ҵ� ����
		int kind = 0;
		Student student;  //Student Ŭ������ ����Ű�� ��ü student ����
		while(kind != 1 && kind != 2) { //while �ݺ��� ����
			System.out.println("1 for Gajwa Dormitory");
			System.out.println("2 for Chilam Dormitory");
			System.out.println("3 for Tongyeong Dormitory");
			System.out.print("Select number for Dormitory Kind "
					+ "between 1 and 3: ");
			kind = input.nextInt();
			//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ kind�� ����
			if (kind == 1) { //kind�� 1�� ��
				student = new Student(DormitoryKind.GajwaDormitory);
				//Student class�� ����Ű�� ��ü student ����
				student.getUserInput(input);
				//Student class�� getUserInput �޼ҵ� ����
				students.add(student); //students �迭�� student �� ����
				student.printInfo(); //Student class�� printInfo �޼ҵ� ����
				break;
			}
			else if (kind == 2) { //kind�� 2�� ��
				student = new ChilamDormitory(DormitoryKind.ChilamDormitory);
				//ChilamDormitory class�� ����Ű�� ��ü student ����
				student.getUserInput(input);
				//ChilamDormitory class�� getUserInput �޼ҵ� ����
				students.add(student); //students �迭�� student �� ����
				student.printInfo();//ChilamDormitory class�� printInfo �޼ҵ� ����
				break;
			}
			else if (kind == 3) { //kind�� 3�� ��
				student = new TongyeongDormitory(DormitoryKind.TongyeongDormitory);
				//TongyeongDormitory class�� ����Ű�� ��ü student ����
				student.getUserInput(input);
				//TongyeongDormitory class�� getUserInput �޼ҵ� ����
				students.add(student); //students �迭�� student �� ����
				student.printInfo();//TongyeongDormitory class�� printInfo �޼ҵ� ����
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
			Student student = students.get(i);
			if (student.getId() == studentId) {
				System.out.print("Student temperature: ");
				double temp = input.nextDouble();
				//input���� ������ nextDouble�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ temp�� ����
				student.setTemp(temp);  //setTemp �޼ҵ带 �̿��Ͽ� temp �� ����
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