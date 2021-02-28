package day08stringmethodcretion;

public class MethodCreation01 {

	public static void main(String[] args) {
		
		System.out.println(add(3,4));
		System.out.println(add(3.4,5.6));
		System.out.println(add('a',5));
	}
	/*
	 * 1)We create methods out of the main method and use then in main method to
	 * make method simpler
	 * 2)static methods can use just static class members bacause of that we have to make our methods to 
	 * be able to call them from main method
	 * 3)The variables which are created in method paranthesis are called parameters==>num1 and num2
	 * 4)The values which are used in main method call are called as arguments
	 * 5)For number parameters you can use "chars" but do not use "String" or "boolean" otherwise
	 * you will get COMPIE THE ERROR
	 */
/*
 * Method Overloading
 * If you create methods whose names are same,parameters are diffrent in a class
 * it is called "method overloading"
 * 
 * When you use same name for methods in a class,Java complains.
 * To stop complaining we have to change parameters
 * Changing access modifier will not stop complaining
 * 
 */
	
	public double add(double num1,double num2) {
		return num1+num2;
	}
	public double add(int  num1,char num2) {
		return num1+num2;
	}
	
	public double add(char  num1,int num2,int num3) {
		return num1+num2+num3;
}
)