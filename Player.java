import java.util.Scanner;

public class Player {
	String name;
	Scanner userName = new Scanner(System.in);

	void setName() {
		System.out.println("what is your name?");
		name = userName.next();
	}

	void sayWelcome() {
		System.out.println("Welcome " + name);

	}

}