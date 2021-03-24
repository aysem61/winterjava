package day29abstraction;

public class Runner {

	public static void main(String[] args) {
		
		Shape rectangle = new Rectangle();
		
        System.out.println(rectangle.area(3, 7));
        rectangle.colour();
        
        Circle circle = new Circle();
        System.out.println(circle.area(4, 2));
        
        SquareRoom squareRoom = new SquareRoom();
        
        squareRoom.draw();
        
       Circle yeni=new Circle();
       
       System.out.println(yeni.area(3, 5)+" ayse nin ki");
       
       yeni.draw();
       
        
    }
}

		

	


