import java.util.Scanner;
public class Question_8 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char char1=sc.next().charAt(0);
    if(Character.isDigit(char1))System.out.println("Digit");
    else if(Character.isAlphabetic(char1))System.out.println("Alphabet");
    else System.out.println("Special Character");
  }
}
