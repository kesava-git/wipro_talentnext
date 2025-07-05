import java.util.Scanner;
public class Question_10 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char char1=sc.next().charAt(0);
    if(Character.isUpperCase(char1))System.out.println(char1+"->"+(char)(char1+32));
    else System.out.println(char1+"->"+(char)(char1-32));
  }
}
