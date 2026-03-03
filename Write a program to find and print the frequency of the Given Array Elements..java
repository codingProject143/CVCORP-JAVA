import java.util.Scanner;
import java.util.LinkedHashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        int size;
        try {
            size = scanner.nextInt();
            if (size <= 0) {
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
        }
        
       
        LinkedHashMap<Integer, Integer> frequencyMap = new LinkedHashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
    
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " -> " + frequencyMap.get(key));
        }
    }
}
