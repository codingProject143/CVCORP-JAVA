import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1 || n>=10)
        {
            System.out.print("Invalid Array Size.");
            System.exit(0);
        }
        else
        {
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            int sum=arr[0]+arr[n-1];
            System.out.print(arr[0]+" + "+arr[n-1]+" = ");
            System.out.print(sum);
        }

    }
}
