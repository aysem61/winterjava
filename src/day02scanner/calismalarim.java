package day02scanner;

import java.util.Scanner;

public class calismalarim {
	
	public static void main (String[] args){
	
	
	
	Scanner scan=new Scanner(System.in);
	
	int a = 20;
	int b = 30;
	System.out.println(a+b);
	System.out.println(a*b);
	
	System.out.println("Please enter the first integer");
	int num1= scan. nextInt();
	
	System.out.println("Please enter the second integer");
	int num2=scan.nextInt();
	
	
	System.out.println("Sum:" + num1+num2);
	System.out.println("Product:"+ num1*num2);
	

System.out.println("Please,enter the length of the side of the square");
double length=scan.nextDouble();
System.out.println("Area:" + length*length);
System.out.println("Perimeter:"+ 4*length);
	

      System.out.println("Please,enter the length of the rectangle");
    
    System.out.println("Please,enter the width of the rectangle");
double width=scan.nextDouble();
System.out.println("Area;" +width*length);
System.out.println("Perimeter:" +2*(width+length));



	}		

}
