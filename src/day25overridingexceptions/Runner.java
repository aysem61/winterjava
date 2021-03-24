package day25overridingexceptions;

public class Runner {
	
	 public static void main(String[] args) {
		    //create an object whose data type is Animal and 
		    //constructor is also Animal()
		        
		   //Note: If parent class and child class have methods whose names are the same,
		   //look at the data types to understand which one will be called
		   //If you re trying to access a variable you need to check the data type
		   //If you re trying to access a method you need to check the constructor
		        
		   //Note:If you use "parent class" as data type the variables and methods which are
		    //in child class, will NOT be accessible
		   //Note:If you use "child class" as data type the variables and methods which are
		        //in parent class will be accessible
		        
		        Animal obj1 = new Animal();
		        System.out.println(obj1.age);
		        obj1.eat();
		        System.out.println(obj1.add());
		        
		        Animal obj2 = new Cat();
		        System.out.println(obj2.age);//17 (came from Animal)
		        System.out.println(obj2.name);//Joe (came from Animal)
		        obj2.sound();//Cats meaw (came from Cat)
		        System.out.println(obj2.multiply());//63 (came from Cat)
		        
		        Cat obj3 = new Cat();
		        System.out.println(obj3.age);
		        System.out.println(obj3.height);
		        obj3.eat();//Cats drink milk 
		        System.out.println(obj3.add());
		        
		        
		        
		    }
		}



