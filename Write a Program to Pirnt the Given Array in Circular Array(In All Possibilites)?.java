import java.util.Scanner;

public class CircularArrayGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        int size;
        try {
            size = scanner.nextInt();
            if (size <= 1 || size >= 11) {
                System.out.println("Invalid Array Size");
                return;
            }
        } catch (Exception e) {
            System.out.println("Invalid Array Size");
            return;
        }
  
        int[] arr = new int[size];
        try {
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Invalid Array Elements");
            return;
   
        for (int i = 0; i < size; i++) {
           
            for (int j = 0; j < size; j++) {
                System.out.print(arr[(i + j) % size] + " ");
            }
            System.out.println();
        }
    }
}
