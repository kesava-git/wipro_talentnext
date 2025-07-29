package functionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Question_7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(7);
        numbers.add(4);
        numbers.add(9);
        numbers.add(6);
        numbers.add(13);
        numbers.add(8);
        numbers.add(1);
        numbers.add(10);
        numbers.add(5);

        Consumer<Integer> checkOddEven = n -> {
            String type = (n % 2 == 0) ? "even" : "odd";
            System.out.println(n + " " + type);
        };

        numbers.forEach(checkOddEven);
    }
}
