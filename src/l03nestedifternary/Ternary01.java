package l03nestedifternary;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("entern an integer");
		int a = input.nextInt();
		
		if (a % 2 == 0) {System.out.println("even");} else {System.out.println("odd");}
		
		//Ternary
		                //Condition    //QuestionMark   //CodeForTrueCondition   //Colon    //CodeForFalseCondition
		String result =   a % 2 == 0     ?                "even"                   :          "odd";
		System.out.println("Ternary: " + result);
		
		//Ternary in System.out.println()
		System.out.println(a > 0 ? "positive" : -1);
		
		input.close();
		
	}

}
