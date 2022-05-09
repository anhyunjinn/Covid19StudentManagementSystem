package student;

import java.util.Scanner;

public interface UserInput {  //interface 이름을 UserInput으로 설정
	
	public int getId();
	
	public void setTemp(double temp);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();

}
