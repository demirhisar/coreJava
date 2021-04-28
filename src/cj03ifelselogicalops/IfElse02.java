package cj03ifelselogicalops;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {

		//if-else; check password (password: JavaLearner)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a password");
		String password = scan.nextLine();
		
		/*
		 * "==" can be used for primitive data types. If you use it for non-primitive ones sometimes it gives correct result
		 * sometimes it gives false result
		 */
//		if(password == "JavaLearner") {
//			System.out.println("The password is true");
//		} else {
//			System.out.println("The password is false");
//		}
				
		if(password.equals("JavaLearner")) {
			System.out.println("The password is true");
		} else {
			System.out.println("The password is false");
		}
				
		scan.close();
	}

}
