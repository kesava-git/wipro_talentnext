package Java_Fundamentals;

import java.util.Arrays;

public class Question_29 {
	public static void main(String[] args) {
		int[] arr= {10,20,30,10,10,5,40,10,89};
		int i=0;int j=0;
		int temp;
		while(j<arr.length) {
			if(arr[i]==10) {
				if(arr[j]!=10) {
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
		for(int k=arr.length-1;k>=0;k--) {
			if(arr[k]==10) {
				arr[k]=0;
			}
			else {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
