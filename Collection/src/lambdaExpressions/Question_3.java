package lambdaExpressions;

import java.util.ArrayList;

public class Question_3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("apple");
        al.add("banana");
        al.add("cherry");
        al.add("date");
        al.add("frog");
        al.add("grape");
        al.add("house");
        al.add("ink");
        al.add("jungle");
        al.add("kite");
        System.out.println("Words with Odd Length:");
        al.stream()
          .filter(word -> word.length() % 2 != 0)
          .forEach(System.out::println);
    }
}
