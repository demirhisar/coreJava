package cj03ifelselogicalops;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter an integer
		 * Check if the integer is odd or even by using if-else statement
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to check if it is odd or even");
		int num = scan.nextInt();
		
		//used if-else: check just 1 condition
		if(num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		//used double if: check 2 condition
		if(num % 2 == 0) {
			System.out.println("even");
		}
		if(num % 2 == 1) {
			System.out.println("odd");
		}
		
		scan.close();
	}

}
