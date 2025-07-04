import java.util.Scanner;
public class Question_6 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String newStr="";
    if(str.length()==0)System.out.println("No values");
    else{
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)==' '){
          newStr+=",";
        }
        else{
          newStr+=str.charAt(i);
        }
      }
    }
    System.out.println(newStr);
  }
}
