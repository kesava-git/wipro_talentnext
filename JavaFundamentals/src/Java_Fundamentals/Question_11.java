package Java_Fundamentals;
import java.util.Scanner;
public class Question_11 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Choose : R->Red,B->Blue,G->Green,O->Orange,Y->Yellow,W->White");
	    char char1=sc.next().charAt(0);
	    switch (Character.toUpperCase(char1)) {
	      case 'R':
	        System.out.println("Red");
	        break;
	      case 'B':
	        System.out.println("Blue");
	        break;
	      case 'G':
	        System.out.println("Green");
	        break;
	      case 'O':
	        System.out.println("Orange");
	        break;
	      case 'Y':
	        System.out.println("Yellow");
	        break;
	      case 'W':
	        System.out.println("White");
	        break;
	      default:
	        System.out.println("Invalid Code");
	        break;
	    }
	  }
}
