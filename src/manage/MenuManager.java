package manage;
//import Ű���带 ����Ͽ� ���̺귯���� ����
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

public class MenuManager {  //class �̸��� MenuManager�� ����
	static EventLogger Logger = new EventLogger("log.txt");
	//log.txt ���Ͽ� ������ ������ EventLogger Ŭ������ ��ü ����
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Scanner��� type �� �̿� �´� input�̶�� ������ ����
		//Scanner��� �޸� ������ ����� input�� �Ҵ�
		Manager m = getObject("m.ser"); //Manager Ŭ������ ��Ÿ���� m�� getObject �޼ҵ��� ��
		if (m == null) { //m�� ���� ���̶��
			m = new Manager(input); //Manager class�� �ش��ϴ� ��ü ����
		} else {
			m.input = input;
		}
		
		WindowFrame frame = new WindowFrame(m);
		selectMenu(input, m); //selectMenu �޼ҵ� ����
		putObject(m, "m.ser"); //putObject �޼ҵ� ����
	}
	
	public static void selectMenu(Scanner input, Manager m) { //selectMenu �޼ҵ�
		int num = -1;
		while(num!=5) { //num�� 5�� �ƴ� ���� �ݺ�
			try { //try ����
				showMenu(); //showMenu �޼ҵ� ����
				num = input.nextInt();
				//input���� ������ nextInt�� �̿��Ͽ� �ֿܼ��� �о�� ������ num�� ����
				
				switch(num) { //num ���� �������� switch�� ����
				case 1: //num�� 1�� ��
					m.addStuInfo();  //addStuInfo method ���
					Logger.log("Add a student in dormitory");//log.txt�� �ش� ���� ����
					break;
				case 2: //num�� 2�� ��
					m.deleteStudent(); //deleteStudent method ���
					Logger.log("Delete a student in dormitory");//log.txt�� �ش� ���� ����
					break;
				case 3: //num�� 3�� ��
					m.editTemperature(); //editTemperature method ���
					Logger.log("Add a student's temperature in dormitory");
					//log.txt�� �ش� ���� ����
					break;
				case 4: //num�� 4�� ��
					m.QnA();  //QnA method ���
					Logger.log("Use Q and A board");//log.txt�� �ش� ���� ����
					break;
				case 5: //num�� 5�� ��
					m.exit(); //exit method ���
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
		System.out.println("Select one number between 1 - 5 : ");
		//�޴� �� ����ڿ��� ���ڸ� �Է¹��� ���� ���
	}
	
	public static Manager getObject(String filename) {
		//Manager Ŭ������ ��ȯ�ϴ� getObject �޼ҵ�
		Manager m = null; //m ���� �������� �д�
		try{ //try ���� (�������� �ƴ��� ����)
			FileInputStream file = new FileInputStream(filename);
			//���ڿ� filename�� �����ϴ� FileInputStream ��ü ����
			ObjectInputStream in = new ObjectInputStream(file);
			//file�� �ִ� ������ �����ϴ� ObjectInputStream ��ü ����
			m = (Manager)in.readObject();//in�� �ִ� file ���� ����(Manager�� ����ȯ)
			in.close(); 
			file.close();
		}catch(FileNotFoundException e) {
			//������ ���(FileNotFoundException)
			return m;
		}catch(IOException e) {
			//������ ��� (IOException)
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//������ ��� (ClassNotFoundException)
			e.printStackTrace();
		}
		return m;
	}

	public static void putObject(Manager m, String filename) {
		//putObejct �޼ҵ�
		try{//try ���� (�������� �ƴ��� ����)
			FileOutputStream file = new FileOutputStream(filename);
			//���ڿ� filename�� �����ϴ� FileOutputStream ��ü ����
			ObjectOutputStream out = new ObjectOutputStream(file);
			//file�� �ִ� ������ �����ϴ� ObjectOutputStream ��ü ����
			
			out.writeObject(m);
			//m�� ����Ǿ��ִ� ���� out�� �ִ� writeObject �޼ҵ带 ����Ͽ� ���
			out.close();
			file.close();
		}catch(FileNotFoundException e) {
			//������ ���(FileNotFoundException)
			e.printStackTrace();
		}catch(IOException e) {
			//������ ��� (IOException)
			e.printStackTrace();
		}
	}
}