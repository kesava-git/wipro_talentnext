package Java_Fundamentals;
import java.util.Scanner;
public class Question_9 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Your gender(Male/Female)");
    String gender=sc.nextLine().toLowerCase();
    System.out.print("Enter Your Age");
    int age=sc.nextInt();
    if(gender.equals("male")){
      if(age>=1&&age<=58){
        System.out.println("Percentage Of Interest: 8.4%");
      }
      else{
        System.out.println("Percentage Of Interest: 10.5%");
      }
    }
    else if(gender.equals("female")){
      if(age>=1&&age<=58){
        System.out.println("Percentage Of Interest: 8.2%");
      }
      else{
        System.out.println("Percentage Of Interest: 9.2%");
      }
    }
  }
}
