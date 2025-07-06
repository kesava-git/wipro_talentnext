package Java_Fundamentals;

public class Question_25 {

	public static void main(String[] args) {
		int[] arr = { 12, 45, 2, 67, 89, 1, 34, 78, 89, 2};
		int smallest1 = Integer.MAX_VALUE, smallest2 = Integer.MAX_VALUE;
		int largest1 = Integer.MIN_VALUE, largest2 = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num < smallest1) {
				smallest2 = smallest1;
				smallest1 = num;
			} else if (num < smallest2 && num != smallest1) {
				smallest2 = num;
			}
		}
		for (int num : arr) {
			if (num > largest1) {
				largest2 = largest1;
				largest1 = num;
			} else if (num > largest2 && num != largest1) {
				largest2 = num;
			}
		}
		if (smallest2 == Integer.MAX_VALUE)
			smallest2 = smallest1;
		if (largest2 == Integer.MIN_VALUE)
			largest2 = largest1;

		System.out.println("Smallest two numbers: " + smallest1 + ", " + smallest2);
		System.out.println("Largest two numbers: " + largest1 + ", " + largest2);
	}

}
