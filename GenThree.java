/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		String final_print = "The minimal generated number was ";
		Integer range_min=0, range_max=0;
		Integer received_1 = Integer.parseInt(args[0]);
		Integer received_2 = Integer.parseInt(args[1]);


		if (received_1 > received_2) {
			range_max = received_1;
			range_min = received_2;
		}
		else {
			range_max = received_2;
			range_min = received_1;
		}

		Integer random_1 = (int)((range_max - range_min) * Math.random() + range_min);
		Integer random_2 = (int)((range_max - range_min) * Math.random() + range_min);
		Integer random_3 = (int)((range_max - range_min) * Math.random() + range_min);

		Integer min_found = Math.min(Math.min(random_1, random_2), random_3);

		System.out.println(random_1);
		System.out.println(random_2);
		System.out.println(random_3);
		System.out.println(final_print + "" + min_found);
	}
}
