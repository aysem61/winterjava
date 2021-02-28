package practice01;

import java.util.Arrays;

public class ArraysSortReverse {

	public static void main(String[] args) {
		
		//interview question
        //How can we sort num[] in descending order?
        //to sort arrays in descending order
        //1)use sort()
        //2)use loop to take elements one by one 
		
		int num []= {3,6,4,7,2,1};// sort her zaman kucukten buyuge dogru siralar.
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		
		int ters[]=new int[num.length];
		
		
		
		int index=0;
		
		for(int i=num.length-1; i>=0; i--) {
			
			ters[index]=num[i];
			
			index++;
			
			
		}
		
		System.out.println(Arrays.toString(ters));
		
		
		
		
		
		
		

	}

}
