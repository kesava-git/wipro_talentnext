package Java_Fundamentals;

import java.util.Arrays;

public class Question_26 {
	public static void main(String[] args) {
		int[] arr= {12,34,12,45,67,89};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
