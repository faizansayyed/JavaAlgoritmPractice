public class Palindrome {
    public static void main(String[] args) {
        String str = "faizan";
        System.out.println(palindromeString(str));
    }

    public static String palindromeString(String str) {
        if (str.length() <= 1) {
            return str;
        }
        // n + palindromeString(aiza) + f
        // a + palindromeString(iz) + a
        // i + palindromeString(z) + z
        return str.charAt(str.length() - 1) + palindromeString(str.substring(1, str.length() - 1)) + str.charAt(0);
    }
}
