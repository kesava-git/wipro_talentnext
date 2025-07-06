package Java_Fundamentals;

import java.util.Arrays;

public class Question_32 {
	public static void main(String[] args) {
		int[] arr1= {3,10,7};
		int[] arr2= {5,2,8};
		int[] arr3=new int[2];
		arr3[0]=arr1[1];
		arr3[1]=arr2[1];
		System.out.println(Arrays.toString(arr3));
	}
}
