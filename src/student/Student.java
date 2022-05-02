package student;

import java.util.Scanner;
//import Ű���带 ����Ͽ� ���̺귯���� ����

public class Student {//class �̸��� Student�� ����
	//������ ���� ���� (�л��� �̸�, id, ���ȣ, ����, ü��)
	protected String name;
	protected int id;
	protected int roomnumber;
	protected String sex;
	protected double temp;
	protected DormitoryKind kind = DormitoryKind.GajwaDormitory;
	//����� ������ ����Ű�� �⺻���� ��ü�� ����ķ�۽� ������ ����

	public Student (DormitoryKind kind, int id, String name,
			int roomnumber, String sex, double temp) {
		//Student �����ڸ� ����Ͽ� �Ʒ� �������� �ʱ�ȭ
		this.kind = kind; //this Ű���带 ���� ������ �������� ����
		this.name = name;
		this.id = id;
		this.roomnumber = roomnumber;
		this.sex = sex;
		this.temp = temp;
	}

	public Student() {//Student ������ ����
	}

	public Student(DormitoryKind kind) {
		this.kind = kind;
	}

	//������ �ش��ϴ� setters, getters �޼ҵ���� �Ʒ��� ����
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

	public void printInfo() { //printInfo �޼ҵ�
		String dkind = "none"; //���ڿ� dkind ����
		switch(this.kind){ //������� ������ ���� ��µǴ� ������ �ٸ��� ����
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

	public void getUserInput(Scanner input) { //getUserInput �޼ҵ� ����
		System.out.print("Enter the Student ID : ");
		int id = input.nextInt();
		//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ id�� ����
		this.setId(id); //setId �޼ҵ忡 id ���� ����

		System.out.print("Enter the Student Name : ");
		String name = input.next();
		//input���� ������ next�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ���ڸ� name�� ����
		this.setName(name);  //setName �޼ҵ忡 name ���� ����

		System.out.print("Enter the Dormitory number between 1 to 11: ");
		int dormnum = input.nextInt();
		//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ dormnum�� ����
		if (dormnum == 1 || dormnum == 2 || dormnum == 3 || dormnum == 6 
				|| dormnum == 8 || dormnum == 10) { //dormnum�� 1,2,3,6,8,10 �� �ϳ��� ��
			System.out.println("You are Man");
			String sex = "Man";
			this.setSex(sex);  //���ڶ�� ������ setSex �޼ҵ忡 sex �� ����
			System.out.print("Enter the Dormitory room number : ");
			int roomnumber = input.nextInt();
			//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ roomnumber�� ����
			this.setRoomnumber(roomnumber);//setRoomnumber �޼ҵ忡 roomnumber �� ����
		}
		else if (dormnum == 4 || dormnum == 5 || dormnum == 7 
				||dormnum == 9 || dormnum == 11) { //dormnum�� 4,5,7,9,11 �� �ϳ��� ��
			System.out.println("You are Woman");
			String sex = "Woman";
			this.setSex(sex);  //���ڶ�� ������ setSex �޼ҵ忡 sex �� ����
			System.out.print("Enter the Dormitory room number : ");
			int roomnumber = input.nextInt();
			//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ roomnumber�� ����
			this.setRoomnumber(roomnumber);//setRoomnumber �޼ҵ忡 roomnumber �� ����
		}
		System.out.print("Enter the student's temperature : ");
		double temp = input.nextDouble();
		//input���� ������ nextDouble�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� �Ǽ��� temp�� ����
		this.setTemp(temp);  //setTemp �޼ҵ忡 temp �� ����
	}
}
