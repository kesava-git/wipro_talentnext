package Java_Fundamentals;


public class Question_27 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 10, 30, 40, 20, 50};
        int n = arr.length;
        int[] temp = new int[n];
        int newIndex = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newIndex; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[newIndex++] = arr[i];
            }
        }
        System.out.print("[ ");
        for (int i = 0; i < newIndex; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.print("]");

	}
}
