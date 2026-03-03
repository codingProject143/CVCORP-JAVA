import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int count =1;
        if(r<=0&&c<=0)
        {
            System.out.print("Invalid Row and Column Values");
        }
        else if(r<=0)
        {
            System.out.print("Invalid Row Value");
        }
        else if(c<=0)
        {
            System.out.print("Invalid Column Value");
        }
        else
        {
            for(int i=1;i<=r;i++)
            {
                for(int j=1;j<=c;j++)
                {
                    if(j==1)
                    {
                        System.out.print(count);
                    }
                    else
                    {
                        System.out.print("*"+count);
                    }
                    count++;
                }
                System.out.println();
            }
        }
    }
}
