package functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Question_3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList(
            "madam", "hello", "racecar", "world", "level", 
            "java", "noon", "civic", "apple", "deed"
        ));

        Predicate<String> isPalindrome = str -> 
            str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());

        System.out.println("Palindrome words:");
        words.stream()
             .filter(isPalindrome)
             .forEach(System.out::println);
    }
}
