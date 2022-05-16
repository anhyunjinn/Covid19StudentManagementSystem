package student;
import java.util.Scanner; //import Ű���带 ����Ͽ� ���̺귯���� ����

public class ChilamDormitory extends Student implements UserInput{
	//�߻�ȭ Ŭ���� Student Ŭ������ ��ӹް� UserInput Interface�� �����ϱ� ���� class
	//class �̸��� ChilamDormitory�� ����
	public ChilamDormitory(DormitoryKind kind) { //������ ����
		this.kind = kind;
	}	

	public void getUserInput(Scanner input) { //getUserInput �޼ҵ� ����
		this.setUserID(input);
		this.setUserName(input);
		int dormnum = 0;
		while (dormnum != 1 && dormnum !=2) {
			//dormnum�� 1�� �ƴϰ� 2�� �ƴҵ��� �ݺ�
			System.out.print("What is your Dormitory number? (1st or 2nd)");
			dormnum = input.nextInt();
			//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ������ dormnum�� ����
			if (dormnum == 1) { //dormnum�� 1�� ��
				System.out.println("Chilam 1st's student"
						+ " is not medical college or nurse college");
				this.setUserSex(input);  //setUserSex �޼ҵ� ����
				this.setUserRoomnumber(input); //setUserRoomnumber �޼ҵ� ����
			}
			else if (dormnum == 2) { //dormnum�� 2�� ��
				System.out.println("Chilam 2nd's student "
						+ "is medical college or nurse college");
				this.setUserSex(input);  //setUserSex �޼ҵ� ����
				this.setUserRoomnumber(input); //setUserRoomnumber �޼ҵ� ����
			}
		}
		this.setUserTemp(input); //setUserTemp �޼ҵ� ����
		this.setUserEmail(input);//setUserEmail �޼ҵ� ����
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
				+" sex: "+sex+" room number: "+roomnumber+
				" temperature: "+temp + " e-mail: "+email);
	}
}
