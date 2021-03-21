package introduction;

public class Operators01 {

	public static void main(String[] args) {


		/*
		 * Create an int variable and increase it by using addition then multiplication and decrease it by using
		 * subtraction and division 
		 */		
		
		int a = 12;
		
		a = a + 3; //a = 15
		System.out.println(a);
		
		a = a * 2; // a = 30
		System.out.println(a);
		
		a = a - 5; //25
		System.out.println(a);
		
		a = a / 5; //5
		System.out.println(a);
		
		
		/*
		 * When you use multiple operations in one line, you should be careful about order of operations
		 * 1) Do the operations in parenthesis
		 * 2) Do * and / operations
		 * 3) Do + and - operations
		 */
		
		int b = 12;
		b = b + 3 * 2 - 5 / 5;
		System.out.println(b); //17
		
		//Question 1
		System.out.println(38 / 2 - (4 + 3) * 2);
		
		//Question 2
		System.out.println(8 + 2 * (14 - 6 / 2) - 12);
		
		
		
		/*MODULUS*/
		
		System.out.println(13 % 5);
		System.out.println(241 % 7);
		
		int x = 12;
		int y = 13;
		int z = 14;
		
		System.out.println(x * y % (y + z)); //
		
		/*
		 * Check if a number is odd or even
		 * odd numbers: Give 1 as remainder when you divide them by 2
		 * even numbers: Give 0 as remainder when you divide them by 2
		 */ 
		
		int d = 2345324;
		System.out.println(d % 2); //if the result is 0, I understand it is even
		
		int e = 12345;
		System.out.println(e % 2); //if the result is 1, I understand it is odd
		
	}

}
