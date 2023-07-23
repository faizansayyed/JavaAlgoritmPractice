import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsInStringExample {
    public static void main(String[] args) {
        String str = "hello world"; // Change this string to check for different cases

        Map<Character, Integer> charFrequency = new HashMap<>();

        // Count the frequency of each character in the string
        for (char ch : str.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " occurrences");
            }
        }
    }
}
