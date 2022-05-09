package student;

public abstract class Student {
	//�߻�ȭ class �̸��� Student�� ����
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
	
	public abstract void printInfo();//�߻�ȭ �޼ҵ� ����
}
