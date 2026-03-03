import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        //Write Your Code Here
        int n = sc.nextInt();
        if(n<=0)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            int count =0;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    count++;
                    System.out.print(count+" ");
                }
                System.out.println();
            }
        }
    }
}
