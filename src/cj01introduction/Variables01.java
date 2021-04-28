package cj01introduction;

public class Variables01 {

	public static void main(String[] args) {

		//boolean variable has one of two possible values. There are 2 values, "true" and "false"
		boolean firstValue = true;
		boolean secondValue = false;
		
		System.out.println("firstValue is a '" + firstValue + "'"); //true
		System.out.println("and secondValue is a '" + secondValue + "'"); //false
		
		System.out.println("---------------------------------------");
		
		//Create a integer variable
		int age = 36;
		System.out.println("integer variable is: " + age); //integer variable is: 36
		
		System.out.println("---------------------------------------");
		
		//Create a float variable
		float salary = 120.500f;
		System.out.println("salary is: " + salary); //salary is: 120.5
		
		float wage = 12f; //12 = 12.0
		System.out.println("the wage is: " + wage); //12.0
		
		float money = 12.45F; //f ot F both are possible
		System.out.println("the money is: " + money); //12.45
		
		System.out.println("---------------------------------------");
		
		//Create a double variable
		double pi = 3.14159265359; //3.14159265359d: we can put "d" its means double. Java accept this, but its not need
		System.out.println("pi value is: " + pi); //3.14159265359
		
		double length = 3.546; //Instead of putting f at the end, you can change data type to double
		System.out.println("the length is: " + length); //3.546
		
		double size = 1.23f; //No problem, because double is bigger than float
		System.out.println("the size is: " + size);
		
		System.out.println("---------------------------------------");
		
		//Create a character variable
		char character = 'P';
		System.out.println("the character is: " + character); //the character is: P
		
		System.out.println("---------------------------------------");
		
		//Create a string variable
		String name = "Phateeh";
		System.out.println("the string is: " + name); //the string is: Phateeh		
	
	}

}
