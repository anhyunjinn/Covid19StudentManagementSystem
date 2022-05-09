import java.util.Scanner; //import 키워드를 사용하여 라이브러리를 선언

public class MenuManager {  //class 이름을 MenuManager로 지정
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Scanner라는 type 및 이에 맞는 input이라는 변수명 선언
		//Scanner라는 메모리 공간을 만들어 input에 할당
		Manager m = new Manager(input);
		//Manager class에 해당하는 변수 m을 지정 및 해당 class에 연결

		int num = 0;
		while(num!=5) { //num이 5가 아닐 동안 반복
			System.out.println("### Dorm Student Temperature"
					+ " Management Menu ###");
			System.out.println("1. Add Student Information");
			System.out.println("2. Delete Student");
			System.out.println("3. Edit Temperature");
			System.out.println("4. Q&A");
			System.out.println("5. Exit");
			System.out.printf("Select one number between 1 - 5 : ");
			//메뉴 및 사용자에게 숫자를 입력받을 문장 출력
			num = input.nextInt();
			//input에서 가져온 nextInt를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 num에 저장

			if (num==1) {//num이 1일 때
				m.addStuInfo();  //addStuInfo method 사용
			}

			else if (num==2) {//num이 2일 때
				m.deleteStudent(); //deleteStudent method 사용
			}

			else if (num==3) { //num이 3일 때
				m.editTemperature(); //editTemperature method 사용
			}

			else if (num==4) {  //num이 4일 때
				m.QnA();  //QnA method 사용
			}

			else if (num==5) {   //num이 5일 때
				m.exit();  //exit method 사용
			}
		}
	}
}
