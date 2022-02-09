package l02ifandifelseandifelseif;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {

		//Take values of length and breadth of a rectangle from user and check if it is square or not
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter length and breadth of rectangle");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if (a == b) {
			System.out.println("square");
		} else {
			System.out.println("rectangle");
		}
		
		input.close();
	}

}
