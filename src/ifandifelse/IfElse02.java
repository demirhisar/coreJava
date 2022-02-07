package ifandifelse;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {

		//Print the larger of 2 numbers
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = input.nextInt();
		System.out.println("Enter other integer");
		int b = input.nextInt();

		if (a >= b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		
		input.close();
		
	}

}
