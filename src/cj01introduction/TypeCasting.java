package cj01introduction;

public class TypeCasting {

	public static void main (String[] args) {
		
		//byte < short < int < long < float < double
		//1. Auto Widening: If you convert small data type to large ones, there is nothing to do. Java will convert automatically
		
		byte num01 = 12;
		short num02 = num01;
		
		//2. Explicit Narrowing: If you convert large data types to small ones, its name is Explicit Narrowing. Java does not do it.
		//You have to do it manually by typing small data type inside the parenthesis.
		int num03 = 14;
	//	byte num04 = num03; //byte < int. its impossible, but if int = 4, its possible. this is risk.
							//Java allows us to take this risk with Explicit Narrowing
		byte num04 = (byte)num03; //Explicit Narrowing

		//Convert int to double (Auto Widening)
		int num05 = 3;
		double num06 = num05;
		
		//Convert float to double (Auto Widening)
		float num07 = 2.3f;
		double num08 = num07;
		
		//Convert double to short (Explicit Narrowing)
		double num09 = 4.5;
		short num10 = (short)num09;
		
		//Convert int to short (Explicit Narrowing)
		int num11 = 9;
		short num12 = (short)num11;
		
		//In how many different ways, I can fix the following error?
		//float num13 = 3.23; //float num13 = 3.23f;
			                  //float num13 = (float)3.23;
							  //double num13 = 3.23;
		
		//What do you see on the console?
		int a = 5;
		int b = 2;
		System.out.println(a / b); //Result is 2: If you divide int by int the result always will be integer. Java delete to decimal part.
		
		int c = 5;
		double d = 3;
		System.out.println(c / d); //Result is 1,666...: If the data types are different the result will be in large data type
		
		System.out.println(5f / 2); //2.5
		
		System.out.println(5d / 2d); //2.5 (we can put "d" its means double. Java accept this)
		
	}
}
