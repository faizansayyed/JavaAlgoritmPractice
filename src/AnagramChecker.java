import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean areAnagrams = checkAnagramNaive(str1, str2);

        if (areAnagrams) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean checkAnagram(String str1, String str2) {
        // Remove any whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the sorted versions of the strings are equal
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static boolean checkAnagramNaive(String str1, String str2) {
        // Remove any whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the strings have the same length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create an array to count the frequencies of characters
        int[] charCount = new int[26];

        // Increment character count for string 1
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
        }

        // Decrement character count for string 2
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i) - 'a']--;
        }

        // Check if all character counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
