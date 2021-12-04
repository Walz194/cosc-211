// Demonstrating the use of static variables.

class Circle {
	private static int numberOfCircles = 0;
	
	private double radius;
	
	public Circle(double circleRadius) {
		numberOfCircles++;
		radius = circleRadius;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public double circumference() {
		return 2.0 * Math.PI * radius;
	}
	
	public static int getNumberOfCircles() {
		return numberOfCircles;
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		
		// The static method getNumberOfCircles can be called before creating any circle object
		System.out.println("The number of circles is " + Circle.getNumberOfCircles());
		
		Circle circle1 = new Circle(8.5);
		System.out.println("The number of circles is " + Circle.getNumberOfCircles());
		
		Circle circle2 = new Circle(5.0);
		System.out.println("The number of circles is " + Circle.getNumberOfCircles());
		
		System.out.println("The area of the first circle is   \t" + circle1.area() + " square cm");
		System.out.println("The circumference of the first circle is\t" + circle1.circumference() + " cm");
		
		System.out.println("The area of the second circle is \t" + circle2.area() + " square cm");
		System.out.println("The circumference of the second circle is\t" + circle2.circumference() + " cm\n\n");
	}
}		   