package day07stringmethods;

public class StringManipulationK01 {

	public static void main(String[] args) {

		// 1)toUppercase() 2)toLowercase()

		String str1 = "Learn coding by typing";
		// 12 startswith() is used for the check if this String starts with
		// the specific prefix startswith() can be used with only String.We can't
		// use it with char startswith() can be used with more than one characters
		// startswith() returns boolean

		str1.startsWith("L");

		System.out.println(str1.startsWith("L"));// TRUE

		System.out.println(str1.startsWith("I"));// FALSE

		System.out.println(str1.startsWith("Le"));// true
		
		System.out.println(str1.startsWith("c",6));//true
		
		System.out.println(str1.startsWith("by",13));//true
		
		System.out.println(str1.startsWith("typ",16));//true
		
		//13 endswith() is used for to check if this String ends with the Specific suffix

		
		
		
		System.out.println(str1.endsWith("g"));//true
		
		System.out.println(str1.endsWith("n"));//false
		
		System.out.println(str1.endsWith("ping"));//true
		
		//14) isEmpty 
		System.out.println(str1.isEmpty());//false
		String s="";
		System.out.println(s.isEmpty());//true
		
		//15)replace()
		String str2="Java is easy";
		System.out.println(str2.replace("a", "e"));//Jeve is eesy
		System.out.println(str2);//Java is easy
		System.out.println(str2.replace("a", "????"));//J????v???? is e????sy
		System.out.println(str2.replace("a", str2));//JJava is easyvJava is easy is eJava is easysy
		//How can I delete all "a"?
		System.out.println(str2.replace("a", ""));
		
		//How can I put ! before and after each character?
		System.out.println(str2.replace("","!"));//!J!a!v!a! !i!s! !e!a!s!y
		
		String str3 ="Teach _more, learn123 more!!! ..";
		
		/*/* Regular Expressions ==> 1) \\s: space character
		 						   2) \\S: all characters except space character
		 						   3) \\w: a->z 	A->Z	_    0->9
		 						   4) \\W: All characters except a->z 	A->Z	_    0->9
		 						   5) \\d: 0 -> 9
		 						   6) \\D: All characters except 0 -> 9
		 
		 */
		System.out.println(str3.replaceAll("\\s", "*"));
		System.out.println(str3.replaceAll("\\S", "*"));
		System.out.println(str3.replaceAll("\\w", "*"));
		System.out.println(str3.replaceAll("\\W", "&"));
		System.out.println(str3.replaceAll("\\d", "@"));
		System.out.println(str3.replaceAll("\\D", "+"));
		
		
		//16)replaceFirst()
		// replaceFirst() changes just the first occurunce of the character
		System.out.println(str3.replaceFirst("a","e"));
	}

}
