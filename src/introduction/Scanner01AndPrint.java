package introduction;

import java.util.Scanner;

public class Scanner01AndPrint {

	public static void main(String[] args) {

		//"println" command will print then navigate to the next line
		System.out.println("Hi Everyone, this line was written with the 'println' command");
				
		//"print" command will print and wait in the same line
		System.out.print("first line use 'print' command");
		System.out.println(" / second line use 'println' command");
		
		//To communicate with the user we use Scanner Class
		
		//STEP 1
		Scanner scan = new Scanner(System.in);
		
		//STEP 2
		System.out.println("Enter your age");
		
		//STEP 3
		int age = scan.nextInt();
		System.out.println(age);
		
		scan.close();
		
	}

}
