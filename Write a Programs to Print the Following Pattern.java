import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        //Write Your Code Here
        int n = sc.nextInt();
        if(n<0)
        {
            n=-n;
        }
        if(n==0)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            int c = 0;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    c+=2;
                        System.out.print(c+" ");
                }
                c--;
                System.out.println();
            }
        }
    }
}
