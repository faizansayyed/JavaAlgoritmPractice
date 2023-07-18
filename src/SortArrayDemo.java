import java.util.Arrays;

public class SortArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 6, 1, 4, 9 };
		// [1,6,2,4,9]

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		Arrays.stream(arr).forEach(System.out::println);
	}

}
