package l03nestedifternary;

import java.util.Scanner;

public class NestedTernary03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter year");
		int year = input.nextInt();
		
		String result = year % 100 == 0 ? year % 400 == 0 ? "is lucky leap year" : "is lucky leap year" : year % 4 == 0 ? "is simple leap year" : "is not simple leap year";
		System.out.println(result);
		
		input.close();
	}

}
