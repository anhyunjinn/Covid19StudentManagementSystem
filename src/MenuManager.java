import java.util.Scanner; //import 키워드를 사용하여 라이브러리를 선언

public class MenuManager {  //class 이름을 ManagerMenu로 지정

	public static void main(String[] args) {
		int num = 0; //정수형 변수 num을 0으로 지정
		Scanner input = new Scanner(System.in);
		//Scanner라는 type 및 이에 맞는 input이라는 변수명 선언
		//Scanner라는 메모리 공간을 만들어 input에 할당
		while(num!=6) { //num이 6이 아닐 동안 반복
			System.out.println("#### Dorm Student Temperature Management Menu ####");
			System.out.println("1. Add Student");
			System.out.println("2. Add Temperature");
			System.out.println("3. Administrator's Phone number");
			System.out.println("4. Q&A");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.printf("Select one number between 1 - 6 : ");
			//메뉴 및 사용자에게 숫자를 입력받을 문장 출력
			num = input.nextInt();
			//input에서 가져온 nextInt 함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 num에 저장
			
			switch(num) {  //num의 종류에 따른 switch문 시작
			case 1:  //num이 1일 때, 사용자로부터 학생ID, 이름, 호수를 입력받을 것
				System.out.print("Enter the Student ID : ");
				int studentID = input.nextInt();
				//input에서 가져온 nextInt 함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 studentID에 저장
				System.out.print("Enter the Student Name : ");
				String studentName = input.next();
				//input에서 가져온 next 함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 문자를 studentName에 저장
				System.out.print("Enter the Dormitory room number : ");
				int roomnum = input.nextInt();
				//input에서 가져온 nextInt 함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 roomnum에 저장
				System.out.println("Back to the menu");
				break;  //처음부터 다시 시작
				
			case 2:  //num이 2일 때, 사용자로부터 학생의 ID를 입력받고 해당 학생의 체온을 추가하도록 할 것
				System.out.print("Enter the student ID to add the temperature information : ");
				int studentID3 = input.nextInt();
				//input에서 가져온 nextInt 함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 studentID3에 저장
				System.out.print("Enter the student's temperature : ");
				double temp2 = input.nextDouble();
				//input에서 가져온 nextInt 함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 실수를 temp2에 저장
				System.out.println("Back to the menu");
				break;  //처음부터 다시 시작
				
			case 3:  //num이 3일 때
				System.out.println("Administrator's Phone number is 010-XXXX-XXXX");
				//관리자의 전화번호 출력
				System.out.println("Back to the menu");
				break;  //처음부터 다시 시작
				
			case 4:  //num이 4일 때, 게시판에 글을 작성할 것
				System.out.println("This is the bulletin board.");
				System.out.println("If you have something to inquire, type your opinion or question here");
				input.nextLine();
				//nextLine 함수를 건너뛰는 것을 방지하기 위해 넣어줌
				String question = input.nextLine();
				//input에서 가져온 nextLine 함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 문자를 question에 저장
				System.out.println("Back to the menu");
				break;  //처음부터 다시 시작
				
			case 6:  //num이 6일 때
				System.out.println("Close the menu");
				break;  //프로그램 종료
			}
		}
	}
}