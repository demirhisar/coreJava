package cj03ifelselogicalops;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {

		//if-else; find absolute value of a number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its absolute value");
		double num = scan.nextDouble();
		
		if(num < 0) {
			System.out.println("Absolute value: " + (num * -1));
		} else {
			System.out.println("Absolute value: " + num);
		}
		
		scan.close();
	}

}
