package Java_Fundamentals;

import java.util.Arrays;

public class Question_30 {
	public static void main(String[] args) {
		int[] arr= {1,20,30,10,10,5,40,10,89};
		int i=0;int j=0;
		int temp;
		while(j<arr.length) {
			if(arr[i]%2==1) {
				if(arr[j]%2!=1) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					i++;j++;
				}
				else
					j++;
				
			}
			else{
				i++;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
}
}