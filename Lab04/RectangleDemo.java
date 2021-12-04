// Demonstrating using accessor and mutator methods.

class Rectangle {
	private double length , width;
		
	public Rectangle(double rectangleLength , double rectangleWidth) {
		length = rectangleLength;
		width = rectangleWidth;
	}
		
	public double area() {
		return length * width;
	}
	
	/* 
	   The only way to get the value of a private instance variable is by a public method.
	   A method that accesses an instance variable without changing it is called an accessor method.
	 */
	 
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	/* 
	   The only way to modify a private instance variable is by a public method.
	   A method that accesses and modifies an instance variable is called a mutator method.
	*/
	
	public void setLength(double newLength)	{
		length = newLength;
	}
	
	public void setRectangleWidth(float newWidth) {
		width = newWidth;
	}
}
	
public class RectangleDemo {
	public static void main(String[] args) 	{
		
		// Create one Rectangle object
		Rectangle rectangle = new Rectangle(20.0, 10.0);
		
		double area;
		
		// Get and display the area of rectangle
		area = rectangle.area();
		System.out.println("The area of the rectangle is\t" + area + " square cm");
		
		// Get and display the length of rectangle
		//Note: we cannot use rectangle.length
		System.out.println("The length of the rectangle is\t" + rectangle.getLength() + " cm");
		
		// Modify the length of rectangle1 to 12.0
		//again, we must use a mutator method to change the value of a private instance variable
		rectangle.setLength(12.0);
		
		// Get and display the new length of the rectangle
		System.out.println("The new length of the rectangle is " + rectangle.getLength() + " cm");
		
		// Get and display the new area of the rectangle
		System.out.println("The new area of the rectangle is   " + rectangle.area() + " square cm\n\n");
	}
}		