package functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Question_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12, 5, 7, 9, 14, 3, 6, 8, 10, 11));

        Function<ArrayList<Integer>, Integer> calculateSum = list -> {
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            return sum;
        };

        int totalSum = calculateSum.apply(numbers);
        System.out.println("Sum of all elements: " + totalSum);
    }
}
