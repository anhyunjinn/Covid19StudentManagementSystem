package student;
import java.util.Scanner; //import Ű���带 ����Ͽ� ���̺귯���� ����

public class TongyeongDormitory extends Student implements UserInput{
	//�߻�ȭ Ŭ���� Student Ŭ������ ��ӹް� UserInput Interface�� �����ϱ� ���� class
	//class �̸��� TongyeongDormitory�� ����
	public TongyeongDormitory(DormitoryKind kind) { //������ ����
		super(kind);
	}

	public void getUserInput(Scanner input) {
		//getUserInput �޼ҵ� ����
		this.setUserID(input); //setUserID �޼ҵ� ����
		this.setUserName(input);//setUserName �޼ҵ� ����		
		int dormnum = 0;
		while (dormnum != 1 && dormnum !=2 && dormnum !=3) {
			//dormnum�� 1�� �ƴϰ� 2�� �ƴҵ��� �ݺ�
			System.out.print("What is your Dormitory number? (1 or 2 or 3)");
			dormnum = input.nextInt();
			//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ������ dormnum�� ����
			if (dormnum == 1) { //dormnum�� 1�� ��
				System.out.println("You are Man");
				String sex = "Man";
				this.setSex(sex); //���ڶ�� ������ setSex �޼ҵ忡 ����
				this.setUserRoomnumber(input); //setUserRoomnumber �޼ҵ� ����
			}
			else if (dormnum == 2) { //dormnum�� 2�� ��
				this.setUserSex(input); //setUserSex �޼ҵ� ����
				this.setUserRoomnumber(input); //setUserRoomnumber �޼ҵ� ����
			}
			else if (dormnum == 3) { //dormnum�� 3�� ��
				System.out.println("You are Woman");
				String sex = "Woman";
				this.setSex(sex);//���ڶ�� ������ setSex �޼ҵ忡 ����
				this.setUserRoomnumber(input); //setUserRoomnumber �޼ҵ� ����
			}
		}
		this.setUserTemp(input);//setUserTemp �޼ҵ� ����
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
				" temperature: "+temp+ " e-mail: "+email);
	}
}