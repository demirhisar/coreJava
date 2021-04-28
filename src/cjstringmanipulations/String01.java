package cjstringmanipulations;

public class String01 {

	public static void main(String[] args) {
		
		/*
		 * There are many String Methods in String Class to manipulate Strings
		 */
		
		String s1 = "Java";
		String s2 = "is easy";
		
		System.out.println("-----charAt()-----");
		//1. charAt()
		System.out.println(s1.charAt(0)); //Returns the 1st character
		System.out.println(s1.charAt(2)); //Returns the 1st character
		//For the last character everytime use length()-1 to make your code dynamic
		System.out.println(s1.charAt(s1.length()-1)); //Returns the last character
		
		System.out.println("\n-----concat()-----");		
		//2. concat()
		System.out.println(s2.concat(s1)); //is easyJava
		System.out.println(s2 + s1); //is easyJava
		
		System.out.println("\n-----contains()-----");
		//3. contains()
		System.out.println(s2.contains("easy")); //true
		System.out.println(s2.contains("a")); //true
		System.out.println(s2.contains("IS")); //false
		System.out.println(s2.contains(" ")); //true
		System.out.println(s2.contains("")); //true
		
		System.out.println("\n-----endsWith()-----");
		//4. endsWith()
		System.out.println(s2.endsWith("y")); //true
		System.out.println(s2.endsWith("m")); //false
		System.out.println(s2.endsWith("")); //true
		
		System.out.println("\n-----equals()-----");
		//5. equals()
		System.out.println(s2.equals(s1)); //false
		System.out.println(s1.equals("Java")); //true
		System.out.println(s1.equals(s1)); //true
		System.out.println(s1.equals("JAVA")); //false
		
		System.out.println("\n-----equalsIgnoreCase()-----");
		//6. equalsIgnoreCase()
		System.out.println(s1.equalsIgnoreCase("JAVA")); //true
		
		System.out.println("\n-----indexOf()-----");
		//7. indexOf() method returns the index of first occurrence of a specific character
		System.out.println(s1.indexOf('a')); //1
		String s3 = "Java is easy and easy";
		System.out.println(s3.indexOf('s')); //6
		System.out.println(s3.indexOf("easy")); //8 (shows where it starts)
		System.out.println(s3.indexOf('a', 5)); //9 (first a after 5th character)
		System.out.println(s3.indexOf("easy", 9)); //17 (first "easy" after 9th character)
		System.out.println(s3.indexOf('x')); //-1 (if the character does not exist in String indexOf() returns -1)
		System.out.println(s3.indexOf(' ')); //4
		System.out.println(s3.indexOf("")); //0
		
		System.out.println("\n-----isEmpty()-----");
		//8. isEmpty()
		String s4 = "Study hard study hard";
		String s5 = "";
		System.out.println(s4.isEmpty()); //false
		System.out.println(s5.isEmpty()); //true
		
		System.out.println("\n-----lastIndexOf()-----");
		//9. lastIndexOf()
		System.out.println(s4.lastIndexOf('u')); //13 (last index of 'u')
		System.out.println(s4.lastIndexOf("hard")); //17 (last "hard"'s first character)
		System.out.println(s4.lastIndexOf('d', 7)); //3 (the last 'd' character in the specified string up to the 7th character)
		System.out.println(s4.lastIndexOf("udy", 3)); //2 (the last 'udy' string in the specified string up to the 3rd character)
		
		System.out.println("\n-----length()-----");
		//10.
		String s6 = "Study hard, stay humble.";
		//Do not forget, the index of last character equals to length()-1
		System.out.println(s6.length()); //24
		
		System.out.println("\n-----replace()-----");
		//11. replace()
		System.out.println(s6.replace('h', 'c')); //Study card, stay cumble.
		System.out.println(s6.replace("y", "")); //Stud hard, sta humble.
		System.out.println(s6.replace(" ", "")); //Studyhard,stayhumble.
		System.out.println(s6.replace('x', '!')); //Study hard, stay humble. (because there is no 'x')
		System.out.println(s6); //Study hard, stay humble.
		System.out.println(s6.replace("hard", "much")); //Study much, stay humble.
		System.out.println(s6.replace("", "!")); //!S!t!u!d!y! !h!a!r!d!,! !s!t!a!y! !h!u!m!b!l!e!.!
		
		System.out.println("\n-----startsWith()-----");
		//12. startsWith()
		String s7 = "Learn Java earn money";
		System.out.println(s7.startsWith("L")); //true
		System.out.println(s7.startsWith("")); //true
		System.out.println(s7.startsWith("l")); //false
		//If you want to check which index has which character, use the followings
		System.out.println(s7.startsWith("J", 6)); //true
		System.out.println(s7.startsWith("e", 10)); //false
		
	}

}
