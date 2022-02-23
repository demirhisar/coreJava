package l03nestedifternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {

		//girl boy man woman
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter gender");
		String gender = input.nextLine();
		System.out.println("enter age");
		int age = input.nextInt();
		String result = gender.equalsIgnoreCase("male") ? age < 20 ? "Boy" : "Man" : gender.equalsIgnoreCase("female") ? age < 20 ? "Girl" : "Woman" : "there is no any definition for other genders" ;
		System.out.println(result);
		
		input.close();
	}

}