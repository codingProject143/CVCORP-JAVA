import java.util.Scanner;
class Main{
    public static void main(String []args){
        Scanner Sc =new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c=0;
        if(a<b)
        {
            for(int i=a;i<=b;i++)
            {
                c++;
                if(c!=1)
                {
                    System.out.print(", ");
                }
                System.out.print(i+"*"+(i+1));
            }
            System.out.println();
            c=0;
            for(int i=a;i<=b;i++)
            {
                c++;
                if(c!=1)
                {
                    System.out.print(", ");
                }
                System.out.print(i*(i+1));
            }
        }
        else
        {
            if(a>b)
            {
                a=(a+b)-(b=a);
            }
                for(int i=a;i<=b;i++)
                {
                    c++;
                    if(c!=1)
                    {
                        System.out.print(", ");
                    }
                    System.out.print(i+"*"+(i+1));
                }
                System.out.println();
                c=0;
                for(int i=a;i<=b;i++)
                {
                    c++;
                    if(c!=1)
                    {
                        System.out.print(", ");
                    }
                    System.out.print(i*(i+1));
                }
            
        }
    }
}
