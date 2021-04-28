package cj05ternarynestedternaryswitch;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		//take from user number has 3 digits, and decide the number of digits
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = scan.nextInt();
				
		String result = (n > 99 && n < 1000) || (n < -99 && n > -1000) ? "This number has 3 digits" : "This number has no 3 digits";
		System.out.println(result);
				
		scan.close();
	}

}
