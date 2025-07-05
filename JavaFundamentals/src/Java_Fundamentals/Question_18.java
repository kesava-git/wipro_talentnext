package Java_Fundamentals;
import java.util.Scanner;
public class Question_18 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      String input = sc.nextLine().trim();
        if (input.isEmpty()) {
            System.out.println("Please enter an integer number");
            return;
        }
        int num;
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer number");
            return;
        }
        // Using For Loop
      for(int i=0;i<num;i++){
        for(int j=0;j<=i;j++){
          System.out.print("*  ");
        }
        System.out.println();
      }
      int i=0;
      int j=0;
        // Using While Loop
      // while(i<num){
      //   while(j<=i){
      //     System.out.print("*  ");
      //     j++;
      //   }
      //   System.out.println();
      //   j=0;
      //   i++;
      // }
    }
}
