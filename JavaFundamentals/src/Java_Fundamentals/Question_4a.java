package Java_Fundamentals;
import java.util.Scanner;
public class Question_4a {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(num>0)System.out.println("The number is Positive ");
    else if(num<0)System.out.println("The number is Negative ");
    else System.out.println("The number is Zero");
  }
}
