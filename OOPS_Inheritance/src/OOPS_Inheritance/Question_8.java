package OOPS_Inheritance;

import java.util.Scanner;

public class Question_8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean isPalindrome=true;
		for(int i=0;i<=(s.length()-1)/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome)System.out.println("Given String is a Palindrome..");
		else System.out.println("Given String is NOT a Palindrome..");
	}
}