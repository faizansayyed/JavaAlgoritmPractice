
public class ReverseStringExample {

    public static void main(String[] args) {
        System.out.println(reverseStringUsingRecurssion("faizan"));
    }

    public static String reverseStringUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseStringUsingCharArray(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static String reverseStringUsingRecurssion(String str) {
        if (str == "") {
            return str;
        }
        return reverseStringUsingRecurssion(str.substring(1)) + str.charAt(0);
    }

}
