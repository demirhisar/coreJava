package ifandifelse;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {

		//odd even finder
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = input.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("even integer");
		}
		
		if (a % 2 == 1 || a % 2 == -1) {
			System.out.println("odd integer");
		}
		
		input.close();
		
	}

}
