package student;

import java.util.Scanner;

public class Student {//class �̸��� Student�� ����
	//������ ���� ���� (�л��� �̸�, id, ���ȣ, ü��)
	protected String name;
	protected int id;
	protected int roomnumber;
	protected double temp;
	protected DormitoryKind kind = DormitoryKind.GajwaDormitory;
	
	public Student() {//�⺻������ ȣ��
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
		//Student �����ڸ� ����Ͽ� �Ʒ� �������� �ʱ�ȭ
		this.name = name;
		this.id = id;
		this.roomnumber = roomnumber;
		this.temp = temp;
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Enter the Student ID : ");
		int id = input.nextInt();
		//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ id�� ����
		this.setId(id);
		
		System.out.print("Enter the Student Name : ");
		String name = input.next();
		//input���� ������ next�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ���ڸ� name�� ����
		this.setName(name);
		
		System.out.print("Enter the Dormitory room number : ");
		int roomnumber = input.nextInt();
		//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ roomnumber�� ����
		this.setRoomnumber(roomnumber);

		System.out.print("Enter the student's temperature : ");
		double temp = input.nextDouble();
		//input���� ������ nextDouble�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� �Ǽ��� temp�� ����
		this.setTemp(temp);
	}
}