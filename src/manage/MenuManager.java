package manage;
//import 키워드를 사용하여 라이브러리를 선언
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {  //class 이름을 MenuManager로 지정
	static EventLogger Logger = new EventLogger("log.txt");
	//log.txt 파일에 내용을 저장할 EventLogger 클래스의 객체 선언
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Scanner라는 type 및 이에 맞는 input이라는 변수명 선언
		//Scanner라는 메모리 공간을 만들어 input에 할당
		Manager m = getObject("m.ser"); //Manager 클래스를 나타내는 m이 getObject 메소드라고 둠
		if (m == null) { //m이 공백 값이라면
			m = new Manager(input); //Manager class에 해당하는 객체 생성
		} else {
			m.input = input;
		}
		
		WindowFrame frame = new WindowFrame(m);
		selectMenu(input, m); //selectMenu 메소드 실행
		putObject(m, "m.ser"); //putObject 메소드 실행
	}
	
	public static void selectMenu(Scanner input, Manager m) { //selectMenu 메소드
		int num = -1;
		while(num!=5) { //num이 5가 아닐 동안 반복
			try { //try 실행
				showMenu(); //showMenu 메소드 실행
				num = input.nextInt();
				//input에서 가져온 nextInt를 이용하여 콘솔에서 읽어온 정수를 num에 저장
				
				switch(num) { //num 값을 기준으로 switch문 실행
				case 1: //num이 1일 때
					m.addStuInfo();  //addStuInfo method 사용
					Logger.log("Add a student in dormitory");//log.txt에 해당 문장 저장
					break;
				case 2: //num이 2일 때
					m.deleteStudent(); //deleteStudent method 사용
					Logger.log("Delete a student in dormitory");//log.txt에 해당 문장 저장
					break;
				case 3: //num이 3일 때
					m.editTemperature(); //editTemperature method 사용
					Logger.log("Add a student's temperature in dormitory");
					//log.txt에 해당 문장 저장
					break;
				case 4: //num이 4일 때
					m.QnA();  //QnA method 사용
					Logger.log("Use Q and A board");//log.txt에 해당 문장 저장
					break;
				case 5: //num이 5일 때
					m.exit(); //exit method 사용
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
		System.out.println("Select one number between 1 - 5 : ");
		//메뉴 및 사용자에게 숫자를 입력받을 문장 출력
	}
	
	public static Manager getObject(String filename) {
		//Manager 클래스를 반환하는 getObject 메소드
		Manager m = null; //m 값을 공백으로 둔다
		try{ //try 실행 (예외인지 아닌지 구분)
			FileInputStream file = new FileInputStream(filename);
			//문자열 filename을 저장하는 FileInputStream 객체 생성
			ObjectInputStream in = new ObjectInputStream(file);
			//file에 있는 내용을 저장하는 ObjectInputStream 객체 생성
			m = (Manager)in.readObject();//in에 있는 file 값을 읽음(Manager로 형변환)
			in.close(); 
			file.close();
		}catch(FileNotFoundException e) {
			//예외인 경우(FileNotFoundException)
			return m;
		}catch(IOException e) {
			//예외인 경우 (IOException)
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//예외인 경우 (ClassNotFoundException)
			e.printStackTrace();
		}
		return m;
	}

	public static void putObject(Manager m, String filename) {
		//putObejct 메소드
		try{//try 실행 (예외인지 아닌지 구분)
			FileOutputStream file = new FileOutputStream(filename);
			//문자열 filename을 저장하는 FileOutputStream 객체 생성
			ObjectOutputStream out = new ObjectOutputStream(file);
			//file에 있는 내용을 저장하는 ObjectOutputStream 객체 생성
			
			out.writeObject(m);
			//m에 저장되어있는 값을 out에 있는 writeObject 메소드를 사용하여 출력
			out.close();
			file.close();
		}catch(FileNotFoundException e) {
			//예외인 경우(FileNotFoundException)
			e.printStackTrace();
		}catch(IOException e) {
			//예외인 경우 (IOException)
			e.printStackTrace();
		}
	}
}