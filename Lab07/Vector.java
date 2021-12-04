public class Vector {
	public static void main(String[] args) {
		double[] x = {5, 2, -3, 4, -2};
		double[] y = {2, 3, 5, -4, -6};
		double[] z;

		z = vectorProduct(x, y);

		System.out.println("The vector product is: ");
		for(int k = 0; k < z.length; k++)
			System.out.print(z[k] + "   ");	
		System.out.println("\n\nThe dot product is: "+dotProduct(x,y));
	}

	public static double[] vectorProduct(double[] a, double[] b) { 
		double[] t = new double[a.length];
		for(int i = 0; i < a.length; i++)
			t[i] = a[i] * b[i];

		return t;
	}
	
	public static double dotProduct(double[] a, double[] b) {
		double sum=0;
		for(int i = 0; i < a.length; i++)
			sum = a[i] * b[i];

		return sum;
	}
}