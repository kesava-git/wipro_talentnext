package functionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Question_5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(16);
        numbers.add(10);
        numbers.add(25);
        numbers.add(31);
        numbers.add(36);
        numbers.add(40);
        numbers.add(1);
        numbers.add(64);

        Predicate<Integer> isPerfectSquare = num -> {
            int sqrt = (int)Math.sqrt(num);
            return sqrt * sqrt == num;
        };

        System.out.println("Perfect square numbers:");
        numbers.stream()
               .filter(isPerfectSquare)
               .forEach(System.out::println);
    }
}
