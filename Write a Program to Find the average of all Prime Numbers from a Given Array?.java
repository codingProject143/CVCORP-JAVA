import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if(n<=3)
        {
            System.out.print("Invalid Array Size.");
            System.exit(1);
        }
        int sum=0;
        int count =0;
        
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]<=1)
            {
                System.out.print("Invalid Array Elements");
                System.exit(0);
            }
        }
        
        for(int i = 0;i < n; i++)
        {
             if(isprime(arr[i]))
            {
                sum=sum+arr[i];
                count++;
            }
        }
        if(count==0)
        {
            System.out.print("No Prime Numbers!");
        }
        else
        {
            float avg=(float)sum/count;
            System.out.printf("Average of Prime Numbers in a Given Array Elements is %.3f",avg);
            System.out.print(".");
        }
        
    }
    public static boolean isprime(int num)
    {
        if(num<=1) {
            return false ;
        }
            for(int i= 2;i<=Math.sqrt(num);i++) 
            {
                if(num%i==0)
                {
                    return false;
                }
            }
            return true;
    }
}
