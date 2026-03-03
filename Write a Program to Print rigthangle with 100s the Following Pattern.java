import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
       
        int n= sc.nextInt();
        int c=100;
        if(n<=0)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(c+" ");
                    c+=100;
                }
                System.out.println();
            }
        }
    }
}
