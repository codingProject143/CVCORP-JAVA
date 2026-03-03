import java.util.Scanner;
class Main 
{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<3)
        {
            System.out.print("Invalid Array Size.");
       
        }
        else
        {
            int a[]= new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;
            
            for(int i=0;i<n;i++)
            {
                if(a[i]>first)
                {
                    third=second;
                    second=first;
                    first=a[i];
                }
                else if(a[i]>second && a[i]< first)
                {
                    third = second;
                    second = a[i];
                    
                }
                else if(a[i]>third && a[i]< second)
                {
                    third = a[i];
                }
            }
            System.out.print(first+" "+second+" "+third);
        }
    }
}
Testcases Ou
