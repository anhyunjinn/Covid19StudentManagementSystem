import java.util.Scanner;
//import 키워드를 이용하여 라이브러리 선언

public class Manager {
	Student student;
	QandA qna;
	Scanner input;
	Manager(Scanner input){//Manager 생성자 선언
		this.input = input;//모든 메소드에서 input 값을 사용할 수 있도록 설정
	}

	public void addStudent() {//addStudent 메소드 생성
		student = new Student();//student에 관한 메모리를 불러옴
		System.out.print("Enter the Student ID : ");
		student.id = input.nextInt();
		//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 student.id에 저장
		System.out.print("Enter the Student Name : ");
		student.name = input.next();
		//input에서 가져온 next함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 문자를 student.name에 저장
		System.out.print("Enter the Dormitory room number : ");
		student.roomnumber = input.nextInt();
		//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 student.roomnumber에 저장
		student.printInfo();//printInfo 메소드 실행
		System.out.println("Back to the menu");
	}

	public void addTemp() {//addTemp 메소드 생성
		System.out.print("Enter the student ID to add the temperature information : ");
		int studentID = input.nextInt();
		//input에서 가져온 nextInt 함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 studentID에 저장
		if (student.id == studentID) {
			System.out.print("Enter the student's temperature : ");
			student.temp = input.nextDouble();
			//input에서 가져온 nextInt 함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 실수를 student.temp에 저장
			student.addTemperature();//addTemperature 메소드 실행
		}
		System.out.println("Back to the menu");
	}

	public void showPN() {//showPN 메소드 생성
		System.out.println("Administrator's Phone number is 010-XXXX-XXXX");
		//관리자의 전화번호 출력
		System.out.println("Back to the menu");
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
