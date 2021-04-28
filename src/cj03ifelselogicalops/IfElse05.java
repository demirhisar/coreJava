package cj03ifelselogicalops;

import java.util.Scanner;

public class IfElse05 {

	public static void main(String[] args) {

		//get a specific character from a String

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();		
		System.out.println("Enter number of the character you want to see on the console");
		int numOfChar = scan.nextInt();
		
		if (numOfChar > s.length() || numOfChar <= 0) {
			System.out.println("enter a valid number of character");
		} else {
			System.out.println(s + "'s " + numOfChar + "rd character is '" + s.charAt(numOfChar - 1) + "'");
		}
		
		scan.close();
	}

}
