package student;
import java.util.Scanner; //import Ű���带 ����Ͽ� ���̺귯���� ����

public class ChilamDormitory extends Student implements UserInput{
	//�߻�ȭ Ŭ���� Student Ŭ������ ��ӹް� UserInput Interface�� �����ϱ� ���� class
	//class �̸��� ChilamDormitory�� ����
	public ChilamDormitory(DormitoryKind kind) { //������ ����
		this.kind = kind;
	}	
	
	public void getUserInput(Scanner input) { //getUserInput �޼ҵ� ����
		System.out.print("Enter the Student ID : ");
		int id = input.nextInt();
		//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ id�� ����
		this.setId(id);  //setId �޼ҵ忡 id �� ����
		
		System.out.print("Enter the Student Name : ");
		String name = input.next();
		//input���� ������ next�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ���ڸ� name�� ����
		this.setName(name);  //setName �޼ҵ忡 name �� ����
		
		int dormnum = 0;
		while (dormnum != 1 && dormnum !=2) {
			//dormnum�� 1�� �ƴϰ� 2�� �ƴҵ��� �ݺ�
			System.out.print("What is your Dormitory number? (1st or 2nd)");
			dormnum = input.nextInt();
			//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ dormnum�� ����
			if (dormnum == 1) { //dormnum�� 1�� ��
				System.out.println("Chilam 1st's student"
						+ " is not medical college or nurse college");
				System.out.print("Enter your sex(Woman or Man): ");
				String sex = input.next();
				//input���� ������ next �Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ���ڿ��� sex�� ����
				this.setSex(sex);//����ڰ� �Է��� ������ setSex �޼ҵ忡 sex �� ����
				System.out.print("Enter the Dormitory room number : ");
				int roomnumber = input.nextInt();
				//input���� ������ nextInt�� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ roomnumber�� ����
				this.setRoomnumber(roomnumber);//setRoomnumber �޼ҵ忡 roomnumber �� ����
			}
			else if (dormnum == 2) { //dormnum�� 2�� ��
				System.out.println("Chilam 2nd's student "
						+ "is medical college or nurse college");
				System.out.print("Enter your sex(Woman or Man): ");
				String sex = input.next();
				//input���� ������ next �Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ���ڿ��� sex�� ����
				this.setSex(sex);//����ڰ� �Է��� ������ setSex �޼ҵ忡 sex �� ����
				System.out.print("Enter the Dormitory room number : ");
				int roomnumber = input.nextInt();
				//input���� ������ nextInt�� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ roomnumber�� ����
				this.setRoomnumber(roomnumber);//setRoomnumber �޼ҵ忡 roomnumber �� ����
			}
		}
		System.out.print("Enter the student's temperature : ");
		double temp = input.nextDouble();
		//input���� ������ nextDouble�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� �Ǽ��� temp�� ����
		this.setTemp(temp);  //setTemp �޼ҵ忡 temp �� ����
	}
	
	public void printInfo() { //printInfo �޼ҵ� ����
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
