package manage;
//import 키워드를 이용하여 라이브러리 선언
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
	//Serializable을 implement하는 class 이름을 Manager로 설정
	/**
	 * 
	 */
	private static final long serialVersionUID = 1530146543357958383L;
	//시리얼 넘버 받기
	
	ArrayList<UserInput> students = new ArrayList<UserInput>();
	//UserInput을 가리키는 students 배열 생성
	transient QandA qna;  //qna일 때를 제외
	transient Scanner input;  //input일 때를 제외
	Manager(Scanner input){//Manager 생성자 선언
		this.input = input;//모든 메소드에서 input 값을 사용할 수 있도록 설정
	}
	
	public void addStuInfo(String id, String name, String sex,
			String roomnumber, String temp, String email) {
		UserInput userInput = new GajwaDormitory(DormitoryKind.GajwaDormitory);
		//GajwaDormitory를 가리키는 userInput 객체 선언
		userInput.getUserInput(input);
		//userInput의 getUserInput 메소드 실행
		students.add(userInput); //students 배열에 userInput 값 저장
		userInput.printInfo(); //userInput의 printInfo 메소드 실행
	}
	
	public void addStuInfo(UserInput userInput) {
		students.add(userInput); //students 배열에 userInput 값 저장
		userInput.printInfo(); //userInput의 printInfo 메소드 실행
	}

	public void addStuInfo() {//addStudent 메소드 생성
		int kind = 0;
		UserInput userInput;  //UserInput Interface를 가리키는 객체 userInput 선언
		while(kind < 1 || kind > 3) {//while 반복문 실행
			try { //try 실행
				System.out.println("1 for Gajwa Dormitory");
				System.out.println("2 for Chilam Dormitory");
				System.out.println("3 for Tongyeong Dormitory");
				System.out.printf("Select number for Dormitory Kind "
						+ "between 1 and 3: ");
				kind = input.nextInt();
				//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 kind에 저장
				if (kind == 1) { //kind가 1일 때
					userInput = new GajwaDormitory(DormitoryKind.GajwaDormitory);
					//GajwaDormitory를 가리키는 userInput 객체 선언
					userInput.getUserInput(input);
					//userInput의 getUserInput 메소드 실행
					students.add(userInput); //students 배열에 userInput 값 저장
					userInput.printInfo(); //userInput의 printInfo 메소드 실행
					break;
				}
				else if (kind == 2) { //kind가 2일 때
					userInput = new ChilamDormitory(DormitoryKind.ChilamDormitory);
					//ChilamDormitory class를 가리키는 객체 userInput 선언
					userInput.getUserInput(input);
					//userInput의 getUserInput 메소드 실행
					students.add(userInput); //students 배열에 userInput 값 저장
					userInput.printInfo();//userInput의 printInfo 메소드 실행
					break;
				}
				else if (kind == 3) { //kind가 3일 때
					userInput = new TongyeongDormitory(DormitoryKind.TongyeongDormitory);
					//TongyeongDormitory class를 가리키는 객체 userInput 선언
					userInput.getUserInput(input);
					//userInput의 getUserInput 메소드 실행
					students.add(userInput); //students 배열에 userInput 값 저장
					userInput.printInfo();//userInput의 printInfo 메소드 실행
					break;
				}
				else { //1,2,3 외의 다른 정수를 입력하였을 때
					System.out.print("Select number for Dormitory Kind: ");
				}
			} catch (InputMismatchException e) {//예외인 경우 (정수가 아닌 값을 입력하였을 때)
				System.out.println("Please put an integer between 1 to 3!");
				if (input.hasNext()) { //input에 next가 있는 경우
					input.next();
				}
				kind = -1;
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
			UserInput userInput = students.get(i);
			if (userInput.getId() == studentId) {
				System.out.print("Student temperature: ");
				double temp = input.nextDouble();
				//input에서 가져온 nextDouble함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 temp에 저장
				userInput.setTemp(temp);  //setTemp 메소드를 이용하여 temp 값 저장
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
	
	public int size() {
		return students.size();
	}
	
	public UserInput get(int index) {
		return (Student) students.get(index);
	}
}