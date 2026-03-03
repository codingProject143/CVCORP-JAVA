import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int c=0;
        int rev =0;
        if(n<1)
        {
            System.out.print("Invalid Input.");
        }
        else
        {
            while(n>0)
            {
                int r= n%10;
                n=n/10;
                rev=rev*10+r;
            }
            while(rev>0)
            {
                int r = rev%10;
                rev=rev/10;
                c++;
                if(c!=1)
                {
                    System.out.print(" + ");
                }
                System.out.print(r);
            }
            System.out.print(".");
        }
    }
}
