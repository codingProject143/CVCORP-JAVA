import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int count=0;
        if(r==0||c==0)
        {
            System.out.print("Invalid Inputs");
        }
       
        else
        {
            if(r<0)
            {
                r=-r;
            }
            if(c<0)
            {
                c=-c;
            }
            for(int i=1;i<=r;i++)
            {
                for(int j=1;j<=c;j++)
                {
                    count++;
                    System.out.print(count+" ");
                }
                System.out.println();
            }
        }
    }
}
