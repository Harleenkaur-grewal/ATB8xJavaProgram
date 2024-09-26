package Sept.ex_25092024;
/*
Prime Number from 1 to 100. (for loop)
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;  // Assume the number is prime
            // Check divisibility by numbers less than 'i'
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;  // If divisible, it's not prime
                    break;
                }
            }
            // If isPrime is still true, then 'i' is a prime number
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

