import java.util.Scanner;
public class Question_7 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char char1=sc.next().charAt(0);
    char char2=sc.next().charAt(0);
    if(char1<char2)System.out.println(char1+","+char2);
    else System.out.println(char2+","+char1);
  }
}
