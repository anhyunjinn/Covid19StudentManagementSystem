import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner; //import Ű���带 ����Ͽ� ���̺귯���� ����
import log.EventLogger;

public class MenuManager {  //class �̸��� MenuManager�� ����
	static EventLogger Logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Scanner��� type �� �̿� �´� input�̶�� ������ ����
		//Scanner��� �޸� ������ ����� input�� �Ҵ�
		Manager m = getObject("m.ser");
		if (m == null) {
			m = new Manager(input); //Manager class�� �ش��ϴ� ��ü ����
		}
		
		selectMenu(input, m); //selectMenu �޼ҵ� ����
		putObject(m, "m.ser"); //putObject �޼ҵ� ����
	}
	
	public static void selectMenu(Scanner input, Manager m) {
		int num = -1;
		while(num!=5) { //num�� 5�� �ƴ� ���� �ݺ�
			try { //try ����
				showMenu(); //showMenu �޼ҵ� ����
				num = input.nextInt();
				//input���� ������ nextInt�� �̿��Ͽ� �ֿܼ��� �о�� ������ num�� ����
				switch(num) {
				case 1:
					m.addStuInfo();  //addStuInfo method ���
					Logger.log("Add a student in dormitory");
					break;
				case 2:
					m.deleteStudent(); //deleteStudent method ���
					Logger.log("Delete a student in dormitory");
					break;
				case 3:
					m.editTemperature(); //editTemperature method ���
					Logger.log("Add a student's temperature in dormitory");
					break;
				case 4:
					m.QnA();  //QnA method ���
					Logger.log("Use Q and A board");
					break;
				case 5:
					m.exit();
					break;
				default:
					continue;
				}

			} catch (InputMismatchException e) { //������ ��� (������ �ƴ� ���� �Է��Ͽ��� ��)
				System.out.println("Please put an integer between 1 to 5!");
				if (input.hasNext()) {//input ���� next�� �ִٸ�
					input.next(); //next ���� ����������
				}
				num = -1;
				System.out.println(num);
//				System.exit(-1);
			}
		}
	}
	
	public static void showMenu() {  //showMenu �޼ҵ�
		System.out.println("### Dorm Student Temperature"
				+ " Management Menu ###");
		System.out.println("1. Add Student Information");
		System.out.println("2. Delete Student");
		System.out.println("3. Edit Temperature");
		System.out.println("4. Q&A");
		System.out.println("5. Exit");
		System.out.printf("Select one number between 1 - 5 : ");
		//�޴� �� ����ڿ��� ���ڸ� �Է¹��� ���� ���
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
