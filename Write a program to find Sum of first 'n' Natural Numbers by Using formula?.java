import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void calculateSum() {
        Scanner scanner = new Scanner(System.in);
        
        // Read input value N
        int N = scanner.nextInt();
        
        // Check for invalid input
        if (N == 0) {
            System.out.println("Invalid Input.");
            return;
        }
        if (N < 0) {
            System.out.println("Sorry! you have Entered Negative Values.");
            return;
        }
        
        // Calculate sum using formula
        int sum = N * (N + 1) / 2;
        
        // Print the result in required format
        System.out.println("Sum of 'N' Natural Numbers is " + sum + ".");
    }

    // Do not change the code below
    public static void main(String[] args) {
        calculateSum();
    }
}
