import java.awt.Rectangle;

/*  Creates a rectangle object, calls its translate method and then print it. */
public class MoveRectangle {
	public static void main(String[] args) {
		Rectangle myRectangle=new Rectangle(5, 5, 10, 10);
		System.out.println("Before Translation: "+myRectangle);
		myRectangle.translate(15,25);
	 	System.out.println("After Translation: "+myRectangle);
	}
}


		
