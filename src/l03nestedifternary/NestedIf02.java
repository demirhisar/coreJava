package l03nestedifternary;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
		 * if employee is female, then she will work only in urban areas.
		 * if employee is a male and age is in between 20 to 40 then he may work in anywhere
		 * if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
		 * And any other input of age should print "ERROR".
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter gender: M or F");
		char s = input.next().charAt(0);
		System.out.println("enter age");
		int age = input.nextInt();
		
		if (s == 'F') {
			if (age >= 20 && age <= 60) {
				System.out.println("work only urban areas");
			} else {
				System.out.println("ERROR");
			}
		} else if (s == 'M') {
			if (age >= 20 && age <= 40) {
				System.out.println("work everywhere");
			} else if (age > 40 && age <= 60) {
				System.out.println("work only urban areas");
			} else {
				System.out.println("ERROR");
			}
		} else {
			System.out.println("ERROR");
		}

		input.close();
	}

}
