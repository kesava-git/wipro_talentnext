package Exception_handling;

public class Question_2 {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new ArrayIndexOutOfBoundsException("Please enter exactly 5 integer values.");
            }

            int[] numbers = new int[5];
            int sum = 0;

            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]); // may throw NumberFormatException
                sum += numbers[i];
            }

            double average = sum / 5.0;  // floating-point division to avoid ArithmeticException
            System.out.println("Sum of array elements: " + sum);
            System.out.println("Average of array elements: " + average);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Error: One or more inputs are not valid integers. " + e);
        } catch (ArithmeticException e) {
            System.out.println("Error in arithmetic operation: " + e);
        }
    }
}
