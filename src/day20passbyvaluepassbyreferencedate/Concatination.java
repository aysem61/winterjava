package day20passbyvaluepassbyreferencedate;

import java.util.ArrayList;
import java.util.List;

public class Concatination {

	public static void main(String[] args) {
		// java  use to remove of java garbage collector    : java delete itself if it needs 
		
		//  Memory will be remove by java through java garbage Collector 
		
		

		String str="Java";
		
		// java comes to Heap memory  and checks if there is  any String  whose values is "Java" 
		
		// java use for a and b same container becoause just single carpet enaugh
		
		// java use String Pool 
		
		// for c we are telling to java new  creat a new container  and in Heap memory new container 
		String a="Java";   // for a and b wont creat new container and reference in heap and stack just once creat a container 
		
		String b="Java";
		
		String c=new String("java");  //when using new word then java doesnt take a risk and creat new container 
		
		/*  == condition is valid only for same values  
		 * 
		 *  equals pass for all same values of container even if new word or object used / created 
		 * 
		 */
		
		System.out.println(a+"- "+b+" - "+c);
		
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println(a==c);
		System.out.println(a.equals(c));
		
		
		
		// String class is immutubale that is mean the original cannt changeable 
		
		System.out.println(concatenate(str));
		
		// java use passByvalue that is mean to use of copy of variable 
		
		
		List<Integer>  list=new ArrayList<>(); // list is mutable class that means which can be update by using set meth.
		
		list.add(11);
		list.add(12);
		list.add(13);
		
		System.out.println(updateAllElements(list));
		System.out.println(list);
	}

	private static String  concatenate(String str) {
		
		
		str=str+"x";
		
		return str; 
	}
	
	public static List<Integer> updateAllElements(List<Integer> list ){
		
		
		for(int i=0; i< list.size(); i++) {
			
			// when we use list with set then will update the original 
			
			// list is mutuable //yani degisebilen orjinal degerler 
			
			
			list.set(i, list.get(i)+3); // java doind an Asaigment in set method ..so that with set will change also the original list 
		}
		
		return list; 
	}

}
