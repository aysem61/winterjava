package day03wrapperclassc;

public class Concatenation01 {

	public static void main(String[] args) {
		
		/*Concatenation:It joints two or more String
		
		 
		 */
		String s="Java";
		String t="is easy";
		System.out.println( s +" "+t );
		
		int a=3;
		int b=4;
		
		 String s1="Java";
		
		System.out.println(a+ s1);//3Java
		System.out.println(s1 +a);//Java3
		
		System.out.println(a+s1+b);//3Java4
		
		System.out.println(s1+a+b);//Java34
		System.out.println(s1+(a+b));//Java7
		
		int d=2;
		int e=3;
		
		String f="Java";
		
		//By using d,e,f print 61Java-1 on the console
		
		
		
			System.out.println(d+e+f);	
			System.out.println((d*e)+((e-d)+f)+(d-e));
			
			  System.out.println(((d+e)*e*d*d + (e-d)) + f + (d-e));
		        

			  deneme();

	}

	private static void deneme() {
		
		//By usuing following variables,print "61 Study-1" on the console
		
		int m=2;
		int n=3;
		String s="Study";
		
		System.out.println((m*n)*(n-m) + s+(m-n));
		
		//((2*3)+""+(3-2)+" "+"Study"+(2-3)
		
		System.out.println("iskender in denemesoi ...............");
		System.err.println((m*n)+""+(n-m)+" "+s+(m-n));
		
				
	}

}
