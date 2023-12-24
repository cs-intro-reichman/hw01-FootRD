/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	// Put your code here
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		double sub_c_b = c - b;
		double div_by_a = sub_c_b / a;

		double x = div_by_a;

		String prt_equation = a + " * x" + " + " + b + " = " + c;
		String prt_res = "x = " + x;

		System.out.println(prt_equation);
		System.out.println(prt_res);
	}
}