package student;

import java.util.Scanner;

public class Student {//class 이름을 Student로 설정
	//각각의 변수 설정 (학생의 이름, id, 방번호, 체온)
	protected String name;
	protected int id;
	protected int roomnumber;
	protected double temp;
	protected DormitoryKind kind = DormitoryKind.GajwaDormitory;
	
	public Student() {//기본생성자 호출
	}
	
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

	public Student (int id, String name, int roomnumber, double temp) {
		//Student 생성자를 사용하여 아래 변수들을 초기화
		this.name = name;
		this.id = id;
		this.roomnumber = roomnumber;
		this.temp = temp;
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Enter the Student ID : ");
		int id = input.nextInt();
		//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 id에 저장
		this.setId(id);
		
		System.out.print("Enter the Student Name : ");
		String name = input.next();
		//input에서 가져온 next함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 문자를 name에 저장
		this.setName(name);
		
		System.out.print("Enter the Dormitory room number : ");
		int roomnumber = input.nextInt();
		//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 roomnumber에 저장
		this.setRoomnumber(roomnumber);

		System.out.print("Enter the student's temperature : ");
		double temp = input.nextDouble();
		//input에서 가져온 nextDouble함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 실수를 temp에 저장
		this.setTemp(temp);
	}
}