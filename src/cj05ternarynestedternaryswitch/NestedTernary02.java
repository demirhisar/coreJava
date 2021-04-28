package cj05ternarynestedternaryswitch;

import java.util.Scanner;

public class NestedTernary02 {

	/*
	 * Ask user the password
	 * If the password has 8 characters and the first character is a digit, print "the password is valid"
	 * Otherwise, check the last character of the password, if it is 'Z', print "Not secure but acceptable"
	 * Otherwise print "The password is not valid"
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a password");
		String pw = scan.nextLine();
		
		String result = pw.length() == 8 && pw.charAt(0) <= '9' && pw.charAt(0) >= '0' ? "the password is valid" : pw.charAt(pw.length() - 1) == 'Z' ? "Not secure but acceptable" : "The password is not valid";
		System.out.println(result);
		
		scan.close();
	}

}
