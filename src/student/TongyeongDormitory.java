package student;
import java.util.Scanner; //import 키워드를 사용하여 라이브러리를 선언

public class TongyeongDormitory extends Student implements UserInput{
	//추상화 클래스 Student 클래스를 상속받고 UserInput Interface를 구현하기 위한 class
	//class 이름을 TongyeongDormitory로 설정
	public TongyeongDormitory(DormitoryKind kind) { //생성자 선언
		super(kind);
	}

	public void getUserInput(Scanner input) {
		//getUserInput 메소드 생성
		this.setUserID(input); //setUserID 메소드 실행
		this.setUserName(input);//setUserName 메소드 실행		
		int dormnum = 0;
		while (dormnum != 1 && dormnum !=2 && dormnum !=3) {
			//dormnum이 1이 아니고 2가 아닐동안 반복
			System.out.print("What is your Dormitory number? (1 or 2 or 3)");
			dormnum = input.nextInt();
			//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 정수를 dormnum에 저장
			if (dormnum == 1) { //dormnum이 1일 때
				System.out.println("You are Man");
				String sex = "Man";
				this.setSex(sex); //남자라는 정보를 setSex 메소드에 저장
				this.setUserRoomnumber(input); //setUserRoomnumber 메소드 실행
			}
			else if (dormnum == 2) { //dormnum이 2일 때
				this.setUserSex(input); //setUserSex 메소드 실행
				this.setUserRoomnumber(input); //setUserRoomnumber 메소드 실행
			}
			else if (dormnum == 3) { //dormnum이 3일 때
				System.out.println("You are Woman");
				String sex = "Woman";
				this.setSex(sex);//여자라는 정보를 setSex 메소드에 저장
				this.setUserRoomnumber(input); //setUserRoomnumber 메소드 실행
			}
		}
		this.setUserTemp(input);//setUserTemp 메소드 실행
		this.setUserEmail(input);//setUserEmail 메소드 실행
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
				+" sex: "+sex+" room number: "+roomnumber+
				" temperature: "+temp+ " e-mail: "+email);
	}
}