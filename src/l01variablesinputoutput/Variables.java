package l01variablesinputoutput;

public class Variables {
	
	public static void main(String[] args) {

		//there is a 8 primitive and 1 non-primitive data types
	
		//primitive data types
		char a = 'a', b = 'B', c = '!', d = '3';
		System.out.println("The char data type contains characters, which can be of the form: " + a + ", " + b + ", " + c + ", " + d + "...");
		
		boolean value1 = true;
		boolean value2 = false;
		System.out.println("boolean value1: " + value1);
		System.out.println("boolean value2: " + value2);
	
		byte maxValueByte = Byte.MAX_VALUE; //Byte.MAX_VALUE is a Wrapper Class (primitive data type + method). It's a non-primitive data type and its for a primitive data types manipulation.
		byte minValueByte = Byte.MIN_VALUE;
		System.out.println("Byte max value: " + maxValueByte); 
		System.out.println("Byte min value: " + minValueByte);
	
		short maxValueShort = Short.MAX_VALUE;
		short minValueShort = Short.MIN_VALUE;
		System.out.println("Short max value: " + maxValueShort);
		System.out.println("Short min value: " + minValueShort);
	
		int maxValueInt = Integer.MAX_VALUE;
		int minValueInt = Integer.MIN_VALUE;
		System.out.println("Int max value: " + maxValueInt);
		System.out.println("Int min value: " + minValueInt);
	
		float maxValueFloat = Float.MAX_VALUE;
		float minValueFloat = Float.MIN_VALUE;
		System.out.println("Float max value: " + maxValueFloat);
		System.out.println("Float min value: " + minValueFloat);
	
		double maxValueDouble = Double.MAX_VALUE;
		double minValueDouble = Double.MIN_VALUE;
		System.out.println("Double max value: " + maxValueDouble);
		System.out.println("Double min value: " + minValueDouble);
	
		long maxValueLong = Long.MAX_VALUE;
		long minValueLong = Long.MIN_VALUE;		
		System.out.println("Long max value: " + maxValueLong);
		System.out.println("Long min value: " + minValueLong);
		
		String str = "Hello World";
		System.out.println("The String data type is a non-primitive data types, etc: " + str);
		
		//Wrapper Class
		System.out.println("The Wrapper Class is a non-primitive data types. Its contain primitive data type + method. Its for a primitive data types manipulation.");
	
	}
	
}