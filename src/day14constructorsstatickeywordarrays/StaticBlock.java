package day14constructorsstatickeywordarrays;
/*
 * 1)Static Block is used to initiliaze "static(class) variables"
 * 2)If you need some variables to initialize bfore "constructors" and "main method" are executed
 	  you should initialize the variable by "static block".
 	3)If you have multiple "static blocks", the static block at the top works first.

 */
public class StaticBlock {
	
	public static int age;
	
	static {
		System.out.println("Static block  1 is exuecuted");
		age=23;
	}

	static {
		System.out.println("Static block  2 is exuecuted");
		age=24;
	}
	
	public StaticBlock() {
		System.out.println("Constructor is executed");
		System.out.println(++age);
	}

	public static void main(String[] args) {
		System.out.println("Main method is executed 1");
		System.out.println(++age);
		
		StaticBlock obj=new StaticBlock();
		System.out.println("Main method is executed 2");

	}

}
