package day28exceptions;

public class GabageCollector {
	
	public final static int P=12;
	
	public static void main(String[] args) {
		
		P=13; // final variable cannot be changed or assigned 
	}

	/*
	 * finalize() ; to finlize and to destroy the objects
	 * 
	 * 1) Garbage collector destroys the " finalized " objects
	 * 
	 * 2) To finalize an object Java uses finalize() method
	 * 
	 * 3) If you want then you can call " finalize (); " method among your code but
	 * 
	 * java decide when and how to use finalize() method .
	 * 
	 * 
	 */
	
	/*
	 * Explain " finaly" finally " and finalize" ?
	 * 
	 * 1  "Final " is a keyword , " finally" is a code block , " finalize " is a method 
	 * 
	 * 2) "final" ==> a) final variables :
	 * 					 i) Final variables must be initialized
	 * 					 ii) Final variables values cannot be modified 
	 * 					 iii) Final variables should be named by using uppercases ==>   public final int Pi=3; 
	 * 				  b) final methods :
	 * 						i) Final methods cannot be overriden but can be overloaded
	 * 						
	 * 				  c) final classes 
	 *                   i) Final classes have child classes .No inheritence , no extends
	 *                   
	 *  3) "finally" ==> a) It is used with try block or try-catch block 
	 *                   b) It is executed when the exception is thrown or the exception is not thrown 
	 *                   c) It is used to end connections with databes , cloud or it is used to close a file 
	 * 
	 *  4) " finalize" ==> a) it is executed before Garbage Collector destroys the objects.                                  
	 * 
	 */
}
