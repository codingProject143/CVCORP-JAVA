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
        
        // Calculate sum and build the output string
        int sum = 0;
        StringBuilder equation = new StringBuilder("Sum of 'N' Natural Numbers is ");
        
        for (int i = 1; i <= N; i++) {
            sum += i;
            equation.append(i);
            if (i < N) {
                equation.append(" + ");
            }
        }
        
        equation.append(" = ").append(sum).append(".");
        System.out.println(equation.toString());
    }

    public static void main(String[] args) {
        calculateSum();
    }
}
