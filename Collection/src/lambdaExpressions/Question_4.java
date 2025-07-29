package lambdaExpressions;

interface WordCount {
    int count(String str);
}

public class Question_4 {
    public static void main(String[] args) {
        WordCount wordCounter = (str) -> {
            if (str == null || str.trim().isEmpty()) {
                return 0;
            }
            return str.trim().split("\\s+").length;
        };
        String input = "Hello this is a lambda expression example for no.of words ";    
        int wordCount = wordCounter.count(input);
        System.out.println("Number of words: " + wordCount);
    }
}
