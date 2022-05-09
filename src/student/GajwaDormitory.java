package student;

import java.util.Scanner;

public class GajwaDormitory extends Student implements UserInput{
	//�߻�ȭ Ŭ���� Student Ŭ������ ��ӹް� UserInput Interface�� �����ϱ� ���� class
	//class �̸��� GajwaDormitory�� ����
	
	public GajwaDormitory(DormitoryKind kind) { //������ ����
		super(kind);
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
			//input���� ������ nextInt�� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ roomnumber�� ����
			this.setRoomnumber(roomnumber);//setRoomnumber �޼ҵ忡 roomnumber �� ����
		}
		else if (dormnum == 4 || dormnum == 5 || dormnum == 7 
				||dormnum == 9 || dormnum == 11) { //dormnum�� 4,5,7,9,11 �� �ϳ��� ��
			System.out.println("You are Woman");
			String sex = "Woman";
			this.setSex(sex);  //���ڶ�� ������ setSex �޼ҵ忡 sex �� ����
			System.out.print("Enter the Dormitory room number : ");
			int roomnumber = input.nextInt();
			//input���� ������ nextInt�� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ roomnumber�� ����
			this.setRoomnumber(roomnumber);//setRoomnumber �޼ҵ忡 roomnumber �� ����
		}
		System.out.print("Enter the student's temperature : ");
		double temp = input.nextDouble();
		//input���� ������ nextDouble�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� �Ǽ��� temp�� ����
		this.setTemp(temp);  //setTemp �޼ҵ忡 temp �� ����
	}
	
	public void printInfo() { //printInfo �޼ҵ�
		String dkind = "none"; //���ڿ� dkind ����
		switch(this.kind){ //������� ������ ���� ��µǴ� ������ �ٸ��� ����
		case GajwaDormitory: //����ķ�۽��� ��
			dkind = "Gajwa";
			break;
		case ChilamDormitory: //ĥ��ķ�۽��� ��
			dkind = "Chilam";
			break;
		case TongyeongDormitory: //�뿵ķ�۽��� ��
			dkind = "Tongyeong";
			break;
		default:
		}
		System.out.println("kind: "+dkind+" name: "+name+" id: "+id
				+" sex: "+sex+" room number: "+roomnumber+" temperature: "+temp);
	}
}
