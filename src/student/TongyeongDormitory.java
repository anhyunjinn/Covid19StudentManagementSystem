package student;
import java.util.Scanner; //import Ű���带 ����Ͽ� ���̺귯���� ����

public class TongyeongDormitory extends Student {
	//Student Ŭ������ ��ӹ޴� class �̸��� ChilamDormitory�� ����
	public TongyeongDormitory(DormitoryKind kind) { //������ ����
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		//getUserInput �޼ҵ� ����
		System.out.print("Enter the Student ID : ");
		int id = input.nextInt();
		//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ id�� ����
		this.setId(id);  //setId �޼ҵ忡 id �� ����
		
		System.out.print("Enter the Student Name : ");
		String name = input.next();
		//input���� ������ next�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ���ڸ� name�� ����
		this.setName(name);  //setName �޼ҵ忡 name �� ����
		
		int dormnum = 0;
		while (dormnum != 1 && dormnum !=2 && dormnum !=3) {
			//dormnum�� 1�� �ƴϰ� 2�� �ƴҵ��� �ݺ�
			System.out.print("What is your Dormitory number? (1 or 2 or 3)");
			dormnum = input.nextInt();
			//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ dormnum�� ����
			if (dormnum == 1) { //dormnum�� 1�� ��
				System.out.println("You are Man");
				String sex = "Man";
				this.setSex(sex); //���ڶ�� ������ setSex �޼ҵ忡 sex �� ����
				System.out.print("Enter the Dormitory room number : ");
				int roomnumber = input.nextInt();
				//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ roomnumber�� ����
				this.setRoomnumber(roomnumber);//setRoomnumber �޼ҵ忡 roomnumber �� ����
			}
			else if (dormnum == 2) { //dormnum�� 2�� ��
				System.out.print("Enter your sex(Woman or Man): ");
				String sex = input.next();
				//input���� ������ next�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ���ڿ��� sex�� ����
				this.setSex(sex); //setSex �޼ҵ忡 sex �� ����
				System.out.print("Enter the Dormitory room number : ");
				int roomnumber = input.nextInt();
				//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ roomnumber�� ����
				this.setRoomnumber(roomnumber);//setRoomnumber �޼ҵ忡 roomnumber �� ����
			}
			else if (dormnum == 3) { //dormnum�� 3�� ��
				System.out.println("You are Woman");
				String sex = "Woman";
				this.setSex(sex);//���ڶ�� ������ setSex �޼ҵ忡 sex �� ����
				System.out.print("Enter the Dormitory room number: ");
				int roomnumber = input.nextInt();
				//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ roomnumber�� ����
				this.setRoomnumber(roomnumber);//setRoomnumber �޼ҵ忡 roomnumber �� ����
			}
		}
		System.out.print("Enter the student's temperature : ");
		double temp = input.nextDouble();
		//input���� ������ nextDouble�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� �Ǽ��� temp�� ����
		this.setTemp(temp);  //setTemp �޼ҵ忡 temp �� ����
	}
}