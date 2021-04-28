package cj01introduction;

public class Concatenation01 {

	public static void main(String[] args) {

		/*
		 * To join two or more Strings we use Concatenation operation
		 */
		
		String s1 = "Java";
		String s2 = "is easy";
		System.out.println(s1 + " " + s2); //Java is easy
		
		String s3 = "2";
		int i1 = 3;
		int i2 = 4;
		System.out.println(s3 + i1 + i2); //234		
		System.out.println(s3 + (i1 + i2)); //27
		System.out.println(i1 + i2 + s3); //72
		
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
				
		//Print "5 Study"
		System.out.println(numA + numB + " " + str1);
		
		//Print "61 Study-1"
		System.out.println(numB * numA + "" + (numB - numA) + " " + str1 + (numA - numB));
		
		//You can use comparison for all primitive data types. Everytime, you get boolean result from comparison operators
		System.out.println(5 == 2 + 3); //true
		System.out.println(5 < 2 + 3); // false
		System.out.println(5 <= 2 + 3); //true		
		System.out.println(5 >= 2 + 3); //true
		System.out.println(5 != 2 + 3); //false
		System.out.println(5 > 2 + 3); //false
		
		System.out.println('a' == 'A'); //false
		System.out.println('a' > 'A'); //true
		
		System.out.println(true == true); //true
		System.out.println(true == false); //false
		
	}

}
