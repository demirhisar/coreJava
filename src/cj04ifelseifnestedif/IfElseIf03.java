package cj04ifelseifnestedif;

import java.util.Scanner;

public class IfElseIf03 {

	public static void main(String[] args) {

		/*
		 * Type java code by using if-else if() statement.
		 * A school has following rules for grading system:
		 * 1. Below 50 - D
		 * 2. 50 to 59 - C
		 * 3. 60 to 79 - B
		 * 4. from 80 to 100 - A
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your note");
		int note = scan.nextInt();
		
		if (note < 0 || note > 100) {
			System.out.println("Enter valid note");
		} else if (note >= 0 && note < 50) {
			System.out.println("Your graduate note: D");
		} else if (note >= 50 && note < 60) {
			System.out.println("Your graduate note: C");
		} else if (note >= 60 && note < 80) {
			System.out.println("Your graduate note: B");
		} else {
			System.out.println("Your graduate note: A");
		}
		
		scan.close();
		
	}

}
