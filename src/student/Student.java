package student;

//import 키워드로 라이브러리 선언
import java.util.Scanner;
import exceptions.EmailFormatException;
import java.io.Serializable;

public abstract class Student implements UserInput, Serializable {
	//UserInput class를 implement 하고 Serialize 하는 추상화 class 이름을 Student로 설정
	/**
	 * 
	 */
	private static final long serialVersionUID = 7385961195489286624L;
	//시리얼 넘버 받기

	//각각의 변수 선언 (학생의 이름, id, 방번호, 성별, 체온, 이메일)
	protected String name;
	protected int id;
	protected int roomnumber;
	protected String sex;
	protected double temp;
	protected String email;
	protected DormitoryKind kind = DormitoryKind.GajwaDormitory;
	//기숙사 종류를 가리키는 기본적인 객체를 가좌캠퍼스 기숙사로 설정

	public Student (DormitoryKind kind, int id, String name,
			int roomnumber, String sex, double temp, String email) {
		//Student 생성자를 사용하여 아래 변수들을 초기화
		this.kind = kind; //this 키워드를 통해 각각의 변수들을 구분
		this.name = name;
		this.id = id;
		this.roomnumber = roomnumber;
		this.sex = sex;
		this.temp = temp;
		this.email=email;
	}

	public Student() {//Student 생성자 선언
	}

	public Student(DormitoryKind kind) {
		this.kind = kind;
	}

	//각각에 해당하는 setters, getters 메소드들을 아래에 생성
	public DormitoryKind getKind() {
		return kind;
	}

	public void setKind(DormitoryKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoomnumber() {
		return roomnumber;
	}

	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailFormatException {
		//EmailFormatException을 throw 하는 메소드 setEmail
		if (!email.contains("@") && !email.equals("")) {
			//email에 @가 포함되어있지 않고 공백인 상태가 아닐 때
			throw new EmailFormatException(); //예외인 경우 throw
		}
		this.email = email;
	}

	public void setUserEmail(Scanner input) {
		String email = "";
		while (!email.contains("@")) { //email에 @가 포함되지 않을 동안 반복
			System.out.print("Enter your E-mail address: ");
			email = input.next();
			//input에서 가져온 next 함수를 이용하여 콘솔에서 읽어온 문자열을 email에 저장
			try {  //try 실행
				this.setEmail(email);//사용자가 입력한 정보를 setEmail 메소드에 저장
			} catch (EmailFormatException e) { //예외인 경우
				System.out.println("Incorrect Email Format."
						+ " put the sex that contains @");
			}
		}
	}
	
	public void setUserSex (Scanner input) {
		System.out.print("Enter your sex(Woman or Man): ");
		String sex = input.next();
		//input에서 가져온 next 함수를 이용하여 콘솔에서 읽어온 문자열을 sex에 저장
		this.setSex(sex); //setSex 메소드에 sex 값 저장
	}

	public void setUserID (Scanner input) {
		System.out.print("Enter the Student ID : ");
		int id = input.nextInt();
		//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 id에 저장
		this.setId(id);  //setId 메소드에 id 값 저장
	}

	public void setUserName(Scanner input) {
		System.out.print("Enter the Student Name : ");
		String name = input.next();
		//input에서 가져온 next함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 문자를 name에 저장
		this.setName(name);  //setName 메소드에 name 값 저장
	}

	public void setUserTemp(Scanner input) {
		System.out.print("Enter the student's temperature : ");
		double temp = input.nextDouble();
		//input에서 가져온 nextDouble함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 실수를 temp에 저장
		this.setTemp(temp);  //setTemp 메소드에 temp 값 저장
	}
	
	public void setUserRoomnumber(Scanner input) {
		System.out.print("Enter the Dormitory room number : ");
		int roomnumber = input.nextInt();
		//input에서 가져온 nextInt를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 roomnumber에 저장
		this.setRoomnumber(roomnumber);//setRoomnumber 메소드에 roomnumber 값 저장
	}

	public abstract void printInfo();//추상화 메소드 생성
}
