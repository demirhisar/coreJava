package cj05ternarynestedternaryswitch;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		//print minimum one integer, taked from user, using ternary and if-else
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter two integer");
				int n1 = scan.nextInt();
				int n2 = scan.nextInt();
				
				int result = n1 > n2 ? n2 : n1;
				System.out.println("Minimum: " + result);
				
				scan.close();
	}

}
