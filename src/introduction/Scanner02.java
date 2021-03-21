package introduction;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		/*
		 * Type the code to get the width and length of a rectangle from user then calculate the perimeter and area
		 * ot the rectangle 
		 */
		
		//STEP 1
		Scanner scan = new Scanner(System.in);
		
		//STEP 2
		System.out.println("Enter the width of the rectangle");
		
		//STEP 3
		double width = scan.nextDouble();
		
		System.out.println("Enter the length of the rectangle");
		double length = scan.nextDouble();
		
		System.out.println("Perimeter: " + (2 * width + 2 * length)); //perimeter
		System.out.println("Area: " + (width * length)); //Area
		
		scan.close();

	}

}
