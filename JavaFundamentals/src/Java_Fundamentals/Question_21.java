package Java_Fundamentals;

public class Question_21 {
	public static void main(String[] args) {
		int[] arr= {2,4,5,6,7,10,9,20,15};
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println("Sum is: "+sum);
		System.out.println("Avg is: "+sum/arr.length);
	}
}
