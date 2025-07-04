import java.util.Scanner;
public class Question_5 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if((num&1)==1)System.out.println(num+" is Odd");
    else System.out.println(num+" is Even");
  }
}
