/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		Integer a = Integer.parseInt(args[0]);
		Integer b = Integer.parseInt(args[1]);
		Integer c = Integer.parseInt(args[2]);

		Integer sum_a_b = a + b;

		Boolean trg_condition = false;

		if (sum_a_b > c) {
			trg_condition = true;
		}

		String prt_sides = a + ", " + b + ", " + c + ": ";

		System.out.println(prt_sides + "" + trg_condition);
	}
}
