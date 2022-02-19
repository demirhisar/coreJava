package l03nestedifternary;

import java.util.Scanner;

public class NestedIf04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter 2 integers");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if (a > b) {
			if (a % b == 0) {
				System.out.println(a + " is a mltiple of " + b);
			}else {
				System.out.println(a + " is not a multiple of " + b);
			}
		}
		if (a < b) {
			if (b % a == 0) {
				System.out.println(b + " is a mltiple of " + a);
			}else {
				System.out.println(b + " is not a multiple of " + a);
			}
		}
		if (b == a) {
			System.out.println(b + " is a multiple of " + a);
		}
		
		input.close();
	}

}
