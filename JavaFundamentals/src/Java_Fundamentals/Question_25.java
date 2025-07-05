package Java_Fundamentals;

public class Question_25 {

	public static void main(String[] args) {
		int[] arr= {21,9,4,5,6,7,10,9,20,20,20,20,15};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int min1=0;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max1<arr[i]) {
				max2=max1;
				max1=arr[i];				
			}
			else if(max2<arr[i]&&max1>arr[i]) {
				max2=arr[i];
			}
		}
		System.out.println(max1);
	}

}
