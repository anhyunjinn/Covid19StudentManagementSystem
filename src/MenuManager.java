import java.util.Scanner; //import Ű���带 ����Ͽ� ���̺귯���� ����

public class MenuManager {  //class �̸��� MenuManager�� ����
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Scanner��� type �� �̿� �´� input�̶�� ������ ����
		//Scanner��� �޸� ������ ����� input�� �Ҵ�
		Manager m = new Manager(input);
		//Manager class�� �ش��ϴ� ���� m�� ���� �� �ش� class�� ����

		int num = 0;
		while(num!=5) { //num�� 5�� �ƴ� ���� �ݺ�
			System.out.println("### Dorm Student Temperature"
					+ " Management Menu ###");
			System.out.println("1. Add Student Information");
			System.out.println("2. Delete Student");
			System.out.println("3. Edit Temperature");
			System.out.println("4. Q&A");
			System.out.println("5. Exit");
			System.out.printf("Select one number between 1 - 5 : ");
			//�޴� �� ����ڿ��� ���ڸ� �Է¹��� ���� ���
			num = input.nextInt();
			//input���� ������ nextInt�� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ num�� ����

			if (num==1) {//num�� 1�� ��
				m.addStuInfo();  //addStuInfo method ���
			}

			else if (num==2) {//num�� 2�� ��
				m.deleteStudent(); //deleteStudent method ���
			}

			else if (num==3) { //num�� 3�� ��
				m.editTemperature(); //editTemperature method ���
			}

			else if (num==4) {  //num�� 4�� ��
				m.QnA();  //QnA method ���
			}

			else if (num==5) {   //num�� 5�� ��
				m.exit();  //exit method ���
			}
		}
	}
}
