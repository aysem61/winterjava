package practice01;

import java.util.Scanner;

public class P_Q02_ElseIF_Overflow {

	public static void main(String[] args) {
   
		
		/*     Write a Java program to compute and print sum of two given numbers (more than or equal to zero). 
    If  sum have more than 10 digits, print "overflow".
    EXAMPLE:
    INPUT      :  
    Input two integers:
    25
    46
    OUTPUT :  
    Sum of the said two numbers:
    71       
*/
		     /*
         Ask user to enter a letter.
         If user enters a letter that in first four letters, 
         Your program will print "(This letter) is in the first four letters" 
         It will also print if this letter is vowel or consonant
         Use switch.
         
         Example :
         INPUT: A
         OUTPUT: "A is in first letters"
                 "A is vowel"
          


*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("");
		char letter=scan.next().charAt(0);
		
		switch(letter) {
			case 'A':
				
		}
		
		
	}

}
