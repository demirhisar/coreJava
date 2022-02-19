package l03nestedifternary;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {

		//Take values of length and breadth of a rectangle from user and check if it is square or not
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter length and breadth of rectangle");
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(a == b ? "square" : "rectangle");
		
		input.close();
	}

}
