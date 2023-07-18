public class PrimeNumberChecker {
    public static void main(String[] args) {
        int number = 47; // Replace with the number you want to check

        boolean isPrime = isPrimeNumber(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2 || number == 3) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            System.out.println(i + " number.");
            if (number % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // Prime number
    }
}
