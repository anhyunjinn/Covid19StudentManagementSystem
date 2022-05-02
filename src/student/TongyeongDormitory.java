package student;
import java.util.Scanner; //import 키워드를 사용하여 라이브러리를 선언

public class TongyeongDormitory extends Student {
	//Student 클래스를 상속받는 class 이름을 ChilamDormitory로 설정
	public TongyeongDormitory(DormitoryKind kind) { //생성자 선언
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		//getUserInput 메소드 생성
		System.out.print("Enter the Student ID : ");
		int id = input.nextInt();
		//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 id에 저장
		this.setId(id);  //setId 메소드에 id 값 저장
		
		System.out.print("Enter the Student Name : ");
		String name = input.next();
		//input에서 가져온 next함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 문자를 name에 저장
		this.setName(name);  //setName 메소드에 name 값 저장
		
		int dormnum = 0;
		while (dormnum != 1 && dormnum !=2 && dormnum !=3) {
			//dormnum이 1이 아니고 2가 아닐동안 반복
			System.out.print("What is your Dormitory number? (1 or 2 or 3)");
			dormnum = input.nextInt();
			//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 dormnum에 저장
			if (dormnum == 1) { //dormnum이 1일 때
				System.out.println("You are Man");
				String sex = "Man";
				this.setSex(sex); //남자라는 정보를 setSex 메소드에 sex 값 저장
				System.out.print("Enter the Dormitory room number : ");
				int roomnumber = input.nextInt();
				//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 roomnumber에 저장
				this.setRoomnumber(roomnumber);//setRoomnumber 메소드에 roomnumber 값 저장
			}
			else if (dormnum == 2) { //dormnum이 2일 때
				System.out.print("Enter your sex(Woman or Man): ");
				String sex = input.next();
				//input에서 가져온 next함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 문자열을 sex에 저장
				this.setSex(sex); //setSex 메소드에 sex 값 저장
				System.out.print("Enter the Dormitory room number : ");
				int roomnumber = input.nextInt();
				//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 roomnumber에 저장
				this.setRoomnumber(roomnumber);//setRoomnumber 메소드에 roomnumber 값 저장
			}
			else if (dormnum == 3) { //dormnum이 3일 때
				System.out.println("You are Woman");
				String sex = "Woman";
				this.setSex(sex);//여자라는 정보를 setSex 메소드에 sex 값 저장
				System.out.print("Enter the Dormitory room number: ");
				int roomnumber = input.nextInt();
				//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 roomnumber에 저장
				this.setRoomnumber(roomnumber);//setRoomnumber 메소드에 roomnumber 값 저장
			}
		}
		System.out.print("Enter the student's temperature : ");
		double temp = input.nextDouble();
		//input에서 가져온 nextDouble함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 실수를 temp에 저장
		this.setTemp(temp);  //setTemp 메소드에 temp 값 저장
	}
}