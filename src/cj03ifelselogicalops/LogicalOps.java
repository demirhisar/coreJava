package cj03ifelselogicalops;

public class LogicalOps {

	public static void main(String[] args) {
		
		/*
		 * Logical Operators:
		 * 1) AND Operator: We use && for AND Operations.
		 * 					Before and After &&, you should have boolean values
		 * 					
		 * 					true && false = false
		 * 					false && true = false
		 * 					false && false = false
		 * 					true && true = true
		 * 
		 * 					If you want to get from && operation both must be true.
		 * 					You can use &, but if you use &, Java check both value. If you use &&, Java will check just first value. && faster than &
		 * 
		 * 2) OR Operation: We || for OR Operation.
		 * 					Before and After ||, you should have boolean values.
		 * 					
		 * 					true || false = true
		 * 					false || true = true
		 * 					true || true = true					
		 * 					false || false = false
		 * 
		 *  				If you want to get false from || operation both must be false.
		 *  
		 * 3) NOT Operation: We use ! for NOT Operations
		 * 
		 * 					 !true = false
		 * 					 !false = true
		 * 					 !!true == true
		 * 					 !(3 < 2) == true
		 */
		
		if(5 > 3 && 4 < 7) {
			System.out.println("Good for AND");
		}
		
		if('A' == 'a' || 5 < 7) {
			System.out.println("Good for OR");
		}
		
		if(!(3 < 2)) {
			System.out.println("Goor for NOT");
		}
		
	}

}
