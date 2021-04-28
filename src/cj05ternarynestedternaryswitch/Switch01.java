package cj05ternarynestedternaryswitch;

import java.util.Scanner;

public class Switch01 {

	/*
	 * When user enters the number of a day
	 * print the name of the day 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of a day");
		int a = scan.nextInt();
		
		//Use if-else-if
//		if (a == 1) {
//			System.out.println("Sunday");
//		} else if (a == 2) {
//			System.out.println("Monday");
//		} else if (a == 3) {
//			System.out.println("Tuesday");
//		} else if (a == 4) {
//			System.out.println("Wednesday");
//		} else if (a == 5) {
//			System.out.println("Thursday");
//		} else if (a == 6) {
//			System.out.println("Friday");
//		} else if (a == 7) {
//			System.out.println("Saturday");
//		} else {
//			System.out.println("Enter a valid day number: between 1 & 7");
//		}
		
		//Use switch
		switch (a) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Enter a valid day number: between 1 & 7");
		}
		
		System.out.println();
		System.out.println("If user enters any day number, I want to see all next days on the console");
		
		//If user enters any day number, I want to see all next days on the console
		switch (a) {
			case 1:
				System.out.println("Sunday");				
			case 2:
				System.out.println("Monday");				
			case 3:
				System.out.println("Tuesday");				
			case 4:
				System.out.println("Wednesday");				
			case 5:
				System.out.println("Thursday");				
			case 6:
				System.out.println("Friday");				
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Enter a valid day number: between 1 & 7");
		}
		
		scan.close();
		
		//Note: In switch statement, you cannot use long, double, float, and boolean data types
		//		You can use the others ==> char, byte, short, int, String
	}

}
