package cj05ternarynestedternaryswitch;

import java.util.Scanner;

public class Ternary05 {

	public static void main(String[] args) {
		//print absolute value of number use ternary
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = scan.nextInt();
				
		int result = n >= 0 ? n : -1 * n;
		System.out.println(result);
			
		scan.close();
	}

}
