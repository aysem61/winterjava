package day29abstraction;

public abstract class Square extends Shape {
	
	/*
    If parent class is abstract, when you create an abstract child class you don't need to
    override abstract methods in your parent abstract class.
    */
	
	public abstract int length(int a, int b);
   
   @Override
   public int area(int a, int b) {
       b = a;
       return a*a;
   }
   @Override
   public int perimeter(int a, int b) {
       b = a;
       return 4*a;
   }
}



