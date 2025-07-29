package functionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Question_6 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("java");
        words.add("stream");
        words.add("lambda");
        words.add("consumer");
        words.add("function");
        words.add("interface");
        words.add("example");
        words.add("reverse");
        words.add("code");

        Consumer<Integer> reverseWord = index -> {
            String word = words.get(index);
            String reversed = new StringBuilder(word).reverse().toString();
            words.set(index, reversed);
        };

        for (int i = 0; i < words.size(); i++) {
            reverseWord.accept(i);
        }

        System.out.println("Reversed Words:");
        words.forEach(System.out::println);
    }
}
