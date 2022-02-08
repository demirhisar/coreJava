package l02ifandifelseandifelseif;

import java.util.Scanner;

public class SwapQuestions {

	public static void main(String[] args) {

		//switch the values of 2 variables
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter 2 integer");
		int a = input.nextInt();
		int b = input.nextInt();
		
		//1. way
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		//2.way
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		input.close();
	}

}
