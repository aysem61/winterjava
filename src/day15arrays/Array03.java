package day15arrays;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		
		        // ==== split() ======PARCALAMA
		        
		        /*
		           split() is used to split a String from by using specific character/s
		           split() puts the elements in an Array
		         */
		        
		        String s = "I like Java but Java needs to be studied hard to learn so I will study hard";
		        
		        
		        String part1 [] = s.split("Java");
		        
		        System.out.println(Arrays.toString(part1));//[I like ,  but ,  needs to study hard to learn so I will study hard]
		        
		        //How can I split String as words ? 
		        
		        String part2[] = s.split(" ");
		        
		        System.out.println(Arrays.toString(part2));
		        
		        //How can I find the number of words?
		        
		        System.out.println(part2.length);//17
		        
		        //How many characters except for space that are used in String s by using split()?
		        
		        String part3[] = s.replace(" ", "").split("");
		        
		        System.out.println(Arrays.toString(part3));
		        
		        System.out.println(part3.length);//55
		        
		        //Count how many times "a" is used in this String ?
		        
		        String part4[]=s.split("a");
		        
		        System.out.println(Arrays.toString(part4));
		        
		        System.out.println(part4.length-1);//7

		

	}

}
