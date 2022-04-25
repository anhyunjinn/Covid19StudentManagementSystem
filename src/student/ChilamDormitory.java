package student;

import java.util.Scanner;

public class ChilamDormitory extends Student {
	
	public void getUserInput(Scanner input) {
		System.out.print("Enter the Student ID : ");
		int id = input.nextInt();
		//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ id�� ����
		this.setId(id);
		
		System.out.print("Enter the Student Name : ");
		String name = input.next();
		//input���� ������ next�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ���ڸ� name�� ����
		this.setName(name);
		
		int dormnum = 0;
		while (dormnum != 1 && dormnum !=2) {
			System.out.print("What is your Dormitory number? (1st or 2nd)");
			dormnum = input.nextInt();
			if (dormnum == 1) {
				System.out.println("Chilam 1st's student"
						+ " is not medical college or nurse college");
				System.out.print("Enter the Dormitory room number : ");
				int roomnumber = input.nextInt();
				//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ roomnumber�� ����
				this.setRoomnumber(roomnumber);
			}
			else if (dormnum == 2) {
				System.out.println("Chilam 2nd's student "
						+ "is medical college or nurse college");
				System.out.print("Enter the Dormitory room number : ");
				int roomnumber = input.nextInt();
				//input���� ������ nextInt�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� ������ roomnumber�� ����
				this.setRoomnumber(roomnumber);
			}
		}
		System.out.print("Enter the student's temperature : ");
		double temp = input.nextDouble();
		//input���� ������ nextDouble�Լ��� �̿��Ͽ� �ֿܼ��� �о�� ����ڰ� �Է��� �Ǽ��� temp�� ����
		this.setTemp(temp);
	}
}
