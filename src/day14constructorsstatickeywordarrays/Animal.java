package day14constructorsstatickeywordarrays;

public class Animal {

	    public String name ;
	    
	    public int weight ;
	    
	    public boolean herbivorous;
	    
	    public Animal() {
	    	
	    	this("joe",33,true);
	        
	        System.out.println("1st costructor is executed.");
	    }
	    
	    public Animal(String name) {
	    	
	        this();
	        
	        System.out.println("2nd costructor is executed.");
	        
	        this.name = name;
	    }
	    public Animal(String name, int weight) {
	        //this("Dog");
	        System.out.println("3rd costructor is executed.");
	        this.name = name;
	        this.weight = weight;
	    }
	    
	    public Animal(String name, int weight, boolean herbivorous) {
	       // this("Sam");//1)Constructor call must be done in the first line every time, otherwise CTE
	                    //2)In a constructor u can make just one constructor call,
	                    //bc if u make multiple calls, at least one of them will not be in the first line
	        // that will contradict with the first rule.
	        System.out.println("4th costructor is executed.");
	        this.name = name;
	        this.weight = weight;
	        this.herbivorous = herbivorous;
	    }
	    public static void main(String[] args) {
	        //main method is entry point, so Java starts to read the code from main method.
	        
	        Animal dog1 = new Animal("Mark");
	        Animal dog2 = new Animal("Mark", 23, false);
	        
	        System.out.println(dog1.name);
	        System.out.println(dog1.weight);
	        System.out.println(dog1.herbivorous);
	        
	    
	    }


}
