import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size;
        try {
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Invalid Array Size.");
                return;
            }
        } catch (Exception e) {
            System.out.println("Invalid Array Size.");
            return;
        }
   
        int[] arr = new int[size];
        try {
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Invalid Array Elements.");
            return;
        }
     
        int k;
        try {
            k = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid Search Key.");
            return;
        }
     
        boolean found = false;
        for (int num : arr) {
            if (num == k) {
                found = true;
                break;
            }
        }
  
        System.out.println(found ? "Found" : "Not Found");
    }
}

