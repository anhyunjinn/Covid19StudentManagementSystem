package student;

public abstract class Student {
	//추상화 class 이름을 Student로 설정
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
	
	public abstract void printInfo();//추상화 메소드 생성
}
