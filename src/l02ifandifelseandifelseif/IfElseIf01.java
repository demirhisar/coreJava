package l02ifandifelseandifelseif;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {

		//determine positive, neutral and negative integer
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter an integer");
		int a = input.nextInt();
		
		if (a > 0) {
			System.out.println("positive");
		} else if (a == 0) {
			System.out.println("neutral");
		} else {
			System.out.println("negative");
		}
		
		input.close();
	}

}
