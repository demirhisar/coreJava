package l02ifandifelseandifelseif;

import java.util.Scanner;

public class IfElse04 {

	public static void main(String[] args) {

		//A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
		//Ask user for their salary and year of service and print the net bonus amount.
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter salary");
		double s = input.nextDouble();
		System.out.println("enter year of service");
		int y = input.nextInt();
		
		if (y > 5) {
			System.out.println("bonus amount: " + s * 0.05);
		} else {
			System.out.println("no bonus amount");
		}
		
		input.close();
	}

}
