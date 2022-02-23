package l03nestedifternary; 

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {

		//if quantity over 1000 and unit price over 30 make % 10 discount, under 30 make %5 discount
		//unit price over 100 make % 4 discount, under 100 no discount
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter quantity");
		int q = input.nextInt();
		System.out.println("enter price");
		int p = input.nextInt();
		
		String result = q > 1000 ? p > 30 ? "%10 discount" : "%5 discount" : p > 100 ? "%4 discount" : "no discount";
		
		System.out.println(result);
		
		input.close();
		
	}

}
