import java.util.Scanner;

public class LeapYearChecker {
    public static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        
        // Read input year
        int year = scanner.nextInt();
        
        // Check for invalid input
        if (year <= 0) {
            System.out.println("Given Year is Invalid Input.");
            return;
        }
        
        // Check for leap year
        boolean isLeapYear;
        if (year % 4 != 0) {
            isLeapYear = false;
        } else if (year % 100 != 0) {
            isLeapYear = true;
        } else {
            isLeapYear = (year % 400 == 0);
        }
        
        // Print the result
        System.out.println(isLeapYear ? "Leap Year." : "Not a Leap Year.");
    }

    // Do not change the code below
    public static void main(String[] args) {
        checkLeapYear();
    }
}
