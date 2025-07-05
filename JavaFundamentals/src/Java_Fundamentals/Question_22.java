package Java_Fundamentals;

public class Question_22 {
	public static void main(String[] args) {
		int[] arr= {2,4,5,6,7,10,9,20,15};
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Maximum Value is: "+max);
		System.out.println("Minimum Value is: "+min);
	}
}
