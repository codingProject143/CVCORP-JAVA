import java.util.Scanner;
class main{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int c = 0;
        if(n<=0)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            for(int i = 0;i<n;i++)
            {
                c++;
                if(c!=1)
                {
                    System.out.print(", ");
                }
                System.out.print(a+i*d);
            }
        }
        System.out.print(".");
    }
}
