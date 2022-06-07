package student;

//import Ű���带 ����Ͽ� ���̺귯���� ����
import java.util.Scanner;
import exceptions.EmailFormatException;

public interface UserInput {  //interface �̸��� UserInput���� ����
	
	public int getId();
	
	public String getName();
	
	public String getEmail();
	
	public double getTemp();
	
	public String getSex();
	
	public int getRoomnumber();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setEmail(String email) throws EmailFormatException;
	
	public void setSex(String sex);
	
	public void setRoomnumber(int roomnumber);
	
	public void setTemp(double temp);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setUserID(Scanner input);
	
	public void setUserName(Scanner input);
	
	public void setUserEmail(Scanner input);
	
	public void setUserSex(Scanner input);
	
	public void setUserTemp(Scanner input);
	
	public void setUserRoomnumber(Scanner input);

}