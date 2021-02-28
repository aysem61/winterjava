package day03wrapperclassc;

public class WrapperClss01 {
	
	/* Wrapper class:Java created some objects whose values are coming from primitive data types but the 
	 * objects have methods as well.
	 * 
	 * Wrapper for boolean==> Boolean
	 * Wrapper for char==>Characater
	 * wrapper for byte==>Byte
	 * Wrapper for short==>Short
	 * !!!Wrapper for int==>Integer
	 * Wrapper for long==>Long
	 * Wrapper for float==>Float
	 * Wrapper for double==>Double
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		
		
		Integer i=12;
		
		//Find the min and max value of byte data type:
		Byte minByteValue=Byte.MIN_VALUE;
		System.out.println(minByteValue);
		
		Byte maxByteValue=Byte.MAX_VALUE;
		System.out.println(maxByteValue);
		
		//Find the min and max value of long data type:
		Long longmax=Long.MAX_VALUE;
		System.out.println(longmax);
		
		Long longmin=Long.MIN_VALUE;
		System.out.println(longmin);
		
		
		
		//Hw:Find all min and max values of primitve data types
		
		all_values();
		
		
	}

	private static void all_values() {
		
		
    System.out.println("Ev odevi olan lar method icin de ");		
	Double d=Double.MAX_VALUE;
	
	System.out.println(d);
	
	Integer i=Integer.MAX_VALUE;
	
	System.out.println(i);
	
	Short s=Short.MAX_VALUE;
	
	
	System.out.println(s);
		
	}

}
