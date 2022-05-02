import java.util.ArrayList;
import java.util.Scanner;
import student.ChilamDormitory;
import student.DormitoryKind;
import student.Student;
import student.TongyeongDormitory; //import 키워드를 이용하여 라이브러리 선언

public class Manager {  //class 이름을 Manager로 설정
	ArrayList<Student> students = new ArrayList<Student>();
	//students 배열 생성
	QandA qna;
	Scanner input;
	Manager(Scanner input){//Manager 생성자 선언
		this.input = input;//모든 메소드에서 input 값을 사용할 수 있도록 설정
	}

	public void addStuInfo() {//addStudent 메소드 생성
		int kind = 0;
		Student student;  //Student 클래스를 가리키는 객체 student 선언
		while(kind != 1 && kind != 2) { //while 반복문 실행
			System.out.println("1 for Gajwa Dormitory");
			System.out.println("2 for Chilam Dormitory");
			System.out.println("3 for Tongyeong Dormitory");
			System.out.print("Select number for Dormitory Kind "
					+ "between 1 and 3: ");
			kind = input.nextInt();
			//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 kind에 저장
			if (kind == 1) { //kind가 1일 때
				student = new Student(DormitoryKind.GajwaDormitory);
				//Student class를 가리키는 객체 student 선언
				student.getUserInput(input);
				//Student class의 getUserInput 메소드 실행
				students.add(student); //students 배열에 student 값 저장
				student.printInfo(); //Student class의 printInfo 메소드 실행
				break;
			}
			else if (kind == 2) { //kind가 2일 때
				student = new ChilamDormitory(DormitoryKind.ChilamDormitory);
				//ChilamDormitory class를 가리키는 객체 student 선언
				student.getUserInput(input);
				//ChilamDormitory class의 getUserInput 메소드 실행
				students.add(student); //students 배열에 student 값 저장
				student.printInfo();//ChilamDormitory class의 printInfo 메소드 실행
				break;
			}
			else if (kind == 3) { //kind가 3일 때
				student = new TongyeongDormitory(DormitoryKind.TongyeongDormitory);
				//TongyeongDormitory class를 가리키는 객체 student 선언
				student.getUserInput(input);
				//TongyeongDormitory class의 getUserInput 메소드 실행
				students.add(student); //students 배열에 student 값 저장
				student.printInfo();//TongyeongDormitory class의 printInfo 메소드 실행
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
		//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 studentId에 저장
		int index = -1;
		for (int i=0; i<students.size(); i++) {
			//정수 i가 students 배열의 크기보다 작을 동안 1씩 더하며 반복
			if (students.get(i).getId() == studentId) {
				//students 배열의 i번째 인덱스의 Id 값이 사용자가 입력한 Id 값과 일치할 때
				index = i;
				break;
			}
		}

		if (index>=0) {  //index가 0 이상일 때
			students.remove(index);
			//students 배열의 index 값을 삭제
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
		//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 studentId에 저장
		for (int i = 0; i<students.size(); i++) {
			Student student = students.get(i);
			if (student.getId() == studentId) {
				System.out.print("Student temperature: ");
				double temp = input.nextDouble();
				//input에서 가져온 nextDouble함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 temp에 저장
				student.setTemp(temp);  //setTemp 메소드를 이용하여 temp 값 저장
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