package day15arrays;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		
		 //=====sort(), binarySearch()======
        //int a[]=new int[4];
		
        int a []= {4,2,1,5};
        System.out.println(Arrays.toString(a));
        
        Arrays.sort(a);
        System.out.println("sort methodunu kullandiktan sonraki Array goruntusu");
        System.out.println(Arrays.toString(a));
        
        //How can we sort the elements in array ?
        //sort() sorts the elements in ascending order
        
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int num []= {9,5,1,8,7};
        
        //interview question
        //How can we sort num[] in descending order?
        //to sort arrays in descending order
        //1)use sort()
        //2)use loop to take elements one by one 
        
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        int reverse[]= new int[num.length];
        
        int idx=0;
        for(int i =num.length-1; i>=0 ; i--) {       
            reverse[idx]=num[i];    
            idx++;  
        }
        System.out.println(Arrays.toString(reverse));
        
        
        

        
        
        
        
        
        
        

		
	}
}
