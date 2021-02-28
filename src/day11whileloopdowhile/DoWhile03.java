package day11whileloopdowhile;

public class DoWhile03 {

	public static void main(String[] args) {
		/*
		 * For the String "1234_?!abcdef", type a code to count the number of letters,
		 * the number of digits and the number of others by using do-while loop
		 * 
		 */

		String word = "1234_?!abcdef";
		
		String letter = "";

		String number = "";

		String othere = "";

		int count = 0;

		int i = word.length();

		do {

			char c = word.charAt(count);
			
			if ((c >= 'A' & c <= 'Z') || (c >= 'a' && c <= 'z')) {

				letter = letter + c;
				count++;
				
			} else if (c >= '0' && c <= '9') {
				number = number + c;
				
				count++;
				
			} else {
				othere = othere + c;
				
				count++;
			}

		} while (count < i);

		System.out.println("The number of letters is :  " + letter.length());

		System.out.println("The number of  numbers is : " + number.length());

		System.out.println("The number of othere is :" + othere.length());
	}

}
