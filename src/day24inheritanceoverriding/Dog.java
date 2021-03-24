package day24inheritanceoverriding;

public class Dog extends Mammal {

	public boolean smellWell;

	public int heigth = 25;

	public Dog() {
		super();// if you type "super()" it is fine
		// if you dont type java puts it automatically

		System.out.println("Dog construtor without parameter ");
	}

	public Dog(boolean smellWell ) {
		
		super(true); // this call always  parents consturctor 
		
		// if you dont type a super() then java uses itself super() for you 
		
		/*
		 * if you dont any type parent  constructor call inside  the first line 
		 * 
		 * java uses the parent constructor without parameter automatically 
		 */
		//super()  super  is for " parent consturctor call"
		// super is for "parent variables calls 
		
		
	
		//super.haveBaby=true;
		//super.heigth=11;
		//super.weigth=22;
		
	    // super.heigth=23;  // ==>retruns the heigth value from parent clasess(Animal)
		//this.heigth=34; //==>etruns the heigth value from parent itself(dog)
				//If you have multiple varibles whose names are same in different parent classes
				//super keyword selects the closest one
		
		this.smellWell=smellWell;
	}
}
