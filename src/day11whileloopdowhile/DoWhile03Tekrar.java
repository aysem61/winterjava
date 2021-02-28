package day11whileloopdowhile;

public class DoWhile03Tekrar {

	public static void main(String[] args) {
		/*
		 * For the String "1234_?!abcdef", type a code to count the number of letters,
		 * the number of digits and the number of others by using do-while loop
		 * 
		 */

		String word="1234_?!abcdef";
		
		String harf="";
		
		String rakam="";
		
		String othere="";
		
		int count=0;
		
		int wL=word.length();
		
		do {
			
			if( (word.charAt(count)>='a' && word.charAt(count)<='z') || (word.charAt(count)>='A' && word.charAt(count)<='Z')  ) {
				
				harf+=word.charAt(count);
				
				count++;
				
			}else if( (word.charAt(count)>='0' && word.charAt(count)<='9') ) {
				
				rakam+=word.charAt(count);
				
				count++;
			}else {
				othere+=word.charAt(count);
				
				count++;
			}
			
			
		}while(count<wL);
		
		System.out.println(harf.length()+" harflerin toplam sayisi ");
		
		System.out.println(rakam.length()+" rakamlarin toplam sayisi ");
		
		System.out.println(othere.length()+" digerlerin toplam sayisi ");
		
		
	}

}
