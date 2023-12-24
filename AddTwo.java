public class AddTwo {
    public static void main(String[] args) {
        // Parse the command line arguments to integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Calculate the sum
        int sum = a + b;

        // Print the result in the specified format
        System.out.println(a + " + " + b + " = " + sum);
    }
}
