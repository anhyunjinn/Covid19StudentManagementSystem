package student;

//import Ű����� ���̺귯�� ����
import java.util.Scanner;
import exceptions.EmailFormatException;
import java.io.Serializable;

public abstract class Student implements UserInput, Serializable {
	//UserInput class�� implement �ϰ� Serialize �ϴ� �߻�ȭ class �̸��� Student�� ����
	/**
	 * 
	 */
	private static final long serialVersionUID = 7385961195489286624L;
	//�ø��� �ѹ� �ޱ�

	//������ ���� ���� (�л��� �̸�, id, ���ȣ, ����, ü��, �̸���)
	protected String name;
	protected int id;
	protected int roomnumber;
	protected String sex;
	protected double temp;
	protected String email;
	protected DormitoryKind kind = DormitoryKind.GajwaDormitory;
	//����� ������ ����Ű�� �⺻���� ��ü�� ����ķ�۽� ������ ����

	public Student (DormitoryKind kind, int id, String name,
			int roomnumber, String sex, double temp, String email) {
		//Student �����ڸ� ����Ͽ� �Ʒ� �������� �ʱ�ȭ
		this.kind = kind; //this Ű���带 ���� ������ �������� ����
		this.name = name;
		this.id = id;
		this.roomnumber = roomnumber;
		this.sex = sex;
		this.temp = temp;
		this.email=email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailFormatException {
		//EmailFormatException�� throw �ϴ� �޼ҵ� setEmail
		if (!email.contains("@") && !email.equals("")) {
			//email�� @�� ���ԵǾ����� �ʰ� ������ ���°� �ƴ� ��
			throw new EmailFormatException(); //������ ��� throw
		}
		this.email = email;
	}

	public void setUserEmail(Scanner input) {
		String email = "";
		while (!email.contains("@")) { //email�� @�� ���Ե��� ���� ���� �ݺ�
			System.out.print("Enter your E-mail address: ");
			email = input.next();
			//input���� ������ next �Լ��� �̿��Ͽ� �ֿܼ��� �о�� ���ڿ��� email�� ����
			try {  //try ����
				this.setEmail(email);//����ڰ� �Է��� ������ setEmail �޼ҵ忡 ����
			} catch (EmailFormatException e) { //������ ���
				System.out.println("Incorrect Email Format."
						+ " put the sex that contains @");
			}
		}
	}
	
	public void setUserSex (Scanner input) {
		System.out.print("Enter your sex(Woman or Man): ");
		String sex = input.next();
		//input���� ������ next �Լ��� �̿��Ͽ� �ֿܼ��� �о�� ���ڿ��� sex�� ����
		this.setSex(sex); //setSex �޼ҵ忡 sex �� ����
	}

	public void setUserID (Scanner input) {
		System.out.print("Enter the Student ID : ");
		int id = input.nextInt();
		//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ id�� ����
		this.setId(id);  //setId �޼ҵ忡 id �� ����
	}

	public void setUserName(Scanner input) {
		System.out.print("Enter the Student Name : ");
		String name = input.next();
		//input���� ������ next�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ���ڸ� name�� ����
		this.setName(name);  //setName �޼ҵ忡 name �� ����
	}

	public void setUserTemp(Scanner input) {
		System.out.print("Enter the student's temperature : ");
		double temp = input.nextDouble();
		//input���� ������ nextDouble�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� �Ǽ��� temp�� ����
		this.setTemp(temp);  //setTemp �޼ҵ忡 temp �� ����
	}
	
	public void setUserRoomnumber(Scanner input) {
		System.out.print("Enter the Dormitory room number : ");
		int roomnumber = input.nextInt();
		//input���� ������ nextInt�� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ roomnumber�� ����
		this.setRoomnumber(roomnumber);//setRoomnumber �޼ҵ忡 roomnumber �� ����
	}

	public abstract void printInfo();//�߻�ȭ �޼ҵ� ����
}
