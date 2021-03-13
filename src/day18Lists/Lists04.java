package day18Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lists04 {

	public static void main(String[] args) {
		
	 //Create a method to increase every element of the given list by 3
		
		List<Integer> list=new ArrayList<>();
		
		
		
		for(int i=0; i<7; i+=2) {
			
			list.add(i+1);
		}
		 
		System.out.println(list);
		
		increaseByThree(list);

	}

	private static void increaseByThree(List<Integer> list) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<list.size(); i++) {
			
			
			list.set(i, list.get(i)+3); // set metho ile oldu set degerleri update etmek icin 
			
			// get mehtodu ise  degerlere ulasmakicin 
		}
		
		System.out.println(list);
		
	}

}
