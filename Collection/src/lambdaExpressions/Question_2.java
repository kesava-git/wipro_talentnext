package lambdaExpressions;

import java.util.ArrayList;

public class Question_2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("apple");
        al.add("banana");
        al.add("cherry");
        al.add("date");
        al.add("elephant");
        al.add("frog");
        al.add("grape");
        al.add("house");
        al.add("ice");
        al.add("jungle");
        System.out.println("Original List: " + al);
        System.out.println("Words in Reverse Order:");
        al.forEach(word -> {
            StringBuilder reversed = new StringBuilder(word).reverse();
            System.out.println(reversed);
        });
    }
}
