package cj02if;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {

		/* 
		 * Ask user to enter the initial of a day in uppercases. According to the initial which user entered,
		 * print the days of the weeks which starts with the initial
		 * with the initial
		 * Example: S ==> Saturday, Sunday    T ==> Tuesday, Thursday     X ==> No avaliable day
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a initial char of a day in uppercase");
		//To get char from user you have to type the following code
		char initial = scan.next().charAt(0);
		
		if (initial == 'S') {
			System.out.println("Saturday, Sunday");
		}
		
		if (initial == 'W') {
			System.out.println("Wednesday");
		}
		
		if (initial == 'M') {
			System.out.println("Monday");
		}
		
		if (initial == 'T') {
			System.out.println("Tuesday, Thursday");
		}
		
		if (initial == 'F') {
			System.out.println("Friday");
		}		
		
		if (initial != 'S' && initial != 'M' && initial != 'W' && initial != 'T' && initial != 'F') {
			System.out.println("No avaliable day");
		}
		
		scan.close();
		
	}

}
