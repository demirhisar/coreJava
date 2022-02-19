package l01variablesinputoutput;

import java.util.Scanner;

public class Operators01 {

	public static void main(String[] args) {

		//dividing a number into digits
		Scanner input = new Scanner(System.in);
		System.out.println("enter a 5 digit number");
		int a = input.nextInt();
		
		System.out.println(a);
		int p = a / 10000;
		int q = (a - p * 10000) / 1000;
		int r = (a - (p * 10000 + q * 1000)) / 100;
		int s = (a - (p * 10000 + q * 1000 + r * 100)) / 10;
		int t = (a - (p * 10000 + q * 1000 + r * 100 + s * 10));
		
		System.out.println(p + " " + q + " " + r + " " + s + " " + t);
		
		input.close();
		
	}

}
