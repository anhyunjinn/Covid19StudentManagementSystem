package student;

import java.util.Scanner;
//import 키워드를 사용하여 라이브러리를 선언

public class Student {//class 이름을 Student로 설정
	//각각의 변수 선언 (학생의 이름, id, 방번호, 성별, 체온)
	protected String name;
	protected int id;
	protected int roomnumber;
	protected String sex;
	protected double temp;
	protected DormitoryKind kind = DormitoryKind.GajwaDormitory;
	//기숙사 종류를 가리키는 기본적인 객체를 가좌캠퍼스 기숙사로 설정

	public Student (DormitoryKind kind, int id, String name,
			int roomnumber, String sex, double temp) {
		//Student 생성자를 사용하여 아래 변수들을 초기화
		this.kind = kind; //this 키워드를 통해 각각의 변수들을 구분
		this.name = name;
		this.id = id;
		this.roomnumber = roomnumber;
		this.sex = sex;
		this.temp = temp;
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

	public void printInfo() { //printInfo 메소드
		String dkind = "none"; //문자열 dkind 선언
		switch(this.kind){ //기숙사의 종류에 따라 출력되는 문장을 다르게 지정
		case GajwaDormitory:
			dkind = "Gajwa";
			break;
		case ChilamDormitory:
			dkind = "Chilam";
			break;
		case TongyeongDormitory:
			dkind = "Tongyeong";
			break;
		default:
		}
		System.out.println("kind: "+dkind+" name: "+name+" id: "+id
				+" sex: "+sex+" room number: "+roomnumber+" temperature: "+temp);
	}

	public void getUserInput(Scanner input) { //getUserInput 메소드 생성
		System.out.print("Enter the Student ID : ");
		int id = input.nextInt();
		//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 id에 저장
		this.setId(id); //setId 메소드에 id 값을 저장

		System.out.print("Enter the Student Name : ");
		String name = input.next();
		//input에서 가져온 next함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 문자를 name에 저장
		this.setName(name);  //setName 메소드에 name 값을 저장

		System.out.print("Enter the Dormitory number between 1 to 11: ");
		int dormnum = input.nextInt();
		//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 dormnum에 저장
		if (dormnum == 1 || dormnum == 2 || dormnum == 3 || dormnum == 6 
				|| dormnum == 8 || dormnum == 10) { //dormnum이 1,2,3,6,8,10 중 하나일 때
			System.out.println("You are Man");
			String sex = "Man";
			this.setSex(sex);  //남자라는 정보를 setSex 메소드에 sex 값 저장
			System.out.print("Enter the Dormitory room number : ");
			int roomnumber = input.nextInt();
			//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 roomnumber에 저장
			this.setRoomnumber(roomnumber);//setRoomnumber 메소드에 roomnumber 값 저장
		}
		else if (dormnum == 4 || dormnum == 5 || dormnum == 7 
				||dormnum == 9 || dormnum == 11) { //dormnum이 4,5,7,9,11 중 하나일 때
			System.out.println("You are Woman");
			String sex = "Woman";
			this.setSex(sex);  //여자라는 정보를 setSex 메소드에 sex 값 저장
			System.out.print("Enter the Dormitory room number : ");
			int roomnumber = input.nextInt();
			//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 roomnumber에 저장
			this.setRoomnumber(roomnumber);//setRoomnumber 메소드에 roomnumber 값 저장
		}
		System.out.print("Enter the student's temperature : ");
		double temp = input.nextDouble();
		//input에서 가져온 nextDouble함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 실수를 temp에 저장
		this.setTemp(temp);  //setTemp 메소드에 temp 값 저장
	}
}
