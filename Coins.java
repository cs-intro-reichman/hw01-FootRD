/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int total_coins = Integer.parseInt(args[0]);

		int total_quarters = total_coins/25;
		int total_cents = total_coins%25;

		String output_quarters = "Use " + total_quarters + " quarters ";
		String output_cents = "Use " + total_cents + " cents";

		System.out.println(output_quarters + "and " + output_cents);
	}
}