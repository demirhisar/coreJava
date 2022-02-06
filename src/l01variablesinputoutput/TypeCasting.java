package l01variablesinputoutput;

public class TypeCasting {

	public static void main(String[] args) {

		//Auto Widening: If we convert small data type to large data type, Java convert automatically.
		//byte < short < int < long < float < double
		
		int numInt = 1;
		
		long numLong = numInt;
		
		//Explicit Narrowing: If we convert large data type to small data type, we must convert manuel
		short numShort = (byte)numLong;
		System.out.println(numShort);
		
		//If we divide Integer by an Integer, the result will be Integer
		int a = 10;
		int b = 3;
		System.out.println(a / b); //3
		
		//If we divide Integer by an Double, the result will be large data type
		int c = 19;
		double d = 3;
		System.out.println(c / d); //6.3333...
		
	}

}