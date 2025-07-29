package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(-4);
        numbers.add(7);
        numbers.add(-8);
        numbers.add(15);
        numbers.add(-3);
        numbers.add(-12);
        numbers.add(0);
        numbers.add(6);
        numbers.add(-2);
        List<Integer> negativeEvenNumbers = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Negative Even Numbers:");
        negativeEvenNumbers.forEach(System.out::println);
    }
}

