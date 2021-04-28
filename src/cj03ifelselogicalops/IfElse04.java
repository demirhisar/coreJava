package cj03ifelselogicalops;

import java.util.Scanner;

public class IfElse04 {

	public static void main(String[] args) {

		/*
		 * A shop will give discount of 10% if the cost of purchased quantity is more than 1000
		 * quantity less than 1000 output will be "no discount"
		 * quantity more than 1000 apply 10% discount
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the unit price of the product");
		double unitPrice = scan.nextDouble();
		System.out.println("Enter your quantity you want to buy");
		int quantity = scan.nextInt();		
		
		if(quantity <= 1000) {
			System.out.println("Total price without discount: " + (quantity * unitPrice));
		} else {
			System.out.println("Total price after 10% discount: " + (0.9 * quantity * unitPrice));
		}
		
		scan.close();
	}

}
