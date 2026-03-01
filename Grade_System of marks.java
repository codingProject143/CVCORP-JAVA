import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0 || n > 100) {
            System.out.print("INVALID INPUT");
        }
        else if (n >= 91) {
            System.out.print("SUPER SMART");
        }
        else if (n >= 81) {
            System.out.print("SMART");
        }
        else if (n >= 71) {
            System.out.print("SMART ENOUGH");
        }
        else if (n >= 61) {
            System.out.print("JUST SMART");
        }
        else if (n >= 36) {
            System.out.print("NO SMART");
        }
        else {
            System.out.print("DUMB");
        }
    }
}
