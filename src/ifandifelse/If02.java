package ifandifelse;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {

		//student grade (passing value 60)
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your grade");
		int grade = input.nextInt();
		
		if (grade >= 60 && grade <= 100) {
			System.out.println("you are success!");
		}
		
		if (grade < 60 && grade >= 0) {
			System.out.println("you are not success");
		}
		
		if (grade < 0 || grade > 100) {
			System.out.println("invalid value");
		}
		
		input.close();
	}

}
