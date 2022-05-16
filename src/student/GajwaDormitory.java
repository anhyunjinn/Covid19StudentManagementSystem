package student;

import java.util.Scanner;

public class GajwaDormitory extends Student implements UserInput{
	//추상화 클래스 Student 클래스를 상속받고 UserInput Interface를 구현하기 위한 class
	//class 이름을 GajwaDormitory로 설정

	public GajwaDormitory(DormitoryKind kind) { //생성자 선언
		super(kind);
	}

	public void getUserInput(Scanner input) { //getUserInput 메소드 생성
		this.setUserID(input);//setUserID 메소드 실행
		this.setUserName(input);//setUserName 메소드 실행
		System.out.print("Enter the Dormitory number between 1 to 11: ");
		int dormnum = input.nextInt();
		//input에서 가져온 nextInt함수를 이용하여 콘솔에서 읽어온 정수를 dormnum에 저장
		if (dormnum == 1 || dormnum == 2 || dormnum == 3 || dormnum == 6 
				|| dormnum == 8 || dormnum == 10) { //dormnum이 1,2,3,6,8,10중 있을 때
			System.out.println("You are Man");
			String sex = "Man";
			this.setSex(sex);  //남자라는 정보를 setSex 메소드에 저장
			this.setUserRoomnumber(input); //setUserRoomnumber 메소드 실행
		}
		else if (dormnum == 4 || dormnum == 5 || dormnum == 7 
				||dormnum == 9 || dormnum == 11) { //dormnum이 4,5,7,9,11 중 하나일 때
			System.out.println("You are Woman");
			String sex = "Woman";
			this.setSex(sex);  //여자라는 정보를 setSex 메소드에 저장
			this.setUserRoomnumber(input); //setUserRoomnumber 메소드 실행
		}
		this.setUserTemp(input);//setUserTemp 메소드 실행
		this.setUserEmail(input);//setUserEmail 메소드 실행
	}

	public void printInfo() { //printInfo 메소드
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
				" temperature: "+temp+" e-mail: "+email);
	}
}
