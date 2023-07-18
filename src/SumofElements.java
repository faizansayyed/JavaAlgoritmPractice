import java.util.Arrays;

public class SumofElements {

	// Create a Method which accepts Array and returns sum of all the elements in
	// array
	// Print 5 Multiplication table without using Multiply operator

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(sumNumbers(a));
		System.out.println(multiply(5, 10));
	}

	public static int sumNumbers(int[] arr) {
		return Arrays.stream(arr).reduce(0, (a, b) -> a + b);
	}

	public static int multiply(int num, int j) {
		int result = 0;
		int i = 1;
		while (i <= j) {
			result += num;
			i++;
		}
		return result;
	}

}
