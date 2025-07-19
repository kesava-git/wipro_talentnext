package Abstraction_Packages_ExceptionHandling;

import java.util.Scanner;

public class Question_11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] marks=new int[3];
		String[] names=new String[2];
		int sum=0;
		try {
			for(int j=0;j<2;j++) {
				System.out.println("Enter name: ");
				names[j]=sc.nextLine();
				for(int i=0;i<3;i++) {
					System.out.println("Enter marks of subject "+(i+1));
					marks[i]=Integer.parseInt(sc.nextLine());
					if(marks[i]<0) {
						throw new Negative("Marks cannot be negative.");
					}
					if (marks[i]>100) {
                        throw new OutOfRange("Marks should be between 0 and 100.");
					}
					sum+=marks[i];
				}
				double avg=sum/3.0;
				sum=0;
				System.out.println("Average of "+names[j]+" for 3 subjects is :"+avg);
			}
		}
		catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter only integer values. " + e);
        }
		catch (Negative|OutOfRange e) {
            System.out.println("Error: " + e.getMessage());
		}
	}
}
class Negative extends Exception{
	public Negative(String message) {
		super(message);
	}
}
class OutOfRange extends Exception{
	public OutOfRange(String message) {
		super(message);
	}
}
