import java.util.Scanner;
import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        if(r<=0||c<=0)
        {
            System.out.print("Invalid Inputs");
        }
        else
        {
            for(int i=1;i<=r;i++)
            {
                for(int j=1;j<=c;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
