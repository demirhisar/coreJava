package l03nestedifternary;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {

		//determine boy/man/girl/woman
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter gender: male/female");
		String str = input.nextLine();
		System.out.println("enter age");
		int age = input.nextInt();
		
		if (str.equalsIgnoreCase("male")) {
			if (age > 17) {
				System.out.println("man");
			} else {
				System.out.println("boy");
			}
		} else if (str.equalsIgnoreCase("female")) {
			if (age > 17) {
				System.out.println("woman");
			} else {
				System.out.println("girl");
			}
		}else {
			System.out.println("not defined");
		}
		
		input.close();
	}

}
