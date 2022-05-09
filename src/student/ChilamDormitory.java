package student;
import java.util.Scanner; //import 키워드를 사용하여 라이브러리를 선언

public class ChilamDormitory extends Student implements UserInput{
	//추상화 클래스 Student 클래스를 상속받고 UserInput Interface를 구현하기 위한 class
	//class 이름을 ChilamDormitory로 설정
	public ChilamDormitory(DormitoryKind kind) { //생성자 선언
		this.kind = kind;
	}	
	
	public void getUserInput(Scanner input) { //getUserInput 메소드 생성
		System.out.print("Enter the Student ID : ");
		int id = input.nextInt();
		//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 id에 저장
		this.setId(id);  //setId 메소드에 id 값 저장
		
		System.out.print("Enter the Student Name : ");
		String name = input.next();
		//input에서 가져온 next함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 문자를 name에 저장
		this.setName(name);  //setName 메소드에 name 값 저장
		
		int dormnum = 0;
		while (dormnum != 1 && dormnum !=2) {
			//dormnum이 1이 아니고 2가 아닐동안 반복
			System.out.print("What is your Dormitory number? (1st or 2nd)");
			dormnum = input.nextInt();
			//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 dormnum에 저장
			if (dormnum == 1) { //dormnum이 1일 때
				System.out.println("Chilam 1st's student"
						+ " is not medical college or nurse college");
				System.out.print("Enter your sex(Woman or Man): ");
				String sex = input.next();
				//input에서 가져온 next 함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 문자열을 sex에 저장
				this.setSex(sex);//사용자가 입력한 정보를 setSex 메소드에 sex 값 저장
				System.out.print("Enter the Dormitory room number : ");
				int roomnumber = input.nextInt();
				//input에서 가져온 nextInt를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 roomnumber에 저장
				this.setRoomnumber(roomnumber);//setRoomnumber 메소드에 roomnumber 값 저장
			}
			else if (dormnum == 2) { //dormnum이 2일 때
				System.out.println("Chilam 2nd's student "
						+ "is medical college or nurse college");
				System.out.print("Enter your sex(Woman or Man): ");
				String sex = input.next();
				//input에서 가져온 next 함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 문자열을 sex에 저장
				this.setSex(sex);//사용자가 입력한 정보를 setSex 메소드에 sex 값 저장
				System.out.print("Enter the Dormitory room number : ");
				int roomnumber = input.nextInt();
				//input에서 가져온 nextInt를 이용하여 콘솔에서 읽어온 사용자가 입력한 정수를 roomnumber에 저장
				this.setRoomnumber(roomnumber);//setRoomnumber 메소드에 roomnumber 값 저장
			}
		}
		System.out.print("Enter the student's temperature : ");
		double temp = input.nextDouble();
		//input에서 가져온 nextDouble함수를 이용하여 콘솔에서 읽어온 사용자가 입력한 실수를 temp에 저장
		this.setTemp(temp);  //setTemp 메소드에 temp 값 저장
	}
	
	public void printInfo() { //printInfo 메소드 생성
		String dkind = "none"; //문자열 dkind 선언
		switch(this.kind){ //기숙사의 종류에 따라 출력되는 문장을 다르게 지정
		case GajwaDormitory: //가좌캠퍼스일 때
			dkind = "Gajwa";
			break;
		case ChilamDormitory: //칠암캠퍼스일 때
			dkind = "Chilam";
			break;
		case TongyeongDormitory: //통영캠퍼스일 때
			dkind = "Tongyeong";
			break;
		default:
		}
		System.out.println("kind: "+dkind+" name: "+name+" id: "+id
				+" sex: "+sex+" room number: "+roomnumber+" temperature: "+temp);
	}
}
