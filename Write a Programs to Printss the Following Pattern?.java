import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        
        if(n<=0)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            int c = 1;
            for(int i=n;i>=1;i--)
            {
                c++;
                if(c%2==0)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(j+" ");
                    }
                }
                else
                {
                    for(int j=i;j>=1;j--)
                    {
                        System.out.print(j+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
