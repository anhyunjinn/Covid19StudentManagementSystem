package student;

import java.util.Scanner;

public class ChilamDormitory extends Student {
	
	public void getUserInput(Scanner input) {
		System.out.print("Enter the Student ID : ");
		int id = input.nextInt();
		//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 id에 저장
		this.setId(id);
		
		System.out.print("Enter the Student Name : ");
		String name = input.next();
		//input에서 가져온 next함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 문자를 name에 저장
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
				//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 roomnumber에 저장
				this.setRoomnumber(roomnumber);
			}
			else if (dormnum == 2) {
				System.out.println("Chilam 2nd's student "
						+ "is medical college or nurse college");
				System.out.print("Enter the Dormitory room number : ");
				int roomnumber = input.nextInt();
				//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 roomnumber에 저장
				this.setRoomnumber(roomnumber);
			}
		}
		System.out.print("Enter the student's temperature : ");
		double temp = input.nextDouble();
		//input에서 가져온 nextDouble함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 실수를 temp에 저장
		this.setTemp(temp);
	}
}
