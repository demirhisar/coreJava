package l03nestedifternary;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {

		//Finding the sum, product, average, largest and smallest of 3 numbers
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 integer");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		System.out.println("sum of 3 integers: " + (a + b + c));
		System.out.println("average of 3 integers: " + (a + b + c) / 3);
		System.out.println("multiplication of 3 integers: " + (a * b * c));
		
		if (a > b && a > c) {
			System.out.println(a + " is the largest number");
			if (c < b) {
				System.out.println(c + " is the smallest number");
			} else {
				System.out.println(b + " is the smallest number");
			}
		}
		if (a < b && a < c) {
			System.out.println(a + " is the smallest number");
			if (c > b) {
				System.out.println(c + " is the largest number");		
			} else {
				System.out.println(b + " is the largest number");
			}
		}
		if (b > a && a > c) {
			System.out.println(b + " is the largest number");
			System.out.println(c + " is the smallest number");
		}
		if (b < a && a < c) {
			System.out.println(c + " is the largest number");
			System.out.println(b + " is the smallest number");
		}

		input.close();
	}

}
