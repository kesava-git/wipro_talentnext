package methodReferences;

interface DigitCounter {
    int count(int n);
}

class NumberUtils {
    public static int digitCount(int n) {
        if (n == 0) return 1;
        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}

public class Question_2 {
    public static void main(String[] args) {
        DigitCounter dc = NumberUtils::digitCount;

        int input = 123456;
        int result = dc.count(input);
        System.out.println("Number of digits in " + input + " is: " + result);
    }
}
