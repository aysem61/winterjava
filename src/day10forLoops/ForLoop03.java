package day10forLoops;

public class ForLoop03 {

	public static void main(String[] args) {
		 sumOfAllInt() ;
		 
		 multipleInt();
		 
	}
	private static void multipleInt() {
		// TODO Auto-generated method stub
		
		int a=1;
		
		for(int i=1; i<8; i++) {
			a=a*i;
			
		}
		
		System.out.println(a+" carpma ");
		
		
		int x = 2; 
        for(long y = 0, z = 4; x < 10 && y < 10; x++, y++)  
        { 
            System.out.println(y + " "); 
        } 
      
        System.out.println(x+" new "); 
		
	}
	/*
	 * Find the summ of all integers from 10 to 200
	
	 */
	public static void sumOfAllInt() {	 
		
		int sum=0;
	
		for(int i=4; i<7; i++) {
			sum=sum+ i;
		}
		System.out.println(sum+" in addition with forloop ");
	}
}
