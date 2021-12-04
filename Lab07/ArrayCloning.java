public class ArrayCloning {
	public static void main(String[] args)	{
		int k;
		double[] x = {5, 2, -3, 4, -2};
		double[] y = new double[5];
		double[] z = {10, 25, 30, 45};
		double[] w;

		y = x;
		/* y and x refer to the same object. The object that was referenced by y
		   is destroyed.
		*/

		System.out.println("The array referenced by y is: ");
		for(k = 0; k < y.length; k++)
			System.out.print(y[k] + "   ");

		x[0] = 200;
		x[4] = 66;

		System.out.println("\n\nThe array referenced by y is: ");
		for(k = 0; k < y.length; k++)
			System.out.print(y[k] + "   ");

		w = (double[])z.clone();
		// w and z refer to different objects

		z[0] = 88;
		z[2] = -99;

		System.out.println("\n\nThe array referenced by w is: ");
		for(k = 0; k < w.length; k++)
			System.out.print(w[k] + "   ");
	}
}