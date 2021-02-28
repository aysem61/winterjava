package day06nestedifternaryswitchStringmethods;

import java.util.Scanner;

public class StringManipulation01 {
	
	/*String Methods:
	 * 1)toUpperCase() 2)toLowerCase 3)charAt 4)equals
	 * 
	 * 5)equalsIgnoreCase() 6)length()  7)next() 8)nextLine() 9)index0f() 10)lastIndexOf()
	 * 11)contains()
	 */

	public static void main(String[] args) {
		
		String str="Java is easy if you study";
		
		//9)indexOf() returns the index of first occurence of the character
		System.out.println(str.indexOf("i"));//5
		
		//indexOf()accepts char as parameter as well
		System.out.println(str.indexOf('i'));//5
		
		//If the character does not exist in the String,it returns "-1"
		System.out.println(str.indexOf("x"));//-1
		
		//If you use multiple character is index(),it returns the index of first character
        System.out.println(str.indexOf("easy"));//8
        
        //If you use indexOf() with 2 parameters,Java looks for the character after the given index.
        System.out.println(str.indexOf('i',8));//13
        
        //second parametrs is inclusive
        System.out.println(str.indexOf('e',8));//8
        
        /*
         * Ask user to enter a String anad a character,then check if the String has the character or not
         
         */
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String the enter a character");
        String s=scan.nextLine();
        char ch=scan.next().charAt(0);
        
        String result=s.indexOf(ch)==-1 ?"The String has no the character"
        		                         :"The String has the character";
        System.out.println(result);
        
        //10lastIndex() returns the index of last occurence of the character
        String t="Java ah Java!";
        
        //In lastIndexOf() method you can use char and String.Both ara acceptable
        System.out.println(t.lastIndexOf('a'));//11
        System.out.println(t.lastIndexOf("a"));//11
        
        //lastIndexOf() method returns-1,if the character does not exist in the String
        System.out.println(t.lastIndexOf("w"));//-1
        
        //lastIndexOf() returns the index of first character of last occurence of "Java"
        System.out.println(t.lastIndexOf("Java"));//8
        
        //If you use lastIndexOf() with 2 PARAMETERS,get the character starting with the index and
        //to the begining of the String
        //In the following example we are usen "Java a"
        //lastindexOf sagdan sola dogru sorgulam yapiyor;iki tane deger varsa
        System.out.println(t.lastIndexOf("J",5));//0
        System.out.println(t.lastIndexOf("v",5));//2
        System.out.println(t.lastIndexOf("h",5));//-1 ==>ILK BES karakterin icinde h olamdigi icin -1 degerini verdi.
        
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
        System.out.println(r.contains("n"));//true
	}

}
