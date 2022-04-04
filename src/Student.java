
public class Student {//class 이름을 Student로 설정
	//각각의 변수 설정 (학생의 이름, id, 방번호, 체온)
	String name;
	int id;
	int roomnumber;
	double temp;
	
	public Student() {//기본생성자 호출
	}
	
	public Student (int id, String name, int roomnumber, double temp) {
		//Student 생성자를 사용하여 아래 변수들을 초기화
		this.name = name;
		this.id = id;
		this.roomnumber = roomnumber;
		this.temp = temp;
	}
	
	public void printInfo() {//학생 정보를 출력하는 printInfo 메소드 생성
		System.out.println("id: " + id + ", name: "+ name + ", roomnumber: " + roomnumber);
	}
	
	public void addTemperature() {
		//입력한 학생의 체온을 출력하는 addTemperature 메소드 생성
		System.out.println(name+"'s temperature: "+temp+"℃");
	}
}
