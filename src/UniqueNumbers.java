import java.util.HashMap;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 2, 4, 3, 5, 6, 1 };

        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each number
        for (int number : numbers) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        // Print the unique numbers and their counts
        System.out.println("Unique numbers and their counts:");
        for (int number : countMap.keySet()) {
            int count = countMap.get(number);
            System.out.println(number + " - " + count);
        }
    }
}
