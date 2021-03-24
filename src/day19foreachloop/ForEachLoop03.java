package day19foreachloop;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoop03 {
	/*
	 * Ask user to enter a String and count the vowels(a,e,i,o,u) contained in the
	 * String AliCan ==> The number of a = 2 The number of i = 1
	 * 
	 */

	public static void main(String[] args) {
		
		int aCounter=0;
		int eCounter=0;
		int iCounter=0;
		int oCounter=0;
		int uCounter=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a String  to see how many vowels did you use");
		
		String str=scan.nextLine().toLowerCase();
		
		String ch[]=str.split("");
		
		System.out.println(Arrays.toString(ch));//split() method does not return char because of that we used String as datatype
		
		for(String w: ch) {
			
		switch(w) {
			case "a":
				aCounter++;
			case"e":
				eCounter++;
			case"i":
				iCounter++;
			case"o":
				oCounter++;
			case"u":
				uCounter++;
				break;
	
			}
		}
		
		System.out.println("The number of a " + aCounter);
		System.out.println("The number of e " + eCounter);
		System.out.println("The number of i " + iCounter);
		System.out.println("The number of o " + oCounter);
		System.out.println("The number of u " + uCounter);


	}

}