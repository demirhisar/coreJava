package l02ifandifelse;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {

		//Password controller
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter password");
		String str = input.nextLine();
		
		if (str.equals("Qwerty")) {
			System.out.println("password is true");
		}
		else {
			System.out.println("password is invalid");
		}
		
		input.close();
	}

}
