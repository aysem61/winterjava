package day29abstraction;

public abstract class Shape {//ABSTRACT CLASSLARI ABSTRACT METHOD OLUSTURMAK ICIN YAPARIZ
	
	
	/*
	 An abstract method can not be final, static, private. Because we create abstract methods to override
	 but we can not override final, static and private methods
	 */
	
	/*
	 Abstract Method:
	 Sometimes we need a method which has no body. These methods are called "abstract methods"
	 To create an abstract method you need to follow these three steps:
	   1)Remove the body
	   2)Put "abstract" keyword between access modifier and return type
	   3)Make the CLASS abstract. 
	   You can create abstract methods in only abstract classes
	   
	 Abstract Class:
	 >We need abstract classes to create abstract methods
	 >NOTE: We cannot create an object from abstract classes!!!
	 ( An abstract class cannot be instantiated with "new" keyword.)
	 >They can have constructors.
	 >We can create concrete methods(not abstract) in abstract classes
	 
	 */
	
	public Shape() {//Abstract classes may have constructors
		super();
		
	}
	
	public abstract int area(int a, int b);
	public abstract int perimeter(int a, int b);
	public abstract void colour();
	public void draw() {//CONCRETE METHOD
		System.out.println("I can draw");
	}
	
	

	
	
	
	//             class abstract olunca obje uretmez.

	// method abstract olunca body si olmaz.

	// concrete class ın icine abstract method konmaz,sadece concrete konur.
	// abstract class ın içine iki tür method da konur

	// abstarct methoda body koymaya calısırsam CompiletimeError
	// concrete methoda body koymazsam CompiletimeError.

	//      abstract class ın cocugu olur bu cocuk concrete da olur abstract da
	//      ama child i concrete yaparsak parentte abstract olan metodlari child içinden override
	// edip body koymak zorundayız, yani consrete yapmak zorundayız..
	// bunun bir faydası var parentdaki abstract methodu almak zorunda kalıyoruz her child da.
	// mesela bir kural getirdin abstract methoda koydun. bunu mecbur her child override etmek için çağırcak
}








