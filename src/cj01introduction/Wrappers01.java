package cj01introduction;

public class Wrappers01 {

	public static void main(String[] args) {


		/*
		 * 1) Wrapper Class contains primitive value and some methods which can be used by primitives
		 * 2) How to name Wrapper Classes 
		 *    int ==> Integer
		 *    byte ==> Byte
		 *    short ==> Short
		 *    long ==> Long
		 *    float ==> Float
		 *    double ==> Double
		 *    char ==> Character
		 *    boolean ==> Boolean
		 */
		
		//Let's find the max and min values of byte, short, int, long, float, double
		
		byte maxValueByte = Byte.MAX_VALUE;
		System.out.println(maxValueByte); //127
		byte minValueByte = Byte.MIN_VALUE;
		System.out.println(minValueByte); //-128
		
		short maxValueShort = Short.MAX_VALUE;
		System.out.println(maxValueShort); //32767
		short minValueShort = Short.MIN_VALUE;
		System.out.println(minValueShort); //-32768
		
		int maxValueInteger = Integer.MAX_VALUE;
		System.out.println(maxValueInteger); //2147483647
		int minValueInteger = Integer.MIN_VALUE;
		System.out.println(minValueInteger); //-2147483648
		
		long maxValueLong = Long.MAX_VALUE;
		System.out.println(maxValueLong); //9223372036854775807
		long minValueLong = Long.MIN_VALUE;
		System.out.println(minValueLong); //-9223372036854775808
		
		float maxValueFloat = Float.MAX_VALUE;
		System.out.println(maxValueFloat); //3.4028235E38
		float minValueFloat = Float.MIN_VALUE;
		System.out.println(minValueFloat); //1.4E-45
		
		double maxValueDouble = Double.MAX_VALUE;
		System.out.println(maxValueDouble); //1.7976931348623157E308
		double minValueDouble = Double.MIN_VALUE;
		System.out.println(minValueDouble); //4.9E-324
		
	}

}
