
public class Student {//class �̸��� Student�� ����
	//������ ���� ���� (�л��� �̸�, id, ���ȣ, ü��)
	String name;
	int id;
	int roomnumber;
	double temp;
	
	public Student() {//�⺻������ ȣ��
	}
	
	public Student (int id, String name, int roomnumber, double temp) {
		//Student �����ڸ� ����Ͽ� �Ʒ� �������� �ʱ�ȭ
		this.name = name;
		this.id = id;
		this.roomnumber = roomnumber;
		this.temp = temp;
	}
	
	public void printInfo() {//�л� ������ ����ϴ� printInfo �޼ҵ� ����
		System.out.println("id: " + id + ", name: "+ name + ", roomnumber: " + roomnumber);
	}
	
	public void addTemperature() {
		//�Է��� �л��� ü���� ����ϴ� addTemperature �޼ҵ� ����
		System.out.println(name+"'s temperature: "+temp+"��");
	}
}
