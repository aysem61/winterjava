package day14constructorsstatickeywordarrays;

import java.util.Arrays;

public class Arrays01Sunday {
	
	public int age=12;

	/*
	 * 1) to store multiple values, we need  " Arrays "
	 * 2) An array can have just a single data type 
	 *    if you decide  to store integeres into an array , you can store just integers not the otheres
	 *    
	 *  3) Arrays accept just  " primitive data types" as elements   , when u put String in an array, 
	 *    Java stores their "references" inside the array, not the String itself.
	 */
	public static void main(String[] args) {
		/*How to create an array 
		 * 
		 * 1) Decide which data type will you store .
		 * 
		 * 2) Put a name for the array 
		 * 
		 * 3) After the name put  "[]" bracet
		 * 
		 * 4) Arrays are object and to creat an object an array to use "new"   
		 * 
		 * 5) put the data type again with brackets ==>[]
		 * 
		 * 
		 */
		// burasi ise 0 dan array olusturma 
		
		
		String kelime[]=new String[5];
		
		System.out.println(Arrays.toString(kelime));
		
		int num[]=new int[4];
		
		num[0]=23; // indexlere eleman atama sekli 
		num[1]=-3;
		num[2]=45;
		num[3]=100;
	
		System.out.println(Arrays.toString(num));
		
		//Second way to create and assign values
		String array2[]= {"Ali","Can","Kemal","Mary"};
		System.out.println(Arrays.toString(array2));
		
 
		// burasi kisa ve genel kullanum yolu  
		char c[]={'c','g','t','a'};
		
		System.out.println(Arrays.toString(c));
		
		int arr1[]= {1,2,4,5,343,3,5};
		
		System.out.println(Arrays.toString(arr1));
		
		//How to update an element 
		array2[1]="Canan";
		System.out.println(Arrays.toString(array2));	
		
		//How to add elements more than size
		//If you try to add elements more than the size of the arrray,you will get run tme error.
		//array2[4]="Angie";
		//System.out.println(Arrays.toString(array2));
		
		//Update all elements to "Joe
		//In String length method is used with parenthesis like "length()"
		//In Arrays length methos is used without parenthesis like "length
		for(int i=0;i<array2.length; i++) {
			array2[i]="Joe";
		}
		System.out.println(Arrays.toString(array2));
		
		//How to print array1 elements one by one on the console in different lines
		
		int k=0;
		while(k<arr1.length) {
			System.out.println(arr1[k]);
			k++;
	}
		//How to find the sum of all "array1" elements
		int m=0;
		int sum=0;
		do {
			sum=sum+arr1[m];
			m++;
		}while	(m<arr1.length);
		System.out.println("The sum of elemnets is" + sum);
		
		//Replace "*" for all the character 'J' in array2
		
		for(int i=0; i<array2.length; i++) {
			array2[i]=array2[i].replace("J", "*");
		}
		System.out.println(Arrays.toString(array2));
	}
	}
