package day28exceptions;

import java.util.Arrays;

public class InterviewQuestiong01 {

	/*
	 *  Create a method which return two integers whose multiplication is the maximum 
	 *  
	 *  12,7 , 3,11,8 ==> 12 and 11
	 */
	public static void main(String[] args) {
		
	
		System.out.println(multiplication(3,5));

	}
	
	public static int multiplication(int a, int b) {
		
		int num[]= {12,7,3,11,8};
		
		Arrays.sort(num);
		
		int sum=0;
		
		int count=0;
		
		
		
		
		for (int i=num.length-1; i>=0; i--) {
			
			sum=num[num.length-1];
			count=+num[num.length-2];
		}
		
		return sum*count ;
	}

}
