package day06nestedifternaryswitchStringmethods;

import java.util.Scanner;

public class InterviewQuesEbayContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 /*
         * Ask user to enter a String anad a character,
         * then check if the String has the character or not
         
         */
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String the enter a character");
        String s=scan.nextLine();
        char ch=scan.next().charAt(0);
        
		
		
		
		
		
		//INTERWIEV SORUSU
        /*Ask user to give you a String and a character.
         * If the character does not exist in the String or exist just once print"Not good!"
         * If the character is used multiple times print "Woow!".
         */
        
        System.out.println("Enter a String the enter a character");
        String x=scan.nextLine();
        char a=scan.next().charAt(0);
        
        if(s.indexOf(ch)==-1 || s.indexOf(ch)==s.lastIndexOf(ch)) {
        	
        	System.out.println("Not good!");
        }else {
        	System.out.println("Woow!");
        }
        
        if( s.indexOf(ch)!=s.lastIndexOf(ch)) {
        	System.out.println("Woow!");
        }
        //11)contains() is used to check if a single characte or multiple characters exist in a String
        //contains() method returns boolean
        //contains() method cannot be used with chars,you have to use String
        String r="Learn Java, earn money";
        System.out.println(r.contains("e"));//true
        System.out.println(r.contains("x"));//false
        System.out.println(r.contains("ney"));//true

	}

}
