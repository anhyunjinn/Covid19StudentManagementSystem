package student;

import java.util.Scanner;

public interface UserInput {  //interface �̸��� UserInput���� ����
	
	public int getId();
	
	public void setTemp(double temp);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();

}
