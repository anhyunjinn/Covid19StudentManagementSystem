import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner; //import 키워드를 사용하여 라이브러리를 선언
import log.EventLogger;

public class MenuManager {  //class 이름을 MenuManager로 지정
	static EventLogger Logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Scanner라는 type 및 이에 맞는 input이라는 변수명 선언
		//Scanner라는 메모리 공간을 만들어 input에 할당
		Manager m = getObject("m.ser");
		if (m == null) {
			m = new Manager(input); //Manager class에 해당하는 객체 생성
		}
		
		selectMenu(input, m); //selectMenu 메소드 실행
		putObject(m, "m.ser"); //putObject 메소드 실행
	}
	
	public static void selectMenu(Scanner input, Manager m) {
		int num = -1;
		while(num!=5) { //num이 5가 아닐 동안 반복
			try { //try 실행
				showMenu(); //showMenu 메소드 실행
				num = input.nextInt();
				//input에서 가져온 nextInt를 이용하여 콘솔에서 읽어온 정수를 num에 저장
				switch(num) {
				case 1:
					m.addStuInfo();  //addStuInfo method 사용
					Logger.log("Add a student in dormitory");
					break;
				case 2:
					m.deleteStudent(); //deleteStudent method 사용
					Logger.log("Delete a student in dormitory");
					break;
				case 3:
					m.editTemperature(); //editTemperature method 사용
					Logger.log("Add a student's temperature in dormitory");
					break;
				case 4:
					m.QnA();  //QnA method 사용
					Logger.log("Use Q and A board");
					break;
				case 5:
					m.exit();
					break;
				default:
					continue;
				}

			} catch (InputMismatchException e) { //예외인 경우 (정수가 아닌 값을 입력하였을 때)
				System.out.println("Please put an integer between 1 to 5!");
				if (input.hasNext()) {//input 값에 next가 있다면
					input.next(); //next 값을 가져오도록
				}
				num = -1;
				System.out.println(num);
//				System.exit(-1);
			}
		}
	}
	
	public static void showMenu() {  //showMenu 메소드
		System.out.println("### Dorm Student Temperature"
				+ " Management Menu ###");
		System.out.println("1. Add Student Information");
		System.out.println("2. Delete Student");
		System.out.println("3. Edit Temperature");
		System.out.println("4. Q&A");
		System.out.println("5. Exit");
		System.out.printf("Select one number between 1 - 5 : ");
		//메뉴 및 사용자에게 숫자를 입력받을 문장 출력
	}
	
	public static Manager getObject(String filename) {
		Manager m = null;
		try{
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);			
			m = (Manager)in.readObject();
			
			in.close();
			file.close();
		}catch(FileNotFoundException e) {
			return m;
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return m;
	}

	public static void putObject(Manager m, String filename) {
		try{
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(m);
			
			out.close();
			file.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
