import java.util.Scanner; //import Ű���带 ����Ͽ� ���̺귯���� ����

public class MenuManager {  //class �̸��� ManagerMenu�� ����

	public static void main(String[] args) {
		int num = 0; //������ ���� num�� 0���� ����
		Scanner input = new Scanner(System.in);
		//Scanner��� type �� �̿� �´� input�̶�� ������ ����
		//Scanner��� �޸� ������ ����� input�� �Ҵ�
		while(num!=6) { //num�� 6�� �ƴ� ���� �ݺ�
			System.out.println("#### Dorm Student Temperature Management Menu ####");
			System.out.println("1. Add Student");
			System.out.println("2. Add Temperature");
			System.out.println("3. Administrator's Phone number");
			System.out.println("4. Q&A");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.printf("Select one number between 1 - 6 : ");
			//�޴� �� ����ڿ��� ���ڸ� �Է¹��� ���� ���
			num = input.nextInt();
			//input���� ������ nextInt �Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ num�� ����
			
			switch(num) {  //num�� ������ ���� switch�� ����
			case 1:  //num�� 1�� ��, ����ڷκ��� �л�ID, �̸�, ȣ���� �Է¹��� ��
				System.out.print("Enter the Student ID : ");
				int studentID = input.nextInt();
				//input���� ������ nextInt �Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ studentID�� ����
				System.out.print("Enter the Student Name : ");
				String studentName = input.next();
				//input���� ������ next �Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ���ڸ� studentName�� ����
				System.out.print("Enter the Dormitory room number : ");
				int roomnum = input.nextInt();
				//input���� ������ nextInt �Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ roomnum�� ����
				System.out.println("Back to the menu");
				break;  //ó������ �ٽ� ����
				
			case 2:  //num�� 2�� ��, ����ڷκ��� �л��� ID�� �Է¹ް� �ش� �л��� ü���� �߰��ϵ��� �� ��
				System.out.print("Enter the student ID to add the temperature information : ");
				int studentID3 = input.nextInt();
				//input���� ������ nextInt �Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ studentID3�� ����
				System.out.print("Enter the student's temperature : ");
				double temp2 = input.nextDouble();
				//input���� ������ nextInt �Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� �Ǽ��� temp2�� ����
				System.out.println("Back to the menu");
				break;  //ó������ �ٽ� ����
				
			case 3:  //num�� 3�� ��
				System.out.println("Administrator's Phone number is 010-XXXX-XXXX");
				//�������� ��ȭ��ȣ ���
				System.out.println("Back to the menu");
				break;  //ó������ �ٽ� ����
				
			case 4:  //num�� 4�� ��, �Խ��ǿ� ���� �ۼ��� ��
				System.out.println("This is the bulletin board.");
				System.out.println("If you have something to inquire, type your opinion or question here");
				input.nextLine();
				//nextLine �Լ��� �ǳʶٴ� ���� �����ϱ� ���� �־���
				String question = input.nextLine();
				//input���� ������ nextLine �Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ���ڸ� question�� ����
				System.out.println("Back to the menu");
				break;  //ó������ �ٽ� ����
				
			case 6:  //num�� 6�� ��
				System.out.println("Close the menu");
				break;  //���α׷� ����
			}
		}
	}
}