package lambdaExpressions;

import java.util.ArrayList;
import java.util.Random;

public class Question_1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            al.add(rand.nextInt(100) + 1);
        }

        System.out.println("Original List: " + al);
        System.out.print("Prime Numbers: ");
        al.stream()
          .filter(n -> isPrime(n))
          .forEach(n -> System.out.print(n + " "));
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}