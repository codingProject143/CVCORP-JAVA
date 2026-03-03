import java.util.Scanner;

public class PrimeNumberChecker {
    public static void checkPrime() {
        Scanner scanner = new Scanner(System.in);
        
        // Read input value
        int number = scanner.nextInt();
        
        // Check for invalid input
        if (number <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        
        // Check for prime (special cases first)
        if (number == 1) {
            System.out.println("Not a Prime Number");
            return;
        }
        if (number == 2) {
            System.out.println("Prime Number");
            return;
        }
        
        // Check for even numbers
        if (number % 2 == 0) {
            System.out.println("Not a Prime Number");
            return;
        }
        
        // Check odd divisors up to sqrt(number)
        boolean isPrime = true;
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        // Print the result
        System.out.println(isPrime ? "Prime Number" : "Not a Prime Number");
    }

    // Do not change the code below
    public static void main(String[] args) {
        checkPrime();
    }
}
