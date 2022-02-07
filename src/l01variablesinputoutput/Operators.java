package l01variablesinputoutput;

public class Operators {

	public static void main(String[] args) {

		int a = 15;
		
		int b = a + 15 / 5 - 1 * 3;
		
		System.out.println(b);
		
		System.out.println(b++);
		System.out.println(++b);
		System.out.println(b);
		
		b += 1;
		System.out.println(b);
		
		b /= 3;
		System.out.println(b);
		
		b -= 1;
		System.out.println(b);
		
		b *= 3;
		System.out.println(b);
		
		//modulus: remainder after division
		System.out.println(a % 3); //0
		System.out.println(a % 2); //1
		
	}

}