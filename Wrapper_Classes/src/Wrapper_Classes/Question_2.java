package Wrapper_Classes;

public class Question_2 {
	public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an integer as a command line argument.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            System.out.println("Given number : " + n);
            System.out.println("Binary equivalent : " + Integer.toBinaryString(n));
            System.out.println("Octal equivalent : " + Integer.toOctalString(n));
            System.out.println("Hexadecimal equivalent : " + Integer.toHexString(n).toUpperCase());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
