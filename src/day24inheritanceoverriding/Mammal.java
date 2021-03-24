package day24inheritanceoverriding;

public class Mammal extends Animal{
	
	public boolean haveBaby;
	
	public int heigth = 45;

	public Mammal() {
		super(5);
		/*
		 * 1 to create  an object  you can use jut a single  constucotor
		 * 
		 * 2 susper() keyword must be  in first line inside  the constructor
		 * 
		 * 3 you can use super() just once in a constructor 
		 * 
		 * 4 if you make constructor call for a non existing constructoy from parent class , you will get compile time 
		 *   error 
		 *   
		 *   
		 *   this() ==> Calls  the constructors  inside the classe itself 
		 *   
		 *   super()==> Calls the constructors from parent class ....
		 */
		System.out.println("Mammal concstuctor withouth parameter ");
	}
	public Mammal(boolean haveBaby) {
		super(3,4);
		
		this.haveBaby=haveBaby;
	}
}
