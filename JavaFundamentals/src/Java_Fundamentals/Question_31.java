package Java_Fundamentals;

public class Question_31 {
	public static void main(String[] args) {
		int[] arr= {1,4,5,1,4};
		boolean b=true;
		for(int i:arr) {
			if(i!=4&&i!=1) {
				b=false;
				System.out.println(b);
				break;
			}
		}
		if(b) {
			System.out.println(b);
		}
	}
}
