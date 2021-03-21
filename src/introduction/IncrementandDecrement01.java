package introduction;

public class IncrementandDecrement01 {

	public static void main(String[] args) {

		/*INCREMENT*/		 
			
		//1.WAY to increase the value of a variable
		int num01 = 12;
		System.out.println("Before increment: " + num01);
		num01 = num01 + 5;
		System.out.println("After increment: " + num01);
		
		System.out.println("-----------------------------");
		
		//Create an int variable and increase its value by 3, then by 4 then by 5
		int num02 = 10;		
		System.out.println(num02); //10
		num02 = num02 + 4;
		System.out.println(num02); //14
		num02 = num02 + 5;
		System.out.println(num02); //29
		
		System.out.println("-----------------------------");
		
		//2.WAY to increase the value of a variable
		//Create an int variable and increase its value by 3, then by 4, then by 5 (by using 2. way)
		int num03 = 300;
		num03 += 3;
		num03 += 4;
		num03 += 5;
		System.out.println(num03); //312
		
		System.out.println("-----------------------------");
		
		//3.WAY to increase the value of a variable by 1
		int num04 = 12;
		num04++;
		System.out.println(num04); //13
		
		System.out.println("-----------------------------");		
		
		//Create an int variable and increase its value by multiplication
		int num05 = 6;
		num05 = num05 * 2;
		System.out.println(num05); //12		
		num05 *= 3;
		System.out.println(num05); //36
		
		System.out.println("-----------------------------");
		
		
		
		/*DECREMENT*/
		
		//Create a variable and decrease it by 5, 3, and 1 by using 3 different ways
		int e = 35;		
		e = e - 5;
		System.out.println(e); //30		
		e -= 3;
		System.out.println(e); //27		
		e--;
		System.out.println(e); //26
		
		System.out.println("-----------------------------");
		
		//Create a variable and decrease it by 2, and 3 by using division operation
		int i = 60;
		i = i / 2;
		System.out.println(i); //30
		i /= 3;
		System.out.println(i); //10

		System.out.println("-----------------------------");

		/*POST&PRE INCREMENT - POST&PRE DECREMENT*/
		int x = 12;				
		System.out.println(x++); //Post increment
		System.out.println(x); //13		
		System.out.println(++x); //Pre increment
		System.out.println(x); //14
		
		System.out.println("-----------------------------");
		
		//What do you see on the console?
		int y = 15;
		System.out.println(++y); //16 because increment and print
		System.out.println(y++); //16 again. because print and increment
		System.out.println(y); //17
		
		System.out.println("-----------------------------");
		
		//What do you see on the console?
		int z = 21;
		System.out.println(--z); //20
		System.out.println(z--); //20
		System.out.println(--z); //18
		
	}

}
