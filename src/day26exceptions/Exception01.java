package day26exceptions;

public class Exception01 {

	/*
    Exception is an abnormal situation. In Java exception is an event that disrupts 
    the normal flow of the program
    
    There are two types of Exceptions:
    1)Compile Time Exceptions(Checked Exceptions): Occur before click on the run button
    2)Run Time Exceptions(Unchecked Exceptions): Occur after click on the run button
    */
	
	public static void main(String[] args) {
	
		try {
            divide(6,3);
            divide(3,12);
            divide(-3,1);
            divide(0,7);
            divide(8,0);
            
            
        }catch(ArithmeticException e) {
        	
            e.printStackTrace();//detailed messages about exception
            System.out.println("You cannot divide by zero " + e.getMessage());//brief message about exception
        }
        System.out.println("Can you print me?");
    }
    
    public static void divide(int a, int b) {
        System.out.println(a/b);
    }


	}

