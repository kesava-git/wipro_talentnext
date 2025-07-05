package Java_Fundamentals;

public class Question_28 {
	public static void main(String[] args) {
		int[] arr= {2,4,5,6,10,30,20,7,15};
		int i=0;
		int j=arr.length-1;
		int sum=0;
		while(i<j) {
			if(arr[i]==6&&arr[j]==7) {
				break;
			}
			if(arr[j]!=7) {
				sum+=arr[j];
				j--;
			}
			if(arr[i]!=6) {
				sum+=arr[i];
				i++;
			}
			
		}
		System.out.println(sum);
	}
}
