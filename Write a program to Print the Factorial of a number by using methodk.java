import java.util.Scanner;

public class FactorialCalculator {
    public static void printFactorial() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            number = -number;
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        printFactorial();
    }
}
