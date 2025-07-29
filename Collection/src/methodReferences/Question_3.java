package methodReferences;

interface PrimeChecker {
    MyPrime check(int number);
}

class MyPrime {
    public MyPrime(int number) {
        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }
    }
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class Question_3 {
    public static void main(String[] args) {
        PrimeChecker checker = MyPrime::new;

        checker.check(17); 
        checker.check(20); 
    }
}
