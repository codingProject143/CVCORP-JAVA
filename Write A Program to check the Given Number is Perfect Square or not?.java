import java.util.Scanner;

public class PerfectSquareChecker {
    public static void checkPerfectSquare() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Invalid Input");
            return;
        }
        boolean isPerfectSquare = false;
        int sqrt = (int) Math.sqrt(Math.abs(number));
        if (sqrt * sqrt == Math.abs(number)) {
            isPerfectSquare = true;
        }
        System.out.println(isPerfectSquare ? "Given Number is Perfect Square." : "Given Number is Not a Perfect Square.");
    }    public static void main(String[] args) {
        checkPerfectSquare();
    }
}
