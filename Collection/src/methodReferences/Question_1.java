package methodReferences;

interface FactorialCalculator {
    int calculate(int n);
}

class MyMath {
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class Question_1 {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        FactorialCalculator fc = math::factorial;
        int input = 5;
        int result = fc.calculate(input);
        System.out.println("Factorial of " + input + " is: " + result);
    }
}